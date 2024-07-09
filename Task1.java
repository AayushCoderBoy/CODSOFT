//Number Game 

import java.util.Scanner;

class GuessNumber
{
    int num;
    int random;
    int count=0;

    public void Guessnum()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Guess a number b/w 1 to 10 :");
        num=s.nextInt();

        random=(int)(Math.random()*10);

        if(num==random){
            System.out.println("You won !");
            count++;
        }

        else if(num>random){
            System.out.println("Your Guess is Too High !");
        }

        else{
            System.out.println("Your Guess is Too Low !");
        }
    }
}


public class Task1
{
    public static void main(String[] args) {

        GuessNumber obj=new GuessNumber();

        int ch=6;
        for(int i=1;i<=5;i++)
        {
            System.out.println((ch-i) +" CHANCES LEFT ! ");
            obj.Guessnum();
        }
        
        System.out.println("Total Score : "+obj.count);

       
    }
}