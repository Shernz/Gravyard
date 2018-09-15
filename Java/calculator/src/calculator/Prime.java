package calculator;

public class Prime {
    //A function with for loop
    private int factor = 0;
    Prime(){ }
    public void prime(int n){
        for (int j = 2; j <= n; j++) {
            if (n % j == 0)
                factor += 1;
        }
        if (factor==1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
