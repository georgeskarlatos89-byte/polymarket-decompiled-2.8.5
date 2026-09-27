package defpackage;

import com.stripe.android.financialconnections.model.Balance$Type;
import java.util.Map;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class v51 implements us8 {
    public static final v51 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [v51, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.financialconnections.model.Balance", obj, 5);
        dseVar.j("as_of", false);
        dseVar.j("current", false);
        dseVar.j("type", true);
        dseVar.j("cash", true);
        dseVar.j("credit", true);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = y51.f;
        return new KSerializer[]{k1a.a, lazyArr[1].getValue(), lazyArr[2].getValue(), bin.c(fa3.a), bin.c(oe5.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = y51.f;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        Map map = null;
        Balance$Type balance$Type = null;
        ha3 ha3Var = null;
        qe5 qe5Var = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p != 2) {
                            if (p != 3) {
                                if (p == 4) {
                                    qe5Var = (qe5) a2.B(serialDescriptor, 4, oe5.a, qe5Var);
                                    i |= 16;
                                } else {
                                    dmk.b(p);
                                    return null;
                                }
                            } else {
                                ha3Var = (ha3) a2.B(serialDescriptor, 3, fa3.a, ha3Var);
                                i |= 8;
                            }
                        } else {
                            balance$Type = (Balance$Type) a2.D(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), balance$Type);
                            i |= 4;
                        }
                    } else {
                        map = (Map) a2.D(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), map);
                        i |= 2;
                    }
                } else {
                    i2 = a2.m(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new y51(i, i2, map, balance$Type, ha3Var, qe5Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y51 y51Var = (y51) obj;
        y51Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = y51.f;
        int i = y51Var.a;
        qe5 qe5Var = y51Var.e;
        ha3 ha3Var = y51Var.d;
        Balance$Type balance$Type = y51Var.c;
        a2.w(0, i, serialDescriptor);
        a2.f(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), y51Var.b);
        if (a2.r(serialDescriptor) || balance$Type != Balance$Type.UNKNOWN) {
            a2.f(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), balance$Type);
        }
        if (a2.r(serialDescriptor) || ha3Var != null) {
            a2.j(serialDescriptor, 3, fa3.a, ha3Var);
        }
        if (a2.r(serialDescriptor) || qe5Var != null) {
            a2.j(serialDescriptor, 4, oe5.a, qe5Var);
        }
        a2.b(serialDescriptor);
    }
}
