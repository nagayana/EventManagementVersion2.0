package com.project.pojo;

public class Food {
	private int foodId, foodPrice, foodQuantity, eventId;
	private String foodName;

	public Food(int foodId, String foodName, int foodPrice, int foodQuantity, int eventId) {
		this.foodId=foodId;
		this.foodName=foodName;
		this.foodPrice=foodPrice;
		this.foodQuantity=foodQuantity;
		this.eventId=eventId;
	}

	public Food() {
		// TODO Auto-generated constructor stub
	}

	

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public int getFoodQuantity() {
		return foodQuantity;
	}

	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodPrice=" + foodPrice + ", foodQuantity=" + foodQuantity + ", eventId="
				+ eventId + ", foodName=" + foodName + "]";
	}

	
	

}
