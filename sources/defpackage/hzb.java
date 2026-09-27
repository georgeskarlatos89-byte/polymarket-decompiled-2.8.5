package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class hzb implements us8 {
    public static final hzb a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [hzb, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.ui.core.elements.MandateTextSpec", obj, 2);
        dseVar.j("api_path", true);
        dseVar.j("stringResId", false);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{jl9.a, k1a.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        ll9 ll9Var = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p == 1) {
                        i2 = a2.m(serialDescriptor, 1);
                        i |= 2;
                    } else {
                        dmk.b(p);
                        return null;
                    }
                } else {
                    ll9Var = (ll9) a2.D(serialDescriptor, 0, jl9.a, ll9Var);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new jzb(i, ll9Var, i2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, defpackage.kl9.a("mandate")) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        jzb jzbVar = (jzb) obj;
        jzbVar.getClass();
        ll9 ll9Var = jzbVar.a;
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        if (!a2.r(serialDescriptor)) {
            ll9.Companion.getClass();
        }
        a2.f(serialDescriptor, 0, jl9.a, ll9Var);
        a2.w(1, jzbVar.b, serialDescriptor);
        a2.b(serialDescriptor);
    }
}
