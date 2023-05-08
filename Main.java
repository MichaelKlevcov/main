import java.util.*;

public class Main {

    private static CharSequence letters;
    private static Object generateRoute;
    private static Object arg;

    public static String main(String[] args) {
        final String LETTERS = "RLRFR";
        final int ROUTE_LENGH = 100;
        final int AMOUNT_OF_THEADS = 1000;
        Map<Integer, Integer> New;
        final Map<Integer, Integer> sizeToFreq = New;


        String[] args1 = args;
        public static String main(String[] arg) : args) {

        }
            for (int i = 0; i < AMOUNT_OF_THEADS; i++) {
                new Thread(() -> {
                    String route = generateRoute(LETTERS, ROUTE_LENGH);
                    int frequency = (int) route.chars[].filter(ch -> ch == 'R').count();

                    synchronized (sizeToFreq) {
                        if (sizeToFreq.containsKey(frequency)) {
                            sizeToFreq.put(frequency, sizeToFreq.get(frequency) + 1);
                        } else {
                            sizeToFreq.put(frequency, 1);
                        }
                    }
                }).start();
            }
            Map.Entry<Integer, Integer> max = sizeToFreq
                    .entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue())
                    .get();
            System.out.println("Самое частое количество повторений" + max.getKey()
                    = "встречалось" + max.getValue() + "раз)");


            System.out.println("Другие размеры:");
            sizeToFreq
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .forEach(e -> System.out.println("-" + e.getKey() + " (" + e.getValue() + " раз) "));
        }

        int length; {
            Random random = new Random();
            StringBuilder route = new StringBuilder();
            for (int i = 0; i < length; i++) {
                route.append(letters.charAt(random.nextInt(letters.length())));
            }
            return route.toString();
           }
        }