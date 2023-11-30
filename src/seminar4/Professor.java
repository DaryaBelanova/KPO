package seminar4;

public class Professor extends Person implements Employee{
    private double salary;
    private Staff boss;
    public double getSalary() {
        return salary;
    }

    public Staff getBoss() {
        return boss;
    }

    public Professor(String name, String lastName) {
        super(name, lastName);
    }

    public void assignBoss(Staff boss) {
        this.boss = boss;
    }
    @Override
    public void fire() {
        System.out.println(toString() + " был уволен");
    }

    @Override
    public void increaseSalary(double amount) {
        salary += amount;
    }

    @Override
    public String toString() {
        return "Профессор " + super.toString() + " с зарплатой " + salary + "; начальник: " + boss.toString();
    }
}
