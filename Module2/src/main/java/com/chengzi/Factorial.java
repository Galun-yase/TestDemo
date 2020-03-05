package com.chengzi;

import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Factorial {
    public static long fact(long n){
        long r=1;
        for(long i=1;i<=n;i++){
            r=r*i;
        }
        return r;
    }


}
