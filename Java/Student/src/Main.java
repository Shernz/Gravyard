public class Main {

    public static void main(String[] args) {
	// write your code here
        int [][] markList = {{23,34,45},{12,23,55},{45,23,45}};
        String [] nameList = {"Abc","Def","Gfh"};
        Student [] student = new Student[3];//Array of objects
        student[0] = new Student(markList[0],nameList[0]);//To make a note that the new operator is necessary while declaring any object
        student[1] = new Student(markList[1],nameList[1]);
        student[2] = new Student(markList[2],nameList[2]);
        for (Student obj: student)
            obj.average();

    }
}
