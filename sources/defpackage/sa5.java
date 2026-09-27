package defpackage;

import io.radar.sdk.RadarTrackingOptions;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class sa5 implements us8 {
    public static final sa5 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [sa5, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.checkout.components.kmp.rememberme.data.model.CreateChallengeResponse", obj, 4);
        dseVar.j(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, false);
        dseVar.j("expires_at", false);
        dseVar.j("attempt_count", false);
        dseVar.j("max_attempt_count", false);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        b2i b2iVar = b2i.a;
        k1a k1aVar = k1a.a;
        return new KSerializer[]{b2iVar, b2iVar, k1aVar, k1aVar};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p != 2) {
                            if (p == 3) {
                                i3 = a2.m(serialDescriptor, 3);
                                i |= 8;
                            } else {
                                dmk.b(p);
                                return null;
                            }
                        } else {
                            i2 = a2.m(serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        str2 = a2.o(serialDescriptor, 1);
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
        return new ua5(i, str, str2, i2, i3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ua5 ua5Var = (ua5) obj;
        ua5Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        a2.A(serialDescriptor, 0, ua5Var.a);
        a2.A(serialDescriptor, 1, ua5Var.b);
        a2.w(2, ua5Var.c, serialDescriptor);
        a2.w(3, ua5Var.d, serialDescriptor);
        a2.b(serialDescriptor);
    }

    @Override // defpackage.us8
    public final KSerializer[] typeParametersSerializers() {
        return iwm.a;
    }
}
