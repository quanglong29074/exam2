package exam2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerManagement customerManagement = new CustomerManagement();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("----- Quan hệ khách hàng - Sự quản lý -----");
            System.out.println("1. Thêm khách hàng mới");
            System.out.println("2. Tìm theo tên");
            System.out.println("3. Hiển thị tất cả");
            System.out.println("4. Thoát");
            System.out.print("Vui lòng chọn tùy chọn (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    customerManagement.addNewCustomer();
                    break;
                case 2:
                    customerManagement.findCustomerByName();
                    break;
                case 3:
                    customerManagement.displayAllCustomers();
                    break;
                case 4:
                    System.out.println("Ứng dụng kết thúc.");
                    break;
                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.println();
        }
    }
}
