package models;

/**
 * Created by Ositadinma on 12/05/15.
 */

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Eze on 13/05/2015.
 */
public class Product {

    public String ean;
    public String name;
    public String description;
    private static List<Product> products;

    public Product() {
    }


    static {
        products = new ArrayListProduct<Product>();
        products.add(new Product("1111111111111", "Paperclips 1", "Paperclips 1 description"));

        products.add(new Product("2222222222222", "Paperclips 2", "Paperclips 2 description"));

        products.add(new Product("3333333333333", "Paperclips 3", "Paperclips 3 description"));

        products.add(new Product("4444444444444", "Paperclips 4", "Paperclips 4 description"));

        products.add(new Product("5555555555555", "Paperclips 5", "Paperclips 5 description"));


    }


    public Product(String ean, String name, String description) {
        this.ean = ean;
        this.name = name;
        this.description = description;
    }

    public String toString() {
        return String.format("%s %s", ean, name);
    }

    public static List<Product> findAll() {
        return new ArreayList<Product>(products);
    }


    public static Product findByEan(String ean) {
        for (Product candidate : products) {
            if (candidate.ean.equals(ean)) {
                return candidate;,
            }
        }
        return null;
    }

    public static List<Product> findByname(String term){
        final List<Product> results = new ArrayList<Product>();

        for (Product candidate : products){
            if (candidate.name.toLowerCase().contains(term.toLowerCase())){

                results.add(candidate);
            }
        }
        return  results;
    }

    public static boolean remove(Product product){
        return products.remove(product);

    }

    public void save(){
        products.remove(findByEan(this.ean));
        products.add(this);
    }
}