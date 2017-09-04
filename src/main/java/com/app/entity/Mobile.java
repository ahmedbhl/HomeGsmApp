package com.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Mobile implements Serializable {

	@Id
	@GeneratedValue
	private Long idMobile;
	private String model;
	private String imei;
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;
	private String nameClient;
	private String panne;

	public Mobile() {
		super();
	}

	public Mobile(Long idMobile, String model, String imei, Date date, String nameClient, String panne) {
		super();
		this.idMobile = idMobile;
		this.model = model;
		this.imei = imei;
		this.date = date;
		this.nameClient = nameClient;
		this.panne = panne;
	}

	public Long getIdMobile() {
		return idMobile;
	}

	public void setIdMobile(Long idMobile) {
		this.idMobile = idMobile;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getPanne() {
		return panne;
	}

	public void setPanne(String panne) {
		this.panne = panne;
	}

}
