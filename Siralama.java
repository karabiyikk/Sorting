package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int n;
        int toplam = 0;
        int eleman;
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi elelan sayısını giriniz : ");
        n = input.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            toplam++;
            System.out.print("Dizinin elamanlarını giriniz : ");
            eleman = input.nextInt();
            System.out.println(toplam + ". Elemanı : " + eleman);
            list[i] = eleman;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
