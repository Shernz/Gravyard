package calculator;

public class Average {
    //Array of numbers based on the number of elements
    //declare a constructor for assigning the array
    //Declare a function for computing the average
    private int [] numlist = new int[10];
    private float sum=0;

    Average(int [] array)
    {
        numlist = array;
    }
    public float average(){
        for (int j : numlist)
            sum += j;
        return sum/numlist.length;
    }
}
