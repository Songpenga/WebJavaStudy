package Format;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class commaFormat1 {
    public static void main(String[] args) {
        int account = 1000000000;
        DF(account);
        NF(account);
        SF(account);
    }

    public static void DF(int account){
        DecimalFormat str = new DecimalFormat("###,###");
        String format = str.format(account);

        System.out.println("df : " + format);

    }

    public static void NF(int account){
        account += account;

        String format = NumberFormat.getInstance().format(account);
        System.out.println("NF : " + format);
    }

    public static void SF(int account){

        account += (account + 100000);

        String format = String.format("%,d", account);
        System.out.println("NF : " + format);
    }

}

