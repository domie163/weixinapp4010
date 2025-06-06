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


import com.dao.CantuanxinxiDao;
import com.entity.CantuanxinxiEntity;
import com.service.CantuanxinxiService;
import com.entity.vo.CantuanxinxiVO;
import com.entity.view.CantuanxinxiView;

@Service("cantuanxinxiService")
public class CantuanxinxiServiceImpl extends ServiceImpl<CantuanxinxiDao, CantuanxinxiEntity> implements CantuanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CantuanxinxiEntity> page = this.selectPage(
                new Query<CantuanxinxiEntity>(params).getPage(),
                new EntityWrapper<CantuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CantuanxinxiEntity> wrapper) {
		  Page<CantuanxinxiView> page =new Query<CantuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CantuanxinxiVO> selectListVO(Wrapper<CantuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CantuanxinxiVO selectVO(Wrapper<CantuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CantuanxinxiView> selectListView(Wrapper<CantuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CantuanxinxiView selectView(Wrapper<CantuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
