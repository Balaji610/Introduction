public class Reverse {
    public static void main(String[] args) {
        String or="hello";
        String rev="";
        System.out.println("or string is ="+or);
        for (int i=0;i<or.length();i++)
        {
            rev=or.charAt(i)+rev;

        }
        System.out.println("the reverse is ="+rev);
    }
}
