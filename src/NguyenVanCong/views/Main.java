package NguyenVanCong.views;

import NguyenVanCong.controller.ProductController;
import NguyenVanCong.model.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductController controller = new ProductController();
        int choice;
        do {
            menu();
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    String str = controller.display();
                    System.out.println(str);
                    break;
                case 2:
                    System.out.println("Nhập vị trí cần thêm Sản Phẩm: ");
                    controller.add(inputIndex(), createProduct());
                    break;
                case 3:
                    controller.add(createProduct());
                    break;
                case 4:
                    System.out.println("Nhập Vị Trí Cần Sửa: ");
                    controller.set(inputIndex(), createProduct());
                    break;
                case 5:
                    System.out.println("Nhập Vị Trí Cần Xóa");
                    controller.remove(inputIndex());
                    break;
                case 6:
                    System.out.println("Nhập Tên Sản Phẩm: ");
                    controller.find(inputString());
                    break;
                case 7:
                    controller.sortUpPrice();
                    break;
                case 8:
                    controller.sortDownPrice();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Vui lòng nhập số từ 0-9");
                    break;
            }

        } while (choice != 0);

    }

    public static void menu() {
        System.out.println("----- Chọn Số Từ 0-8 -----");
        System.out.println("0. Thoát Chương Trình");
        System.out.println("1. Hiển Thị");
        System.out.println("2. Thêm");
        System.out.println("3. Thêm Vào Cuối Danh Sách");
        System.out.println("4. Sửa");
        System.out.println("5. Xóa");
        System.out.println("6. Tìm Sản Phẩm Theo Tên");
        System.out.println("7. Sắp Xếp Tăng Dần Theo Giá");
        System.out.println("8. Sắp Xếp Giảm Dần Theo Giá");
    }

    public static Product createProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Tạo Sản Phẩm Mới---");

        System.out.println("Nhập Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nhập Name:");
        String name = scanner.nextLine();

        System.out.println("Nhập price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Nhập status: ");
        boolean status = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Nhập description: ");
        String description = scanner.nextLine();

        return new Product(id, name, price, status, description);
    }

    public static int inputIndex() {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        scanner.nextLine();
        return index;
    }

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
