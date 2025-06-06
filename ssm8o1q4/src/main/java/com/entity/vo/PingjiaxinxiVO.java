package com.entity.vo;

import com.entity.PingjiaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 评价信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
public class PingjiaxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 拼团图片
	 */
	
	private String pintuantupian;
		
	/**
	 * 金额
	 */
	
	private Integer jine;
		
	/**
	 * 旅游天数
	 */
	
	private String lvyoutianshu;
		
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
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 开团时间
	 */
	
	private String kaituanshijian;
		
	/**
	 * 评价内容
	 */
	
	private String pingjianeirong;
		
	/**
	 * 评价时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingjiashijian;
		
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
	 * 设置：金额
	 */
	 
	public void setJine(Integer jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：金额
	 */
	public Integer getJine() {
		return jine;
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
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：开团时间
	 */
	 
	public void setKaituanshijian(String kaituanshijian) {
		this.kaituanshijian = kaituanshijian;
	}
	
	/**
	 * 获取：开团时间
	 */
	public String getKaituanshijian() {
		return kaituanshijian;
	}
				
	
	/**
	 * 设置：评价内容
	 */
	 
	public void setPingjianeirong(String pingjianeirong) {
		this.pingjianeirong = pingjianeirong;
	}
	
	/**
	 * 获取：评价内容
	 */
	public String getPingjianeirong() {
		return pingjianeirong;
	}
				
	
	/**
	 * 设置：评价时间
	 */
	 
	public void setPingjiashijian(Date pingjiashijian) {
		this.pingjiashijian = pingjiashijian;
	}
	
	/**
	 * 获取：评价时间
	 */
	public Date getPingjiashijian() {
		return pingjiashijian;
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
