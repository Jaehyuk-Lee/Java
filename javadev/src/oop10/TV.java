package oop10;

public interface TV {
    public default void setSpeaker(Speaker speaker) {
    }

    // 접근 제어자 생략 default가 아니고 public임!
    void powerOn();

    void powerOff();

    void channelUp();

    void channelDown();

    void soundUp();

    void soundDown();
}
