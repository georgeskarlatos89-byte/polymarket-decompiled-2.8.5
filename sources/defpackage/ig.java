package defpackage;

import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ig implements us8 {
    public static final ig a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, us8, ig] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.ui.core.elements.AddressSpec", obj, 4);
        dseVar.j("api_path", true);
        dseVar.j("allowed_country_codes", true);
        dseVar.j("display_fields", true);
        dseVar.j("show_label", true);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = kg.g;
        return new KSerializer[]{jl9.a, lazyArr[1].getValue(), lazyArr[2].getValue(), lh1.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = kg.g;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        ll9 ll9Var = null;
        Set set = null;
        Set set2 = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p != 2) {
                            if (p == 3) {
                                z2 = a2.z(serialDescriptor, 3);
                                i |= 8;
                            } else {
                                dmk.b(p);
                                return null;
                            }
                        } else {
                            set2 = (Set) a2.D(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), set2);
                            i |= 4;
                        }
                    } else {
                        set = (Set) a2.D(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), set);
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
        return new kg(i, ll9Var, set, set2, z2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8, defpackage.kl9.a("billing_details[address]")) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        kg kgVar = (kg) obj;
        kgVar.getClass();
        boolean z = kgVar.d;
        Set set = kgVar.c;
        Set set2 = kgVar.b;
        ll9 ll9Var = kgVar.a;
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = kg.g;
        if (!a2.r(serialDescriptor)) {
            ll9.Companion.getClass();
        }
        a2.f(serialDescriptor, 0, jl9.a, ll9Var);
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(set2, ja5.a)) {
            a2.f(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), set2);
        }
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(set, fd7.a)) {
            a2.f(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), set);
        }
        if (a2.r(serialDescriptor) || !z) {
            a2.z(serialDescriptor, 3, z);
        }
        a2.b(serialDescriptor);
    }
}
