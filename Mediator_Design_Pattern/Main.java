package Mediator_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        Auction auctionMediator = new Auction();
        Bidder b1 = new Bidder("Prashanth", auctionMediator);
        Bidder b2 = new Bidder("Alex", auctionMediator);
        Bidder b3 = new Bidder("Bob", auctionMediator);

        auctionMediator.addBidder(b1);
        auctionMediator.addBidder(b2);
        auctionMediator.addBidder(b3);

        b1.placeBid(100);
        b2.placeBid(101);

    }
}
