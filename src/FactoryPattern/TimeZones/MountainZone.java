package FactoryPattern.TimeZones;

public class MountainZone extends Timezone{
    public MountainZone(){
        displayName = "US/Mountain";
        offset = -7;
    }
}
