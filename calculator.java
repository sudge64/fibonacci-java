import java.util.Scanner;
class calculator{
    static int addition(int x, int y){
        return x+y;
    }

    static int subtraction(int x, int y){
        return x-y;
    }

    static int multiplication(int x, int y){
        return x*y;
    }

    static int division(int x, int y){
        if(y == 0){
            System.out.println("ERROR: Division by Zero!\n");
            return 0;
        }
        else{
            return x/y;
        }
    }
    
    static int modulo(int x, int y){
        if(y == 0){
            System.out.println("ERROR: Division by Zero!\n");
            return 0;
        }
        else{
            return x%y;
        }
    }
    public static void main(String args[]){
        int choice, x, y;
        Scanner read = new Scanner(System.in);
        for(;;){
            System.out.println("Calculator Program.\nPlease enter a selection for the mathematic operation to be performed and two interger values\n1.) Addition\n2.) Subtraction\n3.) Multiplcation\n4.) Division\n5.) Modular Division\n6.) Exit\nSelection : ");
            choice = read.nextInt();
            System.out.println("Enter first non-negative integer value : ");
            x = read.nextInt();
            System.out.println("Enter second non-negative integer value : ");
            y = read.nextInt();
            switch (choice)
            {
            case 1:
                System.out.println("Result : "+addition(x,y)+"\n");
                break;
            case 2:
                System.out.println("Result : "+subtraction(x,y)+"\n");
                break;
            case 3:
                System.out.println("Result : "+multiplication(x,y)+"\n");
                break;
            case 4:
                System.out.println("Result : "+division(x,y)+"\n");
                break;
            case 5:
                System.out.println("Result : "+modulo(x,y)+"\n");
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Selection invalid.\n");
                break;
            }
            read.close();
        }
    }
}