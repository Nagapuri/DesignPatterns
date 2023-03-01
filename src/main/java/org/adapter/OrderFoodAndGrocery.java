package org.adapter;

import java.util.ArrayList;
import java.util.List;

public class OrderFoodAndGrocery {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new FoodDeliveryItem("Roti", 100, "Paradise"));
        items.add(new FoodDeliveryItem("Kaju Paneer", 150, "Santosh Dhaba"));
        items.add(new GroceryItemAdapter(new GroceryDeliveryItem("Biscuit", 20,"Parle")));
        int totalPrice=0;
        int i=1;
        for (Item item : items) {
            totalPrice = totalPrice + item.getPrice();
            System.out.println("Item " + i +"        :::: ");
            System.out.println("    Name                  : "+ item.getName());
            System.out.println("    Restaurant/Store name : "+ item.getRestaurantName());
            System.out.println("    item type             : " + item.getItemType());
            i++;
        }
        System.out.println("The total cost of items is:: "+ totalPrice);
    }
}
