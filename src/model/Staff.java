package model;

public class Staff {
    private int employeeCode;

    private String name;
    private int age;
    private String email;
    private String address;

    public Staff() {
    }

    public Staff(int employeeCode, String name, int age, String email, String address) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "employeeStaff: " +
                "name: " + name +
                "age: " + age +
                "email: " + email +
                "address: " + address;

    }
}
