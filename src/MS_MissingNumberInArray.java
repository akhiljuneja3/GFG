import java.util.Arrays;
import java.util.Scanner;

public class MS_MissingNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int num = scanner.nextInt();
            int[] array = new int[num-1];
            for(int i=0;i<num-1;i++){
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            boolean flag = false;
            for(int i=1;i<num;i++){
                if(array[i-1] != i) {
                    System.out.println(i);
                    flag = true;
                    break;
                }
            }
            if(!flag)
                System.out.println(num);
        }
    }
}
