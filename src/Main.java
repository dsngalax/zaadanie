import java.util.Scanner;

public class Main {


    public static void main (String[]args){
        Scanner agh = new Scanner(System.in);
        System.out.print("Введите номер задачи ");
        int num = agh.nextInt();
        if (num == 1) {
            visheslenid();
        } else if (num == 2) {
            zadanie2();
        } else if (num == 3) {
            zadanie3();
        } else if (num == 4) {
            zadanie4();
        } else if (num == 5) {
            zadanie5();
        } else if (num == 6) {
            zadanie6();
        } else if (num == 7) {
            zadanie7();
        } else if (num == 8) {
            zadanie8();
        } else if (num == 9) {
            zadanie9();
        } else if (num == 10) {
            zadanie10();
        } else if (num == 11) {
            zadanie11();
        } else {
            System.out.println("Неправильно");
        }
    }


    public static void visheslenid () {

        double a = 101 + 0 / 3;
        boolean b = false;
        System.out.println("q= + (101+0/3)" + a);

        a = 3.0e-6 * 10000000.1;
        System.out.println("w= + 3.0e-6 * 10000000.1" + a);
        b = true && true;
        System.out.println("e= true && true" + b);
        b = false && true;
        System.out.println("r=false && true" + b);
        b = (false && false) | (true && true);
        System.out.println("t=(false && false) (true && true)" + b);
        b = (false | false) && (true && true);
        System.out.println("y=(false false) && (true && true" + b);
    }

    public static void zadanie2 () {
        Scanner GH = new Scanner(System.in);
        int a = GH.nextInt();
        int b = GH.nextInt();
        int c = GH.nextInt();
        int d = GH.nextInt();
        if (a != b) {
            System.out.println("неравно");

        } else if (b != c) {
            System.out.println("неравно");
        } else if (c != d) {
            System.out.println("неравно");
        } else
            System.out.println("равно");
    }

    public static void zadanie3 () {
        int[] massiv = new int[100];
        int lishnee = 0;
        for (int i = 0; i < 100; i++) {
            massiv[i] = (int) (Math.random() * 5000);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("cколько надо ");
        int k = in.nextInt();
        double[] ost = new double[k];
        for (int r = 0; r < k; r++) {

            for (int i = 0; i < 100; i++) {
                if (massiv[i] < ost[r]) {
                    ost[r] = massiv[i];
                    lishnee = i;

                }

            }
            massiv[lishnee] = 0;
            System.out.println(ost[r]);
        }

    }

    public static void zadanie4 () {
        int[] massiv = new int[100];
        int lishnee = 0;
        for (int i = 0; i < 100; i++) {
            massiv[i] = (int) (Math.random() * 400);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("cколько надо ");
        int k = in.nextInt();
        double[] ost = new double[k];
        for (int r = 0; r > k; r++) {
            ost[r] = 9999;
        }
        for (int r = 0; r < k; r++) {

            for (int i = 0; i < 100; i++) {
                if (massiv[i] < ost[r]) {
                    ost[r] = massiv[i];
                    lishnee = i;

                }

            }
            massiv[lishnee] = 999999999;
            System.out.println(ost[r]);
        }


    }


    public static void zadanie5 () {
        int[] massiv = new int[100];
        double srednee  = 0;
        for (int i=0; i<100; i++){
            massiv[i] = (int) (Math.random()*5000);
            srednee = srednee + massiv[i];
        }
        srednee = srednee / 100;
        System.out.println("Среднее значение = " + srednee);
        for (int i=0; i<100; i++){
            if(massiv[i]>srednee){
                System.out.println(massiv[i]);
            }
        }
    }

    public static int zadanie6 () {
        Scanner agh = new Scanner(System.in);
        System.out.println();
        int a = (int) agh.nextDouble();
        System.out.println();
        int b = (int) agh.nextDouble();
        int res = 0;
        for (int i = 0; i > a; i++) {
            res += b;
        }
        return res;
    }
    public static void zadanie7 () {
        long[] mas = new long[100];
        long[] chet = new long[100];
        long[] nechet = new long[100];
        int tempc=0;
        int tempn=0;
        for (int i=0; i<100; i++){
            mas[i] = (int) (Math.random()*5000);
        }
        for (int i=0;i<100;i++) {
            if (mas[i] % 2 == 0) {
                chet[tempc] = mas[i];
                tempc++;
            }
            else {
                nechet[tempn] = mas[i];
                tempn++;
            }
        }
    }
    public static void zadanie8 () {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите T в Фарегнейтах(F): ");
        double x = input.nextDouble();
        double y = (x - 32) * 5 / 9;
        System.out.println(x + " гр F = " + y + " гр С");
    }
    public static void zadanie9 () {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите вес: ");
        double mas = input.nextDouble();
        System.out.print("Введите рост: ");
        double huh = input.nextDouble();
        System.out.println("Индекс массы вашего тела - " + mas / (huh * huh));
    }

    public static void zadanie10 () {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = input.nextDouble();
        System.out.println("Квадрат a = " + a*a);
        System.out.println("Куб a = " + a*a*a);
        System.out.println("a в 4 степени = " + a*a*a*a);
    }

    public static void zadanie11 () {
        System.out.println("ff");
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первую сторону: ");
        int a = input.nextInt();
        System.out.print("Введите вторую сторону: ");
        int b = input.nextInt();
        System.out.print("Введите третью cторону: ");
        int c = input.nextInt();
        boolean stoorsum = (a < b*c) & (b < a*c) & (c < a*b);
        if (stoorsum){
            System.out.print("Треугольник есть ");
        }
        else {
            System.out.print("Треугольник есть");
        }
    }
}