package javaprogramme_week9_homework;

/**
 Write a Java program to reverse an array of integer values.

 */
public class Programme3_Reverse_ArrayInteger {
    public static void main(String[] args) {
        Programme3_Reverse_ArrayInteger obj1= new Programme3_Reverse_ArrayInteger();
        obj1.ArrayMethod();

    }

    public void ArrayMethod(){
        int [] arr = new int []{1,2,3,4,5};
        System.out.println("Original array: ");
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i] + " ");
        }


    }

}
