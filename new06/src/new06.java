import java.util.Locale;

public class new06 {
    public static void main(String[] args){

        String a = "hello WORLD";
        String ali[] = a.split(" ");
        System.out.println(ali[1]);

        String upa = a.toUpperCase();
        String loa = a.toLowerCase();
        System.out.println(upa);
        System.out.println(loa);
        // 大小写

        String b = "hello world";
        boolean ju1 = b.endsWith("aa");
        boolean ju2 = b.startsWith("aa");
        System.out.println(ju1);
        System.out.println(ju2);

        String c = "    hello world    ";
        String neoc = c.trim();
        System.out.println(neoc);
        // 删除两侧空格  返回新string

        String d = a.substring(2,5);
        System.out.println(d);
        // 子列
    }
}
