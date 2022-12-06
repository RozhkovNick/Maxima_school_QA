        public class Lain {
            public static void main(String[] args) {
                int[] masiv = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                int x = 0;
                for (int i = 0; i < masiv.length; i= i+2)
                {x = x + masiv[i];}
                System.out.println("Сумма четных: " + x);
            }
        }