package Template_Method_Design_Pattern;

public class PayToMerchantFlow extends PaymentFlow {
    public void validateRequest() {
        System.out.println("Validate logic of PayToMerchantFlow");
    }

    public void calculateFees() {
        System.out.println("2% fee charged");
    }

    public void debitAmount() {
        System.out.println("Debit the Amount logic of PayToMerchantFlow");
    }

    public void creditAmount() {
        System.out.println("Credit the remaining amount");
    }
}
