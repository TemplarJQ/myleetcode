package pg;

import java.util.ArrayList;  
import java.util.List; 

/** 
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 
 * -XX:+HeapDumpOnOutOfMemoryError 
 *  
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+HeapDumpOnOutOfMemoryError 
 *  ���ǿ���ʵ�ֵ�java�������������
 *  
 *  
 * Java����� 
 * Java �����ڴ洢����ʵ����ֻҪ���ϵĴ������󣬲��ұ�֤GC Roots������֮���пɴ�·���������������ջ��������Щ���� 
 * ��ô�����������������ѵ��������ƺ�ͻ�����ڴ�����쳣 
 */ 

public class OOMexception {
	static class OOMObject {  
		  
    }  
  
    public static void main(String[] args) {  
        List<OOMObject> list = new ArrayList<OOMexception.OOMObject>();  
        while (true) {  
            list.add(new OOMObject());  
        }  
    }  

}
