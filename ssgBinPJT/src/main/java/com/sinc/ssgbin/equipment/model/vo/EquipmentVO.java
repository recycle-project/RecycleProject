package com.sinc.ssgbin.equipment.model.vo;

public class EquipmentVO {
	private int equipment_id;
	private String equipment_name, category;
	private int capacity;
	private char is_on;
	private String serial_number;
	private int store_id;
	public EquipmentVO() {
		super();
	}
	public EquipmentVO(int equipment_id, String equipment_name, String category, int capacity, char is_on,
			String serial_number, int store_id) {
		super();
		this.equipment_id = equipment_id;
		this.equipment_name = equipment_name;
		this.category = category;
		this.capacity = capacity;
		this.is_on = is_on;
		this.serial_number = serial_number;
		this.store_id = store_id;
	}
	public int getEquipment_id() {
		return equipment_id;
	}
	public void setEquipment_id(int equipment_id) {
		this.equipment_id = equipment_id;
	}
	public String getEquipment_name() {
		return equipment_name;
	}
	public void setEquipment_name(String equipment_name) {
		this.equipment_name = equipment_name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public char getIs_on() {
		return is_on;
	}
	public void setIs_on(char is_on) {
		this.is_on = is_on;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	@Override
	public String toString() {
		return "EquipmentVO [equipment_id=" + equipment_id + ", equipment_name=" + equipment_name + ", category="
				+ category + ", capacity=" + capacity + ", is_on=" + is_on + ", serial_number=" + serial_number
				+ ", store_id=" + store_id + "]";
	}
	
	
}
