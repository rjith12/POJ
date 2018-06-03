public class EvenAndAdd {
        public static void main(String[] args) {
            int r[] = new int[25];
            for (int i=0; i<25; i++) {
                r[i] = (int)(Math.random()*100);
            }
            System.out.println("ODDS: ");
            for (int i=0; i<25; i++) {
                if ((r[i]%2) != 0) {
                    System.out.print(r[i] + " ");
                }
            }
            System.out.println("\nEVENS: ");
            for (int i=0; i<25; i++) {
                if ((r[i]%2) == 0) {
                    System.out.print(r[i] + " ");
                }
            }

        }

    }
