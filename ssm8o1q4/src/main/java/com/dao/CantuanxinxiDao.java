package com.dao;

import com.entity.CantuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CantuanxinxiVO;
import com.entity.view.CantuanxinxiView;


/**
 * 参团信息
 * 
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
public interface CantuanxinxiDao extends BaseMapper<CantuanxinxiEntity> {
	
	List<CantuanxinxiVO> selectListVO(@Param("ew") Wrapper<CantuanxinxiEntity> wrapper);
	
	CantuanxinxiVO selectVO(@Param("ew") Wrapper<CantuanxinxiEntity> wrapper);
	
	List<CantuanxinxiView> selectListView(@Param("ew") Wrapper<CantuanxinxiEntity> wrapper);

	List<CantuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CantuanxinxiEntity> wrapper);
	
	CantuanxinxiView selectView(@Param("ew") Wrapper<CantuanxinxiEntity> wrapper);
	

}
