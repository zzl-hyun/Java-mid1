package lang.string.builder;

public class StringBuilderMain1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println(sb);

        sb.insert(4, "Java");
        String s = sb.toString();
        System.out.println(s);
    }
}
