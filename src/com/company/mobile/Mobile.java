package com.company.mobile;

public interface Mobile {

    void toCall(Long number);
    void answerCall(String number);
    void finishingTheCall();
    void writeTextMessage(String message, String recipient);
    void playGame(String gameName);

}
