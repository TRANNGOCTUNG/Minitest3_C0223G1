package model;

import java.util.List;
import java.util.Scanner;

public class Staff_FullTime extends Staff implements CRUD<Staff_FullTime>,Comparable<Staff_FullTime> {
    private double reward;
    private double findAmount;
    private double hardSalary;
    private Scanner scanner = new Scanner(System.in);
    public Staff_FullTime(){
    }

    public Staff_FullTime(int employeeCode, String name, int age, String email, String address) {
        super(employeeCode,name, age, email, address);
    }

    public Staff_FullTime(int employeeCode,String name, int age, String email, String address,double reward, double findAmount, double hardSalary) {
        super(employeeCode,name,age,email,address);
        this.reward = reward;
        this.findAmount = findAmount;
        this.hardSalary = hardSalary;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public double getFindAmount() {
        return findAmount;
    }

    public void setFindAmount(double findAmount) {
        this.findAmount = findAmount;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }
    public double provision_fullTime() {
        return hardSalary + (reward - findAmount);
    }
    @Override
    public int compareTo(Staff_FullTime o) {
        return (int)(this.hardSalary - o.getHardSalary());
    }
    @Override
    public String toString() {
        return super.toString() +
                "reward = " + reward +
                "findAmount = " + findAmount +
                "hardSalary = " + hardSalary +
                "provision_fullTime = " + provision_fullTime();
    }

    @Override
    public void add(List<Staff_FullTime> list) {
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
        list.add(staffFullTime);
    }

    @Override
    public void display(List<Staff_FullTime> list) {
        for (Staff_FullTime staffFullTime : list) {
            System.out.println(staffFullTime);
        }
    }

    @Override
    public void remove(List<Staff_FullTime> list, int index) {
        for (int i = 0; i < list.size(); i++) {
            if(index == i){
                list.remove(i);
                break;
            }
        }
    }

    @Override
    public void edit(List<Staff_FullTime> list, int index) {
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
                System.out.println("Staff reward: ");
                double rewards = scanner.nextDouble();
                System.out.println("Staff findAmount: ");
                double findAmounts = scanner.nextDouble();
                System.out.println("Staff hardSalary: ");
                double hardSalarys = scanner.nextDouble();
                list.get(i).setEmployeeCode(employeeCodes);
                list.get(i).setName(name);
                list.get(i).setAge(age);
                list.get(i).setEmail(email);
                list.get(i).setAddress(addresses);
                list.get(i).setReward(rewards);
                list.get(i).setFindAmount(findAmounts);
                list.get(i).setHardSalary(hardSalarys);
                break;
            }
        }

    }
}
