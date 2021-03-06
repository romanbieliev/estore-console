package com.rb.view;

import com.rb.exceptions.NoProductFoundException;
import com.rb.model.Product;
import com.rb.model.ProductWrapper;

import java.util.List;

public class StoreView {
    private List<ProductWrapper> products;

    public StoreView(List<ProductWrapper> products) {
        this.products = products;
    }

    public void show() {
        // System.out.println(products.size());

        System.out.println("|------------------ Shop ---------------------|");
        System.out.println("| product              id    quantity   price |");
        System.out.println("|                                             |");
        for (ProductWrapper productWrapper : products) {
            Product product = productWrapper.getProduct();
            int quantity = productWrapper.getQuantity();

            System.out.format("| %-20s %-9d %-7d %.2f |\n",
                    product.getName(),
                    product.getId(),
                    quantity,
                    product.getPrice());
        }
        System.out.println("|---------------------------------------------|\n");
    }
}
