package com.dao;

import com.entity.PintuanlvyouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PintuanlvyouVO;
import com.entity.view.PintuanlvyouView;


/**
 * 拼团旅游
 * 
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
public interface PintuanlvyouDao extends BaseMapper<PintuanlvyouEntity> {
	
	List<PintuanlvyouVO> selectListVO(@Param("ew") Wrapper<PintuanlvyouEntity> wrapper);
	
	PintuanlvyouVO selectVO(@Param("ew") Wrapper<PintuanlvyouEntity> wrapper);
	
	List<PintuanlvyouView> selectListView(@Param("ew") Wrapper<PintuanlvyouEntity> wrapper);

	List<PintuanlvyouView> selectListView(Pagination page,@Param("ew") Wrapper<PintuanlvyouEntity> wrapper);
	
	PintuanlvyouView selectView(@Param("ew") Wrapper<PintuanlvyouEntity> wrapper);
	

}
