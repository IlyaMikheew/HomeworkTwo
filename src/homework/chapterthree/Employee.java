package homework.chapterthree;

public class Employee implements Measurable{
    private String name;
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getMeasure() {
        return salary;
    }


}
