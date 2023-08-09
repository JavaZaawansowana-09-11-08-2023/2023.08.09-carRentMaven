package pl.comarch.szkolenia.car.rent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        ICore core = context.getBean(ICore.class);
        core.start();
    }
}
