public class new05 {
    public static void main(String[] args){
        String a = "abcda";

        System.out.println(a);

        // 某index上的字母
        System.out.println(a.charAt(2));
        // 获取index
        System.out.println(a.indexOf("a"));
        System.out.println(a.indexOf("a",1));
        // 获取子串index
        System.out.println(a.indexOf("ab"));

        // 转list
        char li[] =  a.toCharArray();
        System.out.println(li[1]);

        // list构造
        String str1 = new String(li);
        System.out.println(str1);
        String str2 = new String(li,1,3);
        System.out.println(str2);

        String clo1 = "hello";
        String clo2 = "hello";
        String clo3 = new String("hello");
        // 地址同否
        // 有一样的直接引用
        System.out.println(clo1==clo2);
        // 内容同否
        System.out.println(clo1.equals(clo2));
        // new重新开辟
        System.out.println(clo1==clo3);


        int age = 18;
        String name = "ca";
        String format = String.format("i'm %s,years old",name,age);
        System.out.println(format);
        // 格式输出

    }
}
