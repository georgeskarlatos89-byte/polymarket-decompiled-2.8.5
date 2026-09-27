package defpackage;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession$StatusDetails$Cancelled$Reason;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class l38 implements us8 {
    public static final l38 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [l38, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.financialconnections.model.FinancialConnectionsSession.StatusDetails.Cancelled", obj, 1);
        dseVar.j("reason", false);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{o38.e};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        FinancialConnectionsSession$StatusDetails$Cancelled$Reason financialConnectionsSession$StatusDetails$Cancelled$Reason = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p == 0) {
                    financialConnectionsSession$StatusDetails$Cancelled$Reason = (FinancialConnectionsSession$StatusDetails$Cancelled$Reason) a2.D(serialDescriptor, 0, o38.e, financialConnectionsSession$StatusDetails$Cancelled$Reason);
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
        return new p38(i, financialConnectionsSession$StatusDetails$Cancelled$Reason);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p38 p38Var = (p38) obj;
        p38Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        a2.f(serialDescriptor, 0, o38.e, p38Var.a);
        a2.b(serialDescriptor);
    }
}
