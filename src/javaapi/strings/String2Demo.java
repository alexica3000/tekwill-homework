package javaapi.strings;

public class String2Demo {
    public static void main(String[] args) {
        String line = "";
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            line += i; BAD PRACTICE
//        }

        String s = "";
        s += "Java";
        s += " is awesome";
        for (int i = 0; i < 10; i++) {
            s += " " + i;
        }
        System.out.println(s);

        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("Java");
        sbuilder.append(" is ").append("awesome");
        for (int i = 0; i < 10; i++) {
            sbuilder.append(" ").append(i);
        }

        System.out.println(sbuilder.toString());
        sbuilder.insert(16, "-1 ");
        System.out.println(sbuilder.toString());


        char[] chars = {'a', 'b', 'c', 'v', 'e', 'r', 'y', ' '};
        sbuilder.insert(8, chars, 3, 5);

        System.out.println(sbuilder.toString());

        sbuilder.delete(sbuilder.length() - 5, sbuilder.length());
        System.out.println(sbuilder.toString());

        sbuilder.deleteCharAt(sbuilder.length() - 2);
        System.out.println(sbuilder.toString());

        System.out.println(sbuilder.reverse().toString());

        System.out.println(new StringBuilder(Integer.toString(789456)).reverse().toString());
        System.out.println(new StringBuilder(Integer.toString(-789456)).reverse().toString());

        System.out.println(sbuilder.reverse().toString());
        System.out.println(sbuilder.replace(19, 27, "eeeeeeeeeeeeee").toString()); //sb replace
        System.out.println(sbuilder.toString().replace("e 2", "eeeeeeeeeeeeee")); //str replace

        System.out.println(sbuilder.substring(0, 4));
        System.out.println(sbuilder.subSequence(0, 4));


        System.out.println(new StringBuilder("").append("Java is awesome").reverse().insert(2, "8").deleteCharAt(1).indexOf("w"));
    }
}
