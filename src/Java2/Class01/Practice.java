package Java2.Class01;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> arrli = new ArrayList<>();
        for(int i = 1; i < 20; i++) {
            arrli.add(i%8);
        }
        System.out.println(arrli);


        int cur = arrli.indexOf(2);
        arrli.set(cur, -1);
        System.out.println(arrli.indexOf(2));
        arrli.set(cur,2);
        System.out.println(arrli);

    }
}
