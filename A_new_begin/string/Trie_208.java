class Solution {
    
    //鬼知道java的字符串有startWith这个功能。。。
    public String replaceWords(List<String> dict, String sentence) {
        String[] ss = sentence.split(" ");
        for(int i = 0;i< ss.length;i++){
            for(String s:dict){
                if(ss[i].startsWith(s)){
                    ss[i] = s;
                    break;
                }
            }
        }
//         StringBuilder sb = new StringBuilder();
//         for(int i = 0;i < ss.length;i++){
//             sb.append(ss[i]);
//             if(i != ss.length -1){
//                  sb.append(" ");
//             }
           
//         }
        
        return String.join(" ",ss);
    }
    
    
    //开始自己写的一个前缀树版本居然945ms，用的太重了
//     private TrieNode root = new TrieNode();
    
//     public String replaceWords(List<String> dict, String sentence) {
//         String[] sub = sentence.split(" ");
//         int len = sub.length;
//         StringBuilder res = new StringBuilder();
//         for(int i=0;i<len;i++){
//             String mid = isTarget(dict, sub[i]);
//             if(i==len-1){
//                 if(mid!=""){
//                     res.append(mid);
//                 }
//                 else{
//                     res.append(sub[i]);
//                 }
//                 break;
//             }
//             if(mid!=""){
//                 res.append(mid);
//                 res.append(" ");
//             }
//             else{
//                 res.append(sub[i]);
//                 res.append(" ");
//             }
//         }
//         return res.toString();
        
//     }
    
//     public void initTrie(List<String> dict){
//         for(String pres:dict){
//             TrieNode node = root;
//             for(char key:pres.toCharArray()){
//                 if(node.children[key-'a']==null){
//                     node.children[key-'a'] = new TrieNode();
//                 }
//                 node = node.children[key-'a'];
//             }
//             node.val = pres;
//         }
//     }
    
//     public String isTarget(List<String> dict, String str){
//         initTrie(dict);
//         TrieNode node = root;
//         for(char key:str.toCharArray()){
//             if(node.children[key-'a']==null&&node.val==""){
//                 return "";
//             }
//             if(node.val!=""){return node.val;}
//             node = node.children[key-'a'];
//         }
//         return node.val;
//     }
}



// class TrieNode {
//     public String val;
//     public TrieNode[] children;
//     public TrieNode(){
//         val = "";
//         children = new TrieNode[26];
//     }
// }
