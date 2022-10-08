import java.util.*;
public class insertionShort{
    public static void call(int arr[]){  //5 4 1 3 2
        for(int i=1; i<arr.length; i++){  //0 1 2 3 4
            int curr = arr[i];
            int prev = i-1;
//finding out the correct position for insertion
        while(prev>=0; && arr[prev]>curr){
            arr[prev+1] = arr[prev];
            prev--;
        }
//insertion
        arr[prev+1] = curr;
        public static void main(String[] args) {
            int arr[] = {3,8,6,2,1,5,9};
            call(arr);
            
        }
        }

    }
}