public class StringManipulation {
    public static void main(String[]args){

        String s = "practice is the mother of skills";

        System.out.println(s);

        System.out.println(s.length());
        System.out.println("--------------------1");
        System.out.println(s.charAt(21));
        System.out.println("--------------------2");

        System.out.println(s.indexOf('i'));
        System.out.println("--------------------3");
        System.out.println(s.indexOf('i', s.indexOf('i') + 1));
        System.out.println("--------------------4");
        System.out.println(s.indexOf('i', s.indexOf('i', s.indexOf('i') + 1) + 1));
        System.out.println("--------------------5");
        System.out.println(s.indexOf("mother"));
        System.out.println("--------------------6");
        System.out.println(s.indexOf("Winsen"));
        
    }
}
