package NguyenVanCong.repository;

public interface GeneralRepository<E> {
    void add(int index, E e);
    void add(E e);
    void set(int index, E e);
    void remove(int index);
    int find(String name);
    String display();


}
