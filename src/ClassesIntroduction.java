import java.io.*;
import java.util.Scanner;

public class ClassesIntroduction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int l,w,h;
            l = in.nextInt();
            w = in.nextInt();
            h = in.nextInt();
            task obj = new task();
            obj.setHeight(h);
            obj.setLength(l);
            obj.setWidth(w);
            obj.volume();
        }
    }
}

class task{
    private int length;
    private int width;
    private int height;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void volume(){
        System.out.println(this.length*this.height*this.width);
    }
}