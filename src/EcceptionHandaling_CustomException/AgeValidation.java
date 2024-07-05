package EcceptionHandaling_CustomException;

import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the age of the persion:");
            int age = sc.nextInt();
            validateAge(age);
            System.out.println("Age is valid:"+age);
        }catch (InvalidAgeException e){
            System.out.println("Error."+e.getMessage());
        }catch (Exception e){
            System.out.println("Error:Invalid input");
        }finally {
            sc.close();
        }
    }
    public static void validateAge(int age)throws InvalidAgeException{
        if(age<0 || age >150){
            throw new InvalidAgeException("Age must be bettween 0 and 150.Given age:"+age);
        }
    }
}
