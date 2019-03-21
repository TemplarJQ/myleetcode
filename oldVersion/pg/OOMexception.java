package pg;

import java.util.ArrayList;  
import java.util.List; 

/** 
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 
 * -XX:+HeapDumpOnOutOfMemoryError 
 *  
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+HeapDumpOnOutOfMemoryError 
 *  这是可以实现的java虚拟机参数设置
 *  
 *  
 * Java堆溢出 
 * Java 堆用于存储对象实例，只要不断的创建对象，并且保证GC Roots到对象之间有可达路径来避免垃圾回收机制清除这些对象 
 * 那么当对象数量到达最大堆的容量限制后就会产生内存溢出异常 
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
