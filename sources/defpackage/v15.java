package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class v15 implements us8 {
    public static final v15 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, v15, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.model.ConsumerSessionRefresh", obj, 2);
        dseVar.j("consumer_session", false);
        dseVar.j("link_auth_intent", false);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{g15.a, bin.c(ybb.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        r15 r15Var = null;
        bcb bcbVar = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p == 1) {
                        bcbVar = (bcb) a2.B(serialDescriptor, 1, ybb.a, bcbVar);
                        i |= 2;
                    } else {
                        dmk.b(p);
                        return null;
                    }
                } else {
                    r15Var = (r15) a2.D(serialDescriptor, 0, g15.a, r15Var);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new x15(i, r15Var, bcbVar);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        x15 x15Var = (x15) obj;
        x15Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        a2.f(serialDescriptor, 0, g15.a, x15Var.a);
        a2.j(serialDescriptor, 1, ybb.a, x15Var.b);
        a2.b(serialDescriptor);
    }
}
