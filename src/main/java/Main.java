import com.spring4all.pojo.Student;
import com.spring4all.pojo.StudentConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-15 00:02
 **/
public class Main {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Student student = (Student) applicationContext.getBean("student");
//        System.out.println(student);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student student = applicationContext.getBean(Student.class);
        System.out.println(student);
    }
}
