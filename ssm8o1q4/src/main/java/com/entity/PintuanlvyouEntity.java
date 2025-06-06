package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 拼团旅游
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-11 10:38:39
 */
@TableName("pintuanlvyou")
public class PintuanlvyouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PintuanlvyouEntity() {
		
	}
	
	public PintuanlvyouEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 拼团名称
	 */
					
	private String pintuanmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：拼团名称
	 */
	public void setPintuanmingcheng(String pintuanmingcheng) {
		this.pintuanmingcheng = pintuanmingcheng;
	}
	/**
	 * 获取：拼团名称
	 */
	public String getPintuanmingcheng() {
		return pintuanmingcheng;
	}
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
