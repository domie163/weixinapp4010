package com.entity.view;

import com.entity.PintuanlvyouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 拼团旅游
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
@TableName("pintuanlvyou")
public class PintuanlvyouView  extends PintuanlvyouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PintuanlvyouView(){
	}
 
 	public PintuanlvyouView(PintuanlvyouEntity pintuanlvyouEntity){
 	try {
			BeanUtils.copyProperties(this, pintuanlvyouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
