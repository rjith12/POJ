public class GeneratedNumber {
        public static void main(String[] args) {
            int array[] = new int[101];
            System.out.format("%-10s %20s", "Index", "Generated Number\n");
            for (int i = 0; i < 101; i++) {
                int num = i;
                int a, b, c, d;
                d = num % 10;
                c = (num % 100) / 10;
                b = (num - c * 10 - d) / 100;
                a = num + b + c + d;
                array[i] = a;
                System.out.format("%-10s %20s", i, a + "\n") ;
            }

        }

    }

