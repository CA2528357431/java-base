public class new02 {
    public static void main(String[] args){
        int a = 3;
        int b = 9;

        if ((a+b)>100){
            System.out.println(a+b+100);
        }
        else if ((a+b)>50){
            System.out.println(a+b);
        }

        else {
            System.out.println(a+b-100);
        }

        switch (a+b){
            case 1:
                System.out.println(111);
                break;
            case 12:
                System.out.println(222);
                break;
            default:
                System.out.println(0);
        }

        int n = 0;
        while (n<3){
            System.out.println(n);
            n++;
        }

        for(int i = 0;i<3;i++){
            System.out.println(i);
        }
    }
}
