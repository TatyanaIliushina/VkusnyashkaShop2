package service;

import model.Basket;
import model.Customer;
import model.Order;
import product.Product;

import java.util.Random;

public class CreateOrder {
    public String basket;
    public String customer;

    public CreateOrder (Basket basket, Customer customer){
        double fullPrice = 0;
        for (Product product:Basket.basket){
            product.getPrice();
            fullPrice+=product.getPrice();
        }
        //Order random = null;
        //return new Order(random.nextint(100),fullPrice);
    }


    public void fullOrderBasket(){

    }
    public void createOrder() {

    }
}
