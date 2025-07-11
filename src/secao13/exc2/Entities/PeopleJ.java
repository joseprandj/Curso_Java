package secao13.exc2.Entities;

public class PeopleJ extends People{
    private Integer employees;

    public PeopleJ(String name, Double incomeYear, Integer employees) {
        super(name, incomeYear);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public double CalcImp() {
        if (employees > 10) {
            return getIncomeYear() * 0.14;
        } else {
            return getIncomeYear() * 0.16;
        }
    }
}
