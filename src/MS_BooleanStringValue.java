import java.util.Scanner;

public class MS_BooleanStringValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String s = in.nextLine();
            if(s.length() >= 1) {
                int ans = Integer.parseInt(String.valueOf(s.charAt(0)));
                for (int i = 0; i < s.length() - 2; i+=2) {
                    int num = ans;
                    int num2 = Integer.parseInt(String.valueOf(s.charAt(i+2)));
                    switch (s.charAt(i+1)){
                        case 'A' :
                            ans = num & num2;
                            break;
                        case 'B' :
                            ans = num | num2;
                            break;
                        case 'C' :
                            ans = num ^ num2;
                            break;
                    }
                }
                System.out.println(ans);
            }
            else
                System.out.println(s);
        }
    }
}
