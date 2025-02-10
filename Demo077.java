public class Demo077 {
    public void copyArray(int[] source, int[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i]; 
        }
    }
    public static void main(String[] args) {
        Demo077 demo = new Demo077();
        int[] sourceArray = {10, 20, 30, 40, 50};
        int[] destinationArray = new int[sourceArray.length];
        demo.copyArray(sourceArray, destinationArray);
        System.out.print("Copied array: ");
        for (int i = 0; i < destinationArray.length; i++) {
            System.out.print(destinationArray[i] + " ");
        }
    }
}