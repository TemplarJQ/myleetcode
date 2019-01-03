/**
 * @author: lblade
 * @Date: Created in 3:01 PM 2019/1/3
 */
public class WordDictionary {

    private TrieNode root;

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }

    public TrieNode getRoot() {
        return root;
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode node = root;
        char[] slip = word.toCharArray();
        int cur_level = 0;
        for(char key:slip){
//            node.level = cur_level;
            //这个条件必须注释掉，不然长度不够无法判断，初始化的root的节点都是-1
            cur_level++;
            if(node.children[key-'a']==null){
                node.children[key-'a'] = new TrieNode();
            }
            node = node.children[key-'a'];
        }
        node.level = cur_level;
//        node.val = word;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return search(word,root,0);
    }

    public boolean search(String word, TrieNode begin, int cur_level) {
        if(begin==null){return false;}
        TrieNode node = begin;
        char[] slip = word.toCharArray();
        for(int i=0;i<slip.length;i++){
//            node.level = cur_level;
            cur_level++;
            if(slip[i]=='.'){
                for(TrieNode child:node.children){
//                    System.out.println(word.substring(i+1));
//                    if(child!=null){
//                        System.out.println("i am fine.");
//                    }
//                    System.out.println("::"+search(word.substring(i+1),child));
                    if(search(word.substring(i+1),child,cur_level)){
                        return true;
                    }
                }
            }
            else{
                if(node.children[slip[i]-'a']==null){
                    return false;
                }
                node = node.children[slip[i]-'a'];
            }
        }

        //杜绝没走到头
        for(TrieNode child:node.children) {
            if(child!=null){
                return false;
            }
        }
        //这里千万注意，不能返回这个条件，因为如果切成了ad，那么就不可能和最后的bad重合。
        //但是仅仅返回true不能杜绝插入a，搜索[a.]与[.a]只返回true的情况
        //所以必须校验层数正确
        return cur_level==node.level;
    }

}
