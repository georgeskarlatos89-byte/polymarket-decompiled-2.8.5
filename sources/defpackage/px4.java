package defpackage;

import io.radar.sdk.RadarTrackingOptions;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class px4 implements us8 {
    public static final px4 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, us8, px4] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.model.ConsentUi.ConsentPane.ScopesSection.Scope", obj, 3);
        dseVar.j(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, false);
        dseVar.j("header", false);
        dseVar.j("description", false);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xx4.a, bin.c(b2i.a), m2c.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        zx4 zx4Var = null;
        String str = null;
        String str2 = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p == 2) {
                            str2 = (String) a2.D(serialDescriptor, 2, m2c.a, str2);
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
                    zx4Var = (zx4) a2.D(serialDescriptor, 0, xx4.a, zx4Var);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new rx4(i, zx4Var, str, str2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rx4 rx4Var = (rx4) obj;
        rx4Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        a2.f(serialDescriptor, 0, xx4.a, rx4Var.a);
        a2.j(serialDescriptor, 1, b2i.a, rx4Var.b);
        a2.f(serialDescriptor, 2, m2c.a, rx4Var.c);
        a2.b(serialDescriptor);
    }
}
