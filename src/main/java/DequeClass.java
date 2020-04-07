import java.util.*;

public class DequeClass {
    int dequeProcess(ArrayDeque<Integer> deque, int subsetSize){

        HashSet<Integer> matching = new HashSet<>();
        ArrayList<Integer> uniqueSizesList = new ArrayList<>();

        int subSetNum = deque.size() - subsetSize + 1;

        for (int i = 0; i < subSetNum; i++) {
            Object[] deqAsArray = deque.toArray();

            int count = deque.size()-1;

            for (int j = 0; j < subsetSize; j++) {
                matching.add((Integer) deqAsArray[count-j]);
            }
            deque.removeLast();
            uniqueSizesList.add(matching.size());
            matching.clear();
        }
        return determineMax(uniqueSizesList);
    }
    // Look for the highest number
    int determineMax(ArrayList<Integer> uniqueSizes){
        int max = 0;
        for(Integer num : uniqueSizes){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}