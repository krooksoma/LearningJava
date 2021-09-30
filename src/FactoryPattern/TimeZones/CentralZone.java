package FactoryPattern.TimeZones;

public class CentralZone extends Timezone{
     public CentralZone(){
        displayName = "US/Eastern";
        offset = -5;
    }
}
