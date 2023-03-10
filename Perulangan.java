public class Perulangan {
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("Nomor 1");
        for (int i = 1; i <= 11; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Nomor 2");
        for (int i = 20; i >= 0; i -= 5) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Nomor 3");
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 8; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }

        System.out.println();
        System.out.println("Nomor 4");
        int e = 1;
        int f = 2;
        int c = 3;
        System.out.print(e + " " + f + " " + c + " ");
        for (int i = 4; i <= 7; i++) {
            int d = e + f + c;
            System.out.print(d + " ");
            e = f;
            f = c;
            c = d;
        }

        System.out.println();
        System.out.println("Nomor 5");
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= i + 3; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Nomor 6");
        for (int k = 3; k <= 5; k++) {
            for (int l = 2; l <= 6; l++) {
                if (k == 3 && l <= 4) {
                    System.out.println(k + " x " + l + " = " + k * l);
                } else if (k == 4 && l >= 3 && l <= 5) {
                    System.out.println(k + "x" + l + " = " + k * l);
                } else if (k == 5 && l >= 4 && l <= 6) {
                    System.out.println(k + "x" + l + " = " + k * l);

                }
            }
        }
    }
    
}
