package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zff {
    public static final zff c = new zff();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final m4l a = new m4l(1);

    public final xig a(Class cls) {
        boolean z;
        qt7 qt7Var;
        xig w;
        Class cls2;
        f5a.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        xig xigVar = (xig) concurrentHashMap.get(cls);
        if (xigVar == null) {
            Class cls3 = cjg.a;
            qt7 qt7Var2 = null;
            if (!ts8.class.isAssignableFrom(cls) && (cls2 = cjg.a) != null && !cls2.isAssignableFrom(cls)) {
                dmk.v("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
            pnf a = ((nzb) this.a.a).a(cls);
            if ((a.d & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (ts8.class.isAssignableFrom(cls)) {
                    w = new oec(cjg.c, st7.a, a.a);
                } else {
                    nuj nujVar = cjg.b;
                    qt7 qt7Var3 = st7.b;
                    if (qt7Var3 != null) {
                        w = new oec(nujVar, qt7Var3, a.a);
                    } else {
                        dmk.n("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                }
            } else if (ts8.class.isAssignableFrom(cls)) {
                h4d h4dVar = j4d.b;
                zib zibVar = ajb.b;
                ruj rujVar = cjg.c;
                if (lzb.a[a.a().ordinal()] != 1) {
                    qt7Var2 = st7.a;
                }
                w = mec.w(a, h4dVar, zibVar, rujVar, qt7Var2, q0c.b);
            } else {
                h4d h4dVar2 = j4d.a;
                zib zibVar2 = ajb.a;
                nuj nujVar2 = cjg.b;
                if (lzb.a[a.a().ordinal()] != 1) {
                    qt7 qt7Var4 = st7.b;
                    if (qt7Var4 != null) {
                        qt7Var = qt7Var4;
                    } else {
                        dmk.n("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    qt7Var = null;
                }
                w = mec.w(a, h4dVar2, zibVar2, nujVar2, qt7Var, q0c.a);
            }
            xig xigVar2 = (xig) concurrentHashMap.putIfAbsent(cls, w);
            if (xigVar2 != null) {
                return xigVar2;
            }
            return w;
        }
        return xigVar;
    }
}
