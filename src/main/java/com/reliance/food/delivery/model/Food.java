package com.reliance.food.delivery.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String menu;
private double price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMenu() {
	return menu;
}
public void setMenu(String menu) {
	this.menu = menu;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
