package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class kun {
    public static final long a(int i, int i2, c9h c9hVar, qhg qhgVar, c9h c9hVar2) {
        int i3;
        int i4;
        if (!Intrinsics.areEqual(c9hVar, c9h.c)) {
            i = d(c9hVar.a, qhgVar);
            i2 = d(c9hVar.b, qhgVar);
        }
        et6 et6Var = c9hVar2.a;
        et6 et6Var2 = c9hVar2.b;
        if ((et6Var instanceof at6) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i4 = ((at6) et6Var).a)) {
            i = i4;
        }
        if ((et6Var2 instanceof at6) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i3 = ((at6) et6Var2).a)) {
            i2 = i3;
        }
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final double b(int i, int i2, int i3, int i4, qhg qhgVar, c9h c9hVar) {
        double max;
        double d = i;
        double d2 = i3 / d;
        double d3 = i2;
        double d4 = i4 / d3;
        int i5 = ox5.a[qhgVar.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                max = Math.min(d2, d4);
            } else {
                dmk.a();
                return ConstantsKt.UNSET;
            }
        } else {
            max = Math.max(d2, d4);
        }
        if (c9hVar.a instanceof at6) {
            double d5 = ((at6) r9).a / d;
            if (max > d5) {
                max = d5;
            }
        }
        if (c9hVar.b instanceof at6) {
            double d6 = ((at6) r9).a / d3;
            if (max > d6) {
                return d6;
            }
        }
        return max;
    }

    public static final boolean c(String str, boolean z, Map map) {
        Boolean bool;
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return z;
    }

    public static int d(et6 et6Var, qhg qhgVar) {
        if (et6Var instanceof at6) {
            return ((at6) et6Var).a;
        }
        int i = ox5.a[qhgVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return bd0.API_PRIORITY_OTHER;
            }
            dmk.a();
            return 0;
        }
        return Integer.MIN_VALUE;
    }
}
