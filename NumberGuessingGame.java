import java.util.Random;
import java.util.*;
class NumberGuessingGame{
    public static void main(String[] args) {
        System.out.println("	***WELCOME TO NUMBER GUESSING GAME***	");
        System.out.println("		    <==>RULES<==>		");
	System.out.println("1.The guessing number must be in between 1 and 100 only");
	System.out.println("2.The number should be guessed with in 10 attempts!\n3.For first attempt your score will be 100 and next attempt onwords your score will decrease 10");
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
       
        int randomnumber = rd.nextInt(100) +1;
       int attempts=1;
	   int attempt=9;
       int score=100;
       
        while(attempts<=10){
        System.out.println("enter your guessing number between 1 and 100:");
        int guess=sc.nextInt();
        if(guess==randomnumber){
            System.out.println("Correct! you win!");
            System.out.println("you guessed the number at attempt:"+attempts);
            System.out.println("your score is "+score);
            break;
        }
        else if(randomnumber>guess){
            System.out.println("wrong!the number is greater,Guess again");
			System.out.println("the attempts remaining are:"+attempt);
           
        }
        else{
            System.out.println("wrong!the number is lower,Guess again");
			System.out.println("the attempts remaining are:"+attempt);
        }
           score=score-10;
		   attempt=attempt-1;
          attempts=attempts+1;
    }
    if(attempts==0)
    System.out.println("you exceeded your choices!BETTER LUCK NEXT TIME");
}
}