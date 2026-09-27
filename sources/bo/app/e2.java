package bo.app;

import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.b2i;
import defpackage.dmk;
import defpackage.dse;
import defpackage.k1a;
import defpackage.lh1;
import defpackage.us8;
import defpackage.xq4;
import defpackage.yl1;
import defpackage.yq4;
import defpackage.zx6;
import io.radar.sdk.RadarTrackingOptions;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class e2 implements us8 {
    public static final e2 a;
    private static final SerialDescriptor descriptor;

    static {
        e2 e2Var = new e2();
        a = e2Var;
        dse dseVar = new dse("com.braze.models.BrazeGeofence", e2Var, 12);
        dseVar.j(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, false);
        dseVar.j("latitude", false);
        dseVar.j("longitude", false);
        dseVar.j("radius", false);
        dseVar.j("cooldown_enter", false);
        dseVar.j("cooldown_exit", false);
        dseVar.j("analytics_enabled_enter", false);
        dseVar.j("analytics_enabled_exit", false);
        dseVar.j("enter_events", false);
        dseVar.j("exit_events", false);
        dseVar.j("notification_responsiveness", false);
        dseVar.j("distanceFromGeofenceRefresh", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        zx6 zx6Var = zx6.a;
        k1a k1aVar = k1a.a;
        lh1 lh1Var = lh1.a;
        return new KSerializer[]{b2i.a, zx6Var, zx6Var, k1aVar, k1aVar, k1aVar, lh1Var, lh1Var, lh1Var, lh1Var, k1aVar, zx6Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i5 = 0;
        String str = null;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        boolean z5 = true;
        while (z5) {
            int p = a2.p(serialDescriptor);
            switch (p) {
                case -1:
                    z5 = false;
                    break;
                case 0:
                    str = a2.o(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    d = a2.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    d2 = a2.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i2 = a2.m(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i3 = a2.m(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i4 = a2.m(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z = a2.z(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    z2 = a2.z(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    z3 = a2.z(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    z4 = a2.z(serialDescriptor, 9);
                    i |= Barcode.FORMAT_UPC_A;
                    break;
                case 10:
                    i5 = a2.m(serialDescriptor, 10);
                    i |= Barcode.FORMAT_UPC_E;
                    break;
                case 11:
                    d3 = a2.C(serialDescriptor, 11);
                    i |= 2048;
                    break;
                default:
                    dmk.b(p);
                    return null;
            }
        }
        a2.b(serialDescriptor);
        return new yl1(i, str, d, d2, i2, i3, i4, z, z2, z3, z4, i5, d3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        yl1 yl1Var = (yl1) obj;
        encoder.getClass();
        yl1Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        a2.A(serialDescriptor, 0, yl1Var.b);
        a2.D(serialDescriptor, 1, yl1Var.c);
        a2.D(serialDescriptor, 2, yl1Var.d);
        a2.w(3, yl1Var.e, serialDescriptor);
        a2.w(4, yl1Var.f, serialDescriptor);
        a2.w(5, yl1Var.g, serialDescriptor);
        a2.z(serialDescriptor, 6, yl1Var.h);
        a2.z(serialDescriptor, 7, yl1Var.i);
        a2.z(serialDescriptor, 8, yl1Var.j);
        a2.z(serialDescriptor, 9, yl1Var.k);
        a2.w(10, yl1Var.l, serialDescriptor);
        if (a2.r(serialDescriptor) || Double.compare(yl1Var.m, -1.0d) != 0) {
            a2.D(serialDescriptor, 11, yl1Var.m);
        }
        a2.b(serialDescriptor);
    }
}
