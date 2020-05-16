public class Main {

    public static void main(String[] args) {
        Secret[] secret = Secret.values();
        int counter = 0;
        for (Secret i : secret
        ) {
            if (i.name().startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/