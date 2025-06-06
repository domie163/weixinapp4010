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


import com.dao.FaqirenDao;
import com.entity.FaqirenEntity;
import com.service.FaqirenService;
import com.entity.vo.FaqirenVO;
import com.entity.view.FaqirenView;

@Service("faqirenService")
public class FaqirenServiceImpl extends ServiceImpl<FaqirenDao, FaqirenEntity> implements FaqirenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FaqirenEntity> page = this.selectPage(
                new Query<FaqirenEntity>(params).getPage(),
                new EntityWrapper<FaqirenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FaqirenEntity> wrapper) {
		  Page<FaqirenView> page =new Query<FaqirenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FaqirenVO> selectListVO(Wrapper<FaqirenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FaqirenVO selectVO(Wrapper<FaqirenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FaqirenView> selectListView(Wrapper<FaqirenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FaqirenView selectView(Wrapper<FaqirenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
