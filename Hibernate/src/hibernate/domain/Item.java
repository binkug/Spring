package hibernate.domain;

import java.util.Date;

public class Item {
	private int code;
	private String name;
	private String manufacture;
	private int price;
	private Date builtdate;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getBuiltdate() {
		return builtdate;
	}
	public void setBuiltdate(Date builtdate) {
		this.builtdate = builtdate;
	}
	
	@Override
	public String toString() {
		return "Item [code=" + code + ", name=" + name + ", manufacture=" + manufacture + ", price=" + price
				+ ", builtdate=" + builtdate + "]";
	}
	
}
