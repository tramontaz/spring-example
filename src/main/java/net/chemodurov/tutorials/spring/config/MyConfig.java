package net.chemodurov.tutorials.spring.config;

import net.chemodurov.tutorials.spring.entities.Cat;
import net.chemodurov.tutorials.spring.entities.Dog;
import net.chemodurov.tutorials.spring.entities.Parrot;
import net.chemodurov.tutorials.spring.weekdays.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
@ComponentScan("net.chemodurov.tutorials.spring.entities")
public class MyConfig {

//    @Bean
//    public Cat getCat(Parrot parrot) {
//        Cat cat = new Cat();
//        cat.setName(parrot.getName() + "-killer");
//        return cat;
//    }
//
//    @Bean
//    public Dog newDog() {
//        return new Dog();
//    }
//
//    @Bean("parrot-kesha")
//    public Parrot newParrot() {
//        return new Parrot();
//    }

    @Bean
    public WeekDay getDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY: return new Monday();
            case FRIDAY: return new Friday();
            case TUESDAY: return new Thursday();
            case SATURDAY: return new Saturday();
            case THURSDAY: return new Thursday();
            case WEDNESDAY: return new Wednesday();
            default: return new Sunday();
        }
    }
}
