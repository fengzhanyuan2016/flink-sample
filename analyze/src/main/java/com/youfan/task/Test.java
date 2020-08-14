package com.youfan.task;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.utils.ParameterTool;
import lombok.*;
public class Test {
    public static void main(String[] args) {
        final ParameterTool params = ParameterTool.fromArgs(args);
        final ExecutionEnvironment environment = ExecutionEnvironment.getExecutionEnvironment();
        environment.getConfig().setGlobalJobParameters(params);



        DataSet<String> txt = environment.readTextFile("");
        DataSet map = txt.flatMap(null);
        DataSet reduce = map.groupBy("groupfield").reduce(null);
        try {
            environment.execute("text");
        }catch(Exception e) {
            e.printStackTrace();
        }



    }
}
