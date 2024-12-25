package Template_Method_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        PaymentFlow payToFriend = new PayToFriend();
        payToFriend.sendMoney();
    }
}
