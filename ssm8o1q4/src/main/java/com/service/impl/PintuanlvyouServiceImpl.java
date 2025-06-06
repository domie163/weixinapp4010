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


import com.dao.PintuanlvyouDao;
import com.entity.PintuanlvyouEntity;
import com.service.PintuanlvyouService;
import com.entity.vo.PintuanlvyouVO;
import com.entity.view.PintuanlvyouView;

@Service("pintuanlvyouService")
public class PintuanlvyouServiceImpl extends ServiceImpl<PintuanlvyouDao, PintuanlvyouEntity> implements PintuanlvyouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PintuanlvyouEntity> page = this.selectPage(
                new Query<PintuanlvyouEntity>(params).getPage(),
                new EntityWrapper<PintuanlvyouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PintuanlvyouEntity> wrapper) {
		  Page<PintuanlvyouView> page =new Query<PintuanlvyouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PintuanlvyouVO> selectListVO(Wrapper<PintuanlvyouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PintuanlvyouVO selectVO(Wrapper<PintuanlvyouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PintuanlvyouView> selectListView(Wrapper<PintuanlvyouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PintuanlvyouView selectView(Wrapper<PintuanlvyouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
