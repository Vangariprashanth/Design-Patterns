package Template_Method_Design_Pattern;

import javax.swing.text.StyledEditorKit;

public class PayToFriend extends PaymentFlow {
    public void validateRequest() {
        System.out.println("Validate logic of payToFriend");
    }

    public void calculateFees() {
        System.out.println("0% fee charged");
    }

    public void debitAmount() {
        System.out.println("Debit the Amount logic of payToFriend");
    }

    public void creditAmount() {
        System.out.println("Credit the full amount");
    }
}
