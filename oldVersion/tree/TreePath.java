package tree;

import java.util.ArrayList;
import java.util.List;

public class TreePath {

	public List<String> getPath(TreeNode<Integer> root) {
	        List<String> res = new ArrayList<>();
	        if(root.leftChild==null&&root.rightChild==null){
	            res.add(String.valueOf(root.value));
	            return res;
	        }else{
	            if(root.leftChild!=null){
	                List<String> list = getPath(root.leftChild);
	                for(String s:list){
	                	System.out.println(s);
	                    res.add(String.valueOf(root.value)+"->"+s);
	                }
	            }
	            if(root.rightChild!=null){
	                List<String> list3 = getPath(root.rightChild);
	                for(String s:list3){
	                	System.out.println(s);
	                    res.add(String.valueOf(root.value)+"->"+s);
	                    }
	            }
	        }
	        return res;
	}
	
	
	public static void main(String[] args) {
		TreePath path = new TreePath();
		List<String> reStrings = new ArrayList<>();
		TreeNode<Integer> root = new TreeNode<>(1);
		root.addLeft(2);
		root.addRight(3);
		root.leftChild.addRight(5);
		reStrings = path.getPath(root);
		System.out.println(reStrings);
	}
}
