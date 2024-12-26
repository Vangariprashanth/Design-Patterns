package Mediator_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {

    List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        // TODO Auto-generated method stub
        colleagues.add(bidder);

    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        // TODO Auto-generated method stub
        for (Colleague colleague : colleagues) {
            if (!bidder.getName().equals(colleague.getName())) {
                colleague.recieveBidNotification(bidAmount);
            }
        }

    }

}
