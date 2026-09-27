package defpackage;

import kotlin.reflect.KClass;
import kotlin.reflect.KTypeProjection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class c3n {
    public static final Object a = new Object();

    public static final zgj a(zgj zgjVar) {
        zgjVar.getClass();
        wka wkaVar = zgjVar.b;
        wkaVar.getClass();
        wka wkaVar2 = ((KTypeProjection) wkaVar.d().get(0)).b;
        wkaVar2.getClass();
        tja c = wkaVar2.c();
        c.getClass();
        return new zgj((KClass) c, wkaVar2);
    }

    public static final boolean b(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }
}
