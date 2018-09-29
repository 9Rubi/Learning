public class Main {
    public static <T extends Father> void start(T t){
        System.out.println("ready");
        t.fuck();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("===================================");
        start(new Son());
        System.out.println("===================================");
        start(new Daughter());
        System.out.println("===================================");
        start(new Father());
    }
}
