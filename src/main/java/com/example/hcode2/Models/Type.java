package com.example.hcode2.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Type {
	@Id
	@GeneratedValue
	private int id_Type;
	private String Type;
	public Type(int id_Type, String type) {
		super();
		this.id_Type = id_Type;
		Type = type;
	}
	public int getId_Type() {
		return id_Type;
	}
	public void setId_Type(int id_Type) {
		this.id_Type = id_Type;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	

}
