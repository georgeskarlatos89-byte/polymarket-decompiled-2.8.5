package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface x5c extends y6a {
    static w5c B0(x5c x5cVar, int i, int i2, Function1 function1, Function1 function12) {
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        return x5cVar.C0(i, i2, zc7Var, function1, function12);
    }

    static w5c r0(x5c x5cVar, int i, int i2, Function1 function1) {
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        return x5cVar.d0(i, i2, zc7Var, function1);
    }

    w5c C0(int i, int i2, Map map, Function1 function1, Function1 function12);

    default w5c d0(int i, int i2, Map map, Function1 function1) {
        return C0(i, i2, map, null, function1);
    }
}
