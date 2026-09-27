package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import io.ably.lib.realtime.Presence;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class up implements us8 {
    public static final up a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, up, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.core.networking.AnalyticsRequestV2", obj, 11);
        dseVar.j("eventName", false);
        dseVar.j(Presence.GET_CLIENTID, false);
        dseVar.j("origin", false);
        dseVar.j("created", false);
        dseVar.j("params", false);
        dseVar.j("postParameters", true);
        dseVar.j("headers", true);
        dseVar.j("method", true);
        dseVar.j("mimeType", true);
        dseVar.j("retryResponseCodes", true);
        dseVar.j("url", true);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = xp.l;
        b2i b2iVar = b2i.a;
        return new KSerializer[]{b2iVar, b2iVar, b2iVar, zx6.a, fea.a, b2iVar, lazyArr[6].getValue(), lazyArr[7].getValue(), lazyArr[8].getValue(), lazyArr[9].getValue(), b2iVar};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0023. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr2 = xp.l;
        double d = 0.0d;
        Iterable iterable = null;
        y8i y8iVar = null;
        boolean z = true;
        Map map = null;
        x8i x8iVar = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        bea beaVar = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            switch (p) {
                case -1:
                    lazyArr = lazyArr2;
                    z = false;
                    lazyArr2 = lazyArr;
                case 0:
                    lazyArr = lazyArr2;
                    str = a2.o(serialDescriptor, 0);
                    i |= 1;
                    lazyArr2 = lazyArr;
                case 1:
                    lazyArr = lazyArr2;
                    str2 = a2.o(serialDescriptor, 1);
                    i |= 2;
                    lazyArr2 = lazyArr;
                case 2:
                    lazyArr = lazyArr2;
                    str3 = a2.o(serialDescriptor, 2);
                    i |= 4;
                    lazyArr2 = lazyArr;
                case 3:
                    lazyArr = lazyArr2;
                    d = a2.C(serialDescriptor, 3);
                    i |= 8;
                    lazyArr2 = lazyArr;
                case 4:
                    lazyArr = lazyArr2;
                    beaVar = (bea) a2.D(serialDescriptor, 4, fea.a, beaVar);
                    i |= 16;
                    lazyArr2 = lazyArr;
                case 5:
                    lazyArr = lazyArr2;
                    str4 = a2.o(serialDescriptor, 5);
                    i |= 32;
                    lazyArr2 = lazyArr;
                case 6:
                    lazyArr = lazyArr2;
                    map = (Map) a2.D(serialDescriptor, 6, (KSerializer) lazyArr[6].getValue(), map);
                    i |= 64;
                    lazyArr2 = lazyArr;
                case 7:
                    lazyArr = lazyArr2;
                    x8iVar = (x8i) a2.D(serialDescriptor, 7, (KSerializer) lazyArr[7].getValue(), x8iVar);
                    i |= 128;
                    lazyArr2 = lazyArr;
                case 8:
                    lazyArr = lazyArr2;
                    y8iVar = (y8i) a2.D(serialDescriptor, 8, (KSerializer) lazyArr[8].getValue(), y8iVar);
                    i |= 256;
                    lazyArr2 = lazyArr;
                case 9:
                    lazyArr = lazyArr2;
                    iterable = (Iterable) a2.D(serialDescriptor, 9, (KSerializer) lazyArr2[9].getValue(), iterable);
                    i |= Barcode.FORMAT_UPC_A;
                    lazyArr2 = lazyArr;
                case 10:
                    str5 = a2.o(serialDescriptor, 10);
                    i |= Barcode.FORMAT_UPC_E;
                default:
                    dmk.b(p);
                    return null;
            }
        }
        a2.b(serialDescriptor);
        return new xp(i, str, str2, str3, d, beaVar, str4, map, x8iVar, y8iVar, iterable, str5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xp xpVar = (xp) obj;
        xpVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = xp.l;
        String str = xpVar.a;
        String str2 = xpVar.k;
        Iterable iterable = xpVar.j;
        y8i y8iVar = xpVar.i;
        x8i x8iVar = xpVar.h;
        Map map = xpVar.g;
        String str3 = xpVar.f;
        a2.A(serialDescriptor, 0, str);
        a2.A(serialDescriptor, 1, xpVar.b);
        String str4 = xpVar.c;
        a2.A(serialDescriptor, 2, str4);
        a2.D(serialDescriptor, 3, xpVar.d);
        a2.f(serialDescriptor, 4, fea.a, xpVar.e);
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(str3, xpVar.h())) {
            a2.A(serialDescriptor, 5, str3);
        }
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(map, d1c.e(new Pair("Content-Type", ace.m(y8i.Form.a(), "; charset=", Charsets.UTF_8.name())), new Pair("origin", str4), new Pair("User-Agent", "Stripe/v1 android/23.16.0")))) {
            a2.f(serialDescriptor, 6, (KSerializer) lazyArr[6].getValue(), map);
        }
        if (a2.r(serialDescriptor) || x8iVar != x8i.POST) {
            a2.f(serialDescriptor, 7, (KSerializer) lazyArr[7].getValue(), x8iVar);
        }
        if (a2.r(serialDescriptor) || y8iVar != y8i.Form) {
            a2.f(serialDescriptor, 8, (KSerializer) lazyArr[8].getValue(), y8iVar);
        }
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(iterable, new a(429, 429, 1))) {
            a2.f(serialDescriptor, 9, (KSerializer) lazyArr[9].getValue(), iterable);
        }
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(str2, "https://r.stripe.com/0")) {
            a2.A(serialDescriptor, 10, str2);
        }
        a2.b(serialDescriptor);
    }
}
