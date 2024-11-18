package com.weekOne.AliceBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frosting.dev", havingValue = "Strawberry")
public class StrawberryFrost implements Frosting{
    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }

}
