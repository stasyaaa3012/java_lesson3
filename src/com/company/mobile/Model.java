package com.company.mobile;


public class Model extends SiemensMobile implements Mobile {

    private String name;
    private String operatingSystem;
    private Integer systemVersion;
    private Integer RAM;
    private Integer memory;

    public Model(String name, String operatingSystem, Integer systemVersion, Integer RAM,
                 Integer memory, Boolean startingCall, Boolean breakCall) {
        super(startingCall, breakCall);
        this.name = name;
        this.operatingSystem = operatingSystem;
        this.systemVersion = systemVersion;
        this.RAM = RAM;
        this.memory = memory;
    }

    @Override
    public void connectToSiemensMobile() {
        System.out.println("Подключаемся к сервису SiemensMobile...");
    }

    @Override
    public void writeTextMessage(String message, String recipient) {
        System.out.printf("Набираем сообщение абоненту: %s \n", recipient);
        System.out.printf("Сообщение: '%s' отправлено \n", message);
    }

    @Override
    public void playGame(String gameName) {
        System.out.printf("Запускаем игру: %s \n", gameName);
    }

    @Override
    public void toCall(Long number) {
        System.out.printf("Набираем номер телефона: %s \n", number);
        if(startingCall)
            System.out.println("Абонент взял трубку. Разговор начался");
        else
            System.out.println("Абонент не отвечает...");
    }

    @Override
    public void answerCall(String number) {
        System.out.printf("Звонит номер: %s \n", number);
        if(startingCall)
            System.out.println("Ответили на звонок. Разговор начался");
        else
            System.out.println("Абонент занят...");
    }

    @Override
    public void finishingTheCall() {
        if(breakCall)
            System.out.println("Звонок завершен");
        else
            System.out.println("Звонок продолжается...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(Integer systemVersion) {
        this.systemVersion = systemVersion;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Model {" +
                "name='" + name + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", systemVersion=" + systemVersion +
                ", RAM=" + RAM +
                ", memory=" + memory +
                '}';
    }
}
