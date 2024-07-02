import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSalary implements Comparable<EmployeeSalary>{
    private int baseSalary;
    private int bonus;
    private int espos;
    private int houseRentAllowances;

    private String name;

    public EmployeeSalary(int baseSalary, int bonus, int espos, int houseRentAllowances, String name) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.espos = espos;
        this.houseRentAllowances = houseRentAllowances;
        this.name = name;
    }

    public static void main(String[] args) {
        ArrayList<EmployeeSalary> employeeSalaries = new ArrayList<>();

        employeeSalaries.add(new EmployeeSalary(100, 20, 35, 100, "Rahul"));

        String A = "A";
        String B = "B";
        String c = "z";

        char a = 'a';
        char b = 'b';
        char C = 'c';

        char Z = 'Z';
        Collections.sort(employeeSalaries);

    }

    @Override
    public int compareTo(EmployeeSalary o) {
        return (this.baseSalary + this.bonus + this.houseRentAllowances + this.espos) > (o.baseSalary + o.bonus + o.houseRentAllowances + o.espos) ? 1 : 0;
    }
}
