package javaexample6;

public class JavaExample6 {

    public static void main(String[] args) {

        // use quatatins marks in a string
        System.out.println("He is a \"student\".");

        //long readable integer
        int m = 1000_000_000;
        System.out.println(m);
        System.out.println();
        
        //constant
        final int MONTHS_NUM=12;
        System.out.println(MONTHS_NUM);
        
        //long integer
        long a =1000000000000000000L; // L must be there for long
        System.out.println(a);
        System.out.println();
        
        //float number
        float b=1.4F; // F must be there for float
        System.out.println(b);
        System.out.println();
        
        float c=12e4F;
        System.out.println(c);
        System.out.println();

        // E-notation (10^)
        double d=12752136897.6531588096235653;
        System.out.println(d);
        double e=543.543e35;
        System.out.println(e);
        System.out.println();
        
        //characters
        char f=7; // peep sound
        char g=3200;
        char h=0;
        System.out.println(f+" "+g+" "+h);
        System.out.println();
        System.out.println("----------------");
        char loop=0;
        char[] charArray=new char[1000];
        for (int i = 0; i < charArray.length; i++) {
            loop=(char)i;
            charArray[i]=loop;
            //System.out.println(loop);
        }
        System.out.println("----------------");
        System.out.println();
        
        //characters hexadecimal
        char j='\u0041';
        //charatcter 'A' has order-number 65 (6 * 10 + 5)
        // in the hexa-decimal system its order-number 41 (4 * 16 + 1)
        char k='\u0034';
        System.out.println(j+" "+k);
        System.out.println("\u0042\u0055\u0053\u0053"); // BUSS
        
        // special character
        char newLine='\n';
        System.out.println("aa"+newLine+"bb");
        char backstegTecken='\b';
        System.out.println("aaaa"+backstegTecken+"b");
        char returTecken='\r';                
        System.out.println("aaaa"+returTecken+"b");
        char snedstreck='\\';
        char citatTecken='\"';
        char apostrof='\'';
        System.out.println(snedstreck+" "+citatTecken+" "+apostrof);
        System.out.print("00000\r");
        System.out.println("75435");

    }

}
