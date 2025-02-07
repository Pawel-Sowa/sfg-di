package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nServiceSecond")
public class I18nEnglishGreetingServiceSecond implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
