package seminar2.hw2;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("N=");
        Map<Integer,Boolean> isPrimary= new HashMap<>();

        int[] myArray = new int[scanner.nextInt()];
        for (int i=0;i<myArray.length;i++){
            myArray[i]= (int) (Math.random()*1000);
            if (isPrimary.containsKey(i)){

            }
        }

    }

    /**
     * Принимает целое число и возвращает true если число простое или false в противном случае
     *
     * @param a - int целое число int
     * @return - boolean
     */
    public boolean primeNum(int a) {
        if (a <= 0) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}