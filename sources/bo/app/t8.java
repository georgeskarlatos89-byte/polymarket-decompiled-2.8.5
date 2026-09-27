package bo.app;

import defpackage.b2i;
import defpackage.bin;
import defpackage.dmk;
import defpackage.dse;
import defpackage.lh1;
import defpackage.sw7;
import defpackage.us8;
import defpackage.xq4;
import defpackage.yq4;
import io.radar.sdk.RadarTrackingOptions;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class t8 implements us8 {
    public static final t8 a;
    private static final SerialDescriptor descriptor;

    static {
        t8 t8Var = new t8();
        a = t8Var;
        dse dseVar = new dse("com.braze.models.FeatureFlag", t8Var, 4);
        dseVar.j(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, false);
        dseVar.j("enabled", false);
        dseVar.j("properties", false);
        dseVar.j("fts", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        b2i b2iVar = b2i.a;
        return new KSerializer[]{b2iVar, lh1.a, b2iVar, bin.c(b2iVar)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p != 2) {
                            if (p == 3) {
                                str3 = (String) a2.B(serialDescriptor, 3, b2i.a, str3);
                                i |= 8;
                            } else {
                                dmk.b(p);
                                return null;
                            }
                        } else {
                            str2 = a2.o(serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        z2 = a2.z(serialDescriptor, 1);
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
        return new sw7(i, str, str2, str3, z2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        sw7 sw7Var = (sw7) obj;
        encoder.getClass();
        sw7Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        String str = sw7Var.a;
        String str2 = sw7Var.d;
        a2.A(serialDescriptor, 0, str);
        a2.z(serialDescriptor, 1, sw7Var.b);
        a2.A(serialDescriptor, 2, sw7Var.c);
        if (a2.r(serialDescriptor) || str2 != null) {
            a2.j(serialDescriptor, 3, b2i.a, str2);
        }
        a2.b(serialDescriptor);
    }
}
