package defpackage;

import io.radar.sdk.RadarTrackingOptions;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class lx4 implements us8 {
    public static final lx4 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [lx4, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.model.ConsentUi.ConsentPane", obj, 5);
        dseVar.j(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, false);
        dseVar.j("scopes_section", false);
        dseVar.j("disclaimer", false);
        dseVar.j("deny_button_label", false);
        dseVar.j("allow_button_label", false);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        b2i b2iVar = b2i.a;
        return new KSerializer[]{b2iVar, nx4.a, bin.c(m2c.a), bin.c(b2iVar), b2iVar};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        sx4 sx4Var = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p != 2) {
                            if (p != 3) {
                                if (p == 4) {
                                    str4 = a2.o(serialDescriptor, 4);
                                    i |= 16;
                                } else {
                                    dmk.b(p);
                                    return null;
                                }
                            } else {
                                str3 = (String) a2.B(serialDescriptor, 3, b2i.a, str3);
                                i |= 8;
                            }
                        } else {
                            str2 = (String) a2.B(serialDescriptor, 2, m2c.a, str2);
                            i |= 4;
                        }
                    } else {
                        sx4Var = (sx4) a2.D(serialDescriptor, 1, nx4.a, sx4Var);
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
        return new tx4(i, str, sx4Var, str2, str3, str4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tx4 tx4Var = (tx4) obj;
        tx4Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        a2.A(serialDescriptor, 0, tx4Var.a);
        a2.f(serialDescriptor, 1, nx4.a, tx4Var.b);
        a2.j(serialDescriptor, 2, m2c.a, tx4Var.c);
        a2.j(serialDescriptor, 3, b2i.a, tx4Var.d);
        a2.A(serialDescriptor, 4, tx4Var.e);
        a2.b(serialDescriptor);
    }
}
