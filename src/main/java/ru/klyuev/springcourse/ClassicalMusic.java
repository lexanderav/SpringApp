package ru.klyuev.springcourse;

public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Богемская рапсодия";
    }

    public void doMyDestroy() {
        System.out.println("Bean Classical Music destroy");
    }
}
