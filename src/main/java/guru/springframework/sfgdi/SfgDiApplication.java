package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());


        System.out.println("----------- i18n second if non profile");
        I18nControllerSecond i18nControllerSecond = (I18nControllerSecond) ctx.getBean("i18nControllerSecond");
        System.out.println(i18nControllerSecond.sayHello());

        MyController myController = (MyController) ctx.getBean("myController");
//        String greetingting = myController.sayHello();
//        System.out.println(greeting);

        System.out.println("----------- Primary Bean");
        System.out.println(myController.sayHello());

        System.out.println("-------------Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("---------Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
