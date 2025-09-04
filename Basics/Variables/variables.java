public class variables {
    public static void main(String[] args) {
        // variables
        String name = "Tony Stark";
        int age = 25;
        double pi = 3.14;
        char a = 'a';
        // Java is a typed language
        // before defining a var in java, we have to specify the data type of that
        // variable means which type of data or value it is going to
        // store in that memory space, so to allocate that much memory for that variable
        System.out.println("Data types:");
        System.out.println("1. Primitive: ");
        System.out.print("\tbyte -> 1 byte\n" +
                "\tshort -> 2 byte\n" +
                "\tchar -> 2 byte\n" +
                "\tint -> 4 byte\n" +
                "\tfloat -> 4 byte\n" +
                "\tdouble -> 8 byte\n" +
                "\tlong -> 8 byte\n" +
                "\tboolean -> 1 byte\n");
        System.out.println("2. Non-Primitive: ");
        System.out.print("\tString\n\tArray\n\tClass\n\tObject\n\tInterface\n");
        int x = 10, y = 5;
        int sum = x + y;
        System.out.println(sum);
        int diff = x - y;
        System.out.println(diff);
        //in java, bodmas rule is not used
        //operator precedence is used -> * / % is greater than + -
        //associativity is from left to right i.e calculation is from left  to  right
        int ans = 10 * 5 / 10 - 5;
        System.out.println("10 * 5 / 10 - 5 = " + ans);
        ans = (10 * 5) / (10 - 5);
        System.out.println("(10 * 5) / (10 - 5) = " + ans);
    }
}
