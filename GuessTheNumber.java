import java.util.Scanner;

class GuessTheNumber{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Guess");

        int k = sc.nextInt();

        int randomNum = 1+(int)(Math.random()*100);
        int flag = 0;

        for(int i=1;i<=k;i++){
            System.out.println(k-i+1 + " guess remaining");
            System.out.println("Enter your "+ i + " guess");
            int guessNum = sc.nextInt();

            if(guessNum==randomNum){
                System.out.println("wow you guessed it right");
                flag = 1;
                break;
            }
            else if(guessNum>randomNum){
                System.out.println("Guess Lower");
            }
            else{
                System.out.println("Guess Higher");
            }
        }

        if(flag==0){
            System.out.println("0 guess remaining");
            System.out.println("The correct number was "+ randomNum);
        }
    }

}