package defpackage;

import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class frm {
    public static mqd a(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new mqd(f, f2, f, f2);
    }

    public static mqd b(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return new mqd(f, f2, f3, f4);
    }

    public static final float c(iqd iqdVar, owa owaVar) {
        if (owaVar == owa.Ltr) {
            return iqdVar.c(owaVar);
        }
        return iqdVar.b(owaVar);
    }

    public static final float d(iqd iqdVar, owa owaVar) {
        if (owaVar == owa.Ltr) {
            return iqdVar.b(owaVar);
        }
        return iqdVar.c(owaVar);
    }

    public static final kjc e(kjc kjcVar, iqd iqdVar) {
        return kjcVar.e(new lqd(iqdVar, new e1d(iqdVar, 8)));
    }

    public static final kjc f(kjc kjcVar, float f) {
        return kjcVar.e(new eqd(f, f, f, f, new va1(f, 15)));
    }

    public static final kjc g(float f, float f2, kjc kjcVar) {
        return kjcVar.e(new eqd(f, f2, f, f2, new uh1(f, f2, 6)));
    }

    public static kjc h(kjc kjcVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return g(f, f2, kjcVar);
    }

    public static final kjc i(kjc kjcVar, final float f, final float f2, final float f3, final float f4) {
        return kjcVar.e(new eqd(f, f2, f3, f4, new Function1() { // from class: fqd
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                zz9 zz9Var = (zz9) obj;
                zz9Var.a = "padding";
                tl0 tl0Var = zz9Var.c;
                tl0Var.c(new hy6(f), OpsMetricTracker.START);
                tl0Var.c(new hy6(f2), VerticalAlignment.TOP);
                tl0Var.c(new hy6(f3), "end");
                tl0Var.c(new hy6(f4), VerticalAlignment.BOTTOM);
                return Unit.INSTANCE;
            }
        }));
    }

    public static kjc j(kjc kjcVar, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return i(kjcVar, f, f2, f3, f4);
    }

    public static final long k(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final Object l(ada adaVar, String str, bfa bfaVar, KSerializer kSerializer) {
        adaVar.getClass();
        str.getClass();
        return new fga(adaVar, bfaVar, str, kSerializer.getDescriptor()).q(kSerializer);
    }

    public static final long m(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }
}
