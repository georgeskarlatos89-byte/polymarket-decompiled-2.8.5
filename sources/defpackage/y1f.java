package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class y1f {
    public abstract Map a();

    public abstract Object b(w1f w1fVar);

    public final aqc c() {
        return new aqc(new LinkedHashMap(a()), false);
    }

    public final aqc d() {
        return new aqc(new LinkedHashMap(a()), true);
    }
}
