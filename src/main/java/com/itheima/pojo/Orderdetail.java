package com.itheima.pojo;

public class Orderdetail {
	private Integer id;
	private Integer orders_id;
	private Integer items_id;
	private Integer items_num;//商品购买数量
	
	
	public Integer getItems_num() {
		return items_num;
	}
	public void setItems_num(Integer items_num) {
		this.items_num = items_num;
	}
	private Items item;
	
	private Orders orders;
	
	
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(Integer orders_id) {
		this.orders_id = orders_id;
	}
	public Integer getItems_id() {
		return items_id;
	}
	public void setItems_id(Integer items_id) {
		this.items_id = items_id;
	}
	
}
