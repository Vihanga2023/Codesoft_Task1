import java.util.Scanner;

class rangen
{
    public  int generator(int max,int min)
    {
        int num=(min + (int)(Math.random() * ((max - min) + 1)));
        return num;
    }
}


public class Game
{
    public static void main(String [] args)
    {

        Scanner sc=new Scanner(System.in);
        rangen rand = new rangen();

        int score =0;
        char again;
        
        System.out.println("************Welcome to Number Game******************");
       do
        {
           
            System.out.println("Enter the maximum number: ");
            int max=sc.nextInt();

            System.out.println("Enter the minimum number: ");
            int min=sc.nextInt();

            int num=rand.generator(max,min);
            int attemps=0;

            
            while(attemps<5)
            {
                System.out.println("Guess a number between "+max+" and "+min);
                int gnum=sc.nextInt();
                attemps++;

                if(gnum>num)
                {
                    System.out.println("Its too high");
                }
                else if(gnum<num)
                {
                    System.out.println("Its too low");
                }
                else 
                {
                    System.out.println("Its correct");
                    score++;
                    break;
                }
                
            }
            System.out.println("The random number is : "+num);

            System.out.println("Attempts = "+attemps);
            System.out.println("Score = "+score);

        
            System.out.println("Do you run this prgram again (Y/N) ?");
            again = sc.next().charAt(0);

           
        }while(again=='Y' || again=='y');

        sc.close();
        System.exit(0);
        


    }
}