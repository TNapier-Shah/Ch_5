/**Class: ReadPoem
 * @author: Taj Napier-Shah
 * @version: 4.0.4
 * course: ITEC 2150 Spring 2023
 * written: April 16, 2023
 * Description: Takes the poem and poet nam from poem2 file and reads each onto the console
 */


package Exercise_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadPoem {

    public static void main(String[] args) {
        String fileName = "poem2.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String pm;
            String pt;


            while ((pm = reader.readLine()) != null) {

                if ((pt = reader.readLine()) != null) {

                    Poem poem = new Poem();
                    poem.setName(pm);
                    poem.setPoet(pt);


                    System.out.println("Poem");
                    System.out.println("Poem Name: " + poem.getName());
                    System.out.println("Poet: " + poem.getPoet());
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
