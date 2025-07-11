package secao13.exc1.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        return super.priceTag() + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
    }
}
