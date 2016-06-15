package org.ansj.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) throws IOException {
//        Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
//        Matcher m = p.matcher(
//                "java has regex/nJava has regex/n" +
//                        "JAVA has pretty good regular expressions/n" +
//                        "Regular expressions are in Java");
//        while (m.find())
//            System.out.println(m.group());


        numReg();
        equalReg();
        bigContain();
        lastWords();


    }

    private static void lastWords() {
        String regex = ".*\b(.+)$";
        String string = "你好{a是bc}我是{defsdfdfs是}早上好大泽乡" +
                "人民路" +
                "国家fgd333话村 sdf";
        System.out.println(string.endsWith("话村"));
        Pattern pattern = Pattern.compile (regex);
        Matcher match = pattern.matcher (string);
        while (match.find ())
        {
            System.out.println (match.group ());
        }
    }

    private static void bigContain() {
        String regex = "\\{[^\\}]*\\}";
        String string = "你好{a是bc}我是{defsdfdfs是}早上好";
        Pattern pattern = Pattern.compile (regex);
        Matcher match = pattern.matcher (string);
        while (match.find ())
        {
            System.out.println (match.group ());
        }

    }

    private static void equalReg() {
        /*String text = "name=\"alvin1\",password=\"alvin2\",mail=\"alvin3\",sex=\"alvin4\"";
        Pattern pa = Pattern.compile(".+=\"(.+)\"");*/
        String text = "name=123n,password=223p,j=3";
        Pattern pa = Pattern.compile(".+=(.+)");
        Matcher ma = pa.matcher(text);
        do {
            int end = text.indexOf(",");
            if (end > -1)
                ma.region(0, end);
            if (!ma.matches())
                break;
            System.out.println(ma.group(1));
            if (end == -1)
                break;
            text = text.substring(end + 1);
            ma = ma.reset(text);
        } while (true);
    }


    private static void numReg() throws IOException {
        BufferedReader in;
//        Pattern pattern = Pattern.compile("//(//d{3}//)//s//d{3}-//d{4}");
        Pattern pattern = Pattern.compile("(//(//d{3}//)|//d{3})//s?//d{3}(-|)?//d{4}");
        in = new BufferedReader(new FileReader("C:/s.txt"));
        String s;
        while ((s = in.readLine()) != null) {
//            System.out.println(s);
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                System.out.println(matcher.group());
            }
        }

        in.close();
    }



}
