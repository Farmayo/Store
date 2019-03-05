
package Controller;

import Data_Structure.Product;
import Data_Structure.User;
import java.util.HashMap;

public class ControlUser {
    
    private static ControlUser instance;
    
    private HashMap<String, User> users;
    private HashMap<String, Product> products;
    private boolean error;
    
    public static ControlUser getInstance(){
        if(instance == null){
            instance = new ControlUser();
        }
        return instance;
    }

    public ControlUser() {
        this.error = false;
        users = new HashMap<>();
        products = new HashMap<>();
        createProducts();
    }

    public HashMap<String, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, User> users) {
        this.users = users;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public HashMap<String, Product> getProducts() {
        return products;
    }

    public void setProducts(HashMap<String, Product> products) {
        this.products = products;
    }
    
    
    
    private void createProducts(){
        Product product = new Product();
        product.setId("1");
        product.setTitle_book("Diario del fin del Mundo");
        product.setAuthor_book("Mario Mendoza");
        product.setValue("5");
        products.put(product.getId(), product);
        product = new Product();
        product.setId("1");
        product.setTitle_book("El Nobel");
        product.setAuthor_book("Vicky Davila");
        product.setValue("5");
        products.put(product.getId(), product);
        product = new Product();
        product.setId("1");
        product.setTitle_book("Hoy es Siempre Todavia");
        product.setAuthor_book("Alejandro Gaviria");
        product.setValue("5");
        products.put(product.getId(), product);
        product = new Product();
        product.setId("1");
        product.setTitle_book("Ideas Millonarias");
        product.setAuthor_book("Juan Diego Gomez");
        product.setValue("5");
        products.put(product.getId(), product);
        product = new Product();
        product.setTitle_book("Las palabras más bellas");
        product.setAuthor_book("Juan Gosain");
        product.setValue("5");
        products.put(product.getId(), product);
        product = new Product();
        product.setId("1");
        product.setTitle_book("Los divinos");
        product.setAuthor_book("Laura Restrepo");
        product.setValue("5");
        products.put(product.getId(), product);
        product = new Product();
        product.setId("1");
        product.setTitle_book("Nińas rebeldes 2");
        product.setAuthor_book("Elena Favilli");
        product.setValue("5");
        products.put(product.getId(), product);
        product = new Product();
        product.setId("1");
        product.setTitle_book("Todos somos poderosos");
        product.setAuthor_book("Luisa Fernanda W");
        product.setValue("5");
    }
    
}
