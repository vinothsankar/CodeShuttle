package com.weekOne.AliceBakery;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeBaker {
     private final Frosting frosting;
     private final Syrup syrup;

     public CakeBaker(Frosting frosting, Syrup syrup){
         this.frosting = frosting;
         this.syrup = syrup;
     }

     public String BakeCake(){
         return "Cake with "+syrup.getSyrupType()+" and "+frosting.getFrostingType();
     }


}
