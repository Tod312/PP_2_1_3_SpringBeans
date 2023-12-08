package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("chiken")
public class Chicken extends Animal{
	@Override
    public String toString() {
        return "I'm a Chicken";
    }
}
