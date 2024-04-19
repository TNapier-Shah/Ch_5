/**Class: ReadBook
 * @author: Taj Napier-Shah
 * @version: 2.0.0
 * course: ITEC 2150 Spring 2023
 * written: April 16, 2023
 * Description:
 */



package Exercise_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadBook {

    public static void main(String[] args){
        String a = "Book1.csv";
        int b = 0;
        int c = 0;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        try(BufferedReader read = new BufferedReader(new FileReader(a))){
            String d;

            while((d = read.readLine()) != null){
                String[] num = d.split(",");
                for(String eString: num){
                    int f =Integer.parseInt(eString.trim());
                    b += f;
                    c++;
                    if(f < low){
                        low = f;
                    }
                    if(f > high){
                        high = f;
                    }
                }
            }
        } catch(IOException | NumberFormatException e){
            e.printStackTrace();
            System.out.println("An error has occurred trying to read the file. Please try again.");
            return;
        }

        System.out.println("The sum is " + b);
        System.out.println("The lowest integer is " + low);
        System.out.println("There highest integer is " + high);

        if(c > 0){
            double ave = (double) b/c;
            System.out.println("The average of the integers is " + ave);
        }else{
            System.out.println("Integers are needed to process the average.");
        }
    }

}
