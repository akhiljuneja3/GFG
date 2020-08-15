import java.util.Scanner;

public class CamelCaseCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(t-->0){
            String s = in.nextLine();
            int count = 0;
            char[] array = s.toCharArray();
            for(char c : array){
                if(c >= 65 && c <= 90)
                    count++;
            }
            System.out.println(count);
        }
    }
}
