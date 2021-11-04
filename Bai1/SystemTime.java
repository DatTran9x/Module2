package Bai1;

import jdk.nashorn.internal.parser.JSONParser;
import java.util.Date;
import java.net.SocketPermission;
import java.sql.SQLOutput;

public class SystemTime {
    public static void main(String[] args) {
        //Lấy thời gian
        Date now = new Date();
        System.out.println("Now is :"+now);
    }
}
