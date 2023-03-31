public class Main {

    public static void main(String[] args) {
        String s;
        String s1;
        StringBuffer sBuffer = new StringBuffer();
        StringBuilder sBuilder = new StringBuilder();

        sBuffer.append("1. JAVA is a programming language.\n");
        sBuffer.append("2. JAVA is a general purpose programming language.\n");
        sBuffer.append("3. JAVA is OOPs based language.\n");
        sBuffer.append("4. JAVA is robust language.\n");
        sBuffer.append("5. At last we can say JAVA is Old but Gold.");

        sBuilder.append("i. SpringBoot is a framework.\n");
        sBuilder.append("ii. SpringBoot is a JAVA's framework.\n");
        sBuilder.append("iii. SpringBoot has lot's of features.\n");
        sBuilder.append("iv. SpringBoot is so powerful.\n");
        sBuilder.append("v. SpringBoot is most popular framework of JAVA.");

        System.out.println("Before applying toUpperCase() method and trim () method.");
        System.out.println("sBuilder : \n"+sBuilder);
        System.out.println("sBuffer : \n"+sBuffer);

        System.out.println("\nAfter applying toUpperCase() method and trim () method.");
        s1 = sBuilder.toString().toUpperCase().trim();
        s = sBuffer.toString().toUpperCase().trim();

        System.out.println("sBuilder : \n"+s1);
        System.out.println("sBuffer : \n"+s);



    }
}