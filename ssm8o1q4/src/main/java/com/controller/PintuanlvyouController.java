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

import com.entity.PintuanlvyouEntity;
import com.entity.view.PintuanlvyouView;

import com.service.PintuanlvyouService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 拼团旅游
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
@RestController
@RequestMapping("/pintuanlvyou")
public class PintuanlvyouController {
    @Autowired
    private PintuanlvyouService pintuanlvyouService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PintuanlvyouEntity pintuanlvyou, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("faqiren")) {
			pintuanlvyou.setFaqizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PintuanlvyouEntity> ew = new EntityWrapper<PintuanlvyouEntity>();
		PageUtils page = pintuanlvyouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, pintuanlvyou), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PintuanlvyouEntity pintuanlvyou, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("faqiren")) {
			pintuanlvyou.setFaqizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PintuanlvyouEntity> ew = new EntityWrapper<PintuanlvyouEntity>();
		PageUtils page = pintuanlvyouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, pintuanlvyou), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PintuanlvyouEntity pintuanlvyou){
       	EntityWrapper<PintuanlvyouEntity> ew = new EntityWrapper<PintuanlvyouEntity>();
      	ew.allEq(MPUtil.allEQMapPre( pintuanlvyou, "pintuanlvyou")); 
        return R.ok().put("data", pintuanlvyouService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PintuanlvyouEntity pintuanlvyou){
        EntityWrapper< PintuanlvyouEntity> ew = new EntityWrapper< PintuanlvyouEntity>();
 		ew.allEq(MPUtil.allEQMapPre( pintuanlvyou, "pintuanlvyou")); 
		PintuanlvyouView pintuanlvyouView =  pintuanlvyouService.selectView(ew);
		return R.ok("查询拼团旅游成功").put("data", pintuanlvyouView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PintuanlvyouEntity pintuanlvyou = pintuanlvyouService.selectById(id);
        return R.ok().put("data", pintuanlvyou);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PintuanlvyouEntity pintuanlvyou = pintuanlvyouService.selectById(id);
        return R.ok().put("data", pintuanlvyou);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PintuanlvyouEntity pintuanlvyou, HttpServletRequest request){
    	pintuanlvyou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(pintuanlvyou);

        pintuanlvyouService.insert(pintuanlvyou);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PintuanlvyouEntity pintuanlvyou, HttpServletRequest request){
    	pintuanlvyou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(pintuanlvyou);
    	pintuanlvyou.setUserid((Long)request.getSession().getAttribute("userId"));

        pintuanlvyouService.insert(pintuanlvyou);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody PintuanlvyouEntity pintuanlvyou, HttpServletRequest request){
        //ValidatorUtils.validateEntity(pintuanlvyou);
        pintuanlvyouService.updateById(pintuanlvyou);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        pintuanlvyouService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<PintuanlvyouEntity> wrapper = new EntityWrapper<PintuanlvyouEntity>();
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

		int count = pintuanlvyouService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
