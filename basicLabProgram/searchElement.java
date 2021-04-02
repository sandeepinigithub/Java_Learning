import java.util.*; 

public class searchElement { 
    public static int Index(int arr[], int t) 
    { 
        if (arr == null) { 
            return -1; 
        } 
        int len = arr.length; 
        int i = 0; 
        while (i < len) { 
            if (arr[i] == t) { 
                return i; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return -1; 
    } 

    public static void main(String[] args) 
    { 
        int[] array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 }; 
  
        // find the index of 6 
        System.out.println("Index position of 5 is: " + Index(array, 6)); 
  
        // find the index of 7
        System.out.println("Index position of 7 is: " + Index(array, 7)); 
    } 
} 