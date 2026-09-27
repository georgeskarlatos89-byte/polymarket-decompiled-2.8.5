package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class z31 implements us8 {
    public static final z31 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [z31, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.ui.core.elements.BacsDebitBankAccountSpec", obj, 3);
        dseVar.j("sortCodeIdentifier", true);
        dseVar.j("accountNumberIdentifier", true);
        dseVar.j("apiPath", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        jl9 jl9Var = jl9.a;
        return new KSerializer[]{jl9Var, jl9Var, jl9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        ll9 ll9Var = null;
        ll9 ll9Var2 = null;
        ll9 ll9Var3 = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p == 2) {
                            ll9Var3 = (ll9) a2.D(serialDescriptor, 2, jl9.a, ll9Var3);
                            i |= 4;
                        } else {
                            dmk.b(p);
                            return null;
                        }
                    } else {
                        ll9Var2 = (ll9) a2.D(serialDescriptor, 1, jl9.a, ll9Var2);
                        i |= 2;
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
        return new b41(i, ll9Var, ll9Var2, ll9Var3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, defpackage.kl9.a("bacs_debit[sort_code]")) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, defpackage.kl9.a("bacs_debit[account_number]")) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        b41 b41Var = (b41) obj;
        b41Var.getClass();
        ll9 ll9Var = b41Var.c;
        ll9 ll9Var2 = b41Var.b;
        ll9 ll9Var3 = b41Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        if (!a2.r(serialDescriptor)) {
            ll9.Companion.getClass();
        }
        a2.f(serialDescriptor, 0, jl9.a, ll9Var3);
        if (!a2.r(serialDescriptor)) {
            ll9.Companion.getClass();
        }
        a2.f(serialDescriptor, 1, jl9.a, ll9Var2);
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(ll9Var, new ll9())) {
            a2.f(serialDescriptor, 2, jl9.a, ll9Var);
        }
        a2.b(serialDescriptor);
    }
}
