package oop10;

import java.io.FileInputStream;
import java.util.Properties;

public class TVUser {
    public static void main(String[] args) throws Exception {

        // 설정 파일에서 TV와 Speaker 클래스 이름을 읽어서 객체 생성하기

        Properties prop = new Properties();
        prop.load(new FileInputStream("/Users/alex00728/dev/workspace/javadev/src/oop10/product.properties"));
        String tvName = prop.getProperty("tv");
        Class tvClass = Class.forName(tvName);
        TV tv = (TV) tvClass.getConstructor().newInstance(); // TV tv = new LgTV();

        Class speakerClass = Class.forName(prop.getProperty("speaker"));
        Speaker speaker = (Speaker) speakerClass.getConstructor().newInstance();

        tv.powerOn();
        tv.soundUp();
        tv.setSpeaker(speaker);
        tv.soundUp();
        tv.powerOff();
    }
}
