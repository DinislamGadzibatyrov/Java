package JavaBase;

public class EvenArray {
    public static void main(String[] args) {
        int[] evenArray = new int[10];

        for (int i = 0; i < evenArray.length; i++) {
            evenArray[i] = 20 - 2 * i;
        }

        System.out.println("Массив четных чисел: ");
        for (int num : evenArray) {
            System.out.println(num + " ");
        }
    }
}
