package secao13.exc2.Entities;

public abstract class People {
    private String name;
    private Double incomeYear;

    public People(String name, Double incomeYear) {
        this.name = name;
        this.incomeYear = incomeYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIncomeYear() {
        return incomeYear;
    }

    public void setIncomeYear(Double incomeYear) {
        this.incomeYear = incomeYear;
    }

    public abstract double CalcImp();
}
