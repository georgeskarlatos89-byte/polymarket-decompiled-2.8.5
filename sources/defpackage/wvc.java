package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class wvc implements us8 {
    public static final wvc a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [wvc, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.polymarket.android.ui.features.usHome.NavGraphHome.USEventDetailBySlugScreen", obj, 3);
        dseVar.j("slug", false);
        dseVar.j("tabRaw", true);
        dseVar.j("buy", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        b2i b2iVar = b2i.a;
        return new KSerializer[]{b2iVar, bin.c(b2iVar), bin.c(xvc.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        zvc zvcVar = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p == 2) {
                            zvcVar = (zvc) a2.B(serialDescriptor, 2, xvc.a, zvcVar);
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
        return new bwc(i, str, str2, zvcVar);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        bwc bwcVar = (bwc) obj;
        bwcVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        String str = bwcVar.a;
        zvc zvcVar = bwcVar.c;
        String str2 = bwcVar.b;
        a2.A(serialDescriptor, 0, str);
        if (a2.r(serialDescriptor) || str2 != null) {
            a2.j(serialDescriptor, 1, b2i.a, str2);
        }
        if (a2.r(serialDescriptor) || zvcVar != null) {
            a2.j(serialDescriptor, 2, xvc.a, zvcVar);
        }
        a2.b(serialDescriptor);
    }
}
