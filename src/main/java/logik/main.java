package logik;

import impl.car.Audi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("logik.Config");
      //  ApplicationContext ctx = new GenericXmlApplicationContext("context.xml");
        Audi audi = ctx.getBean(Audi.class);
        audi.move();
        audi.getAudioSystems().playCD();
        audi.getNavigationSystem().createRoute();
    }
}
