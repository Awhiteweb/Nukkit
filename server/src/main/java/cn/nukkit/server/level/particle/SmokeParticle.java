package cn.nukkit.server.level.particle;

import cn.nukkit.server.math.Vector3;

/**
 * Created on 2015/11/21 by xtypr.
 * Package cn.nukkit.server.level.particle in project Nukkit .
 */
public class SmokeParticle extends GenericParticle {
    public SmokeParticle(Vector3 pos) {
        this(pos, 0);
    }

    public SmokeParticle(Vector3 pos, int scale) {
        super(pos, Particle.TYPE_SMOKE, scale);
    }
}