package NguyenVanCong.service.impl;

import NguyenVanCong.model.Product;
import NguyenVanCong.repository.impl.ProductRepositoryImpl;
import NguyenVanCong.service.ProductService;

public class ProductServiceImpl implements ProductService {
    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();

    @Override
    public void add(int index, Product product) {
    productRepository.add(index,product);
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void set(int index, Product product) {
        productRepository.set(index,product);
    }

    @Override
    public void remove(int index) {
         productRepository.remove(index);
    }

    @Override
    public int find(String product) {
        return productRepository.find(product);
    }

    @Override
    public String display() {
       return productRepository.display();
    }

    @Override
    public void sortUpPrice() {
        productRepository.sortUpPrice();
    }

    @Override
    public void sortDownPrice() {
        productRepository.sortDownPrice();
    }
}
