package FactoryPattern.TimeZones;

public class ZoneFactory {
    public Timezone createZone(String zoneId){
       Timezone timezone = null;
       if(zoneId == "US/Central"){
           timezone = new CentralZone();
       }
       else if(zoneId == "US/Mountain"){
           timezone = new MountainZone();
       }
       return timezone;
    }
}
