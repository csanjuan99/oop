package clasesAbstractas;

public abstract class Empleado {
    private String name;
    private String lastname;
    private float baseSalary;
    private int years;

    public Empleado(String name, String lastname, float baseSalary, int years) {
        this.name = name;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
        this.years = years;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return String.format("%s:\nNombre=%s, Apellido=%s\nBase Salarial=%.2f, Años=%d, Salario=%.2f}",
                getClass().getSimpleName(), name, lastname, baseSalary, years, getSalary());
    }


}
