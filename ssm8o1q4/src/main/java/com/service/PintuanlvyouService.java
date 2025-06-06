package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PintuanlvyouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PintuanlvyouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PintuanlvyouView;


/**
 * 拼团旅游
 *
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
public interface PintuanlvyouService extends IService<PintuanlvyouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PintuanlvyouVO> selectListVO(Wrapper<PintuanlvyouEntity> wrapper);
   	
   	PintuanlvyouVO selectVO(@Param("ew") Wrapper<PintuanlvyouEntity> wrapper);
   	
   	List<PintuanlvyouView> selectListView(Wrapper<PintuanlvyouEntity> wrapper);
   	
   	PintuanlvyouView selectView(@Param("ew") Wrapper<PintuanlvyouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PintuanlvyouEntity> wrapper);
   	

}

