package com.company.doctor;

public class Neurosurgeon extends Surgeon implements Doctor {

    private Integer numberOfConferencesOnNeurosurgeon;

    public Neurosurgeon() {

    }

    public Neurosurgeon(String name, Integer age, String surgeonClassification,
                        Integer workExperience, Boolean headOfDepartment, Integer numberOfConferencesOnNeurosurgeon) {
        super(name, age, surgeonClassification, workExperience, headOfDepartment);
        this.numberOfConferencesOnNeurosurgeon = numberOfConferencesOnNeurosurgeon;
    }

    @Override
    public void inspection() {
        System.out.printf("Нейрохирург: %s в данный момент проводит осмотр пациента \n", super.getName());
    }

    @Override
    public void operation() {
        System.out.printf("Нейрохирург: %s в данный момент проводит операцию \n", super.getName());
    }

    @Override
    public void toBreak() {
        System.out.printf("Нейрохирург: %s ушел на обеденный перерыв \n", super.getName());
    }

    @Override
    public void assistance() {
        System.out.printf("Нейрохирург: %s в данный момент ассистирует на опреации \n", super.getName());
    }

    @Override
    public void recordsManagement() {
        System.out.printf("Нейрохирург: %s в данный момент заполняет ведомости \n", super.getName());
    }

    public Integer getNumberOfConferencesOnNeurosurgeon() {
        return numberOfConferencesOnNeurosurgeon;
    }

    public void setNumberOfConferencesOnNeurosurgeon(Integer numberOfConferencesOnNeurosurgeon) {
        this.numberOfConferencesOnNeurosurgeon = numberOfConferencesOnNeurosurgeon;
    }

    @Override
    public String toString() {
        return "Neurosurgeon {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surgeonClassification='" + surgeonClassification + '\'' +
                ", numberOfConferencesOnNeurosurgeon=" + numberOfConferencesOnNeurosurgeon +
                ", workExperience=" + workExperience +
                ", headOfDepartment=" + headOfDepartment +
                '}';
    }
}
