package divideAndConquer;

public class BinarySearch{

    /**
     * @param arr, which is a sorted array
    */
    public int naiveSearch(int[] arr, int target ){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;


    }



    /**
     * @param arr, which is a sorted integer array
    */
    public int Binary_Search(int low, int high, int[] array, int target){
        int mid = high-low;
        while(high > low){
            if(array[mid] == target){return mid;}
            else if(array[mid] < target){
                return Binary_Search(mid+1, high, array, target);}
            else{return Binary_Search(low, mid-1, array, target);} 
                
        }
        return -1;

    }
}