public class DedInsult {

    private static void dedInsult (Integer num) {
        if (num > 7) {
            Integer num1 = num - 7;
            System.out.println(num1 + " - 7");
            dedInsult(num1);
        }
    }

    public static void main(String[] args) {
        dedInsult(1007);
        System.out.println("I'am ghoul");
    }
}
