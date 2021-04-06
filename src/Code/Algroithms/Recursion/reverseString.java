package Code.Algroithms.Recursion;

public class reverseString {
    public void solution(char[]s){
        //如果为奇数，那么只需要递归一半（长度为五 处理两个)

        int i =0;
        rec(s,i);
    }
    public void rec(char[]s, int i){
        // i 为当前遍历的度
        if (i >= s.length / 2) {
            return;
            //递归出口
        }
        char tmp = s[i];
        s[i]=s[s.length-i-1];
        s[s.length-i-1]=tmp;
        //继续调用
        rec(s,i+1);


    }
}
