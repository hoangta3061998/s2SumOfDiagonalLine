import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter size of matrix:");
        size = scanner.nextInt();
        double arr[][] = new double[size][size];
        for (int i = 0; i < arr.length;i++){
            for (int j = 0; j <arr[i].length;j++){
                System.out.println("Enter value of elements row " + (i+1)+" column " + (j+1) + ":");
                arr[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Matrix:");
        double sum = 0;
        for (int i = 0 ; i<arr.length;i++){
            System.out.println();
            for (int j =0;j<arr[i].length ;j++){
                if (i == j){
                    sum += arr[i][j];
                }
                System.out.print(arr[i][j]+"\t");
            }
        }
        System.out.println("Sum of diagonal line is " + sum);
    }
}
