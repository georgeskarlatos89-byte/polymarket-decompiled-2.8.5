package bo.app;

import defpackage.b2i;
import defpackage.bin;
import defpackage.cub;
import defpackage.dmk;
import defpackage.dse;
import defpackage.us8;
import defpackage.v61;
import defpackage.xq4;
import defpackage.yq4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements us8 {
    public static final o a;
    private static final SerialDescriptor descriptor;

    static {
        o oVar = new o();
        a = oVar;
        dse dseVar = new dse("com.braze.models.BannerPendingDismissal", oVar, 3);
        dseVar.j("banner_id", false);
        dseVar.j("stable_key", true);
        dseVar.j("dismissal_time", false);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        b2i b2iVar = b2i.a;
        return new KSerializer[]{b2iVar, bin.c(b2iVar), cub.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        int i = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p == 2) {
                            j = a2.g(serialDescriptor, 2);
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
                    str = a2.o(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new v61(i, j, str, str2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v61 v61Var = (v61) obj;
        encoder.getClass();
        v61Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        String str = v61Var.a;
        String str2 = v61Var.b;
        a2.A(serialDescriptor, 0, str);
        if (a2.r(serialDescriptor) || str2 != null) {
            a2.j(serialDescriptor, 1, b2i.a, str2);
        }
        a2.E(serialDescriptor, 2, v61Var.c);
        a2.b(serialDescriptor);
    }
}
