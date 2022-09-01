public class HelloWorld {
    public static void main(String[] args) {
        print("Hello World!");
        print("conflict from master");
        print("another conflict from master");
    }

    public static void print(Object toPrint) {
        System.out.println(toPrint);
    }
}
