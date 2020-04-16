package com.nttdata.manyToOne;

public class Product {
private int proId;
private String proName;
private Category category;
public int getProId() {
	return proId;
}
public void setProId(int proId) {
	this.proId = proId;
}
public String getProName() {
	return proName;
}
public void setProName(String proName) {
	this.proName = proName;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}

}
