
public class Selection {

    public static void main(String[] args) {
        int temp;
        int arr[] = {7, 6, 5, 8, 9};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;             
                }           
            }
        }
        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
    }
}
