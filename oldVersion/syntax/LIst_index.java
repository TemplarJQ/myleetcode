package syntax;

import java.util.ArrayList;
import java.util.List;


public class LIst_index {
	public static void main(String[] args) {
//		List<String> list=new ArrayList<String>();
//		list.add("����");
//		list.add("����");
//		list.add("����");
//		list.add("����");
//		list.add("��");
//		list.add("����");
//		System.out.println(list.indexOf("����"));
//		System.out.println(list.lastIndexOf("����"));
		List<String> phone=new ArrayList<>();
        phone.add("����");    //����Ϊ0
        phone.add("ƻ��");    //����Ϊ1
        phone.add("����");    //����Ϊ2
        phone.add("��Ϊ");    //����Ϊ3
        phone.add("С��");    //����Ϊ4
        //ԭlist���б���
        for(String pho:phone){
            System.out.println(pho);
        }
        //������list
        phone=phone.subList(1, 4);  //.subList(fromIndex, toIndex)      //��������1-4�Ķ�����������һ��list�����ǲ���������Ϊ4��Ԫ�أ�4-1=3
        for (int i = 0; i < phone.size(); i++) { // phone.size() �÷����õ�list�е�Ԫ�����ĺ�
            System.out.println("�µ�list������Ԫ����"+phone.get(i));
        }
	}
	
}
