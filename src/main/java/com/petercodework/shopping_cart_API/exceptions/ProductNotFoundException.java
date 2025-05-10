package com.petercodework.shopping_cart_API.exceptions;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
    super(message);
    }
}
