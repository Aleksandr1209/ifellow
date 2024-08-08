public class Exercise1 {
    public static void main(String[] args) {
        int len = 10;
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
            System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        float average = (float)sum/len;
        System.out.println("\nмасимальное число = " + max + "\nминимальное число = " + min + "\nсреднее значение = " + average);
    }
}
