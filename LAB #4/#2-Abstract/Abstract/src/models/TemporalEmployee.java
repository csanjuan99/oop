package models;

public class TemporalEmployee extends Employee implements UnionMembership {


    public TemporalEmployee(
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
        return 2.5 * getBaseSalary() - getBaseSalary() * 0.286;
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
