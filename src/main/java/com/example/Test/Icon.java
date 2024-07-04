package com.example.test;

public class Icon {

	private String name;
	private String img;

	public Icon(String name, String img) {
		this.name = name;
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Icon [name=" + name + ", img=" + img + "]";
	}

}
