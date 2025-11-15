package com.GST.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gsttable")
public class GSTEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int hsncode;
	private int taxpercentage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHsncode() {
		return hsncode;
	}
	public void setHsncode(int hsncode) {
		this.hsncode = hsncode;
	}
	public int getTaxpercentage() {
		return taxpercentage;
	}
	public void setTaxpercentage(int taxpercentage) {
		this.taxpercentage = taxpercentage;
	}

}
