package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class is0 implements us8 {
    public static final is0 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [is0, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.ui.core.elements.AuBecsDebitMandateTextSpec", obj, 1);
        dseVar.j("api_path", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{jl9.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        ll9 ll9Var = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p == 0) {
                    ll9Var = (ll9) a2.D(serialDescriptor, 0, jl9.a, ll9Var);
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
        return new ks0(i, ll9Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, defpackage.kl9.a("au_becs_mandate")) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        ks0 ks0Var = (ks0) obj;
        ks0Var.getClass();
        ll9 ll9Var = ks0Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        if (!a2.r(serialDescriptor)) {
            ll9.Companion.getClass();
        }
        a2.f(serialDescriptor, 0, jl9.a, ll9Var);
        a2.b(serialDescriptor);
    }
}
