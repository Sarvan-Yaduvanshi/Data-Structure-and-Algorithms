package ARRAY;
public class subArrays {
    public static void subOfArrays(int[] numbers) {
        int total_subarray = 0;
        for ( int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int k;
                for (k = i; k <= j; k++) {
                    System.out.print(+numbers[k] + " ");     // subArray
                }
                total_subarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("The Total of SubArrays : " + total_subarray);
    }
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10,12};
        subOfArrays(numbers);
    }
}
