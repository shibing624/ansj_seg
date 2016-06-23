package org.ansj.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xuming on 2016/6/15.
 */
public class ChinesejudgeDemo {
    String regEx = "[\u4e00-\u9fa5]";


    public void isHanzi2(String str){
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.print(m.group(0)+"");
        }
    }
    public void isHanzi(String str){
        if(str.getBytes().length == str.length()){
            System.out.println("无汉字");
        }else{
            System.out.println("有汉字");
        }

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str1 = "zhong guo";
        String str2 = "dfdf中 国。,,fgd,的，sdf真，,";
        ChinesejudgeDemo  ht1 = new ChinesejudgeDemo();
        ht1.isHanzi(str1);
        ht1.isHanzi(str2);
        ht1.isHanzi2(str2);

    }
}
