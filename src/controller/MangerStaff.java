package controller;

import model.Staff;
import model.Staff_FullTime;
import model.Staff_Part_Time;

import java.util.*;

import static java.util.Collections.sort;

public class MangerStaff {
    private List<Staff> staffs;

    public MangerStaff(List<Staff> staffs) {
        this.staffs = staffs;
    }
    public MangerStaff() {
        staffs = new ArrayList<Staff>();

    }
    Scanner scanner = new Scanner(System.in);
    public void addStaff(Staff staff) {
        staffs.add(staff);
    }
    public void displayStaff() {
        for (Staff staff : staffs)
              {
                  System.out.println(staff);
        }
    }
    public void editStaff(Staff staff) {
        System.out.println("enter index: ");
        int index = scanner.nextInt();
        for (int i = 0; i < staffs.size(); i++) {
            if( i == index ){
                staffs.set(i, staff);
            }
        }
    }
    public void removeStaff() {
        System.out.println("Enter index: ");
        int index = scanner.nextInt();
        for (int i = 0; i < staffs.size(); i++) {
            if( i == index ){
                staffs.remove(i);
            }
        }
    }

    public double  averageSalary(){
        double total = 0;
        double  averageSalary = 0;
        for (Staff staff : staffs){
            if(staff instanceof Staff_FullTime){
                total += ((Staff_FullTime) staff).provision_fullTime();
            }
          if(staff instanceof Staff_Part_Time){
              total += ((Staff_Part_Time) staff).provision_partTime();
          }
        }
        return averageSalary += total / staffs.size();
    }
    public String checkSalaryFullTime(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Staff staff : staffs) {
            if(staff instanceof Staff_FullTime){
                if(((Staff_FullTime) staff).provision_fullTime() < averageSalary()){
                    stringBuilder.append("\t").append(staff.getName()).append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }
    public  double totalSalaryPartTime(){
        double totalSalaryPartTime = 0;
        for (Staff staff : staffs
             ) {
            if(staff instanceof Staff_Part_Time){
                totalSalaryPartTime += ((Staff_Part_Time) staff).provision_partTime();
            }
        }
        return totalSalaryPartTime;
    }
    public List<Staff_FullTime> sortSalary(){
        List<Staff_FullTime> result = new ArrayList<Staff_FullTime>();
        for (Staff staff : staffs
             ) {
            if(staff instanceof Staff_FullTime){
                result.add((Staff_FullTime) staff);
            }
        }
        Collections.sort(result);
        return result;
    }
}
