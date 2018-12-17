package Lab3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);

        //name
        System.out.print("what is your nickname? : ");
        name = sc.nextLine();
        System.out.println("Hello," + name);

        //age
        System.out.print("how old are you? : ");
        int age = sc.nextInt();
        System.out.println("you are" + age + "year old.");

        //address
        System.out.print("What address are you? : ");
        int address = sc.nextInt();
        System.out.println("you address" + address);

        //Telephone
        System.out.print("What Telephone are you? : ");
        int Telephone = sc.nextInt();
        System.out.println("Your Telephone " + Telephone);

        String sex;
        Scanner se = new Scanner(System.in);
        //sex
        System.out.print("What sex are you? : ");
        sex = se.nextLine();
        System.out.println("sex " + sex);
    }//main
}//class
