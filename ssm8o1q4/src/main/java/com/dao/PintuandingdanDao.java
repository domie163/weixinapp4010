package com.dao;

import com.entity.PintuandingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PintuandingdanVO;
import com.entity.view.PintuandingdanView;


/**
 * 拼团订单
 * 
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
public interface PintuandingdanDao extends BaseMapper<PintuandingdanEntity> {
	
	List<PintuandingdanVO> selectListVO(@Param("ew") Wrapper<PintuandingdanEntity> wrapper);
	
	PintuandingdanVO selectVO(@Param("ew") Wrapper<PintuandingdanEntity> wrapper);
	
	List<PintuandingdanView> selectListView(@Param("ew") Wrapper<PintuandingdanEntity> wrapper);

	List<PintuandingdanView> selectListView(Pagination page,@Param("ew") Wrapper<PintuandingdanEntity> wrapper);
	
	PintuandingdanView selectView(@Param("ew") Wrapper<PintuandingdanEntity> wrapper);
	

}
