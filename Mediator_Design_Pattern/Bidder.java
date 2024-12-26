package Mediator_Design_Pattern;

import Mediator_Design_Pattern.Colleague;

public class Bidder implements Colleague {
    String name;
    AuctionMediator auctionMediator;

    Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public void placeBid(int bidAmount) {
        // TODO Auto-generated method stub
        auctionMediator.placeBid(this, bidAmount);

    }

    @Override
    public void recieveBidNotification(int bidAmount) {
        // TODO Auto-generated method stub
        System.out.println("Bidder: " + name + " got the notification that someone has put bid of: " + bidAmount);
    }

}
