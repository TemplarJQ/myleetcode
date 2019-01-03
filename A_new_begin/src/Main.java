public class Main {

    public static void main(String[] args) {

//        String str = "dad";
////        for(int i=0;i<str.length();i++){
////            if(str.charAt(i)=='.'){
////                System.out.print(str.substring(i+1));
////            }
////        }
//        System.out.print(str.substring(3));


        //测试trie_211

        WordDictionary trienode = new WordDictionary();
        trienode.addWord("bad");
        trienode.addWord("mad");
        trienode.addWord("dad");

        //毫无毛病，三个分支都得到了有效建立
//        TrieNode rep = trienode.getRoot();
//        for(TrieNode key:rep.children) {
//            if(key!=null) {
//                System.out.println("yes");
//                for(TrieNode childkey:key.children) {
//                    if(childkey!=null) {
//                        System.out.println(" i am yes");
//                    }
//
//                }
//            }
//        }
        System.out.println(trienode.search("pad"));
        System.out.println(trienode.search(".ad"));
    }
}
