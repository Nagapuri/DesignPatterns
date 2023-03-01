package org.adapter;

public class GroceryItemAdapter implements  Item{
    GroceryItem groceryItem;

    GroceryItemAdapter(GroceryItem groceryItem){
        this.groceryItem = groceryItem;
    }

    @Override
    public String getName() {
        return groceryItem.getGroceryName();
    }

    @Override
    public int getPrice() {
        return groceryItem.getGroceryPrice();
    }

    @Override
    public String getRestaurantName() {
        return groceryItem.getGroceryBrandName();
    }

    @Override
    public String getItemType() {
        return groceryItem.getItemType();
    }
}
