package com.trv13.ProjectWithMaven.Address;

import java.sql.Blob;
import java.sql.SQLException;
import java.util.Date;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

public class Address {
	private int addressId;
	private boolean isOpen;
	private String location;
	private String city;
	private Date date;
	private byte[] image;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressId, boolean isOpen, String location, String city, Date date, byte[] image) {
		super();
		this.addressId = addressId;
		this.isOpen = isOpen;
		this.location = location;
		this.city = city;
		this.date = date;
		this.image = image;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public boolean getIsOpen() {
		return isOpen;
	}
	public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Blob getImage() throws SerialException, SQLException {
		return new SerialBlob(image);
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
}
