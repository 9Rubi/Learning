package builder;

import builder.bean.Engine;
import builder.bean.EscapeTower;
import builder.bean.OrbitalModule;

/**
 * @author : wangyijie
 * @version : 2018-09-26 13:48
 */
public interface AirShipBuilder {
    Engine buildEngine();
    OrbitalModule buildOrbitalModule();
    EscapeTower buildEscapeTower();
}
