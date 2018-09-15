package calculator;

public class LinearSearch {
    private int [] list = {1,4,5,3,25};
    private int i=0,n=0;
    //LinearSearch(int [] num){
      //  list = num;

    public void linearSearch(int search){
        for( i=0;i<list.length;i++)
        {
            if(search==list[i]){
                System.out.println("Number at "+i);
                break;
            }
        }
        if(i==list.length)
        {
            System.out.println("Number not found");
        }
    }
}
