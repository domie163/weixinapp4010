package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FaqirenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FaqirenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FaqirenView;


/**
 * 发起人
 *
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
public interface FaqirenService extends IService<FaqirenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FaqirenVO> selectListVO(Wrapper<FaqirenEntity> wrapper);
   	
   	FaqirenVO selectVO(@Param("ew") Wrapper<FaqirenEntity> wrapper);
   	
   	List<FaqirenView> selectListView(Wrapper<FaqirenEntity> wrapper);
   	
   	FaqirenView selectView(@Param("ew") Wrapper<FaqirenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FaqirenEntity> wrapper);
   	

}

