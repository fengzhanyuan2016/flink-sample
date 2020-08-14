package com.youfan.util;

import org.joda.time.DateTime;

public class DateUtils {
    public static String getYearBaseByAge(String age){
        DateTime now =new DateTime();
        var date = now.plusYears(- Integer.valueOf(age));
        var year = date.year().get();
        if(year >= 1940 && year < 1950){
            return "40后";
        }else if(year >= 1950 && year < 1960){
            return "50后";
        }else if(year >= 1960 && year < 1970){
            return "60后";
        }else if(year >= 1970 && year < 1980){
            return "70后";
        }else if(year >= 1980 && year < 1990){
            return "80后";
        }else if(year >= 1990 && year < 2000){
            return "90后";
        }else if(year >= 2000 && year < 2010){
            return "00后";
        }else{
            return "10后";
        }
    }
}
