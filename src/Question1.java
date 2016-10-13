import java.util.ArrayList;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question1 {
public static void main (String[] args){
    question1();
}
    // Create an array list with numbers 1 - 10
    // Print out size of array list

    public static void question1(){

        ArrayList<Integer> myNumList = new ArrayList<>();

        myNumList.add(1);
        myNumList.add(2);
        myNumList.add(3);
        myNumList.add(4);
        myNumList.add(5);
        myNumList.add(6);
        myNumList.add(7);
        myNumList.add(8);
        myNumList.add(9);
        myNumList.add(10);

        myNumList.size();
    }
}
