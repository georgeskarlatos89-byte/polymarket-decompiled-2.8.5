package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class odn {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, e0 e0Var, xxi xxiVar, aga agaVar, pq4 pq4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        aga agaVar2;
        int i6;
        int i7;
        boolean z;
        aga agaVar3;
        nrf u;
        str.getClass();
        e0Var.getClass();
        xxiVar.getClass();
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(346510580);
        if (sr8Var.h(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i | i3;
        if (sr8Var.h(e0Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (sr8Var.h(xxiVar)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i9 | i5;
        if ((i2 & 8) == 0) {
            agaVar2 = agaVar;
            if (sr8Var.h(agaVar2)) {
                i6 = 2048;
                i7 = i10 | i6;
                if ((i7 & 1171) == 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (!sr8Var.V(i7 & 1, z)) {
                    sr8Var.a0();
                    if ((i & 1) != 0 && !sr8Var.D()) {
                        sr8Var.Y();
                        if ((i2 & 8) != 0) {
                            i7 &= -7169;
                        }
                    } else if ((i2 & 8) != 0) {
                        i7 &= -7169;
                        agaVar2 = h8m.s;
                    }
                    sr8Var.t();
                    Object Q = sr8Var.Q();
                    if (Q == oq4.a) {
                        Q = new kib(14);
                        sr8Var.o0(Q);
                    }
                    aga agaVar4 = agaVar2;
                    hen.b(str, e0Var, xxiVar, cug.c(hjc.a, false, (Function1) Q), agaVar4, null, sr8Var, (i7 & 1022) | ((i7 << 3) & 57344));
                    agaVar3 = agaVar4;
                } else {
                    sr8Var.Y();
                    agaVar3 = agaVar2;
                }
                u = sr8Var.u();
                if (u == null) {
                    u.d = new lm(str, e0Var, xxiVar, agaVar3, i, i2, 28);
                    return;
                }
                return;
            }
        } else {
            agaVar2 = agaVar;
        }
        i6 = Barcode.FORMAT_UPC_E;
        i7 = i10 | i6;
        if ((i7 & 1171) == 1170) {
        }
        if (!sr8Var.V(i7 & 1, z)) {
        }
        u = sr8Var.u();
        if (u == null) {
        }
    }

    public static pu9 b(e47 e47Var, tzf tzfVar, long j, int i) {
        if ((i & 2) != 0) {
            tzfVar = tzf.Restart;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        return new pu9(e47Var, tzfVar, j);
    }

    public static final zoa c(Function1 function1) {
        yoa yoaVar = new yoa();
        function1.invoke(yoaVar);
        return new zoa(yoaVar);
    }

    public static fch d() {
        return new fch(0);
    }

    public static qjh e(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new qjh(f, f2, obj);
    }

    public static ofj f(int i, int i2, w57 w57Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            w57Var = y57.a;
        }
        return new ofj(i, i2, w57Var);
    }

    public abstract int g();

    public abstract nbl h(int i);

    public abstract Object i(nbl nblVar);

    public abstract Object j(int i);
}
