import java.util.ArrayList;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question8 {

public static void main(String[] args){
    question8();
}

    // Copy the array list from the previous question to this one.
    // Iterate over the ArrayList and print out each element.
    public static void question8() {
        ArrayList<String> Strings = new ArrayList<>();
        Strings.add("Hello");
        Strings.add("how");
        Strings.add("are");
        Strings.add("you");
        Strings.add("today?");

        for(int i = 0; i < Strings.size(); i++){
            System.out.println(Strings.get(i));
        }
    }
}
