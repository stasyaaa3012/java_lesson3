package com.company.doctor;


public class Surgeon implements Doctor {

    protected String name;
    protected Integer age;
    protected String surgeonClassification;
    protected Integer workExperience;
    protected Boolean headOfDepartment;

    public Surgeon() {

    }

    public Surgeon(String name, Integer age, String surgeonClassification,
                   Integer workExperience, Boolean headOfDepartment) {
        this.name = name;
        this.age = age;
        this.surgeonClassification = surgeonClassification;
        this.workExperience = workExperience;
        this.headOfDepartment = headOfDepartment;
    }

    @Override
    public void inspection() {
        System.out.printf("Хирург: %s в данный момент проводит осмотр пациента", name);
    }

    @Override
    public void operation() {
        System.out.printf("Хирург: %s в данный момент проводит операцию \n", name);
    }

    @Override
    public void toBreak() {
        System.out.printf("Хирург: %s ушел на обеденный перерыв \n", name);
    }

    @Override
    public void assistance() {
        System.out.printf("Хирург: %s в данный момент ассистирует на опреации \n", name);
    }

    @Override
    public void recordsManagement() {
        System.out.printf("Хирург: %s в данный момент заполняет ведомости \n", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSurgeonClassification() {
        return surgeonClassification;
    }

    public void setSurgeonClassification(String surgeonClassification) {
        this.surgeonClassification = surgeonClassification;
    }

    public Integer getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }

    public Boolean getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(Boolean headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    @Override
    public String toString() {
        return "Surgeon {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surgeonClassification='" + surgeonClassification + '\'' +
                ", workExperience=" + workExperience +
                ", headOfDepartment=" + headOfDepartment +
                '}';
    }
}
