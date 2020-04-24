package rejimboga;

import java.util.*;

public class rejimboga {
    public static void main(String[] args){
        doJob();
    }

    static void doJob(){
        int[] a = new int[] {1, 2, 3, 4};
        int[] b = new int[] {5, 6, 7, 8,};
        int[] c = new int[8];
        System.arraycopy(a,0,c,0, a.length);
        System.arraycopy(b,0,c,4,b.length);
        String s = Arrays.toString(c);
        System.out.println(s);
    }
}
