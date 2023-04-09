package view;

import model.CRUD;
import model.Staff;
import model.Staff_FullTime;
import controller.MangerStaff;
import model.Staff_Part_Time;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowStaff {
    static Scanner scanner = new Scanner(System.in);
    static int choice;
    static List<Staff> staffList = new ArrayList<Staff>();
    static MangerStaff mangerStaff = new MangerStaff(staffList);
    public static void main(String[] args) {

        staffList.add(new Staff_FullTime(1,"Trần Hồng Quân",23,"hongquan@gamail.com","Hà Nội",2000.000,2000.000,6000.000));
        staffList.add(new Staff_FullTime(2,"Nguyễn Hồng An",20,"hongan@gamail.com","Nam Định",3000.000,3000.000,5000.000));
        staffList.add(new Staff_FullTime(3,"Lê Hồng Bình",18,"hongbình@gamail.com","Hà Nam",1000.000,1000.000,7000.000));
        staffList.add(new Staff_Part_Time(4,"Bùi Thị Diệu",19,"dieu@gamil.com","Thái Bình",20));
        staffList.add(new Staff_Part_Time(5,"Bùi Thị Thảo",21,"thao@gamil.com","Thái Bình",18));
        staffList.add(new Staff_Part_Time(6,"Trần Minh Ngọc",23,"minhngoc@gamil.com","Nam Định",25));
        for (Staff s: staffList
             ) {
            System.out.println(s);
        }
        do {
            System.out.println("""
                    Menu:
                     1. Thêm nhân viên vào danh sách.
                     2. Hiển thị danh sách nhân viên.
                     3. Sửa dữ liệu nhân viên.
                     4. Xóa nhân viên trong danh sách.
                     5. Hiển thị trung bình lương tất cả nhân viên công ty.
                     6. Danh sách nhân viên Fulltime lương thấp hơn trung bình.
                     7. Số tiền phải trả cho nhân viên parttime.
                     8. Bảng lương nhân viên fulltime theo thứ tự từ thấp đến cao.
                     0. Thoát khỏi chương trình.
                    """);
            System.out.println("Enter choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    mangerStaff.addStaff(addStaffs());
                }
                case 2 -> {
                    mangerStaff.displayStaff();
                }
                case 3 -> {
                    mangerStaff.editStaff(editStaffs());
                }
                case 4 -> {
                    mangerStaff.removeStaff();
                }
                case 5 -> {
                    System.out.println("Trung bình lương tất cả nhân viên là: " + mangerStaff.averageSalary());
                    ;
                }
                case 6 -> {
                    System.out.println("Danh sách nhân viên fulltime thấp hơn lương trung bình: " + mangerStaff.checkSalaryFullTime());
                }
                case 7 -> {
                    System.out.println("Số tiền phải trả cho nhân viê pasttime: " + mangerStaff.totalSalaryPartTime());
                }
                case 8 -> {
                    System.out.println("Bảng lương nhân viên theo thứ tự từ thấp đến cao: " + mangerStaff.sortSalary());
                }
                case 0 -> System.exit(0);
            }
        } while (choice != 0);
    }
    public static Staff addStaffs() {
        System.out.println(" Bạn muốn thêm thành phần nào:\n" +
                "1. nhân viên fulltime\n" +
                "2. nhân viên parttime\n");
        choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Staff employeeCode: ");
                int employeeCodes = scanner.nextInt();
                System.out.println("Staff name: ");
                String name = scanner.next();
                System.out.println("Staff age: ");
                int age = scanner.nextInt();
                System.out.println("Staff email: ");
                String email = scanner.next();
                System.out.println("Staff addresses: ");
                String addresses = scanner.next();
                System.out.println("Staff reward: ");
                double rewards = scanner.nextDouble();
                System.out.println("Staff findAmount: ");
                double findAmounts = scanner.nextDouble();
                System.out.println("Staff hardSalary: ");
                double hardSalarys = scanner.nextDouble();
                Staff_FullTime staffFullTime = new Staff_FullTime(employeeCodes,name,age,email,addresses,rewards,findAmounts,hardSalarys);
                return staffFullTime;
            }
            case 2 -> {
                System.out.println("Staff employeeCode: ");
                int employeeCodes = scanner.nextInt();
                System.out.println("Staff name: ");
                String name = scanner.next();
                System.out.println("Staff age: ");
                int age = scanner.nextInt();
                System.out.println("Staff email: ");
                String email = scanner.next();
                System.out.println("Staff addresses: ");
                String addresses = scanner.next();
                System.out.println("Staff workingHours: ");
                int workingHours = scanner.nextInt();
                Staff_Part_Time staffPart = new Staff_Part_Time(employeeCodes,name, age,email, addresses,workingHours );
                return staffPart;
            }
            default -> System.out.println("Xin nhập lại, 1 hoặc 2");
        }
        return null;
    }
    public static Staff editStaffs() {
        System.out.println("""
                Bạn muốn sửa nhân viên
                1.Sửa nhân viên fulltime.
                2.sửa nhân viên parttime.
                """);
        choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Staff employeeCode: ");
                int employeeCodes = scanner.nextInt();
                System.out.println("Staff name: ");
                String name = scanner.next();
                System.out.println("Staff age: ");
                int age = scanner.nextInt();
                System.out.println("Staff email: ");
                String email = scanner.next();
                System.out.println("Staff addresses: ");
                String addresses = scanner.next();
                System.out.println("Staff reward: ");
                double rewards = scanner.nextDouble();
                System.out.println("Staff findAmount: ");
                double findAmounts = scanner.nextDouble();
                System.out.println("Staff hardSalary: ");
                double hardSalarys = scanner.nextDouble();
                Staff_FullTime staffFullTime = new Staff_FullTime(employeeCodes,name,age,email,addresses,rewards,findAmounts,hardSalarys);
                return staffFullTime;
            }
            case 2 -> {
                System.out.println("Staff employeeCode: ");
                int employeeCodes = scanner.nextInt();
                System.out.println("Staff name: ");
                String name = scanner.next();
                System.out.println("Staff age: ");
                int age = scanner.nextInt();
                System.out.println("Staff email: ");
                String email = scanner.next();
                System.out.println("Staff addresses: ");
                String addresses = scanner.next();
                System.out.println("Staff workingHours: ");
                int workingHours = scanner.nextInt();
                Staff_Part_Time staffPart = new Staff_Part_Time(employeeCodes,name, age,email, addresses,workingHours );
                return staffPart;
            }
            default -> System.out.println("Please en-enter");
            }
            return null;
        }
    }
