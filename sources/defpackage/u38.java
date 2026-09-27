package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class u38 implements us8 {
    public static final u38 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u38, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.financialconnections.lite.repository.model.FinancialConnectionsSessionManifest", obj, 3);
        dseVar.j("cancel_url", true);
        dseVar.j("hosted_auth_url", true);
        dseVar.j("success_url", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        b2i b2iVar = b2i.a;
        return new KSerializer[]{bin.c(b2iVar), bin.c(b2iVar), bin.c(b2iVar)};
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
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p == 2) {
                            str3 = (String) a2.B(serialDescriptor, 2, b2i.a, str3);
                            i |= 4;
                        } else {
                            dmk.b(p);
                            return null;
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
        return new w38(i, str, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w38 w38Var = (w38) obj;
        w38Var.getClass();
        String str = w38Var.c;
        String str2 = w38Var.b;
        String str3 = w38Var.a;
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
        a2.b(serialDescriptor);
    }
}
