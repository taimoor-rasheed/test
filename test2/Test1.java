class demo1{

    public int testing(String x, int y){
        System.out.println("first method");
        return y;
    }

    public int testing(int x, String y){
        System.out.println("second mehtod");
        return x;
    }
}

public class Test1 {
    public static void main(String[] args) {
        
        demo1 d = new demo1();
        int ans1 = d.testing(10, "hello");
        System.out.println(ans1);

        int ans2 = d.testing("hello", 10);
        System.out.println(ans2);
    }
}
