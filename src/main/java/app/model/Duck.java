package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier(value = "duck")
public class Duck extends Animal{
	
	@Override
    public String toString() {
        return "I'm a Duck";
    }

}
