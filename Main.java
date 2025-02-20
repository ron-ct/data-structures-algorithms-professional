import divideAndConquer.*;

public class Main{

    public static void main(String[] args){
        BinarySearch binary_search = new BinarySearch();

        int[] myArray = {1, 2 ,4, 12, 42 ,65, 89, 190};
        int num = 89;

        int result = binary_search.Binary_Search(0, myArray.length-1, myArray, num);

        System.out.println(result);


    }
}