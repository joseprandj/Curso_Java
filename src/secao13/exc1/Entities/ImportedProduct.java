package secao13.exc1.Entities;

public class ImportedProduct extends Product{
    private Double customFee;

    public ImportedProduct(String name, Double price, Double customFree) {
        super(name, price);
        this.customFee = customFree;
    }

    public Double getCustomFree() {
        return customFee;
    }

    public void setCustomFree(Double customFree) {
        this.customFee = customFree;
    }

    public double totalPrice(){
        return getPrice() + customFee;
    }

    @Override
    public String priceTag(){
        return getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $" + String.format("%.2f", customFee) + ")";
    }
}
