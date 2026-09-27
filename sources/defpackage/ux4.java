package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ux4 implements us8 {
    public static final ux4 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [ux4, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.model.ConsentUi.ConsentSection", obj, 1);
        dseVar.j("disclaimer", false);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{m2c.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p == 0) {
                    str = (String) a2.D(serialDescriptor, 0, m2c.a, str);
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
        return new wx4(i, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wx4 wx4Var = (wx4) obj;
        wx4Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        a2.f(serialDescriptor, 0, m2c.a, wx4Var.a);
        a2.b(serialDescriptor);
    }
}
