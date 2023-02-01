public class JavaSyntaxExercises {
    public static void main(String[] args) {
        boolean boolVar = false;

        byte byteVar; //-128...127

        byte byte1 = 10;
        System.out.println("byte1: " + byte1);//10

        byte byte2 = (byte) 130;
        System.out.println("byte2: " + byte2);//-126

        System.out.println("byte1 + byte2 = " + (byte1 + byte2)); //-116
        System.out.println("byte2 - byte1 = " + (byte2 - byte1)); //-136


        int int1 = 100;
        int int2 = 500;
        System.out.println("int1: " + int1);
        System.out.println("int2: " + int2);

        System.out.println("int1 + int2 = " + (int1 + int2));//600
        System.out.println("int2 % int1 = " + (int2 % int1));//0

        double double1 = 2.5;
        double double2 = 7.1;

        System.out.println("double1: " + double1);
        System.out.println("double2: " + double2);

        System.out.println("double1 + double2 = " + (double1 + double2));//9.6
        System.out.println("double1 * double2 = " + (double1 * double2));//17.75

        System.out.println("double2 / double1 = " + (double2 / double1));//2.84


        System.out.println("int1 + double2 = " + (int1 + double2));//107.1

        float float1 = 3.5F;
        float float2 = 1.5F;

        System.out.println("float1: " + float1);
        System.out.println("float2: " + float2);

        System.out.println("float1 + float2 = " + (float1 + float2));//5.0

        System.out.println("float1 + double2 = " + (float1 + double2));//10.6

        char zeroChar = '0';

        System.out.println("zeroChar: " + zeroChar);

        if (!boolVar && ((int1 + float1) > 100)) {
            System.out.println("You should see it");

        } else {
            System.out.println("You wil never see it");
        }
    }
}
