package defpackage;

import kotlin.jvm.functions.Function2;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class ms4 {
    public static final uk a = new uk("CLOSED", 8);

    public static final Object a(fog fogVar, long j, Function2 function2) {
        while (true) {
            fog fogVar2 = fogVar;
            while (true) {
                if (fogVar2.d >= j && !fogVar2.d()) {
                    return fogVar2;
                }
                Object objectVolatile = oo4.a.getObjectVolatile(fogVar2, ns4.a);
                uk ukVar = a;
                if (objectVolatile == ukVar) {
                    return ukVar;
                }
                fogVar = (fog) ((ns4) objectVolatile);
                if (fogVar != null) {
                    break;
                }
                fog fogVar3 = (fog) function2.invoke(Long.valueOf(fogVar2.d + 1), fogVar2);
                while (true) {
                    Unsafe unsafe = oo4.a;
                    long j2 = ns4.a;
                    if (unsafe.compareAndSwapObject(fogVar2, j2, (Object) null, fogVar3)) {
                        if (fogVar2.d()) {
                            fogVar2.e();
                        }
                        fogVar2 = fogVar3;
                    } else if (unsafe.getObjectVolatile(fogVar2, j2) != null) {
                        break;
                    }
                }
            }
        }
    }
}
