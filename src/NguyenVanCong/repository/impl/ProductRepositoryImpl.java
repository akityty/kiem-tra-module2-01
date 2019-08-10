package NguyenVanCong.repository.impl;

import NguyenVanCong.model.Product;
import NguyenVanCong.repository.ProductRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductRepositoryImpl implements ProductRepository {
    ArrayList<Product> list = new ArrayList<Product>();

    @Override
    public void add(int index, Product product) {
        list.add(product);
    }

    @Override
    public void add(Product product) {
        list.add(product);
    }

    @Override
    public void set(int index, Product product) {
        list.set(index, product);
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        list.remove(index);
    }

    private void checkIndex(int index) {
        if (index < 0 || index > list.size()) {
            throw new IndexOutOfBoundsException("SO NGOAI MANG");
        }
    }

    @Override
    public int find(String name) {
        for (int i = 0; i < list.size(); i++) {
            String productName = list.get(i).getName();
            if (productName.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String display() {
        if (list.size() != 0) {
            String result = "";
            for (int i = 0; i < list.size(); i++) {
                result += "Product[" + i + "]:\n Id: " + list.get(i).getId() +
                        " name: " + list.get(i).getName() +
                        " price: " + list.get(i).getPrice() +
                        " status: " + list.get(i).isStatus() +
                        " description: " + list.get(i).getDescription() +
                        " \n ";
            }
            return result;
        } else {
            return "List is empty!!!";
        }
    }

    @Override
    public void sortUpPrice() {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
    }

    @Override
    public void sortDownPrice() {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getPrice(),o1.getPrice());
            }
        });
    }
}
