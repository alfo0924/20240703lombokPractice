package fcu.web;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("LonBokPractice001");
        Student s1=new Student("al",0111,"cs");
        Student s2=new Student("alf",0222,"cs");
        Student s3=new Student("alfo",0333,"cs");
        System.out.println(s1.toString());
        System.out.println(s1);
        System.out.println(s2.toString());
        System.out.println(s2);
        System.out.println(s3.toString());
        System.out.println(s3);

        DateTime now=new DateTime();
        System.out.println(now.toString());
        System.out.println(now);

        DateTime now1=new DateTime();
        System.out.println(now1);
        DateTime now2=new DateTime();
        System.out.println(now2);

        DateTimeFormatter format= DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");
        String strNow=format.print(now);
        System.out.println(strNow);

        DateTimeFormatter format1= DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");
        String strNow1=format1.print(now1);
        System.out.println(strNow1);

        DateTimeFormatter format2= DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss:ms");
        String strNow2=format2.print(now2);
        System.out.println(strNow2);

        DateTimeFormatter format3= DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss:ms");
        String strNow3=format3.print(now);
        System.out.println(strNow3);

        DateTimeFormatter format4= DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss:ms");
        String strNow4=format4.print(now);
        System.out.println(strNow4);

        DateTimeFormatter format5=DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss");
        String strNow5=format5.print(now);
        System.out.println(strNow5);

        DateTimeFormatter format6=DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss");
        String strNow6=format6.print(now);
        System.out.println(strNow6);

        DateTimeFormatter format7=DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        String strNow7=format7.print(now);
        System.out.println(strNow7);

        String cnyDay="2025/01/01 00:00:00";
        DateTime cny=format5.parseDateTime(cnyDay);
        System.out.println(cny);

        String hlwDay="10/30/2025 00:00:00";
        DateTime hlw=format6.parseDateTime(hlwDay);
        System.out.println(hlw);

        String xmasDay="2025-12-25 00:00:00";
        DateTime xmas=format7.parseDateTime(xmasDay);
        System.out.println(xmas);





    }
}