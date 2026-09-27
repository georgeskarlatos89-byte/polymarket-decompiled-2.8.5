package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class xv6 implements us8 {
    public static final xv6 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [xv6, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.model.DisplayablePaymentDetails", obj, 4);
        dseVar.j("default_card_brand", true);
        dseVar.j("default_payment_type", true);
        dseVar.j("last_4", true);
        dseVar.j("number_of_saved_payment_details", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        b2i b2iVar = b2i.a;
        return new KSerializer[]{bin.c(b2iVar), bin.c(b2iVar), bin.c(b2iVar), bin.c(cub.a)};
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
        Long l = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p != 2) {
                            if (p == 3) {
                                l = (Long) a2.B(serialDescriptor, 3, cub.a, l);
                                i |= 8;
                            } else {
                                dmk.b(p);
                                return null;
                            }
                        } else {
                            str3 = (String) a2.B(serialDescriptor, 2, b2i.a, str3);
                            i |= 4;
                        }
                    } else {
                        str2 = (String) a2.B(serialDescriptor, 1, b2i.a, str2);
                        i |= 2;
                    }
                } else {
                    str = (String) a2.B(serialDescriptor, 0, b2i.a, str);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new zv6(i, str, str2, str3, l);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zv6 zv6Var = (zv6) obj;
        zv6Var.getClass();
        Long l = zv6Var.d;
        String str = zv6Var.c;
        String str2 = zv6Var.b;
        String str3 = zv6Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        if (a2.r(serialDescriptor) || str3 != null) {
            a2.j(serialDescriptor, 0, b2i.a, str3);
        }
        if (a2.r(serialDescriptor) || str2 != null) {
            a2.j(serialDescriptor, 1, b2i.a, str2);
        }
        if (a2.r(serialDescriptor) || str != null) {
            a2.j(serialDescriptor, 2, b2i.a, str);
        }
        if (a2.r(serialDescriptor) || l != null) {
            a2.j(serialDescriptor, 3, cub.a, l);
        }
        a2.b(serialDescriptor);
    }
}
