package pg;

/**
 * 1 ��������ڱ�GCʱ��������
 * 2 �����ԾȻ���ֻ��һ�Σ���Ϊһ�������finalize()�������ֻ�ᱻϵͳ�Զ�����һ��
 * Created by �������� on 2017-05-24.
 */
public class FinalizeEscapeGc {
    private static FinalizeEscapeGc SAVE_HOOK = null;
    private void isAlive(){
        System.out.println("yes, i am still alive :)");
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        FinalizeEscapeGc.SAVE_HOOK = this;
    }
 
    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new FinalizeEscapeGc();
        //�����һ�������Լ�
        SAVE_HOOK = null;
        System.gc();
        //��Ϊfinalize �������ȼ��ܵͣ�������ͣ0.5��ȴ���
        Thread.sleep(500);
        if(SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("no, i am dead :(");
        }
        //----------���������ȫ��ͬ�����Ծ�ʧ��---------
        //�����һ�������Լ�
        SAVE_HOOK = null;
        System.gc();
        //��Ϊfinalize �������ȼ��ܵͣ�������ͣ0.5��ȴ���
        Thread.sleep(500);
        if(SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("no, i am dead :(");
        }
    }
}

