package com.manage_assets.manage_assets.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Assets {
	
	@Id
	String name;
	
	int assetid;
	String purchase_date;
	String note;
	String category;
	String status;
	
	
	
	public Assets() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Assets(String name,int assetid ,String purchase_date, String note, String category, String status) {
		super();
		this.name = name;
		this.assetid=assetid;
		this.purchase_date = purchase_date;
		this.note = note;
		this.category = category;
		this.status = status;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public void setAssetId(int assetid) {
		this.assetid = assetid;
	}
	public int getAssetId(int assetid) {
		return assetid;
	}



	public String getPurchase_date() {
		return purchase_date;
	}



	public void setPurchase_date(String purchase_date) {
		this.purchase_date = purchase_date;
	}



	public String getNote() {
		return note;
	}



	public void setNote(String note) {
		this.note = note;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "Assets [name=" + name + ",assetid="+assetid+", purchase_date=" + purchase_date + ", note=" + note + ", category=" + category+ ", status=" + status + "]";
	}
	

}
