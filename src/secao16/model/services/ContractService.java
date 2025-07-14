package secao16.model.services;

import secao16.model.entities.Contract;
import secao16.model.entities.Instaliment;
import secao16.model.interfaces.OnlinePaymentService;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1 ; i <= months ; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee( basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstalments().add(new Instaliment(dueDate, quota));
        }
    }
}
