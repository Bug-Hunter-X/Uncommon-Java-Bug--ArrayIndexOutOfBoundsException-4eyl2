public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int index = 2; // Example index within bounds
        if (index >= 0 && index < arr.length) { 
            System.out.println(arr[index]); // Safe access
        }
        else {
            System.out.println("Index out of bounds");
        }
    }
}