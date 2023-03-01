package org.adapter;

public class FoodDeliveryItem implements Item {

    int price;
    String name;
    String restaurantName; //e.g. Paradise
    static String itemType = "FOOD";

    FoodDeliveryItem(String name, int price, String restaurantName){
        this.name = name;
        this.price = price;
        this.restaurantName = restaurantName;

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getRestaurantName() {
        return restaurantName;
    }


    @Override
    public String getItemType() {
        return itemType;
    }
}
