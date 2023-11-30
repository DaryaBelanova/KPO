package seminar4;

public class Staff extends Person implements Employee {

    private double salary;

    public double getSalary() {
        return salary;
    }

    private String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Staff(String name, String lastName, String phoneNumber) {
        super(name, lastName);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void fire() {
        System.out.println(toString() + " уволен");
    }

    @Override
    public void increaseSalary(double amount) {
        salary += amount;
    }

    @Override
    public String toString() {
        return "Сотрудник " + super.toString() + " с зарплатой " + salary + ", номером " + phoneNumber;
    }
}
