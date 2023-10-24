package clasesAbstractas;

public class Main {
    public static void main(String[] args) {

        Nomina n = new Nomina();
        n.addEmployee(new EmpleadoPlanta("Daniel", "Perez", 1000000, 5));
        n.addEmployee(new EmpleadoTemporal("Camila", "Lopez", 1000000, 10));
        n.getPayroll();
    }
}

