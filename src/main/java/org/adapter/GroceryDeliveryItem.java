package org.adapter;

public class GroceryDeliveryItem implements GroceryItem {

    String groceryItemName; //e.g. Biscuits
    int groceryItemPrice;
    String groceryItemBrand; // e.g. Britannia / Parle
    static String itemType = "GROCERY";

    public GroceryDeliveryItem(String groceryItemName, int groceryItemPrice, String groceryItemBrand) {
        this.groceryItemName = groceryItemName;
        this.groceryItemPrice = groceryItemPrice;
        this.groceryItemBrand = groceryItemBrand;
    }

    @Override
    public int getGroceryPrice() {
        return groceryItemPrice;
    }

    @Override
    public String getGroceryName() {
        return groceryItemName;
    }

    @Override
    public String getGroceryBrandName() {
        return groceryItemBrand;
    }

    @Override
    public String getItemType(){
        return itemType;
    }
}
