package com.company;

import com.company.book.*;
import com.company.doctor.*;
import com.company.mobile.*;

public class Main {

    public static void main(String[] args) {

        Encyclopedia encyclopedia = new Encyclopedia(104348, "Иванов Иван Алексеевич",
                "Ветеринарный энциклопедический словарь", 1981, "М.: «Советская энциклопедия»", 569);
        Encyclopedia encyclopedia2 = new Encyclopedia(104349, "Иванова Мария Алексеевна",
                "Лингвистический энциклопедический словарь", 1990, "М.: «Советская энциклопедия»", 688);
        System.out.println(encyclopedia);
        System.out.println(encyclopedia2);
        System.out.println(" ");
        Guide guide = new Guide(345899, "Кузнецов Антон Антонович", "Справочник профессий", 2019,
                "Издание: Москва", "учебный");
        guide.display();
        System.out.println(guide);
        System.out.println(" ");
        System.out.println("====================");
        System.out.println("====================");
        System.out.println(" ");
        Surgeon surgeon = new Surgeon("Петров Никита Антонович", 38, "высокая",
                16, false);
        System.out.println(surgeon);
        surgeon.assistance();
        Neurosurgeon neurosurgeon = new Neurosurgeon("Синицина Виктория Владимировна", 46, "высокая", 25,
                true, 12);
        System.out.println(neurosurgeon);
        neurosurgeon.operation();
        System.out.println(" ");
        System.out.println("====================");
        System.out.println("====================");
        System.out.println(" ");
        Model model = new Model("iPhone 11", "iOS", 14, 6, 256, false, true);
        System.out.println(model);
        model.connectToSiemensMobile();
        model.writeTextMessage("Привет! Как дела?", "Ира");
        System.out.println(" ");
        model.toCall(89201235545L);
        System.out.println(" ");
        model.playGame("Судоку");
    }
}
