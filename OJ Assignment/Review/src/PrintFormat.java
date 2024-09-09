public class PrintFormat {
    public static void main(String[] args) {
        int testInteger = 123456789;
        float testFloat = 1.245990878f;
        String testString = "JingqiSUN";
        System.out.printf("%d\n",testInteger);
        System.out.printf("%20d\n",testInteger);
        System.out.printf("%-20d\n",testInteger);
        System.out.printf("%+d\n",testInteger);
        System.out.printf("%+20d\n",testInteger);
        System.out.printf("%,d\n",testInteger);
        System.out.printf("%,20d\n",testInteger);
        System.out.printf("%,020d\n",testInteger);
        System.out.printf("%,+020d\n",testInteger);
        System.out.printf("%,+-20d\n",testInteger);
        System.out.printf("%,-+20d\n",testInteger);
        System.out.printf("%f\n",testFloat);
        System.out.printf("%.7f\n",testFloat);
        System.out.printf("%+-20.7f\n",testFloat);
        System.out.printf("%+020.7f\n",testFloat);
        System.out.printf("%s\n",testString);
        System.out.printf("%S\n",testString);
    }
}
