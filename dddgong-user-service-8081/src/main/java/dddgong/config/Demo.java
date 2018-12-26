package dddgong.config;

/**
 * Created by xiaoguokang on 2018/12/24
 */
public class Demo {
    public static void main(String[] args) {
        int[] ints = new int[100];
        ints[ints.length - 1] = 1;
        int n = 50;

        for (int i = 1; i <= n; i++) {
            ints = yunSuan(ints, i);

        }
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
        }

    }

    public static int[] yunSuan(int[] ints, int num) {

        for (int i = 0; i < ints.length; i++) {

            ints[i] = ints[i] * num;

        }

        for (int i = ints.length - 1; i > 0; i--) {
            ints[i - 1] = ints[i - 1] + ints[i] / 10;
            ints[i] = ints[i] % 10;

        }
        return ints;
    }

}
