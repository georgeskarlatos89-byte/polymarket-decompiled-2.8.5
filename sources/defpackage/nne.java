package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class nne implements us8 {
    public static final nne a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [nne, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.ui.core.elements.PlaceholderSpec", obj, 2);
        dseVar.j("api_path", true);
        dseVar.j("for", true);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{jl9.a, rne.c[1].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = rne.c;
        boolean z = true;
        int i = 0;
        ll9 ll9Var = null;
        qne qneVar = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p == 1) {
                        qneVar = (qne) a2.D(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), qneVar);
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
        return new rne(i, ll9Var, qneVar);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, defpackage.kl9.a("placeholder")) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        rne rneVar = (rne) obj;
        rneVar.getClass();
        qne qneVar = rneVar.b;
        ll9 ll9Var = rneVar.a;
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = rne.c;
        if (!a2.r(serialDescriptor)) {
            ll9.Companion.getClass();
        }
        a2.f(serialDescriptor, 0, jl9.a, ll9Var);
        if (a2.r(serialDescriptor) || qneVar != qne.Unknown) {
            a2.f(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), qneVar);
        }
        a2.b(serialDescriptor);
    }
}
