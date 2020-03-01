package Java2.Class01;

import java.util.ArrayList;
public class Class01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrlst = new ArrayList<>();
        arrlst.add(12);
        arrlst.add(42);
        arrlst.add(35);
        arrlst.add(1);
        arrlst.add(5);

        int sum = 0;
        for(int i = 0; i < arrlst.size(); i++) {
            if(arrlst.get(i)%2==1) sum += arrlst.get(i);
        }
        System.out.println(sum);

        int sum2 = 0;
        for(int item : arrlst) {
            sum2 += item;
        }
        System.out.println(sum2);
    }
}
