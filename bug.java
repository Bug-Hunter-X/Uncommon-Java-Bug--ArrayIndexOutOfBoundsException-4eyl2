public class UncommonBug {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr[5]); // This will throw an ArrayIndexOutOfBoundsException
    }
}