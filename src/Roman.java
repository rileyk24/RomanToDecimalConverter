/**
 * Roman numeral translator
 * @author riley kim
 * @version 10.13.22
 */
public class Roman {
    /**
     * the method runs through all the letters in argument and translates them into decimal form, takes into consideration invariants
     * @param roman
     * @return sum
     */
    public static int romanToDecimal(String roman) {
        //parse roman letter by letter
        // find raw point val based on the letter
        // sum point values
        // return decimal value of roman
        int sum = 0;
        roman = roman.toUpperCase();

        for (int i = 0; i < roman.length(); i++) { //string.length() ,  array.length() ,  list.size()
            //counter variable driven -> looks @ diff character addresses
            if (roman.charAt(i) == 'I')
                sum += 1;
            else if (roman.charAt(i) == 'V')
                sum += 5;
            else if (roman.charAt(i) == 'X')
                sum += 10;
            else if (roman.charAt(i) == 'L')
                sum += 50;
            else if (roman.charAt(i) == 'C')
                sum += 100;
            else if (roman.charAt(i) == 'D')
                sum += 500;
            else if (roman.charAt(i) == 'M')
                sum += 1000;
            else
                return -1;      // invalid data non-Roman numerals
        }
        //INVARIANTS
        if (roman.indexOf("IV") != -1)
            sum -= 2;
        if (roman.indexOf("IX") != -1)
            sum -= 2;
        if (roman.indexOf("XL") != -1)
            sum -= 20;
        if (roman.indexOf("XC") != -1)
            sum -= 20;
        if (roman.indexOf("CD") != -1)
            sum -= 200;
        if (roman.indexOf("CM") != -1)
            sum -= 200;
        return sum;
    }

    /**
     * EXTRA: method that returns the properly formatted (logical) roman numeral for the inputted roman numerals
     * @param decimal
     * @return romanlog
     */

    public static String decimalToRoman(int decimal) {
        String romanlog = "";
        while (decimal >= 1000) {
            romanlog += "M";
            decimal -= 1000;}
        while (decimal >= 900){
            romanlog += "CM";
            decimal -= 900;}
        while (decimal >= 500){
            romanlog += "D";
            decimal -= 500;}
        while (decimal >= 400){
            romanlog += "CD";
            decimal -= 400;}
        while (decimal >= 100){
            romanlog += "C";
            decimal -= 100;}
        while (decimal >= 90){
            romanlog += "XC";
            decimal -= 90;}
        while (decimal >= 50){
            romanlog += "L";
            decimal -= 50;}
        while (decimal >= 40){
            romanlog += "XL";
            decimal -= 40;}
        while (decimal >= 10){
            romanlog += "X";
            decimal -= 10;}
        while (decimal >= 9){
            romanlog += "IX";
            decimal -= 9;}
        while (decimal >= 5){
            romanlog += "V";
            decimal -= 5;}
        while (decimal >= 4){
            romanlog += "IV";
            decimal -= 4;}
        while (decimal >= 1){
            romanlog += "I";
            decimal -= 1;}
        return romanlog;

    }

    /**
     * main method for the class Roman: prints out the conversion of the inputted roman numerals into decimal form
     * EXTRA: IF THE INPUTTED ROMAN NUMERAL IS NOT LOGICAL, THE EXTRA WILL CONVERT THE CALCULATED DECIMAL INTO ITS PROPER ROMAN NUMERAL FORM
     * @param args
     */
    public static void main(String[] args) {
        for(String roman : args) { //for each loop -> for every string within the array args itll run the loop
            int decimal = romanToDecimal(roman);
            roman = roman.toUpperCase();

            if (decimal == -1)
                System.out.println("Input:" + roman + "=> output: invalid");
            else{
                if (roman.equals(decimalToRoman(decimal)))
                    System.out.println("Input: " + roman + "=> output: " + romanToDecimal(roman));
                else
                    System.out.println("Input: " + roman + "=> output: " + romanToDecimal(roman) + "=> logical roman numeral: " + decimalToRoman(decimal));
            }
        }
    }
}