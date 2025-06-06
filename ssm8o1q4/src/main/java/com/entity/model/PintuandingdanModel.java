package com.entity.model;

import com.entity.PintuandingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 拼团订单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
public class PintuandingdanModel  implements Serializable {
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
	
	private Integer pintuanjiage;
		
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
	 * 参团备注
	 */
	
	private String cantuanbeizhu;
		
	/**
	 * 参团时间
	 */
	
	private String cantuanshijian;
		
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
	 * 车辆状态
	 */
	
	private String cheliangzhuangtai;
		
	/**
	 * 开团时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaituanshijian;
		
	/**
	 * 开团备注
	 */
	
	private String kaituanbeizhu;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
		
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
	 
	public void setPintuanjiage(Integer pintuanjiage) {
		this.pintuanjiage = pintuanjiage;
	}
	
	/**
	 * 获取：拼团价格
	 */
	public Integer getPintuanjiage() {
		return pintuanjiage;
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
	 * 设置：参团备注
	 */
	 
	public void setCantuanbeizhu(String cantuanbeizhu) {
		this.cantuanbeizhu = cantuanbeizhu;
	}
	
	/**
	 * 获取：参团备注
	 */
	public String getCantuanbeizhu() {
		return cantuanbeizhu;
	}
				
	
	/**
	 * 设置：参团时间
	 */
	 
	public void setCantuanshijian(String cantuanshijian) {
		this.cantuanshijian = cantuanshijian;
	}
	
	/**
	 * 获取：参团时间
	 */
	public String getCantuanshijian() {
		return cantuanshijian;
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
	 * 设置：车辆状态
	 */
	 
	public void setCheliangzhuangtai(String cheliangzhuangtai) {
		this.cheliangzhuangtai = cheliangzhuangtai;
	}
	
	/**
	 * 获取：车辆状态
	 */
	public String getCheliangzhuangtai() {
		return cheliangzhuangtai;
	}
				
	
	/**
	 * 设置：开团时间
	 */
	 
	public void setKaituanshijian(Date kaituanshijian) {
		this.kaituanshijian = kaituanshijian;
	}
	
	/**
	 * 获取：开团时间
	 */
	public Date getKaituanshijian() {
		return kaituanshijian;
	}
				
	
	/**
	 * 设置：开团备注
	 */
	 
	public void setKaituanbeizhu(String kaituanbeizhu) {
		this.kaituanbeizhu = kaituanbeizhu;
	}
	
	/**
	 * 获取：开团备注
	 */
	public String getKaituanbeizhu() {
		return kaituanbeizhu;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
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
