class Hello {
    public static void main(String args[]) {
        System.out.println("Hello, World!");
        // primitive data types
        byte num1 = 1; // 1 byte -2^7 to 2^7 - 1;
        short num2 = 2; // 2 bytes -2^15 to 2^15 - 1;
        int num3 = 3; // 4 bytes -2^31 to 2^31 - 1;
        long num4 = 4l; // 8 bytes -2^63 to 2^63 - 1;
        float num5 = 5.0f; // 4 bytes
        // by default java considers all decimal numbers as double, so we have to add f
        // at
        // the end of the number to make it float
        double num6 = 6.0; // 8 bytes
        char c = 'a'; // 2bytes unicode format not ascii
        boolean isJavaFun = false; // 1 byte true or false 0,1 doesnt work here

        // literals
        int a = 0x14; // hexadecimal literal
        int b = 0b1010; // binary literal
        int c1 = 1_000_000; // using underscore for better readability
        double d = 1.5e30; // scientific notation for 1.5 * 10^3
        double d1 = 1.5e-3; // scientific notation for 1.5 * 10^-3
        double dw = 56; // double can also hold integer values, it will be converted to 56.0
        float f = 56.0f; // float can also hold integer values, it will be converted to 56.0f
        System.out.println("a: " + a + " b: " + b + " c1: " + c1 + " d: " + d
                + " d1: " + d1 + " dw: " + dw + " f: " + f);
        c1++;
        System.out.println("c1: " + c1);
        char c3 = 'a';
        c3++;
        System.out.println("c3: " + c3);
    }

}
