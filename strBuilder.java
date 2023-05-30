public class strBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("hello");

        // insert()
        sb.insert(1, 'e');
        System.out.println(sb);

        // delete()
        sb.delete(1, 2);
        System.out.println(sb);

        // charAt()
        for (int i = 0; i < sb.length(); i++) {
            sb.charAt(i);
        }
        System.out.println(sb);

        // charAt() direct print
        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(1));
        System.out.println(sb.charAt(2));
        System.out.println(sb.charAt(3));
        System.out.println(sb.charAt(4));

        // Append()
        sb.append('w');
        System.out.println(sb);

        // setCharAT()
        sb.setCharAt(3, 'e');
        System.out.println(sb);

        // Replace()
        sb.replace(3, sb.length() - 1, "l");
        System.out.println(sb);

        // Reverse()
        sb.reverse();
        System.out.println(sb);
    }
}
