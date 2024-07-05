package ExceptionHandeling_Try_Catch_Finally;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int count =0;

        System.out.println("Enter integers (type 'done' to finish):");

        while (true){
            try{
                String input = sc.next();
                if(input.equalsIgnoreCase("done")){
                    break;
                }
                int number = Integer.parseInt(input);
                sum+=number;
                count++;
            }catch (NumberFormatException e){
                System.out.println("int number = Integer.parseInt(input);");
                sc.nextLine();
            }
        }
        sc.close();

        if(count > 0){
            double average = (double) sum/count;
            System.out.println("\"Average of entered numbers: \" + average");
        }else {
            System.out.println("no valid numver entrer");
        }
    }
}
