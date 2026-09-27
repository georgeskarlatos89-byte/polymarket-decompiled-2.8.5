package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class xvc implements us8 {
    public static final xvc a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [xvc, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.polymarket.android.ui.features.usHome.NavGraphHome.USEventDetailBySlugScreen.BuyParams", obj, 3);
        dseVar.j("outcomeIndex", true);
        dseVar.j("marketSlug", true);
        dseVar.j("long", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{bin.c(k1a.a), bin.c(b2i.a), lh1.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Integer num = null;
        String str = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p == 2) {
                            z2 = a2.z(serialDescriptor, 2);
                            i |= 4;
                        } else {
                            dmk.b(p);
                            return null;
                        }
                    } else {
                        str = (String) a2.B(serialDescriptor, 1, b2i.a, str);
                        i |= 2;
                    }
                } else {
                    num = (Integer) a2.B(serialDescriptor, 0, k1a.a, num);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new zvc(i, num, str, z2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zvc zvcVar = (zvc) obj;
        zvcVar.getClass();
        boolean z = zvcVar.c;
        String str = zvcVar.b;
        Integer num = zvcVar.a;
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        if (a2.r(serialDescriptor) || num != null) {
            a2.j(serialDescriptor, 0, k1a.a, num);
        }
        if (a2.r(serialDescriptor) || str != null) {
            a2.j(serialDescriptor, 1, b2i.a, str);
        }
        if (a2.r(serialDescriptor) || !z) {
            a2.z(serialDescriptor, 2, z);
        }
        a2.b(serialDescriptor);
    }
}
