package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Service("birds")
public class BirdPetService implements PetService {
    @Override
    public String getPetType() {
        return "Birds Are the Best!";
    }
}
