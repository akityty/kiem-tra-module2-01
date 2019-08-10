package NguyenVanCong.service;

public interface GeneralService<E>  {
    void add(int index, E e);
    void add(E e);
    void set(int index, E e);
    E remove(int index);
    int find(String e);
    String display();
}
