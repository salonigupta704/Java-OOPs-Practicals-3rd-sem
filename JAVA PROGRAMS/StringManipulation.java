public class StringManipulation {
    public static void main(String[] args) {

        // Using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("StringBuilder after append: " + sb);

        sb.reverse();
        System.out.println("StringBuilder after reverse: " + sb);


        // Using StringBuffer
        StringBuffer sf = new StringBuffer("Java");

        sf.append(" Programming");
        System.out.println("StringBuffer after append: " + sf);

        sf.reverse();
        System.out.println("StringBuffer after reverse: " + sf);
    }
}