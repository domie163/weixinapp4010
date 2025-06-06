package com.dao;

import com.entity.FaqirenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FaqirenVO;
import com.entity.view.FaqirenView;


/**
 * 发起人
 * 
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
public interface FaqirenDao extends BaseMapper<FaqirenEntity> {
	
	List<FaqirenVO> selectListVO(@Param("ew") Wrapper<FaqirenEntity> wrapper);
	
	FaqirenVO selectVO(@Param("ew") Wrapper<FaqirenEntity> wrapper);
	
	List<FaqirenView> selectListView(@Param("ew") Wrapper<FaqirenEntity> wrapper);

	List<FaqirenView> selectListView(Pagination page,@Param("ew") Wrapper<FaqirenEntity> wrapper);
	
	FaqirenView selectView(@Param("ew") Wrapper<FaqirenEntity> wrapper);
	

}
