package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class c7n {
    public final /* synthetic */ int a = 1;

    public static final void a(kjc kjcVar, pq4 pq4Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(206644096);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (sr8Var.h(kjcVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i3 & 1, z)) {
            if (i5 != 0) {
                kjcVar = hjc.a;
            }
            kjc kjcVar2 = kjcVar;
            qxn.a(0.5f, (i3 & 14) | 384, 8, ((ycb) sr8Var.l(syi.c)).f, sr8Var, kjcVar2);
            kjcVar = kjcVar2;
        } else {
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new j11(kjcVar, i, i2, 10);
        }
    }

    public static xlk b(pq4 pq4Var) {
        sr8 sr8Var = (sr8) pq4Var;
        View view = (View) sr8Var.l(AndroidCompositionLocals_androidKt.f);
        xlk f = f(view);
        boolean j = sr8Var.j(f) | sr8Var.j(view);
        Object Q = sr8Var.Q();
        if (j || Q == oq4.a) {
            Q = new czj(9, f, view);
            sr8Var.o0(Q);
        }
        hrl.b(f, (Function1) Q, sr8Var);
        return f;
    }

    public static xlk f(View view) {
        xlk xlkVar;
        WeakHashMap weakHashMap = xlk.x;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new xlk(view);
                    weakHashMap.put(view, obj);
                }
                xlkVar = (xlk) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xlkVar;
    }

    public static q3k g(int i, String str) {
        return new q3k(new oz9(0, 0, 0, 0), str);
    }

    public abstract lcf c();

    public abstract Object d();

    public abstract String e();

    public String toString() {
        switch (this.a) {
            case 1:
                return "The field " + e() + " (default value is " + d() + ')';
            default:
                return super.toString();
        }
    }
}
