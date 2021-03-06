

class WordDictionary {

    private TrieNode root;

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode node = root;
        char[] slip = word.toCharArray();
        for(char key:slip){
            if(node.children[key-'a']==null){
                node.children[key-'a'] = new TrieNode();
            }
            node = node.children[key-'a'];
        }
        node.val = word;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return search(word,root);
    }

    public boolean search(String word, TrieNode begin) {
        if(begin==null){return false;}
        TrieNode node = begin;
        char[] slip = word.toCharArray();
        for(int i=0;i<slip.length;i++){
            if(slip[i]=='.'){
                for(TrieNode child:node.children){
                    if(search(word.substring(i+1),child)){
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
        return word.equals(node.val);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */

//class TrieNode {
//    public String val;
//    public TrieNode[] children;
//    public TrieNode(){
//        val = "";
//        children = new TrieNode[26];
//    }
//}