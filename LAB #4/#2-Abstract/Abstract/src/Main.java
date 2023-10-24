import models.Payroll;
import models.PermanentEmployee;
import models.TemporalEmployee;

public class Main {
    public static void main(String[] args) {

        Payroll n = new Payroll();
        n.addEmployee(new PermanentEmployee("Daniel", "Perez", 1000000, 5));
        n.addEmployee(new TemporalEmployee("Camila", "Lopez", 1000000, 10));
        n.getPayroll();
    }
}
