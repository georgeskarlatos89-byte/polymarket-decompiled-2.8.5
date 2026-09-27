package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class spg implements us8 {
    public static final spg a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, spg, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("next_action_spec", obj, 2);
        dseVar.j("light_theme_png", true);
        dseVar.j("dark_theme_png", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        b2i b2iVar = b2i.a;
        return new KSerializer[]{bin.c(b2iVar), bin.c(b2iVar)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p == 1) {
                        str2 = (String) a2.B(serialDescriptor, 1, b2i.a, str2);
                        i |= 2;
                    } else {
                        dmk.b(p);
                        return null;
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
        return new upg(i, str, str2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        upg upgVar = (upg) obj;
        upgVar.getClass();
        String str = upgVar.b;
        String str2 = upgVar.a;
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        if (a2.r(serialDescriptor) || str2 != null) {
            a2.j(serialDescriptor, 0, b2i.a, str2);
        }
        if (a2.r(serialDescriptor) || str != null) {
            a2.j(serialDescriptor, 1, b2i.a, str);
        }
        a2.b(serialDescriptor);
    }
}
