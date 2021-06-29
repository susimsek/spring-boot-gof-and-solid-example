package io.github.susimsek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class SpringBootDesignPatternExampleApplication {

    public static void main(String[] args) {
        String regex = "(\\d{2}[- /.]\\d{2}[- /.]\\d{4} \\d{2}[. :]\\d{2}|\\d{2}[- /.]\\d{2}[- /.]\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("current date: 01-05-2017 12.00 2");
        if (matcher.find()) {
            int start = matcher.start(); // start index of match
            int end = matcher.end(); // end index of match
            String result = matcher.group(1);
            System.out.println(result);
        }


        SpringApplication.run(SpringBootDesignPatternExampleApplication.class, args);
    }

    public String getInvoiceDate(String text){
        String regex = "(\\d{2}[- /.]\\d{2}[- /.]\\d{4} \\d{2}[. :]\\d{2}|\\d{2}[- /.]\\d{2}[- /.]\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            int start = matcher.start(); // start index of match
            int end = matcher.end(); // end index of match
            String result = matcher.group(1);
            return result;
        }
        return null;
    }





    private static String[] getDate(String desc) {
        int count=0;
        String[] allMatches = new String[2];
        Matcher m = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d").matcher(desc);
        while (m.find()) {
            allMatches[count] = m.group();
            count++;
        }
        return allMatches;
    }

}
