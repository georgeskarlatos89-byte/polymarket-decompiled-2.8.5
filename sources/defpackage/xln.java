package defpackage;

import androidx.compose.foundation.layout.b;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class xln {
    public static final void a(kjc kjcVar, List list, Function1 function1, pq4 pq4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        sr8 sr8Var;
        kjc kjcVar2;
        boolean z2;
        boolean z3;
        boolean z4;
        list.getClass();
        function1.getClass();
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.g0(1889447219);
        if (sr8Var2.j(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (sr8Var2.f(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (sr8Var2.j(function1)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5 | 3072;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var2.V(i8 & 1, z)) {
            z2b a = a3b.a(0, 0, 3, sr8Var2);
            Integer valueOf = Integer.valueOf(i);
            boolean j = sr8Var2.j(list);
            int i9 = i8 & 112;
            if (i9 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean h = j | z2 | sr8Var2.h(a);
            Object Q = sr8Var2.Q();
            Object obj = oq4.a;
            if (h || Q == obj) {
                Q = new f62(i, list, a, (Continuation) null);
                sr8Var2.o0(Q);
            }
            hrl.d(sr8Var2, valueOf, (Function2) Q);
            kk0 kk0Var = new kk0(8.0f, true, new f27(14));
            mqd a2 = frm.a(16.0f, 0.0f, 2);
            hjc hjcVar = hjc.a;
            kjc j2 = frm.j(b.d(hjcVar, 1.0f), 0.0f, 12.0f, 0.0f, 8.0f, 5);
            boolean j3 = sr8Var2.j(list);
            if (i9 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z3 | j3;
            if ((i8 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object Q2 = sr8Var2.Q();
            if (z6 || Q2 == obj) {
                Q2 = new r22(list, i, function1, 3);
                sr8Var2.o0(Q2);
            }
            sr8Var = sr8Var2;
            a4n.b(j2, a, a2, kk0Var, null, null, false, null, (Function1) Q2, sr8Var, 24960, 488);
            kjcVar2 = hjcVar;
        } else {
            sr8Var = sr8Var2;
            sr8Var.Y();
            kjcVar2 = kjcVar;
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new i22(i, i2, 2, kjcVar2, list, function1);
        }
    }

    public abstract void b(q1g q1gVar, Object obj);
}
