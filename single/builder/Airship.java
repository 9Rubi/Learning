package builder;

import builder.bean.Engine;
import builder.bean.EscapeTower;
import builder.bean.OrbitalModule;

/**
 * @author : wangyijie
 * @version : 2018-09-26 13:26
 */
public class Airship {
    private OrbitalModule orbitalModule;//轨道舱
    private Engine engine;
    private EscapeTower escapeTower;

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }


}
