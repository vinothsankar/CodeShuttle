package com.weekOne.AliceBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@ConditionalOnProperty(name="frosting.dev" , havingValue = "Chocolate")
public class ChocolateFrost implements Frosting{

    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
