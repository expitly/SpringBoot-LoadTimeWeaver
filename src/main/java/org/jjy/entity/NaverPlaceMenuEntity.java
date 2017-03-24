package org.jjy.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "naver_place_menu")
@Component
@Scope(value="prototype")
public class NaverPlaceMenuEntity implements Serializable{
	private static final long serialVersionUID = -326132191224442013L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MID",length=10,nullable=false	)
	private Integer mid;//장소메뉴시퀀스 int(10) default = null
	@Column(name = "PID",length=10,nullable=false	)
	private Integer pid;//장소시퀀스 int(10) default = null
	@Column(name = "NAME",length=100,nullable=false	)
	private String name;//메뉴명 varchar(100) default = null
	@Column(name = "PRICE",length=100,nullable=false	)
	private String price;//메뉴가격 varchar(100) default = null
	@Column(name = "REG_DT",nullable=false	)
	private Date regDt;//등록 시각 datetime default = null


	public void setMid(Integer mid){
		this.mid = mid;
	}
	public Integer  getMid(){
		return this.mid;
	}
	public void setPid(Integer pid){
		this.pid = pid;
	}
	public Integer  getPid(){
		return this.pid;
	}
	public void setName(String name){
		this.name = name;
	}
	public String  getName(){
		return this.name;
	}
	public void setPrice(String price){
		this.price = price;
	}
	public String  getPrice(){
		return this.price;
	}
	public void setRegDt(Date regDt){
		this.regDt = regDt;
	}
	public Date  getRegDt(){
		return this.regDt;
	}

	@PrePersist
	public void prePersist(){
		if(this.regDt == null){
			setRegDt(new Date());
		}
	}
	@PreUpdate
	public void preUpdate(){
	}
	@Override
	public String toString() {
		return "[mid="+getMid()+" , pid="+getPid()+" , name="+getName()+" , price="+getPrice()+" , regDt="+((getRegDt() == null)?null:(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(getRegDt()))+"]";
	}
}