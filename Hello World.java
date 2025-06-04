import java.util.Random;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int i = roll();
        System.out.println(i);
    }
        
        public static int roll() {
        Random rm = new Random();
        int i = rm.nextInt(5);
        return i;
    }
}