package Gerhard.A3;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(5 / 0);
        }catch(ArithmeticException e){
            System.out.println("You can't divide by zero!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
}
