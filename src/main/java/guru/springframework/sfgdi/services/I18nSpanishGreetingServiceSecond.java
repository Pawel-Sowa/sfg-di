package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES"})
@Service("i18nServiceSecond")
public class I18nSpanishGreetingServiceSecond implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
