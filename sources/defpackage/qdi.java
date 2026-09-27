package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qdi {
    public static final p0i e = p0i.DEFAULT;
    public static final mdi[] f = {mdi.S720P_16_9, mdi.S1080P_4_3, mdi.S1080P_16_9, mdi.S1440P_16_9, mdi.UHD, mdi.X_VGA};
    public static final Map g;
    public static final LinkedHashMap h;
    public final odi a;
    public final mdi b;
    public final p0i c;
    public final int d;

    static {
        Map e2 = d1c.e(new Pair(odi.YUV, 35), new Pair(odi.JPEG, 256), new Pair(odi.JPEG_R, 4101), new Pair(odi.RAW, 32), new Pair(odi.PRIV, 34));
        g = e2;
        Set<Map.Entry> entrySet = e2.entrySet();
        int a = c1c.a(CollectionsKt.w(entrySet));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (odi) entry.getKey());
        }
        h = linkedHashMap;
    }

    public qdi(odi odiVar, mdi mdiVar, p0i p0iVar) {
        int i;
        odiVar.getClass();
        mdiVar.getClass();
        p0iVar.getClass();
        this.a = odiVar;
        this.b = mdiVar;
        this.c = p0iVar;
        Integer num = (Integer) g.get(odiVar);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        this.d = i;
    }

    public static final qdi a(odi odiVar, mdi mdiVar) {
        odiVar.getClass();
        mdiVar.getClass();
        return ttl.a(odiVar, mdiVar, e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdi)) {
            return false;
        }
        qdi qdiVar = (qdi) obj;
        if (this.a == qdiVar.a && this.b == qdiVar.b && this.c == qdiVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.a + ", configSize=" + this.b + ", streamUseCase=" + this.c + ')';
    }
}
