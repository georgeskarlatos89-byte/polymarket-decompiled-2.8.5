package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class k38 implements us8 {
    public static final k38 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [k38, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.financialconnections.model.FinancialConnectionsSession.StatusDetails", obj, 1);
        dseVar.j("cancelled", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{bin.c(l38.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        p38 p38Var = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p == 0) {
                    p38Var = (p38) a2.B(serialDescriptor, 0, l38.a, p38Var);
                    i = 1;
                } else {
                    dmk.b(p);
                    return null;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new r38(i, p38Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r38 r38Var = (r38) obj;
        r38Var.getClass();
        p38 p38Var = r38Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        if (a2.r(serialDescriptor) || p38Var != null) {
            a2.j(serialDescriptor, 0, l38.a, p38Var);
        }
        a2.b(serialDescriptor);
    }
}
