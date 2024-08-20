public class BinaryToDecimal {
    public static void main(String[] args) {
        String binaryString = "1100";
        int decimalValue = convertBinaryToDecimal(binaryString);
        System.out.println("Decimal Equivalent of " + binaryString + " is " + decimalValue);
    }

    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            if (binary.charAt(length - 1 - i) == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }
}
