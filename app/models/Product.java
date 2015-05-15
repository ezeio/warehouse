package models;
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

    public Product (){}


    static {
        products = new ArrayListProduct<Product>();
        products.add(new Product("1111111111111", "Paperclips 1", "Paperclips 1 description"));

        products.add(new Product ("2222222222222","Paperclips 2","Paperclips 2 description"));

        products.add(new Product ("3333333333333","Paperclips 3","Paperclips 3 description"));

        products.add(new Product ("4444444444444","Paperclips 4","Paperclips 4 description"));

        products.add(new Product ("5555555555555","Paperclips 5","Paperclips 5 description"));






    }


    public Product (String ean, String name, String description){
        this.ean = ean;
        this.name = name;
        this.description = description;
    }

    public String toString(){
        return String.format("%s %s", ean, name);
    }

}
