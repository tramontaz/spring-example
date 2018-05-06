package net.chemodurov.tutorials.spring;

import net.chemodurov.tutorials.spring.config.MyConfig;
import net.chemodurov.tutorials.spring.entities.Cat;
import net.chemodurov.tutorials.spring.entities.Dog;
import net.chemodurov.tutorials.spring.entities.Parrot;
import net.chemodurov.tutorials.spring.weekdays.WeekDay;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("net.chemodurov.tutorials.spring.config");

        Cat cat = context.getBean(Cat.class);
        Dog dog = context.getBean(Dog.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());

        System.out.println("==============================================");

        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's " + weekDay.getWeekDayName() + " today!");
    }
}
