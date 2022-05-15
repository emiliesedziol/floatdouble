public class doublefloat {

    public static void main(String[] args) {

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;

        System.out.println(("Float min value = " + minFloatValue));
        System.out.println("Float max value n= " + maxFloatValue );

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double min value = " + minDoubleValue);
        System.out.println("Double max value n= " + maxDoubleValue );

        /*

Float min value = 1.4E-45
Float max value n= 3.4028235E38
Double min value = 4.9E-324
Double max value n= 1.7976931348623157E308
         */

        /*
        int  intValue = 5;
        float floatValue = 5f;
        double doubleValue= 5d;

        System.out.println("int " + intValue);
        System.out.println("Float " + floatValue);
        System.out.println("Double " + doubleValue);

int 5
Float 5.0
Double 5.0




        int  intValue = 5 / 22;
        float floatValue = 5f / 2f;
        double doubleValue= 5d / 2d;

        System.out.println("int / 2 " + intValue);
        System.out.println("Float / 2 " + floatValue);
        System.out.println("Double / 2 " + doubleValue);
        int / 2 0
Float / 2 2.5
Double / 2 2.5



        int  intValue = 5 / 3;
        float floatValue = 5f / 3f;
        double doubleValue= 5d / 3d;

        System.out.println("int / 3 " + intValue);
        System.out.println("Float / 3 " + floatValue);
        System.out.println("Double / 3 " + doubleValue);

        int / 3 1
Float / 3 1.6666666
Double / 3 1.6666666666666667
         */

        double doubleNumPounds = 200d;
        double doubleConvertKilograms = doubleNumPounds * .45359237d;

        System.out.println("Convert Kilograms = " + doubleConvertKilograms);


    }
}
