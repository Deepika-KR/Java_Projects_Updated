public class ImplicitTypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int i = b;              // byte to int
        float f = i;            // int to float
        double d = f;           // float to double

        System.out.println("Byte value: " + b);
        System.out.println("Int value (from byte): " + i);
        System.out.println("Float value (from int): " + f);
        System.out.println("Double value (from float): " + d);
    }
}
