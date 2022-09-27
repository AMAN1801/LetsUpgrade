class Main{
    public static void main(String[] args) {
        
        int num1=36,num2=74;

        num1+=num2;
        num2=num1-num2;
        num1-=num2;

        System.out.println("First number is"+num1);
        System.out.println("Second number is"+num2);
    }
}
