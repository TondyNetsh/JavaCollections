import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeInput {
    private Deque<Integer> deque = new ArrayDeque<>();
    private Scanner sc = new Scanner(System.in);

    int getSize() {
        System.out.println("Enter the size of the deque array: ");
        return sc.nextInt();
    }
    int getSubsetSize() {
        System.out.println("Enter the size a subset array: ");
        int subsetSize = sc.nextInt();
        sc.nextLine();
        return subsetSize;
    }
    Deque<Integer> getDeque() throws NumberFormatException {
        System.out.println("Enter deque elements e.g 6 2 8 3 7 1 4 4 : ");
        String element = sc.nextLine();

        String[] intArray = element.split(" ");

        for (String strNum: intArray) {
            try {
                deque.add(Integer.parseInt(strNum));
            }catch (NumberFormatException e){
                System.err.println("Invalid input");
                throw new NumberFormatException();
            }
        }
        return deque;
    }
}