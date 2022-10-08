import java.util.*;
public class selectionShort{
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        for(int i=0; i<arr.length;i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){ 
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
                //swap
                int temp = arr[i];
                arr[i] = arr[minPos];
                arr[minPos] = temp;
            }
          }
          for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
          }

    }
}






// import java.util.*;
// public class Main{
//     public static void call(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             int min = i;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[min] > arr[j]){
//                 min = j;
//             }
//             //swap
//             int temp = arr[min];
//             arr[min] = arr[i];
//             arr[i] = temp;
//         }
//         }
    
//     }
//     public static void main(String args[]){
//         int arr[] = {5,3,1,2,4};
//         call(arr);
//     }
// }