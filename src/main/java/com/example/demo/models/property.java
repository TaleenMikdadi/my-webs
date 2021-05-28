package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="properties")
public class property {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String Location;
	@Column
	private String Type;
	@Column
	private String Area;
	@Column
	private String Description;
	@Column
	private String Price;
	@Column
	private String Photo1;
	@Column
	private String Photo2;
	@Column
	private String Photo3;
	@Column
	private String Photo4;
	@Column
	private String Photo5;
	
	public property(int id, String location, String type, String area, String description, String price, String photo1,
			String photo2, String photo3, String photo4, String photo5) {
		super();
		this.id = id;
		Location = location;
		Type = type;
		Area = area;
		Description = description;
		Price = price;
		Photo1 = photo1;
		Photo2 = photo2;
		Photo3 = photo3;
		Photo4 = photo4;
		Photo5 = photo5;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getPhoto1() {
		return Photo1;
	}

	public void setPhoto1(String photo1) {
		Photo1 = photo1;
	}

	public String getPhoto2() {
		return Photo2;
	}

	public void setPhoto2(String photo2) {
		Photo2 = photo2;
	}

	public String getPhoto3() {
		return Photo3;
	}

	public void setPhoto3(String photo3) {
		Photo3 = photo3;
	}

	public String getPhoto4() {
		return Photo4;
	}

	public void setPhoto4(String photo4) {
		Photo4 = photo4;
	}

	public String getPhoto5() {
		return Photo5;
	}

	public void setPhoto5(String photo5) {
		Photo5 = photo5;
	}

	@Override
	public String toString() {
		return "property [id=" + id + ", Location=" + Location + ", Type=" + Type + ", Area=" + Area + ", Description="
				+ Description + ", Price=" + Price + ", Photo1=" + Photo1 + ", Photo2=" + Photo2 + ", Photo3=" + Photo3
				+ ", Photo4=" + Photo4 + ", Photo5=" + Photo5 + "]";
	}
	
}
