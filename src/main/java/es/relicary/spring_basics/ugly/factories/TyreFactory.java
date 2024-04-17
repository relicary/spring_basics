package es.relicary.spring_basics.ugly.factories;

import es.relicary.spring_basics.ugly.Tyres;
import es.relicary.spring_basics.ugly.tyres.BridgeStoneTyres;
import es.relicary.spring_basics.ugly.tyres.MichelinTyres;

public class TyreFactory {

    public Tyres getTyre(String tyreType) {

        if(tyreType.isEmpty()) {
            return null;
        }

        if(tyreType.equalsIgnoreCase("MICHELIN")) {
            return new MichelinTyres();
        }
        else if(tyreType.equalsIgnoreCase("BRIDGESTONE")) {
            return new BridgeStoneTyres();
        }

        return null;
    }

}