public class TestToReverseTheInteger {
    public static void main(String[] args) {
        int initialInteger = 984;
        int lengthOfTheInteger=0;
        int remainedInteger = initialInteger;
        int numberToTestLength = initialInteger;
        int outputInteger= 0;
        while (true){
            numberToTestLength = numberToTestLength/10;
            lengthOfTheInteger += 1;
            if (numberToTestLength == 0){
                break;
            }
        }
        for (int timeOfComputation = 0; timeOfComputation < lengthOfTheInteger; timeOfComputation++) {
            int computationPart = remainedInteger % 10;
            outputInteger = outputInteger*10+computationPart;
            remainedInteger = remainedInteger /10;
        }
        System.out.println(outputInteger);
    }
}
