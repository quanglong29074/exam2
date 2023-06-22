package exam2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomerManagement {
    private Map<String, Customer> customerMap;
    private Scanner scanner;

    public CustomerManagement() {
        customerMap = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void addNewCustomer() {
        System.out.print("Nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.print("Nhập email khách hàng: ");
        String email = scanner.nextLine();
        System.out.print("Nhập số điện thoại khách hàng: ");
        String phoneNumber = scanner.nextLine();

        Customer customer = new Customer(name, email, phoneNumber);
        customerMap.put(name, customer);

        System.out.println("Khách hàng đã được thêm thành công.");
    }

    public void findCustomerByName() {
        System.out.print("Nhập tên khách hàng để tìm kiếm: ");
        String name = scanner.nextLine();

        if (customerMap.containsKey(name)) {
            Customer customer = customerMap.get(name);
            System.out.println("Thông tin khách hàng:");
            System.out.println("Tên: " + customer.getName());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Số điện thoại: " + customer.getPhoneNumber());
        } else {
            System.out.println("Không tìm thấy khách hàng.");
        }
    }

    public void displayAllCustomers() {
        System.out.println("Danh sách khách hàng:");

        if (customerMap.isEmpty()) {
            System.out.println("Không có khách hàng nào.");
        } else {
            for (Customer customer : customerMap.values()) {
                System.out.println("Tên: " + customer.getName());
                System.out.println("Email: " + customer.getEmail());
                System.out.println("Số điện thoại: " + customer.getPhoneNumber());
                System.out.println();
            }
        }
    }
}
