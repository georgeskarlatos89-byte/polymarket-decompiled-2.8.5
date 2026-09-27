package defpackage;

import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class yxe implements us8 {
    public static final yxe a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [yxe, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.link.serialization.PopupPayload", obj, 19);
        dseVar.j("publishableKey", false);
        dseVar.j("stripeAccount", false);
        dseVar.j("merchantInfo", false);
        dseVar.j("customerInfo", false);
        dseVar.j("paymentInfo", false);
        dseVar.j("appId", false);
        dseVar.j("locale", false);
        dseVar.j("paymentUserAgent", false);
        dseVar.j("paymentObject", false);
        dseVar.j("intentMode", false);
        dseVar.j("setupFutureUsage", false);
        dseVar.j("cardBrandChoice", false);
        dseVar.j("flags", false);
        dseVar.j("linkFundingSources", false);
        dseVar.j("clientAttributionMetadata", false);
        dseVar.j("path", true);
        dseVar.j("integrationType", true);
        dseVar.j("loggerMetadata", true);
        dseVar.j("experiments", true);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = nye.t;
        b2i b2iVar = b2i.a;
        return new KSerializer[]{b2iVar, bin.c(b2iVar), hye.a, dye.a, bin.c(kye.a), b2iVar, b2iVar, b2iVar, b2iVar, b2iVar, lh1.a, bin.c(zxe.a), lazyArr[12].getValue(), lazyArr[13].getValue(), lazyArr[14].getValue(), b2iVar, b2iVar, lazyArr[17].getValue(), lazyArr[18].getValue()};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0030. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        int i;
        String str3;
        int i2;
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = nye.t;
        Map map = null;
        Map map2 = null;
        List list = null;
        Map map3 = null;
        Map map4 = null;
        bye byeVar = null;
        int i3 = 0;
        String str4 = null;
        String str5 = null;
        jye jyeVar = null;
        fye fyeVar = null;
        mye myeVar = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        boolean z = false;
        boolean z2 = true;
        String str11 = null;
        String str12 = null;
        while (z2) {
            int p = a2.p(serialDescriptor);
            switch (p) {
                case -1:
                    str3 = str4;
                    z2 = false;
                    str4 = str3;
                case 0:
                    str = str6;
                    i3 |= 1;
                    str4 = a2.o(serialDescriptor, 0);
                    str6 = str;
                case 1:
                    str2 = str4;
                    str = str6;
                    str5 = (String) a2.B(serialDescriptor, 1, b2i.a, str5);
                    i3 |= 2;
                    str4 = str2;
                    str6 = str;
                case 2:
                    str2 = str4;
                    str = str6;
                    jyeVar = (jye) a2.D(serialDescriptor, 2, hye.a, jyeVar);
                    i3 |= 4;
                    str4 = str2;
                    str6 = str;
                case 3:
                    str2 = str4;
                    str = str6;
                    fyeVar = (fye) a2.D(serialDescriptor, 3, dye.a, fyeVar);
                    i3 |= 8;
                    str4 = str2;
                    str6 = str;
                case 4:
                    str2 = str4;
                    str = str6;
                    myeVar = (mye) a2.B(serialDescriptor, 4, kye.a, myeVar);
                    i3 |= 16;
                    str4 = str2;
                    str6 = str;
                case 5:
                    str3 = str4;
                    str6 = a2.o(serialDescriptor, 5);
                    i3 |= 32;
                    str4 = str3;
                case 6:
                    str3 = str4;
                    str7 = a2.o(serialDescriptor, 6);
                    i3 |= 64;
                    str4 = str3;
                case 7:
                    str3 = str4;
                    str8 = a2.o(serialDescriptor, 7);
                    i3 |= 128;
                    str4 = str3;
                case 8:
                    str3 = str4;
                    str9 = a2.o(serialDescriptor, 8);
                    i3 |= 256;
                    str4 = str3;
                case 9:
                    str3 = str4;
                    str10 = a2.o(serialDescriptor, 9);
                    i3 |= Barcode.FORMAT_UPC_A;
                    str4 = str3;
                case 10:
                    str3 = str4;
                    z = a2.z(serialDescriptor, 10);
                    i3 |= Barcode.FORMAT_UPC_E;
                    str4 = str3;
                case 11:
                    str2 = str4;
                    str = str6;
                    byeVar = (bye) a2.B(serialDescriptor, 11, zxe.a, byeVar);
                    i3 |= 2048;
                    str4 = str2;
                    str6 = str;
                case 12:
                    str2 = str4;
                    str = str6;
                    map3 = (Map) a2.D(serialDescriptor, 12, (KSerializer) lazyArr[12].getValue(), map3);
                    i3 |= 4096;
                    str4 = str2;
                    str6 = str;
                case 13:
                    str2 = str4;
                    str = str6;
                    list = (List) a2.D(serialDescriptor, 13, (KSerializer) lazyArr[13].getValue(), list);
                    i3 |= 8192;
                    str4 = str2;
                    str6 = str;
                case 14:
                    str2 = str4;
                    str = str6;
                    map2 = (Map) a2.D(serialDescriptor, 14, (KSerializer) lazyArr[14].getValue(), map2);
                    i3 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    str4 = str2;
                    str6 = str;
                case 15:
                    str3 = str4;
                    str11 = a2.o(serialDescriptor, 15);
                    i2 = 32768;
                    i3 |= i2;
                    str4 = str3;
                case 16:
                    str3 = str4;
                    str12 = a2.o(serialDescriptor, 16);
                    i2 = 65536;
                    i3 |= i2;
                    str4 = str3;
                case 17:
                    str2 = str4;
                    str = str6;
                    map = (Map) a2.D(serialDescriptor, 17, (KSerializer) lazyArr[17].getValue(), map);
                    i = 131072;
                    i3 |= i;
                    str4 = str2;
                    str6 = str;
                case MlKitException.UNSUPPORTED /* 18 */:
                    str2 = str4;
                    str = str6;
                    map4 = (Map) a2.D(serialDescriptor, 18, (KSerializer) lazyArr[18].getValue(), map4);
                    i = 262144;
                    i3 |= i;
                    str4 = str2;
                    str6 = str;
                default:
                    dmk.b(p);
                    return null;
            }
        }
        a2.b(serialDescriptor);
        return new nye(i3, str4, str5, jyeVar, fyeVar, myeVar, str6, str7, str8, str9, str10, z, byeVar, map3, list, map2, str11, str12, map, map4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, defpackage.c1c.b(new kotlin.Pair("mobile_session_id", defpackage.s1e.h.toString()))) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0103, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, r2) == false) goto L25;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        nye nyeVar = (nye) obj;
        nyeVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = nye.t;
        a2.A(serialDescriptor, 0, nyeVar.a);
        a2.j(serialDescriptor, 1, b2i.a, nyeVar.b);
        a2.f(serialDescriptor, 2, hye.a, nyeVar.c);
        a2.f(serialDescriptor, 3, dye.a, nyeVar.d);
        a2.j(serialDescriptor, 4, kye.a, nyeVar.e);
        a2.A(serialDescriptor, 5, nyeVar.f);
        a2.A(serialDescriptor, 6, nyeVar.g);
        a2.A(serialDescriptor, 7, nyeVar.h);
        a2.A(serialDescriptor, 8, nyeVar.i);
        a2.A(serialDescriptor, 9, nyeVar.j);
        a2.z(serialDescriptor, 10, nyeVar.k);
        a2.j(serialDescriptor, 11, zxe.a, nyeVar.l);
        a2.f(serialDescriptor, 12, (KSerializer) lazyArr[12].getValue(), nyeVar.m);
        a2.f(serialDescriptor, 13, (KSerializer) lazyArr[13].getValue(), nyeVar.n);
        a2.f(serialDescriptor, 14, (KSerializer) lazyArr[14].getValue(), nyeVar.o);
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(nyeVar.p, "mobile_pay")) {
            a2.A(serialDescriptor, 15, nyeVar.p);
        }
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(nyeVar.q, "mobile")) {
            a2.A(serialDescriptor, 16, nyeVar.q);
        }
        if (!a2.r(serialDescriptor)) {
            Map map = nyeVar.r;
            UUID uuid = s1e.h;
        }
        a2.f(serialDescriptor, 17, (KSerializer) lazyArr[17].getValue(), nyeVar.r);
        if (!a2.r(serialDescriptor)) {
            Map map2 = nyeVar.s;
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
        }
        a2.f(serialDescriptor, 18, (KSerializer) lazyArr[18].getValue(), nyeVar.s);
        a2.b(serialDescriptor);
    }
}
