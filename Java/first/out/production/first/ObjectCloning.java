/*class ObjectCloning implements Cloneable//interface that is implemented
{
    int n = 3;
    public Object clone()throws CloneNotSupportedException //
    {
        return super.clone();//calls the clone() of the object class
    }
    public static void main(String[] args)throws CloneNotSupportedException {
        try{
        ObjectCloning o1 = new ObjectCloning();
        System.out.println("Object 1 : " + o1.n);
        ObjectCloning o2 = (ObjectCloning) o1.clone();//remember to type cast to convert the returned object to the one you want
        System.out.println("Object 2 : " + o2.n);    
        }
        catch(CloneNotSupportedException e)
        {}
    }
}*/
class StringPrint
{
    public static void main(String[] args) {
        String toPrint = "Prints in the reverse";
        for (int i = toPrint.length(); i > -1; i--) {
            System.out.println(toPrint[]);
        }
       // System.out.println(toPrint.charAt(0));
    }
}