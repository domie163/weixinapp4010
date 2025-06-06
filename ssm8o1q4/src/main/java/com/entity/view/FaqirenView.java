package com.entity.view;

import com.entity.FaqirenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 发起人
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
@TableName("faqiren")
public class FaqirenView  extends FaqirenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FaqirenView(){
	}
 
 	public FaqirenView(FaqirenEntity faqirenEntity){
 	try {
			BeanUtils.copyProperties(this, faqirenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
