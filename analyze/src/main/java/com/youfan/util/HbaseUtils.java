package com.youfan.util;


import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.Map;

public class HbaseUtils {


    private static Connection connection;
    private static Admin admin;

    static {
        var configuration = HBaseConfiguration.create();
        configuration.set("","");
        configuration.set("","");
        configuration.set("","");
        configuration.set("","");
        try {
            connection = ConnectionFactory.createConnection(configuration);
            admin = connection.getAdmin();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void put(String tableName, String key, String familyName, Map<String,String> map) throws IOException {
        var table = connection.getTable(TableName.valueOf(tableName));
        var keyBytes = Bytes.toBytes(key);
        var put = new Put(keyBytes);
        if(map!=null){
            

        }




    }


}
