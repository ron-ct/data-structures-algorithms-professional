import java.util.List;

public class Bisect{

    /**
     * Returns the index where x should be inserted in the sorted list to maintain order
     * if x is already present, return the leftmost index at which x can be inserted
     * @param a is a sorted list
     * @param x which is the value to insert
     * @return the leftmost index to insert x
     * 
    */
   public static int bisectLeft(List<Integer> a, int x){
    int low = 0;
    int high = a.size();

    while(low < high){
        int mid = (low + high) / 2;
        if(a.get(mid) < x){
            low = mid+1;

        }else{high = mid;}
    }
    return low;

   }

   /**
    * returns the index where x should be inserted in the sorted list 'a' to maintain order.
    * if x is already present, returns the insertion point after the last occurrence
    * @param a which is a sorted list
    * @param x the value to insert
    * @return the rightmost index to insert x
   */
    public static int bisectRight(List<Integer> a, int x){
        int low = 0;
        int high = a.size();
        while (low < high){
            int mid = (low + high) / 2;
            if(a.get(mid) <= x){
                low = mid+1;

            }else{
                high = mid;
            }
        }
        return low;
    }

    //simple test for the bisect functions
    public static void main(String[] args){
        List<Integer> sortedList = List.of(1,3,3,5,6,7,9);
        int value = 3;

        int leftIndex = bisectLeft(sortedList, value);
        int rightIndex = bisectRight(sortedList, value);

        
        System.out.println("bisect_left for " + value + " returns index: " + leftIndex);   
        System.out.println("bisect_right for " + value + " returns index: " + rightIndex); 
    }

   
}