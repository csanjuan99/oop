package clasesAbstractas;

public class EmpleadoPlanta extends Empleado implements AfiliacionSindical {

    public EmpleadoPlanta(
            String name,
            String lastname,
            float baseSalary,
            int years
    ) {
        super(
                name,
                lastname,
                baseSalary,
                years
        );
    }

    @Override
    public double getSalary() {
        return 2.5 * getBaseSalary() + getAntiquityBonus() - getMembershipContribution();
    }

    @Override
    public double getAntiquityBonus() {
        if (getYears() > 10) {
            return getBaseSalary() * 0.1;
        } else {
            return getBaseSalary() * 0.05;
        }
    }

    @Override
    public double getMembershipContribution() {
        if (getYears() > 10) {
            return getBaseSalary() * 0.03;
        } else {
            return getBaseSalary() * 0.015;
        }
    }
}
