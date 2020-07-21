package Gerhard.A1;

public class Main {
    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3};
        try {
            System.out.println(myNumbers[10]);
        }catch(Exception e){
            System.out.println("There is an Error! check it out!");
        }
    }
}
