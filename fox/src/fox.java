//This program implements ArryaLists and FileReader to find out what the mysterious noise the fox makes.
/*
    Corey Klevan
    09-15-2021
    What Does the Fox Say?
    CS203
    Vitaly Ford
*/

import java.io.*;
import java.util.*;

public class fox
{
    public static int audio;
    public static void main(String[] args) throws FileNotFoundException
    {
        
        String animalGoesNoise = "";
        // Message will be used for the hidden message
        Scanner sc = new Scanner(new File("fox\\src\\Audio_recordings.txt"));
        // Scanner reads the audio recording text file
        audio = Integer.parseInt(sc.nextLine());
        
        ArrayList<String> sounds = new ArrayList<String>();
        String[] forSounds = null;
        // Array for all sounds

        ArrayList<String> knownSounds = new ArrayList<String>();
        // Array for sounds we know ex: dog goes woof


        for(int row = 0; row < audio; row++)
        {
            forSounds = sc.nextLine().split(" ");
            for (String word : forSounds)
            {
                sounds.add(word);
            }
            // for (int i = 0; i < forSounds.length; i++)
            // sounds.add(forSounds[i]);
        }
        // this for loop goes through the text file and finds all the sounds and puts them into a list

        while(true)
        {
            animalGoesNoise = sc.nextLine(); 
            if (animalGoesNoise.equals("what does the fox say?"))
            {
                break;
            } 
            // animalGoesNoise = "dog goes woof"
            // animalGoesNoise.split(" ") ==>> "dog", "goes", "woof"
            // animalGoesNoise.split(" ")[2] ==>> "woof"
            knownSounds.add(animalGoesNoise.split(" ")[2]);
        }

        sounds.removeAll(knownSounds);
        System.out.println(sounds);
        // Prints out the hidden message
        // Array is edited to reflect the new code
    }
}
// "the best ideas come as jokes make your think as funny as possible" - David Ogilvygit
