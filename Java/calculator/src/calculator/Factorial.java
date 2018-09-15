package calculator;

public class Factorial {
    private int f=1;
    Factorial(){ }
    public void factorial(int num){
        for(int i=1; i<=num; i++)
            f*=i;
        System.out.println("Factorial="+f);
    }
}
