package com.entity.vo;

import com.entity.PintuanlvyouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 拼团旅游
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
public class PintuanlvyouVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 拼团图片
	 */
	
	private String pintuantupian;
		
	/**
	 * 开团人数
	 */
	
	private Integer kaituanrenshu;
		
	/**
	 * 拼团人数
	 */
	
	private Integer pintuanrenshu;
		
	/**
	 * 拼团价格
	 */
	
	private String pintuanjiage;
		
	/**
	 * 旅游天数
	 */
	
	private String lvyoutianshu;
		
	/**
	 * 旅游景点
	 */
	
	private String lvyoujingdian;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 发起账号
	 */
	
	private String faqizhanghao;
		
	/**
	 * 发起姓名
	 */
	
	private String faqixingming;
		
	/**
	 * 联系手机
	 */
	
	private String lianxishouji;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：拼团图片
	 */
	 
	public void setPintuantupian(String pintuantupian) {
		this.pintuantupian = pintuantupian;
	}
	
	/**
	 * 获取：拼团图片
	 */
	public String getPintuantupian() {
		return pintuantupian;
	}
				
	
	/**
	 * 设置：开团人数
	 */
	 
	public void setKaituanrenshu(Integer kaituanrenshu) {
		this.kaituanrenshu = kaituanrenshu;
	}
	
	/**
	 * 获取：开团人数
	 */
	public Integer getKaituanrenshu() {
		return kaituanrenshu;
	}
				
	
	/**
	 * 设置：拼团人数
	 */
	 
	public void setPintuanrenshu(Integer pintuanrenshu) {
		this.pintuanrenshu = pintuanrenshu;
	}
	
	/**
	 * 获取：拼团人数
	 */
	public Integer getPintuanrenshu() {
		return pintuanrenshu;
	}
				
	
	/**
	 * 设置：拼团价格
	 */
	 
	public void setPintuanjiage(String pintuanjiage) {
		this.pintuanjiage = pintuanjiage;
	}
	
	/**
	 * 获取：拼团价格
	 */
	public String getPintuanjiage() {
		return pintuanjiage;
	}
				
	
	/**
	 * 设置：旅游天数
	 */
	 
	public void setLvyoutianshu(String lvyoutianshu) {
		this.lvyoutianshu = lvyoutianshu;
	}
	
	/**
	 * 获取：旅游天数
	 */
	public String getLvyoutianshu() {
		return lvyoutianshu;
	}
				
	
	/**
	 * 设置：旅游景点
	 */
	 
	public void setLvyoujingdian(String lvyoujingdian) {
		this.lvyoujingdian = lvyoujingdian;
	}
	
	/**
	 * 获取：旅游景点
	 */
	public String getLvyoujingdian() {
		return lvyoujingdian;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：发起账号
	 */
	 
	public void setFaqizhanghao(String faqizhanghao) {
		this.faqizhanghao = faqizhanghao;
	}
	
	/**
	 * 获取：发起账号
	 */
	public String getFaqizhanghao() {
		return faqizhanghao;
	}
				
	
	/**
	 * 设置：发起姓名
	 */
	 
	public void setFaqixingming(String faqixingming) {
		this.faqixingming = faqixingming;
	}
	
	/**
	 * 获取：发起姓名
	 */
	public String getFaqixingming() {
		return faqixingming;
	}
				
	
	/**
	 * 设置：联系手机
	 */
	 
	public void setLianxishouji(String lianxishouji) {
		this.lianxishouji = lianxishouji;
	}
	
	/**
	 * 获取：联系手机
	 */
	public String getLianxishouji() {
		return lianxishouji;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
