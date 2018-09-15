import java.util.*;//Array list exercise
import java.lang.*;
class Array
{
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        ArrayList<Integer> array = new ArrayList<> ();
        boolean end = false ;
        while (end != true)
        {
            int x = in.nextInt();
            if(x > 10)
            {
                array.add(x);
            }
            else if(x < 0)
                end = true;
        }
        for(int j : array)
        {
            System.out.print(j + " ");
        }
    }
}