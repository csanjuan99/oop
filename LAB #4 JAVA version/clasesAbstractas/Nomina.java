package clasesAbstractas;

import java.util.ArrayList;
import java.util.List;


public class Nomina {

    private final List<Empleado> employees;

    public Nomina() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Empleado e) {
        employees.add(e);
    }

    public void getPayroll() {
        for (Empleado employee : employees) {
            System.out.println("***************");
            System.out.printf("%s %s %.2f%n", employee.getName(), employee.getLastname(), employee.getSalary());
            System.out.println(employee);
            System.out.println();
        }
    }

}

