import java.util.Scanner;

public class Ass1Q1 
{
    public static void main(String[] args) 
    { 
        Scanner scanner = new Scanner(System.in);
        
        String CalcFunc;
        double num1;
        double num2;
        
        System.out.println("\n~Welcome to Calculator Program~");
            
        while(true)
        {
            System.out.println("\nPlease choose your calculator function:");
            System.out.println("[1] Addition (+)");
            System.out.println("[2] Subtraction (-)");
            System.out.println("[3] Multiplication (*)");
            System.out.println("[4] Division (/)");
            System.out.println("[5] Exit");

            while (true)
            {
                CalcFunc = scanner.nextLine();
                if (CalcFunc.equals("1") || CalcFunc.equals("2") || CalcFunc.equals("3") || CalcFunc.equals("4") || CalcFunc.equals("5"))
                {
                    break;
                }
                else
                {
                    System.out.println("'" + CalcFunc + "' is not a valid option.");
                }
            }

            if (CalcFunc.equals("5"))
            {
                System.out.println("Thank you for using Calculator Program");
                break;
            }
            else
            {
                while (true)
                {
                    System.out.print("\nEnter the first number: ");
                        
                    if (scanner.hasNextDouble())
                    {
                        num1 = scanner.nextDouble();
                        break;
                    }
                    else
                    {
                        System.out.println("\nPlease enter a number");
                        scanner.next();
                    }
                }

                int i = 0;
                do
                {
                    if (i > 0)
                    {
                        System.out.println("\n!!! [Not allowed to divide by 0] !!!");
                    }
                    while (true)
                    {
                        System.out.print("\nEnter the second number: ");
                            
                        if (scanner.hasNextDouble())
                        {
                            num2 = scanner.nextDouble();
                            break;
                        }
                        else
                        {
                            System.out.println("Please enter a number");
                            scanner.next();
                        }
                    }
                    i++;
                }while (CalcFunc.equals("4") && num2 == 0);

                switch(CalcFunc)
                {
                    case "1":
                    {
                        System.out.println("\n" + num1 + " + " + num2 + " = " + (num1 + num2));
                        scanner.nextLine();
                        break;
                    }
                    case "2":
                    {
                        System.out.println("\n" + num1 + " - " + num2 + " = " + (num1 - num2));
                        scanner.nextLine();
                        break;
                    }
                    case "3":
                    {
                        System.out.println("\n" + num1 + " * " + num2 + " = " + (num1 * num2));
                        scanner.nextLine();
                        break;
                    }
                    case "4":
                    {
                        System.out.println("\n" + num1 + " / " + num2 + " = " + (num1 / num2));
                        scanner.nextLine();
                        break;
                    }
                }
                System.out.println("Press [enter] to continue...");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}