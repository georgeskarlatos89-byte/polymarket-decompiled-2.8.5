package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class m95 implements us8 {
    public static final m95 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [m95, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.uicore.address.CountryAddressSchema", obj, 3);
        dseVar.j("type", false);
        dseVar.j("required", false);
        dseVar.j("schema", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{bin.c((KSerializer) o95.d[0].getValue()), lh1.a, bin.c(uy7.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = o95.d;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        jz7 jz7Var = null;
        wy7 wy7Var = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p == 2) {
                            wy7Var = (wy7) a2.B(serialDescriptor, 2, uy7.a, wy7Var);
                            i |= 4;
                        } else {
                            dmk.b(p);
                            return null;
                        }
                    } else {
                        z2 = a2.z(serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    jz7Var = (jz7) a2.B(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), jz7Var);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new o95(i, jz7Var, z2, wy7Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o95 o95Var = (o95) obj;
        o95Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        KSerializer kSerializer = (KSerializer) o95.d[0].getValue();
        jz7 jz7Var = o95Var.a;
        wy7 wy7Var = o95Var.c;
        a2.j(serialDescriptor, 0, kSerializer, jz7Var);
        a2.z(serialDescriptor, 1, o95Var.b);
        if (a2.r(serialDescriptor) || wy7Var != null) {
            a2.j(serialDescriptor, 2, uy7.a, wy7Var);
        }
        a2.b(serialDescriptor);
    }
}
