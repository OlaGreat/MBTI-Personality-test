package hugeInteger;

import java.util.Arrays;

public class HugeInteger {
    private int [] digit;
    private int size;



    public HugeInteger(){
        digit = new int[40];
        size = 0;
        
    }


    public HugeInteger parse(String input){
        HugeInteger number = new HugeInteger();
        for (int i = 0; i < input.length(); i++) {
            int extractedNumber = input.charAt(i);
            number.digit[i] = extractedNumber - '0';
        }
        return number;
    }

    public int []  add(String  input){
       HugeInteger num = new HugeInteger();
        HugeInteger secondInput = num.parse(input);

        int count = 0;
        int hold = digit[0];
        for (int i = secondInput.digit.length-1; i >= 0 ; i--) {
            int remainder ;
            int sumIndex = digit[i] + secondInput.digit[i];
                if (sumIndex > 9) {
                    digit[i] = sumIndex%10;
                    remainder = sumIndex/10;
                } else {
                    digit[i] = sumIndex;
                    remainder = 0;
                }
                while (remainder >0 &&count<=secondInput.digit.length-1 && i>0){
                    i--;
                     sumIndex = digit[i] + secondInput.digit[i] + remainder;
                    if (sumIndex > 9) {

                        digit[i]= sumIndex%10;
                        remainder = sumIndex/10;

                    }
                    else {
                        digit[i] =sumIndex;
                        remainder = 0;
                    }

                    count++;


                }
                count++;

            if (count == secondInput.digit.length){
                digit[i] = hold;
                int s = secondInput.digit[i] + remainder;
                System.out.println(remainder);
                digit[i]+=s;
                break;
            }



        }
        return digit;
    }

    public HugeInteger addition(String input){
        HugeInteger number = new HugeInteger();
        HugeInteger parsed = number.parse(input);
        int remainder =0;
        int count = 1;
        for (int i = parsed.digit.length-1; i >=0; i--) {
            if (count == parsed.digit.length){
                int sum = parsed.digit[i] + this.digit[i] + remainder;
                parsed.digit[i] = sum;
                break;
            }
            int sum = parsed.digit[i] + this.digit[i] + remainder;
            parsed.digit[i] = sum%10;
            remainder = sum/10;

            count++;
        }

        for (int i = 0; i < parsed.digit.length; i++) {
            number.digit[i] = parsed.digit[i];
        }
        return number;
    }


    public HugeInteger subtraction(HugeInteger input){
        HugeInteger num = new HugeInteger();

        for (int i = input.digit.length-1; i >=0; i--) {
            int sum = this.digit[i] - input.digit[i];
            this.digit[i] = sum;

        }

        for (int i = 0; i < input.digit.length; i++) {
            num.digit[i] = this.digit[i];
        }
        return num;
    }

    public boolean isEqualTo(HugeInteger number2){
        return Arrays.equals(this.digit, number2.digit);
    }
    public boolean isNotEqualTo(HugeInteger number2){
        if (this.digit != number2.digit) return true;
        return false;
    }
    public boolean isGreaterThan(HugeInteger input){
        for (int i = 0; i < digit.length; i++) {
            if (digit[i]>input.digit[i]) return true;
        }
        return false;
    }


    public boolean isLessThan(HugeInteger input){
        for (int i = 0; i < digit.length; i++) {
            if (digit[i]<input.digit[i]) return true;
        }
        return false;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HugeInteger{");
        sb.append("digit=").append(Arrays.toString(digit));
        sb.append('}');
        return sb.toString();
    }

























    //
//    public int [] subtract (String input){
//        HugeInteger num = new HugeInteger();
//        int [] secondInput = num.parse(input);
//        int count = 0;
//        int hold = digit[0];
//        for (int i = secondInput.length-1; i >= 0 ; i--) {
//            int remainder ;
//            int sumIndex = digit[i] - secondInput[i];
//            if (sumIndex > 9) {
//                digit[i] = sumIndex%10;
//                remainder = sumIndex/10;
//            } else {
//                digit[i] = sumIndex;
//                remainder = 0;
//            }
//            while (remainder >0 &&count<=secondInput.length-1 && i>0){
//                i--;
//                sumIndex = digit[i] - secondInput[i] - remainder;
//                if (sumIndex > 9) {
//
//                    digit[i]= sumIndex%10;
//                    remainder = sumIndex/10;
//
//                }
//                else {
//                    digit[i] =sumIndex;
//                    remainder = 0;
//                }
//
//                count++;
//
//
//            }
//            count++;
//
//            if (count == secondInput.length){
//                digit[i] = hold;
//                int s = secondInput[i] - remainder;
//                digit[i]-=s;
//                break;
//            }
//
//
//
//        }
//        return digit;
//
//    }
}
