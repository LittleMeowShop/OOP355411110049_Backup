package Lab4;

public class Ex1 {

    public static void B(int a, int b) {
        System.out.println("Hello B.");
    }//B

    public static void main(String[] args) {
        System.out.println("Hello Main.");
        //call method
//        for (int i=0; i<10; i++){
//            A();
//        }
        B(5, 5);

    }//main

    public static void A() {
        //statements
        System.out.println("Hello A.");
    }//A
}//class
