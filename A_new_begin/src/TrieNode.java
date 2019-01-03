/**
 * @author: lblade
 * @Date: Created in 2:59 PM 2019/1/3
 */
public class TrieNode {
    public String val;
    public TrieNode[] children;
    public TrieNode(){
        val = "";
        children = new TrieNode[26];
    }
}
