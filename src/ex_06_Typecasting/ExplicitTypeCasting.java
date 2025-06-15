public class ExplicitTypeCasting {
    public static void main(String[] args) {
        double d = 123.456;

        float f = (float) d;      // double to float
        long l = (long) f;        // float to long
        int i = (int) l;          // long to int
        short s = (short) i;      // int to short
        byte b = (byte) s;        // short to byte

        System.out.println("Double value: " + d);
        System.out.println("Float value (from double): " + f);
        System.out.println("Long value (from float): " + l);
        System.out.println("Int value (from long): " + i);
        System.out.println("Short value (from int): " + s);
        System.out.println("Byte value (from short): " + b);
    }
}
