package pg;

public class AuctionTest {
	private double initPrice = 30.0;
    public void bid(String bidPrice) throws AuctionException {
        double d = 0.0;
        try{
            d = Double.parseDouble(bidPrice);
        }catch(Exception e) {
            e.printStackTrace();
            throw new AuctionException("竞拍价必须为数值，不能包含其它数值");
        }
        if(initPrice > d) {
            throw new AuctionException("竞拍价应比起拍价高");
        }
        initPrice = d;
    }
    public static void main(String[] args) {
        AuctionTest at = new AuctionTest();
        try{
            at.bid("..");
        }catch(AuctionException ae) {
            System.out.println(ae.getMessage());
        }
    }
}
