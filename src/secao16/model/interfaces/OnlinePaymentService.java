package secao16.model.interfaces;

public interface OnlinePaymentService {
    Double paymentFee(double amount);
    Double interest(double amount, int months);
}
