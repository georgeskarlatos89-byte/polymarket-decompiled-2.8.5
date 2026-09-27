package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface tub {
    nwa a(nwa nwaVar);

    default long c(nwa nwaVar, nwa nwaVar2) {
        nwa a = a(nwaVar);
        nwa a2 = a(nwaVar2);
        if (a instanceof oub) {
            return ((oub) a).z(a2, 0L, true);
        }
        if (a2 instanceof oub) {
            return ((oub) a2).z(a, 0L, true) ^ (-9223372034707292160L);
        }
        return a.z(a, 0L, true);
    }
}
