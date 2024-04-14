package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // java based config
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();

        // desktop1 is the method, which is the bean name also, alternatively you can also provide
        // the bean name using name property inside @Bean annotation
//        Desktop dt = context.getBean("desktop1", Desktop.class);
//        dt.compile();

        // xml based config
        //below line creates container for the object and its configuration is present in spring.xml
        //you specify the which object needs to be created using bean tag inside the spring.xml file
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = (Alien) context.getBean("alien");
//        obj.code();
    }
}
