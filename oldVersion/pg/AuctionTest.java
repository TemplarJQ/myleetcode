package pg;

public class AuctionTest {
	private double initPrice = 30.0;
    public void bid(String bidPrice) throws AuctionException {
        double d = 0.0;
        try{
            d = Double.parseDouble(bidPrice);
        }catch(Exception e) {
            e.printStackTrace();
            throw new AuctionException("���ļ۱���Ϊ��ֵ�����ܰ���������ֵ");
        }
        if(initPrice > d) {
            throw new AuctionException("���ļ�Ӧ�����ļ۸�");
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
