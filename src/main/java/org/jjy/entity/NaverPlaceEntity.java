package org.jjy.entity;
//package com.siksin.entity;
//
//import java.io.Serializable;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.PrePersist;
//import javax.persistence.PreUpdate;
//import javax.persistence.Table;
//
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//@Entity
//@Table(name = "naver_place")
//@Component
//@Scope(value="prototype")
//public class NaverPlaceEntity implements Serializable{
//	@OneToMany
//	@JoinColumn(foreignKey=@ForeignKey(name="PID"))
//	private NaverPlaceMenuEntity naverPlaceMenuEntity;
//		
//	private static final long serialVersionUID = -415975658941588029L;
//	@Id
//	@Column(name = "PID",length=10,nullable=false	)
//	private Integer pid;//장소시퀀스 int(10) default = null
//	@Column(name = "NAME",length=100,nullable=false	)
//	private String name;//장소명 varchar(100) default = null
//	@Column(name = "CATE",length=20,nullable=false	)
//	private String cate;//카테고리 varchar(20) default = null
//	@Column(name = "TEL",length=20,nullable=true	)
//	private String tel;//전화번호 varchar(20) default = null
//	@Column(name = "INTRO",length=600,nullable=true	)
//	private String intro;//소개 varchar(600) default = null
//	@Column(name = "LAT",nullable=false	)
//	private Double lat;//위도 decimal(11,7) default = null
//	@Column(name = "LNG",nullable=false	)
//	private Double lng;//경도 decimal(11,7) default = null
//	@Column(name = "ADDR_OLD",length=300,nullable=true	)
//	private String addrOld;//지번 주소 varchar(300) default = null
//	@Column(name = "ADDR_NEW",length=300,nullable=true	)
//	private String addrNew;//도로명 주소 varchar(300) default = null
//	@Column(name = "PHOTO",length=300,nullable=true	)
//	private String photo;//사진 varchar(300) default = null
//	@Column(name = "OFFICE_HOURS",length=300,nullable=true	)
//	private String officeHours;//영업 시간 varchar(300) default = null
//	@Column(name = "REG_DT",nullable=false	)
//	private Date regDt;//등록 시각 datetime default = null
//
//
//	public void setPid(Integer pid){
//		this.pid = pid;
//	}
//	public Integer  getPid(){
//		return this.pid;
//	}
//	public void setName(String name){
//		this.name = name;
//	}
//	public String  getName(){
//		return this.name;
//	}
//	public void setLat(Double lat){
//		this.lat = lat;
//	}
//	public Double  getLat(){
//		return this.lat;
//	}
//	public void setLng(Double lng){
//		this.lng = lng;
//	}
//	public Double  getLng(){
//		return this.lng;
//	}
//	public void setAddrOld(String addrOld){
//		this.addrOld = addrOld;
//	}
//	public String  getAddrOld(){
//		return this.addrOld;
//	}
//	public void setAddrNew(String addrNew){
//		this.addrNew = addrNew;
//	}
//	public String  getAddrNew(){
//		return this.addrNew;
//	}
//	public void setPhoto(String photo){
//		this.photo = photo;
//	}
//	public String  getPhoto(){
//		return this.photo;
//	}
//	public void setOfficeHours(String officeHours){
//		this.officeHours = officeHours;
//	}
//	public String  getOfficeHours(){
//		return this.officeHours;
//	}
//	public void setRegDt(Date regDt){
//		this.regDt = regDt;
//	}
//	public Date  getRegDt(){
//		return this.regDt;
//	}
//	public String getCate() {
//		return cate;
//	}
//	public void setCate(String cate) {
//		this.cate = cate;
//	}
//	public String getIntro() {
//		return intro;
//	}
//	public void setIntro(String intro) {
//		this.intro = intro;
//	}
//	public String getTel() {
//		return tel;
//	}
//	public void setTel(String tel) {
//		this.tel = tel;
//	}
//	@PrePersist
//	public void prePersist(){
//		if(this.regDt == null){
//			setRegDt(new Date());
//		}
//	}
//	@PreUpdate
//	public void preUpdate(){
//		if(this.regDt == null){
//			setRegDt(new Date());
//		}
//	}
//	@Override
//	public String toString() {
//		return "[pid="+getPid()+" , name="+getName()+" , cate="+getCate()+" , tel="+getTel()+" , intro="+getIntro()+" , lat="+getLat()+" , lng="+getLng()+" , addrOld="+getAddrOld()+" , addrNew="+getAddrNew()+" , photo="+getPhoto()+" , officeHours="+getOfficeHours()+" , regDt="+((getRegDt() == null)?null:(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(getRegDt()))+"]";
//	}
//}