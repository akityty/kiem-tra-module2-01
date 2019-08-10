package NguyenVanCong.controller;

import NguyenVanCong.model.Product;
import NguyenVanCong.service.impl.ProductServiceImpl;

public class ProductController extends ProductServiceImpl {
    ProductServiceImpl productService = new ProductServiceImpl();
    public void add(int index, Product product) {
        productService.add(index,product);
    }

    public void add(Product product) {
        productService.add(product);
    }

    public void set(int index, Product product) {
        productService.set(index,product);
    }

    public void remove(int index) {
        productService.remove(index);
    }

    public int find(String product) {
        return productService.find(product);
    }

    public String display() {
        return productService.display();
    }

    public void sortUpPrice() {
        productService.sortUpPrice();
    }

    public void sortDownPrice() {
        productService.sortDownPrice();
    }
}
