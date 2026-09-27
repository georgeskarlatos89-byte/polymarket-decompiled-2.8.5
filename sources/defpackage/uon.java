package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.platform.a;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.Closeable;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class uon {
    public static final void a(Function0 function0, ktc ktcVar, long j, String str, vl4 vl4Var, pq4 pq4Var, int i) {
        int i2;
        boolean z;
        sr8 sr8Var;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        function0.getClass();
        ktcVar.getClass();
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.g0(1954348016);
        if ((i & 6) == 0) {
            if (sr8Var2.j(function0)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sr8Var2.j(ktcVar)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (sr8Var2.g(j)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (sr8Var2.h(str)) {
                i4 = 2048;
            } else {
                i4 = Barcode.FORMAT_UPC_E;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (sr8Var2.j(vl4Var)) {
                i3 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        int i8 = i2;
        if ((i8 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var2.V(i8 & 1, z)) {
            y4h g = kic.g(6, 2, sr8Var2, true);
            Object Q = sr8Var2.Q();
            uwn uwnVar = oq4.a;
            if (Q == uwnVar) {
                Q = hrl.i(g.a, sr8Var2);
                sr8Var2.o0(Q);
            }
            t85 t85Var = (t85) Q;
            qag d = rag.d(24.0f, 24.0f, 0.0f, 0.0f, 12);
            kjc l = b4n.l(a.a(b.c, str));
            boolean j2 = sr8Var2.j(t85Var) | sr8Var2.h(g) | sr8Var2.j(ktcVar);
            if ((i8 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = j2 | z2;
            Object Q2 = sr8Var2.Q();
            if (z3 || Q2 == uwnVar) {
                po0 po0Var = new po0(t85Var, g, ktcVar, function0, 25);
                sr8Var2.o0(po0Var);
                Q2 = po0Var;
            }
            sr8Var = sr8Var2;
            kic.b((Function0) Q2, l, g, 0.0f, d, j, 0L, 0L, null, null, null, sel.d(1792352909, new ae2(vl4Var, t85Var, g, ktcVar, function0), sr8Var2), sr8Var, (i8 << 9) & 458752);
        } else {
            sr8Var = sr8Var2;
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new hl2(function0, ktcVar, j, str, vl4Var, i);
        }
    }

    public static final void b(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                gp7.a(th, th2);
            }
        }
    }
}
