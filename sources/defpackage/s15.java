package defpackage;

import com.stripe.android.model.LinkBrand;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class s15 implements us8 {
    public static final s15 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [s15, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.model.ConsumerSessionLookup", obj, 8);
        dseVar.j("exists", false);
        dseVar.j("consumer_session", true);
        dseVar.j("error_message", true);
        dseVar.j("publishable_key", true);
        dseVar.j("displayable_payment_details", true);
        dseVar.j("consent_ui", true);
        dseVar.j("suggested_email", true);
        dseVar.j("link_brand", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        KSerializer c = bin.c(g15.a);
        b2i b2iVar = b2i.a;
        return new KSerializer[]{lh1.a, c, bin.c(b2iVar), bin.c(b2iVar), bin.c(xv6.a), bin.c(jx4.a), bin.c(b2iVar), bin.c(ocb.e)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        r15 r15Var = null;
        String str = null;
        String str2 = null;
        zv6 zv6Var = null;
        ay4 ay4Var = null;
        String str3 = null;
        LinkBrand linkBrand = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            switch (p) {
                case -1:
                    z = false;
                case 0:
                    z2 = a2.z(serialDescriptor, 0);
                    i |= 1;
                    obj = null;
                case 1:
                    r15Var = (r15) a2.B(serialDescriptor, 1, g15.a, r15Var);
                    i |= 2;
                    obj = null;
                case 2:
                    str = (String) a2.B(serialDescriptor, 2, b2i.a, str);
                    i |= 4;
                    obj = null;
                case 3:
                    str2 = (String) a2.B(serialDescriptor, 3, b2i.a, str2);
                    i |= 8;
                    obj = null;
                case 4:
                    zv6Var = (zv6) a2.B(serialDescriptor, 4, xv6.a, zv6Var);
                    i |= 16;
                    obj = null;
                case 5:
                    ay4Var = (ay4) a2.B(serialDescriptor, 5, jx4.a, ay4Var);
                    i |= 32;
                    obj = null;
                case 6:
                    str3 = (String) a2.B(serialDescriptor, 6, b2i.a, str3);
                    i |= 64;
                    obj = null;
                case 7:
                    linkBrand = (LinkBrand) a2.B(serialDescriptor, 7, ocb.e, linkBrand);
                    i |= 128;
                    obj = null;
                default:
                    dmk.b(p);
                    return obj;
            }
        }
        a2.b(serialDescriptor);
        return new u15(i, z2, r15Var, str, str2, zv6Var, ay4Var, str3, linkBrand);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u15 u15Var = (u15) obj;
        u15Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        boolean z = u15Var.a;
        LinkBrand linkBrand = u15Var.h;
        String str = u15Var.g;
        ay4 ay4Var = u15Var.f;
        zv6 zv6Var = u15Var.e;
        String str2 = u15Var.d;
        String str3 = u15Var.c;
        r15 r15Var = u15Var.b;
        a2.z(serialDescriptor, 0, z);
        if (a2.r(serialDescriptor) || r15Var != null) {
            a2.j(serialDescriptor, 1, g15.a, r15Var);
        }
        if (a2.r(serialDescriptor) || str3 != null) {
            a2.j(serialDescriptor, 2, b2i.a, str3);
        }
        if (a2.r(serialDescriptor) || str2 != null) {
            a2.j(serialDescriptor, 3, b2i.a, str2);
        }
        if (a2.r(serialDescriptor) || zv6Var != null) {
            a2.j(serialDescriptor, 4, xv6.a, zv6Var);
        }
        if (a2.r(serialDescriptor) || ay4Var != null) {
            a2.j(serialDescriptor, 5, jx4.a, ay4Var);
        }
        if (a2.r(serialDescriptor) || str != null) {
            a2.j(serialDescriptor, 6, b2i.a, str);
        }
        if (a2.r(serialDescriptor) || linkBrand != null) {
            a2.j(serialDescriptor, 7, ocb.e, linkBrand);
        }
        a2.b(serialDescriptor);
    }
}
