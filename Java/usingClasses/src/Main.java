public class Main {
    public class MyClass{
        public void showSum(float x , float y , int count)
        {
            int sum=x+y;
            for (int i = 0; i < count; i++)
                System.out.println(sum);
        }
        }
    }


	// write your code here
        MyClass m = new MyClass();
        m.showSum(9.1,8.3,10);



}
