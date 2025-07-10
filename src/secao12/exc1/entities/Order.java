package secao12.exc1.entities;

import secao12.exc1.entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double sum = 0.0;
        for (OrderItem calcTotal : items){
            sum += calcTotal.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        String name = "";
        for(OrderItem item : items){
            name += item;
        }
        return name + "\n" + "Total price: $" +  String.format("%.2f", total());
    }
}
