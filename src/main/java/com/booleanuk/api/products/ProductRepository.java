package com.booleanuk.api.products;


import java.util.ArrayList;

public class ProductRepository {

    private ArrayList<Product> products = new ArrayList<>(){{
        add(new Product("How to build APIs", "Book", 1500));
        add(new Product("Elden Ring", "Game", 90));
    }};

    public Product createProduct(String name, String category, int price){
        Product product = new Product(name, category, price);
        this.products.add(product);
        return product;
    }

    public ArrayList<Product> getAll(){
        return this.products;
    }

    public Product getOne(int id){
        for (Product p : products){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public Product updateProduct(int id, Product product){
        for (Product p : products){
            if (p.getId() == id){
                p.setName(product.getName());
                p.setCategory(product.getCategory());
                p.setPrice(product.getPrice());
                return p;
            }
        }
        return null;
    }

    public Product deleteProduct(int id){
        for (Product p : products){
            if (p.getId() == id){
                products.remove(p);
                return p;
            }
        }
        return null;
    }

}
