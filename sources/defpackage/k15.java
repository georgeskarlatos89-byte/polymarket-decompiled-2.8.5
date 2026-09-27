package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class k15 implements us8 {
    public static final k15 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, us8, k15] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.model.ConsumerSession.VerificationSession", obj, 2);
        dseVar.j("type", false);
        dseVar.j("state", false);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = q15.c;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = q15.c;
        boolean z = true;
        int i = 0;
        p15 p15Var = null;
        n15 n15Var = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p == 1) {
                        n15Var = (n15) a2.D(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), n15Var);
                        i |= 2;
                    } else {
                        dmk.b(p);
                        return null;
                    }
                } else {
                    p15Var = (p15) a2.D(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), p15Var);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new q15(i, p15Var, n15Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q15 q15Var = (q15) obj;
        q15Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = q15.c;
        a2.f(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), q15Var.a);
        a2.f(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), q15Var.b);
        a2.b(serialDescriptor);
    }
}
