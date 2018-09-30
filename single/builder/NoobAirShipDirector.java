package builder;

import builder.bean.Engine;
import builder.bean.EscapeTower;
import builder.bean.OrbitalModule;

/**
 * @author : wangyijie
 * @version : 2018-09-26 13:55
 */
public class NoobAirShipDirector implements AirShipDirector {

    private AirShipBuilder airShipBuilder;

    public AirShipBuilder getAirShipBuilder() {
        return airShipBuilder;
    }

    public void setAirShipBuilder(AirShipBuilder airShipBuilder) {
        this.airShipBuilder = airShipBuilder;
    }

    private NoobAirShipDirector(){}
    private static class NoobAirShipDirectorInstance{
        private static final NoobAirShipDirector instance = new NoobAirShipDirector();
    }
    public static NoobAirShipDirector getInstance(AirShipBuilder airShipBuilder){
        NoobAirShipDirector.NoobAirShipDirectorInstance.instance.setAirShipBuilder(airShipBuilder);
        return NoobAirShipDirector.NoobAirShipDirectorInstance.instance;
    }



    @Override
    public Airship directAirShip() {
        Engine e = airShipBuilder.buildEngine();
        OrbitalModule om = airShipBuilder.buildOrbitalModule();
        EscapeTower et = airShipBuilder.buildEscapeTower();
        Airship ship= new Airship();
        ship.setEngine(e);
        ship.setOrbitalModule(om);
        ship.setEscapeTower(et);
        return ship;
    }
}
