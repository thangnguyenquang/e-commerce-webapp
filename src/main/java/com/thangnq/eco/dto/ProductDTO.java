package com.thangnq.eco.dto;

public class ProductDTO {

	private long id;
	private String name;
	private int category_id;
	private double price;
	private double weight;
	private String description;
	private String imageName;
	
	public ProductDTO() {
		
	}
	
	public ProductDTO(long id, String name, int category_id, double price, double weight, String description,
			String imageName) {
		super();
		this.id = id;
		this.name = name;
		this.category_id = category_id;
		this.price = price;
		this.weight = weight;
		this.description = description;
		this.imageName = imageName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
	
}
