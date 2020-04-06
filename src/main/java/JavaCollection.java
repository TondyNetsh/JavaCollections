import javax.swing.*;
import java.util.*;

public class JavaCollection {
    public static ArrayList<Integer> queue = new ArrayList<Integer>();

    public static void addNumbersToQueue(){
        Scanner sc = new Scanner(System.in);

        int intNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of integers in the set."));
        int subArraySize = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter sub array size"));

        for(int i = 0; i < intNumber;i++){
//            System.out.println("Enter number: ");
//            int num = sc.nextInt();
            int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number"));
            queue.add(num);
        }

        for(int i = 0; i < queue.size();i++){
            int max = 0;
            if(i < subArraySize){
                max = queue.get(i);
            }
            else if(i > subArraySize){
                max = queue.get(i);
            }
        }

        System.out.println(queue);
    }

    public static void main(String[] args) {
        JavaCollection.addNumbersToQueue();
    }
}