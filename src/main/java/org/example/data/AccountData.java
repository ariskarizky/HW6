package org.example.data;

public interface AccountData {
    //Registered Account Login
    String username = "standard_user";
    String password = "secret_sauce";
    String homepage ="Products";

    //Item Data
    String item_name = "Sauce Labs Backpack";
    String item_price_currency_expect = "$29.99";
    String item_qty_expect = "1";

    //My Information
    String first_name = "Alice";
    String last_name = "Sunflower";
    String postal_code = "12405";

    //Checkout Overview
    String checkout_overview_page_name = "Checkout: Overview";

    //Complete page
    String complete_page_name = "Thank you for your order!";

    //Not Registered Account Login
    String invalid_username = "Alice";
    String invalid_password = "Alice";
//    String error_alert = "Epic sadface: Username and password do not match any user in this service";
}
