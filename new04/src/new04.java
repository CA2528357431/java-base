public class new04 {

    public static void main(String[] args){
        int a[];
        a = new int[3];

        System.out.println(a);

        System.out.println(a[0]);
        System.out.println(a[1]);
        a[2] = 100;
        System.out.println(a[2]);

        int b[] = {199,3,4};
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        int c[][] = {{1,2},{3,4}};
        System.out.println(c[0][0]);



        int m[] = {1,2};
        int n[] = {1,2};
        System.out.println(m==n);

    }

}
