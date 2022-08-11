package productsManager;

import java.util.ArrayList;

public class Products {

    ArrayList<Product> products = new ArrayList();

    public Product create(Product product){
        products.add(product);
        return product;
    }

    public Product read(Product product){
        if (products.contains(product)){
            return product;
        }

        return null;
    }

    public Product updateQuantity(Product newProduct, int newQuantity){
        for (Product product : products){
            if (newProduct.name == product.name){
                product.quantity = newQuantity;
                return product;
            }
        }
        return null;
    }

    public Product delete(Product product){
        if (products.contains(product)) {
            products.remove(product);
            return product;
        }
        return null;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
