package com.yang.MyString;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;


public class MyString {
    public static String dumpProperties(Properties p) {
        if (p == null) return "Null properties.";
        StringBuilder sb = new StringBuilder();

        TreeMap sm = new TreeMap(p);
        Set keySet = sm.keySet();
        Iterator iter = keySet.iterator();

        while (iter.hasNext()) {
            String key = (String)iter.next();
            String value = (String)sm.get(key);

            if (key.contains("secret")) {
                value = "** suppressed ("+value.length()+") **";
            }
            if (sb.length() > 0) {
                sb.append("\n");
            }

            sb.append(key);
            sb.append(": ");
            sb.append(value);
        }

        if (sb.length() < 1) {
            sb.append("Empty Properties");
        }
        return sb.toString();
    }
}
