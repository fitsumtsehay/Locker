public class Locker {

    public static void main(String[] args) {

        String[] lockers = new String[100];
        int n = lockers.length;

        for (int i = 0; i < n; i++) {
            lockers[i] = "Closed";
        }

        // open lockers
        for (int i = 0; i < n; i++) {
            lockers[i] = "Open";
        }

        for (int i = 2; i <= n; i++) {
            for (int j = i - 1; j < n; j += i) {
                if (lockers[j].equals("Open")) {
                    lockers[j] = "Closed";
                } else {
                    lockers[j] = "Open";
                }
            }
        }

        System.out.println("The lockers that remain open are Square Numbers of 1-10");
        for (int i = 0; i < n; i++) {
            if (lockers[i].equals("Open")) {
                System.out.println((i + 1));
            }
        }
    }   }