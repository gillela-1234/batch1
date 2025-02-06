public class Demo064 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + java.util.Arrays.toString(array));
        swapFirstLast(array);
        System.out.println("Array after swapping: " + java.util.Arrays.toString(array));
    }

    public static void swapFirstLast(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }
}