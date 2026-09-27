package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class o7h implements us8 {
    public static final o7h a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [o7h, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.ui.core.elements.SimpleTextSpec", obj, 5);
        dseVar.j("api_path", false);
        dseVar.j("label", false);
        dseVar.j("capitalization", true);
        dseVar.j("keyboard_type", true);
        dseVar.j("show_optional_label", true);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = r7h.f;
        return new KSerializer[]{jl9.a, k1a.a, lazyArr[2].getValue(), lazyArr[3].getValue(), lh1.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = r7h.f;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        ll9 ll9Var = null;
        y23 y23Var = null;
        qoa qoaVar = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p != 2) {
                            if (p != 3) {
                                if (p == 4) {
                                    z2 = a2.z(serialDescriptor, 4);
                                    i |= 16;
                                } else {
                                    dmk.b(p);
                                    return null;
                                }
                            } else {
                                qoaVar = (qoa) a2.D(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), qoaVar);
                                i |= 8;
                            }
                        } else {
                            y23Var = (y23) a2.D(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), y23Var);
                            i |= 4;
                        }
                    } else {
                        i2 = a2.m(serialDescriptor, 1);
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
        return new r7h(i, ll9Var, i2, y23Var, qoaVar, z2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r7h r7hVar = (r7h) obj;
        r7hVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = r7h.f;
        jl9 jl9Var = jl9.a;
        ll9 ll9Var = r7hVar.a;
        boolean z = r7hVar.e;
        qoa qoaVar = r7hVar.d;
        y23 y23Var = r7hVar.c;
        a2.f(serialDescriptor, 0, jl9Var, ll9Var);
        a2.w(1, r7hVar.b, serialDescriptor);
        if (a2.r(serialDescriptor) || y23Var != y23.None) {
            a2.f(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), y23Var);
        }
        if (a2.r(serialDescriptor) || qoaVar != qoa.Ascii) {
            a2.f(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), qoaVar);
        }
        if (a2.r(serialDescriptor) || z) {
            a2.z(serialDescriptor, 4, z);
        }
        a2.b(serialDescriptor);
    }
}
