package string;

public class OperasiString {
    public static void main(String[] args) {
        String kota = "Bandung";

        System.out.println(kota);

        char[] itbChar = { 'I','T','B' };
        String itbString = new String(itbChar);
        System.out.println(itbString);

        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(0,5));
        System.out.println(kota.substring(5));
    }
}
