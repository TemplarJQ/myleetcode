class Trie {

    private TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
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

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        char[] slip = word.toCharArray();
        for(char key:slip){
            if(node.children[key-'a']==null){
                return false;
            }
            node = node.children[key-'a'];
        }
        return node.val.equals(word);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        char[] slip = prefix.toCharArray();
        for(char key:slip){
            if(node.children[key-'a']==null){
                return false;
            }
            node = node.children[key-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
class TrieNode{
    public String val;
    public TrieNode[] children;
    public TrieNode(){
        val = "";
        children = new TrieNode[26];
    }
}