package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CantuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CantuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CantuanxinxiView;


/**
 * 参团信息
 *
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
public interface CantuanxinxiService extends IService<CantuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CantuanxinxiVO> selectListVO(Wrapper<CantuanxinxiEntity> wrapper);
   	
   	CantuanxinxiVO selectVO(@Param("ew") Wrapper<CantuanxinxiEntity> wrapper);
   	
   	List<CantuanxinxiView> selectListView(Wrapper<CantuanxinxiEntity> wrapper);
   	
   	CantuanxinxiView selectView(@Param("ew") Wrapper<CantuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CantuanxinxiEntity> wrapper);
   	

}

