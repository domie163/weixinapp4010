package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.PintuandingdanDao;
import com.entity.PintuandingdanEntity;
import com.service.PintuandingdanService;
import com.entity.vo.PintuandingdanVO;
import com.entity.view.PintuandingdanView;

@Service("pintuandingdanService")
public class PintuandingdanServiceImpl extends ServiceImpl<PintuandingdanDao, PintuandingdanEntity> implements PintuandingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PintuandingdanEntity> page = this.selectPage(
                new Query<PintuandingdanEntity>(params).getPage(),
                new EntityWrapper<PintuandingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PintuandingdanEntity> wrapper) {
		  Page<PintuandingdanView> page =new Query<PintuandingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PintuandingdanVO> selectListVO(Wrapper<PintuandingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PintuandingdanVO selectVO(Wrapper<PintuandingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PintuandingdanView> selectListView(Wrapper<PintuandingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PintuandingdanView selectView(Wrapper<PintuandingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
