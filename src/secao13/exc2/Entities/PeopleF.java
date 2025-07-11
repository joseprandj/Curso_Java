package secao13.exc2.Entities;

public class PeopleF extends People{
    private Double spentHealth;

    public PeopleF(String name, Double incomeYear, Double spentHealth) {
        super(name, incomeYear);
        this.spentHealth = spentHealth;
    }

    public Double getSpentHealth() {
        return spentHealth;
    }

    public void setSpentHealth(Double spentHealth) {
        this.spentHealth = spentHealth;
    }

    @Override
    public double CalcImp() {
        if (getIncomeYear() < 20000) {
            if (spentHealth != 0) {
                return (getIncomeYear() * 0.15) - (spentHealth * 0.5);
            } else {
                return getIncomeYear() * 0.15;
            }
        } else {
            if (spentHealth != 0) {
                return (getIncomeYear() * 0.25) - (spentHealth * 0.5);
            } else {
                return getIncomeYear() * 0.25;
            }
        }
    }
}
