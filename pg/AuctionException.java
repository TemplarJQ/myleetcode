package pg;

public class AuctionException extends Exception{
	//�޲ι���
    public AuctionException() {}
    //���ι���
    //ͨ�����ø���Ĺ��������ַ���msg�����쳣�����massage���ԣ�
    //massage���Ծ��Ƕ��쳣������
    public AuctionException(String msg) {
        super(msg);
    }
}
