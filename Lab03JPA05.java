import java.util.Scanner;

public class Lab03JPA05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for(int i = 0 ; i <3; i++){
            System.out.print("Please enter one value: ");
            int total = 1;
            int number = input.nextInt();
            if (number>0 && number<11){
                for(int j = 1; j < number+1;j++){
                    total *=j;
                }
                System.err.println(number+"!: "+total);
            }else{
                System.out.println("Error,the value is out of range.");
            }
        }
    }
}
