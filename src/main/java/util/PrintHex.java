package util;

public class PrintHex {
    private static void print(String msg,boolean newLine) {
        System.out.print(msg);
        if(newLine) System.out.println();
    }

    public static void printInt(int value) {
        printInt(value,true);
    }
    public static void printInt(int value,boolean newLine) {
        print(String.format("%8s", Integer.toHexString(value)).replace(' ', '0'),newLine);
    }

    public static void printLong(long value) {
        print(String.format("%16s", Long.toHexString(value)).replace(' ', '0'),true);
    }

    public static void printBytes(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        print(sb.toString(),true);
    }
}
