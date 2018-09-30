package builder;

import builder.bean.Engine;
import builder.bean.EscapeTower;
import builder.bean.OrbitalModule;

/**
 * @author : wangyijie
 * @version : 2018-09-26 13:51
 */
public class NoobAirShipBuilder implements AirShipBuilder {

    private NoobAirShipBuilder(){}
    private static class NoobAirShipBuilderInstance{
        private static final NoobAirShipBuilder instance = new NoobAirShipBuilder();
    }
    public static NoobAirShipBuilder getInstance(){
        return NoobAirShipBuilder.NoobAirShipBuilderInstance.instance;
    }
    @Override
    public Engine buildEngine() {
        System.out.println("building engine");
        return new Engine("Noob_Engine");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        System.out.println("building orbitalModule");
        return new OrbitalModule("Noob_OrbitalModule");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("building escapeTower");
        return new EscapeTower("Noob_EscapeTower");
    }
}
