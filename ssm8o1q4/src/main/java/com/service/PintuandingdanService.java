package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PintuandingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PintuandingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PintuandingdanView;


/**
 * 拼团订单
 *
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
public interface PintuandingdanService extends IService<PintuandingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PintuandingdanVO> selectListVO(Wrapper<PintuandingdanEntity> wrapper);
   	
   	PintuandingdanVO selectVO(@Param("ew") Wrapper<PintuandingdanEntity> wrapper);
   	
   	List<PintuandingdanView> selectListView(Wrapper<PintuandingdanEntity> wrapper);
   	
   	PintuandingdanView selectView(@Param("ew") Wrapper<PintuandingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PintuandingdanEntity> wrapper);
   	

}

