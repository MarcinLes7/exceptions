package exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws MalformedURLException {
        CheckedExceptionDemo ced = new CheckedExceptionDemo();
    //    ced.urlTesterByTryCatch("httpssdss://www.wszib.edu.pl");
        ced.urlTesterByThrows("ftp://ftp.pl");
    }

    public void urlTesterByTryCatch(String urlSts) {

        try {
            URL url = new URL(urlSts);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            // throw new RuntimeException(e);
            System.out.println("Podałeś nieprawidłowy adres URL: " + e.getMessage());


        }

    }

    // zepchnięcie odpowiedzialności
    public void urlTesterByThrows(String urlStr) throws  MalformedURLException {
        URL url = new URL(urlStr);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }



}
