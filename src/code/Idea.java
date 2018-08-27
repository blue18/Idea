// August 26, 2018
package code;
import java.util.Random;

public class Idea {

    public static void main(String[] args) {

        // create instance of Random class
        Random rand = new Random();

        int max_size = 15;
        LinkedList list = new LinkedList();

        // inputs 15 random number between 0 to 20
        for (int i = 0; i < max_size; i++) {
            list.addAtTheEnd(rand.nextInt(20));
        }

        // Print list
        list.printList();
    }
}
