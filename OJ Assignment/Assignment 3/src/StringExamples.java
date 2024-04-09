public class StringExamples {
    public static void main(String[] args) {
        String s1 = "hello world";
        char[] charArray = new char[6];
        System.out.printf("s1: %s\n", s1);
        s1.getChars(3, 6, charArray, 1);
        for(char c : charArray) {
            System.out.print(c);
        }
    }
}
