public class HelloWorld {
    public static void main(String[] args) {
        print("Hello World!");
        print("Here is a conflict from a feature branch");
        print("Here is another conflict from a feature branch");
    }

    public static void print(Object toPrint) {
        System.out.println(toPrint);
    }
}
