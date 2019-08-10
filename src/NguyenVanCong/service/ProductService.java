package NguyenVanCong.service;

import NguyenVanCong.model.Product;
import NguyenVanCong.repository.GeneralRepository;

public interface ProductService extends GeneralRepository<Product> {
    @Override
    void add(int index, Product product);

    @Override
    void add(Product product);

    @Override
    void set(int index, Product product);

    @Override
    void remove(int index);

    @Override
    int find(String product);

    @Override
    String display();
    void sortUpPrice();
    void sortDownPrice();
}
