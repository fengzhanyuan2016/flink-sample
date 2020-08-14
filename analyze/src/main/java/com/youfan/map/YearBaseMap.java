package com.youfan.map;

import com.youfan.model.YearBase;
import com.youfan.util.DateUtils;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.util.StringUtils;

public class YearBaseMap implements MapFunction<String, YearBase> {

    @Override
    public YearBase map(String s) throws Exception {
         if(StringUtils.isNullOrWhitespaceOnly(s))
            return null;
         var info = s.split("");
         var userID = info[0];
         var userName = info[1];
         var sex = info[2];
         var phone = info[3];
         var email = info[4];
         var age = info[5];
         var registerTime = info[6];
         var userType = info[7];
         var yearBaseType = DateUtils.getYearBaseByAge(age);

         return new YearBase();










    }
}
