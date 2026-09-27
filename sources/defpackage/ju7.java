package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ju7 implements us8 {
    public static final ju7 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, us8, ju7] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.ui.core.elements.ExternalPaymentMethodSpec", obj, 4);
        dseVar.j("type", false);
        dseVar.j("label", false);
        dseVar.j("light_image_url", false);
        dseVar.j("dark_image_url", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        b2i b2iVar = b2i.a;
        return new KSerializer[]{b2iVar, b2iVar, b2iVar, bin.c(b2iVar)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p != 2) {
                            if (p == 3) {
                                str4 = (String) a2.B(serialDescriptor, 3, b2i.a, str4);
                                i |= 8;
                            } else {
                                dmk.b(p);
                                return null;
                            }
                        } else {
                            str3 = a2.o(serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        str2 = a2.o(serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = a2.o(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new lu7(str, str2, str3, i, str4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lu7 lu7Var = (lu7) obj;
        lu7Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        String str = lu7Var.a;
        String str2 = lu7Var.d;
        a2.A(serialDescriptor, 0, str);
        a2.A(serialDescriptor, 1, lu7Var.b);
        a2.A(serialDescriptor, 2, lu7Var.c);
        if (a2.r(serialDescriptor) || str2 != null) {
            a2.j(serialDescriptor, 3, b2i.a, str2);
        }
        a2.b(serialDescriptor);
    }
}
