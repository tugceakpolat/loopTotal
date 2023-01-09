import java.util.Scanner;
public class totalLoop {
    public static void main(String[] args) {

        //Tek sayı girilene kadar giriş alan, çift ve 4'e bölünen sayıları toplayan prog.

        int number;
        int total=0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Please enter an even number : ");
            number = input.nextInt();
            if(number % 2 == 0 && number % 4 == 0){
                total += number;
            }
        }while (number % 2 == 0);

        System.out.println("Sum of even numbers : " + total);







        //Negatif bir değer girilene kadar giriş kabul eden ve tek sayıları toplayıp ekrana basan prog.
        /*
        int input;
        int total = 0;

        Scanner add = new Scanner(System.in);

        do{
            System.out.print("Please enter number : ");
            input = add.nextInt();
            if(input % 2 == 1){
                total+=input;
            }
        }while (input > 0);

        System.out.println("Total : " + total);
         */
    }
}
