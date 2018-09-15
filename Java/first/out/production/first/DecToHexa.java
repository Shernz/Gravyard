import java.util.*;
class DecToHexa
{
    static String hexadecimal = "";
    public static void hexEquivalent(int num)
    {
        switch (num) {
            case 10:
                hexadecimal += "A";
                break;
            
            case 11:
                hexadecimal += "B";
                break;

            case 12:
                hexadecimal += "C";
                break;
            
            case 13:
                hexadecimal += "D";
                break;

            case 14:
                hexadecimal += "E";
                break;

            case 15:
                hexadecimal += "F";
                break;
            default:
                hexadecimal += Integer.toString(num);
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        int q = dec, r;
        while(q > 16)
        {
            r = q % 16;
            q /= 16;
            hexEquivalent(r);
        }
        hexEquivalent(q);
        for (int i = hexadecimal.length() - 1; i > -1; i--) {
            System.out.print(hexadecimal.charAt(i));
        }
    }
}