package syntax;

import java.util.ArrayList;
import java.util.List;


public class LIst_index {
	public static void main(String[] args) {
//		List<String> list=new ArrayList<String>();
//		list.add("刘备");
//		list.add("关羽");
//		list.add("赵云");
//		list.add("刘备");
//		list.add("马超");
//		list.add("刘备");
//		System.out.println(list.indexOf("刘备"));
//		System.out.println(list.lastIndexOf("刘备"));
		List<String> phone=new ArrayList<>();
        phone.add("三星");    //索引为0
        phone.add("苹果");    //索引为1
        phone.add("锤子");    //索引为2
        phone.add("华为");    //索引为3
        phone.add("小米");    //索引为4
        //原list进行遍历
        for(String pho:phone){
            System.out.println(pho);
        }
        //生成新list
        phone=phone.subList(1, 4);  //.subList(fromIndex, toIndex)      //利用索引1-4的对象重新生成一个list，但是不包含索引为4的元素，4-1=3
        for (int i = 0; i < phone.size(); i++) { // phone.size() 该方法得到list中的元素数的和
            System.out.println("新的list包含的元素是"+phone.get(i));
        }
	}
	
}
