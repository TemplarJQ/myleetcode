# 刷算法要坚持三年的，只要学技术就要一直刷下去。

--2019.1.27打卡--

回家第一天，昨儿晚上刚到家，今天开始正式刷题啦，加油。



--2019.1.24打卡--

放假前的图书馆，国院的同学也都走了，4楼就我一个哈哈。
![图书馆2019.1.24](https://github.com/TemplarJQ/myleetcode/blob/master/readme_pic/library2019_1_24.jpeg)
把活干完。
![离开](https://github.com/TemplarJQ/myleetcode/blob/master/readme_pic/2019_1_24llibrary2.jpeg)

--2019.1.22打卡--

今天接到第一个活，是个内网穿透的问题，还以为会问我之前flask的东西，研究研究，下午刷题。
也没刷成，这几天先把这个活研究透了吧。



--2019.1.21打卡--

今天是假前的最后一周了，到16号回学校之前这是相当于一个月时间了，也不能松懈下来。\
先从一道斐波那契开始873（感觉题号靠后的质量不如前面的高），这个题是set遍历加上dp，dp这周整一下。\
^_^200道成就达成。\
![200成就达成](https://github.com/TemplarJQ/myleetcode/blob/master/readme_pic/200.jpg)\




--2019.1.20打卡--

emmm，很惭愧昨天荒废了。。。刚买了本《忒修斯之船》，晚上和熊又去玩儿了，年前的一个假期，感觉自己还是放松了。\
不行啊，该刷的题还要刷起来，别忘了刷算法要一直坚持下去，今天找一个类型的题目做到会，继续搞《剑指》上面的题目。\
\
剑指面试题9是“用两个栈实现队列”，那么对应在leetcode里是232题，“队列实现栈”是225题，这两题都做了。\
总结起来就是，都得俩：两个栈，要出队先把1号栈的元素都入2号栈，再出顶部元素；两个队，要出栈，先把1号队出得剩1个元素，之前的元素全入2号队，再出。\
递归：关于斐波那契也有一个思考，那就是递归是效率最低的，需要剪枝才能提高效率，还有矩形覆盖和小青蛙上台阶问题。\
![矩形覆盖](https://github.com/TemplarJQ/myleetcode/blob/master/readme_pic/juxingfugai.jpg)\
哈希查找用来高效查找，剑指50题，二叉排序树用来考数据结构，33与36题。\
二分在排序数组中找一个数字或者统计某数字出现次数用到，11(lt：153)和53题。\
典型二分法：
```
int start = 0;
        int end = nums.length - 1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        if(nums[start]==target){
            return start;
        }else{
            return -1;
        }
```
然后是寻找峰值162这道题，感觉二分还是不太溜。



--2019.1.18打卡--

要快开始干活了吧，自己的事情也要开始安排了，不能总是太被动。\
今天终于把自己调整过来了，从年前12月底调整到现在，花了整整一个月时间，好在调整过来了就没事，好好干活学习，但行好事，莫问前程。\
一首《Best is yet to come》送给自己。\
![best is yet to come](https://github.com/TemplarJQ/myleetcode/blob/master/readme_pic/best_is_yet_to_come.jpg)
早上的雀巢加一道328~,这道题需要考虑的点的划分有很多，思考的时候还是不够仔细，应该培养出先思考所有条件再动笔的习惯。\
725这道就是考虑得不够清晰，它其实需要一个数组来记录每个区间有多少个值，开始还以为只是第一个区间，读题不够仔细。\
61还行，比较简单。142环形链表2这道题很有启发，做题的时候考虑的还是不够全面。\
[带环链表的几个思考](https://www.cnblogs.com/dancingrain/p/3405197.html)



--2019.1.17打卡--

今天是周四，学长还没有联系我们，估计是代码还没有重构完成，明天就应该会联系我们了。\
旷工一天。\
今天在学scrapy，晚上又发神经，感觉自己调整间歇性迷失自我的状况总是需要很长时间。（笑哭）


--2019.1.16打卡--

拖了2天的959，今天花了一大块时间整明白了scrapy，接下来得认真刷题了。\
感觉还是欠点火候。\
今天做了两道812求三角形最大面积就是道数学题，413求等差数列这个也很有意思。最快的仍然是一个动规题目，这周末就开始琢磨。


--2019.1.15打卡--

昨天的959还没有做完，今天接着写。\
今天这个406“根据身高重建队列”其实还是蛮有意思的。
```
Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                return o2[0] - o1[0];
            }
        });
 ```
 对Arrays.sort使用了一种重排手段，这道题其实还是蛮难的，看看其他解法都还是量挺大的。\
 这个大兄弟的解法里面List<int\[]>这种手法还是第一次见到。
 ```
 List<int[]> tmp = new ArrayList<>();
        for(int i = 0;i < n;i++){
            tmp.add(people[i][1],new int[]{people[i][0],people[i][1]});
        }
 ```
 学习了
 



--2019.1.14打卡--

每天起床第一句，先给自己刷道题。\
今天做个并查集的959，这个题还是很有意思的。
![959并查集内容](https://github.com/TemplarJQ/myleetcode/blob/master/readme_pic/959_bingcha.jpg)\
晚上是一道外星字典953，还是挺有意思的，没有看起来那么简单。\
然后因为之前做的一道题目在评论里写出自己的解法被人赞牛逼了，hhhhhhh，太高兴了。\
![被赞](https://github.com/TemplarJQ/myleetcode/blob/master/readme_pic/zan.jpg)\



--2019.1.13打卡--

2019年都过了两周了，时间是真的快。\
今天把github加上hexo的博客搞出来了，以后日志之类的东西就写在上面了，省的麻烦。\
今天做上一两道就行。\
哈哈，做了一道671，看错2回题目，醉了···


--2019.1.12打卡--

今天无霾很严重，感觉近几年冬天雾霾少了，但是每次有的时候都很难受，希望以后能少一点吧。\
昨天好像只刷了2道，今天勤快一点刷上三道，找个难一点的问题下手。\
821是个简单题，但是两种不同思想还是很有意思，可能和它的测试用例有关系吧，最快的果然是个dp。\
109这个题有点垃圾的。。。我还是没学会这种头尾的遍历递归方法，用数组角标来做太容易出问题了。\
![角标遍历方法](https://github.com/TemplarJQ/myleetcode/blob/master/readme_pic/sortedListToBST_109.jpg)\
这个方法得学会啊。


--2019.1.11打卡--

今天考分布式，这课还是非常硬核的，感觉这些知识学起来很有意思也很让人舒服，可惜时间太短，不能写个作业啥的。\
晚上还有一门高操，趁没考试之前看一下今天的题目。\
leetcode_145的二叉树后续遍历的非递归方式，主要是一个pre节点记录当前节点是不是被记录过，这个题明天再看一下是不是被掌握了。\
又做了个137，只有一个数字二，还行吧，晚上回来做个难题。


--2019.1.10打卡--

昨天1.9考完的图论，很简单，出题都是去年的，感觉和日了狗一样，把题目存一下，也许学弟学妹还用得上。自己也偷了个懒，刷题没再继续下去。\
今天刷三道简单的算了。结果一上来740又是个DP题目，难受，肯定要找个机会做会DP题目。\
405这道，就是用一个字符串解决，将数字由二进制转成十六进制。有一个使用0xf的”与“操作，取目标数字后四位，并且>>>4位的迭代需要注意\
剑指的面试题5，没有找到对应的leetcode。就是一个移动指针的算法罢了。\
637层次遍历几下就写出来，也是一个进步。\
![层次遍历637](https://github.com/TemplarJQ/myleetcode/blob/master/readme_pic/level_tree_637.jpg)
最后做了一道，根据前序和中序构建二叉树的题目，leetcode_105。\

--2019.1.7打卡--

今天就做了一道506题目，这个题是map综合了排序的算法，感觉还挺有意思的，估计可以用优先队列解除\
下午考的两门，英语和大数据，英语和阿雨抄了一手题目，大数据也很简单。nice。


--2019.1.6打卡--

今天刷了2简单2中等，学了一种二维数组的右上角遍历方法，剑指面试-4，也就是leetcode74的题目，但是结果并不明显，应该是和样例有很大的关系。\
![剑指offer面试题4](https://github.com/TemplarJQ/myleetcode/blob/master/readme_pic/leetcode_74.jpeg)


--2019.1.5打卡--

今天换一种刷代码的方法，那就是先在《剑指》上面刷一个算法类型，然后去做一道到三道相同类型的题，这样效率可能会更高一点。\
先是贪心861这道，行号什么的一定要细心。晚上再来一道。


--2019.1.4打卡--

今天上午做这个153的二分法太sb了，算了半天，将近1.5h，时间效率并没有提升多少，但是分清楚了一个道理，二分法并不是回溯和递归，是要使用left和right指针交替进行的。\
今天就写了一道，这道题想的过于复杂，中等题但是思路其实并没有非常复杂，还需要多学习思路。

--2019.1.3打卡--

![今天成功解决的一波前缀树应用题，反反复复找bug，还好没放弃](https://github.com/TemplarJQ/myleetcode/blob/master/readme_pic/2019_1_3_success.jpg)
今天成功解决的一波前缀树应用题，反反复复找bug，还好没放弃，今天又花了1h就把这个题解决了，很开心woc

--2019.1.2打卡--

现在的进度是162/799，简单105，中等56，困难4，但是还有很多东西没有做完。
动规还没有开窍，回溯法耍得不够6，但是大部分数据结构的实现还是做到了，觉得有进步的就是练了优先队列，前缀树，后缀树什么的，希望进步可以更大。\
今年的一年规划先是写了个刷够700题，想了想这可真是个豪言壮语，还是定个小目标500道吧，能做完就觉得很好了。\
接下来这一年里，每次刷完难题可都要来打卡，看看一年到头能得到啥子结果。

