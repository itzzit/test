package com.itheima.pojo;

import java.util.Date;
import java.util.List;

public class Items {
	
	private Integer id;
	private Float price;
	private String detail;
	private String pic;
	private Date createtime;
	private String name;


	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Orderdetail> getItemsdetail() {
		return itemsdetail;
	}
	public void setItemsdetail(List<Orderdetail> itemsdetail) {
		this.itemsdetail = itemsdetail;
	}
	private List<Orderdetail> itemsdetail;//
	
	
	public List<Orderdetail> getDetails() {
		return itemsdetail;
	}
	public void setDetails(List<Orderdetail> itemsdetail) {
		this.itemsdetail = itemsdetail;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
