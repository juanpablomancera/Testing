package productsManager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductsTest {
    Products products = new Products();
    Product product = new Product("Phone",500,56);


    @Test
    void create(){
        assertEquals( products.create(product), products.getProducts().get(0));
    }


    @Test
    void read(){
        products.create(product);

        assertEquals(product, products.read(product));

    }

    @Test
    void notRead(){
        assertEquals(null, products.read(product));
    }


    @Test
    void updateQuantity(){
        products.create(product);

        assertEquals(product, products.updateQuantity(product, 70));
    }

    @Test
    void notUpdateQuantity(){
        assertEquals(null, products.updateQuantity(product, 70));
    }

    @Test
    void delete(){
        products.create(product);

        assertEquals(product, products.delete(product));
    }

    @Test
    void notDelete(){
        assertEquals(null, products.delete(product));
    }

}
