package calculator;

public class BinarySearch {
    private int [] list = {1,4,5,3,25};
    private boolean found = false;
    private int mid = 0, start = 0,end = list.length-1;
    BinarySearch(){ }

    public void binarySearch(int search){
        while((found!=true)&&(start<end)){
            mid = (start+end)/2;
            if (list[mid]==search){
                System.out.println("Number found in "+mid);
                found=true;
                break;
            }
            else if (list[mid]<search){
                start = mid+1;
            }
            else
                end = mid-1;
        }
        if(found==false)
            System.out.println("Number not found");
    }
}
