public class new03 {
    public static void main(String[] args){
        int num = 100;

        person per =new person(3,5,"007");
        System.out.println(per.say(1));
        System.out.println(per.say(3,4));
        System.out.println(square(10));

    }

    public static int square(int x){
        return x*x;
    }




}

class person{
    int age;
    int id;
    String name;
    static int total = 0;

    public person(int a,int b,String c){
        this.age = a;
        this.id = b;
        this.name = c;
        person.total+=1;
    }

    public int say(int a){
        return a;
    }

    public int say(int a,int b){
        return a+b;
    }


}
