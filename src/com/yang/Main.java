package com.yang;

import com.yang.date.MyDate;
import com.yang.MyString.MyString;
import java.util.Properties;


public class Main {

    public static Properties p = System.getProperties();
    public static void main(String[] args) {
	// write your code here
        System.out.println(MyDate.countDiffDay("2018-01-03", "2018-01-02"));
        System.out.println(MyString.dumpProperties(p));
    }
}
