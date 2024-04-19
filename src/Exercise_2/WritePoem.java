/**Class: WritePoem
 * @author: Taj Napier-Shah
 * @version: 3.1.4
 * course: ITEC 2150 Spring 2023
 * written: April 16, 2023
 * Description: Writes the information about both the poem and poet onto a text file
 */


package Exercise_2;

public class WritePoem {

    public static void main(String[] args) {
        // Create three Poem objects
        Poem poem1 = new Poem();
        poem1.setName("The Raven");
        poem1.setPoet("Edgar Allen Poe");

        Poem poem2 = new Poem();
        poem2.setName("Jabberwocky");
        poem2.setPoet("Lewis Carroll");

        Poem poem3 = new Poem();
        poem3.setName("Invictus");
        poem3.setPoet("William Ernest Henley");


        System.out.println("1st Poem:");
        System.out.println("Poem Name: " + poem1.getName());
        System.out.println("Poet: " + poem1.getPoet());
        System.out.println();

        System.out.println("2nd Poem:");
        System.out.println("Poem Name: " + poem2.getName());
        System.out.println("Poet: " + poem2.getPoet());
        System.out.println();

        System.out.println("3rd Poem:");
        System.out.println("Poem Name: " + poem3.getName());
        System.out.println("Poet: " + poem3.getPoet());
    }
}
