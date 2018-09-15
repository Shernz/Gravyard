import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //To create anime lot with random module and for loop which has to print the randomly chosen anime
        String[] anime={"onePiece","fiaryTail","deathNote","angelBeats"};
        for (int i =0;i<anime.length;i++)
        {
            System.out.println(anime[new Random().nextInt(anime.length)]);
        }

    }
}
