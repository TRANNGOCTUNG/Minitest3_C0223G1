package model;

import java.util.List;
import java.util.Scanner;

public class Staff_Part_Time extends Staff implements CRUD<Staff_Part_Time>,Comparable<Staff_Part_Time>{
    Scanner scanner = new Scanner(System.in);
    private int workingHours;
    public Staff_Part_Time(){

    }

    public Staff_Part_Time(int employeeCode,String name, int age, String email, String address) {
        super(employeeCode,name, age, email, address);
    }

    public Staff_Part_Time(int employeeCode, String name, int age, String email, String address,int workingHours) {
        super(employeeCode, name, age, email, address);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    public double provision_partTime(){
        return workingHours * 100.000;
    }

    @Override
    public String toString() {
        return super.toString() +
                "workingHours = " + workingHours +
                "provision_partTime = " + provision_partTime();
    }
    @Override
    public int compareTo(Staff_Part_Time o) {
        return this.workingHours - o.getWorkingHours();
    }
    @Override
    public void add(List<Staff_Part_Time> list) {
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
        list.add(staffPart);

    }

    @Override
    public void display(List<Staff_Part_Time> list) {
        for (Staff_Part_Time staffPart : list
             ) {
            System.out.println(staffPart);
        }

    }

    @Override
    public void remove(List<Staff_Part_Time> list, int index) {
        for (int i = 0; i < list.size(); i++) {
            if(index == i){
                list.remove(i);
                break;
            }
        }
    }

    @Override
    public void edit(List<Staff_Part_Time> list, int index) {
        for (int i = 0; i < list.size(); i++) {
            if(index == i){
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
                list.get(i).setEmployeeCode(employeeCodes);
                list.get(i).setName(name);
                list.get(i).setAge(age);
                list.get(i).setEmail(email);
                list.get(i).setAddress(addresses);
                list.get(i).setWorkingHours(workingHours);
                break;
            }
        }

    }
}
