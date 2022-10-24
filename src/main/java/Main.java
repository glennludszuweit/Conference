import com.conference.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);

        speakerService.findAll().forEach(speaker -> System.out.println(speaker.getFirstName() + " " + speaker.getLastName()));
    }
}
