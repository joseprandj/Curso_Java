package secao9;

public class Account {

    private String nameAccount;
    private int numberAccount;
    private double balanceAccount;

    public Account(String nameAccount, int numberAccount) {
        this.nameAccount = nameAccount;
        this.numberAccount = numberAccount;
        balanceAccount = 0;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double getBalanceAccount() {
        return balanceAccount;
    }

    public void AddBalance(double valor){
        balanceAccount += valor;
    }

    public void RemoveBalance(double valor){
        balanceAccount -= (valor + 5);
    }
}
