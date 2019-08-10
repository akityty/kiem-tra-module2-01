package NguyenVanCong.repository;

import NguyenVanCong.model.Product;

public interface ProductRepository extends GeneralRepository<Product> {
    @Override
    void add(int index, Product product);

    @Override
    void add(Product product);

    @Override
    void set(int index, Product product);

    @Override
    void remove(int index);

    @Override
    int find(String name);

    @Override
    String display();

    void sortUpPrice();
    void sortDownPrice();
}
