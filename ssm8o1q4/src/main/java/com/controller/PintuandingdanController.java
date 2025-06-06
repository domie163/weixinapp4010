package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.PintuandingdanEntity;
import com.entity.view.PintuandingdanView;

import com.service.PintuandingdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 拼团订单
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
@RestController
@RequestMapping("/pintuandingdan")
public class PintuandingdanController {
    @Autowired
    private PintuandingdanService pintuandingdanService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PintuandingdanEntity pintuandingdan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("faqiren")) {
			pintuandingdan.setFaqizhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			pintuandingdan.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PintuandingdanEntity> ew = new EntityWrapper<PintuandingdanEntity>();
		PageUtils page = pintuandingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, pintuandingdan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PintuandingdanEntity pintuandingdan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("faqiren")) {
			pintuandingdan.setFaqizhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			pintuandingdan.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PintuandingdanEntity> ew = new EntityWrapper<PintuandingdanEntity>();
		PageUtils page = pintuandingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, pintuandingdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PintuandingdanEntity pintuandingdan){
       	EntityWrapper<PintuandingdanEntity> ew = new EntityWrapper<PintuandingdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( pintuandingdan, "pintuandingdan")); 
        return R.ok().put("data", pintuandingdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PintuandingdanEntity pintuandingdan){
        EntityWrapper< PintuandingdanEntity> ew = new EntityWrapper< PintuandingdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( pintuandingdan, "pintuandingdan")); 
		PintuandingdanView pintuandingdanView =  pintuandingdanService.selectView(ew);
		return R.ok("查询拼团订单成功").put("data", pintuandingdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PintuandingdanEntity pintuandingdan = pintuandingdanService.selectById(id);
        return R.ok().put("data", pintuandingdan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PintuandingdanEntity pintuandingdan = pintuandingdanService.selectById(id);
        return R.ok().put("data", pintuandingdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PintuandingdanEntity pintuandingdan, HttpServletRequest request){
    	pintuandingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(pintuandingdan);

        pintuandingdanService.insert(pintuandingdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PintuandingdanEntity pintuandingdan, HttpServletRequest request){
    	pintuandingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(pintuandingdan);
    	pintuandingdan.setUserid((Long)request.getSession().getAttribute("userId"));

        pintuandingdanService.insert(pintuandingdan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody PintuandingdanEntity pintuandingdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(pintuandingdan);
        pintuandingdanService.updateById(pintuandingdan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        pintuandingdanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<PintuandingdanEntity> wrapper = new EntityWrapper<PintuandingdanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("faqiren")) {
			wrapper.eq("faqizhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = pintuandingdanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
