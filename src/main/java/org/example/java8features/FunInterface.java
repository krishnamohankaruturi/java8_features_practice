package org.example.java8features;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public interface FunInterface {
    String doPayment(String source, String dest);
    default double getScratchCard(){
        return  new Random().nextDouble();
    }
    static  String datePatterns(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        return  simpleDateFormat.format(new Date());
    }

}
