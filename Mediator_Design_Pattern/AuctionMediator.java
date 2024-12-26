package Mediator_Design_Pattern;

public interface AuctionMediator {

    void addBidder(Colleague bidder);

    void placeBid(Colleague bidder, int bidAmount);

}
