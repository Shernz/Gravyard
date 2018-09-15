public class Student {
    private int [] mark = new int[10];
    private int average,total;
    private String name;

    Student(int [] m ,String s){
        mark = m;
        name = s;
    }

    public void average(){
        for(int x : mark)
            total+=x;
        System.out.println(total/mark.length);
    }
}
