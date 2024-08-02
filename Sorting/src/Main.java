import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int arr[] = {-67,88,7,77,-6};
        bubble(arr);
        System.out.println(Arrays.toString((arr)));

    }
    static void bubble(int arr[]){
        boolean swapped;
        for(int i = 0;i<arr.length;i++){
            swapped = false;
            for(int j = 1;j<arr.length - i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}