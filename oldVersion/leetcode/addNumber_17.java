package leetcode;

import java.util.ArrayList;
import java.util.List;

public class addNumber_17 {

	public static void main(String[] args) {
		String ss = "23";
		addNumber_17 temp = new addNumber_17();
		List<String> reStrings = temp.letterCombinations(ss);
		for(String string: reStrings) {
			System.out.println(string+"--");
		}
	}
	
	public List<String> letterCombinations(String digits) {
        //这个有点杨辉三角的意思
        int len = digits.length();
        List<List<String>> temp = new ArrayList<List<String>>();
        if(len == 0){return new ArrayList<String>();}
        if(len == 1){
            List<String> res = new ArrayList<>();
            List<String> head = new ArrayList<>();
            head.add("");
            res = addNumber(head,digits.charAt(0));
            return res;
        }
        List<String> head = new ArrayList<>();
        head.add("");
        temp.add(head);
        for(int i=0;i<len;i++){
            List<String> pre = temp.get(temp.size()-1);
            List<String> add = addNumber(pre,digits.charAt(i));
            temp.add(add);
        }
        return temp.get(temp.size()-1);
    }
	
	public List<String> addNumber(List<String> pre,char target){
        List<String> res = new ArrayList<>();
        for(String str:pre){
            if(target == '2'){
                res.add(str+"a");
                res.add(str+"b");
                res.add(str+"c");
            }
            if(target == '3'){
                res.add(str+"d");
                res.add(str+"e");
                res.add(str+"f");
            }
            if(target == '4'){
                res.add(str+"g");
                res.add(str+"h");
                res.add(str+"i");
            }
            if(target == '5'){
                res.add(str+"j");
                res.add(str+"k");
                res.add(str+"l");
            }
            if(target == '6'){
                res.add(str+"m");
                res.add(str+"n");
                res.add(str+"o");
            }
            if(target == '7'){
                res.add(str+"p");
                res.add(str+"q");
                res.add(str+"r");
                res.add(str+"s");
            }
            if(target == '8'){
                res.add(str+"t");
                res.add(str+"u");
                res.add(str+"v");
            }
            if(target == '9'){
                res.add(str+"w");
                res.add(str+"x");
                res.add(str+"y");
                res.add(str+"z");
            }
        }
        return res;
    }
}
