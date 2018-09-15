//String operations
import java.util.*;
class StringOperations
{
  Scanner in = new Scanner(System.in);
  public void append(ArrayList list)
  {
    System.out.println("Enter the string to be appended: ");
    String str = in.next();
    list.add(str);
  }
  public void insert(ArrayList list)
  {
    System.out.println("Enter the string to be inserted and the position: ");
    String str = in.next();
    int pos = in.nextInt();
    list.add(pos, str);
  }
  public void search(ArrayList<String> list)
  {
    System.out.println("Enter the string to be searched: ");
    String str = in.next();
    int pos = 0;
    for(String words : list)
    {
      if(str.compareTo(words) == 0)
      {
        System.out.println("Element found at " + pos);
        break;
      }
      pos += 1;
    }
  }
  public void listAllNeeded(ArrayList<String> list)//May point to any type so tell specificaly which type it is going to hold
  {
    System.out.println("Enter the letter: ");
    String ch = in.next();
    for (String words : list ) {
      if(ch.charAt(0) == words.charAt(0))
      {
        System.out.println(words);
      }
    }
  }
}

class Strings
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int option = 0;
    StringOperations str = new StringOperations();
    ArrayList<String> list = new ArrayList<String>();//Specify the type
    do {
      System.out.println("1.Append\n2.Insert\n3.Search\n4.List all the words starting from the character\n5.Exit\n");
      option = sc.nextInt();
      switch (option) {
        case 1: str.append(list);
                break;

        case 2: str.insert(list);
                break;

        case 3: str.search(list);
                break;

        case 4: str.listAllNeeded(list);
                break;

        case 5: break;
      }
      System.out.println();
    } while (option != 5);
  }
}
