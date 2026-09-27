package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class qhi implements us8 {
    public static final qhi a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [qhi, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.financialconnections.lite.repository.model.SynchronizeSessionResponse", obj, 1);
        dseVar.j("manifest", false);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u38.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        w38 w38Var = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p == 0) {
                    w38Var = (w38) a2.D(serialDescriptor, 0, u38.a, w38Var);
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
        return new shi(i, w38Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        shi shiVar = (shi) obj;
        shiVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        a2.f(serialDescriptor, 0, u38.a, shiVar.a);
        a2.b(serialDescriptor);
    }
}
