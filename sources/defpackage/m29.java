package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class m29 implements us8 {
    public static final m29 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [m29, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.hcaptcha.config.HCaptchaConfig", obj, 18);
        dseVar.j("siteKey", false);
        dseVar.j("sentry", true);
        dseVar.j("loading", true);
        dseVar.j("hideDialog", true);
        dseVar.j("rqdata", true);
        dseVar.j("jsSrc", true);
        dseVar.j("endpoint", true);
        dseVar.j("reportapi", true);
        dseVar.j("assethost", true);
        dseVar.j("imghost", true);
        dseVar.j("locale", true);
        dseVar.j("size", true);
        dseVar.j("orientation", true);
        dseVar.j("theme", true);
        dseVar.j("host", true);
        dseVar.j("customTheme", true);
        dseVar.j("tokenExpiration", true);
        dseVar.j("disableHardwareAcceleration", true);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = o29.t;
        b2i b2iVar = b2i.a;
        lh1 lh1Var = lh1.a;
        return new KSerializer[]{b2iVar, lh1Var, lh1Var, lh1Var, bin.c(b2iVar), b2iVar, bin.c(b2iVar), bin.c(b2iVar), bin.c(b2iVar), bin.c(b2iVar), b2iVar, lazyArr[11].getValue(), lazyArr[12].getValue(), lazyArr[13].getValue(), bin.c(b2iVar), bin.c(b2iVar), l47.a, lh1Var};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002e. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        boolean z;
        String str;
        boolean z2;
        int i;
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = o29.t;
        c39 c39Var = null;
        h39 h39Var = null;
        String str2 = null;
        String str3 = null;
        k39 k39Var = null;
        String str4 = null;
        int i2 = 0;
        String str5 = null;
        String str6 = null;
        d47 d47Var = null;
        boolean z3 = false;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        boolean z4 = true;
        String str10 = null;
        String str11 = null;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (z4) {
            int p = a2.p(serialDescriptor);
            switch (p) {
                case -1:
                    str = str8;
                    z4 = false;
                    str8 = str;
                case 0:
                    z2 = z3;
                    str = str8;
                    str11 = a2.o(serialDescriptor, 0);
                    i2 |= 1;
                    z3 = z2;
                    str8 = str;
                case 1:
                    z = z3;
                    z5 = a2.z(serialDescriptor, 1);
                    i2 |= 2;
                    z3 = z;
                case 2:
                    z = z3;
                    z6 = a2.z(serialDescriptor, 2);
                    i2 |= 4;
                    z3 = z;
                case 3:
                    z3 = a2.z(serialDescriptor, 3);
                    i2 |= 8;
                case 4:
                    z2 = z3;
                    str = str8;
                    str7 = (String) a2.B(serialDescriptor, 4, b2i.a, str7);
                    i2 |= 16;
                    z3 = z2;
                    str8 = str;
                case 5:
                    z = z3;
                    str8 = a2.o(serialDescriptor, 5);
                    i2 |= 32;
                    z3 = z;
                case 6:
                    z2 = z3;
                    str = str8;
                    str9 = (String) a2.B(serialDescriptor, 6, b2i.a, str9);
                    i2 |= 64;
                    z3 = z2;
                    str8 = str;
                case 7:
                    z2 = z3;
                    str = str8;
                    str4 = (String) a2.B(serialDescriptor, 7, b2i.a, str4);
                    i2 |= 128;
                    z3 = z2;
                    str8 = str;
                case 8:
                    z2 = z3;
                    str = str8;
                    str3 = (String) a2.B(serialDescriptor, 8, b2i.a, str3);
                    i2 |= 256;
                    z3 = z2;
                    str8 = str;
                case 9:
                    z2 = z3;
                    str = str8;
                    str2 = (String) a2.B(serialDescriptor, 9, b2i.a, str2);
                    i2 |= Barcode.FORMAT_UPC_A;
                    z3 = z2;
                    str8 = str;
                case 10:
                    z = z3;
                    str10 = a2.o(serialDescriptor, 10);
                    i2 |= Barcode.FORMAT_UPC_E;
                    z3 = z;
                case 11:
                    z2 = z3;
                    str = str8;
                    h39Var = (h39) a2.D(serialDescriptor, 11, (KSerializer) lazyArr[11].getValue(), h39Var);
                    i2 |= 2048;
                    z3 = z2;
                    str8 = str;
                case 12:
                    z2 = z3;
                    str = str8;
                    c39Var = (c39) a2.D(serialDescriptor, 12, (KSerializer) lazyArr[12].getValue(), c39Var);
                    i2 |= 4096;
                    z3 = z2;
                    str8 = str;
                case 13:
                    z2 = z3;
                    str = str8;
                    k39Var = (k39) a2.D(serialDescriptor, 13, (KSerializer) lazyArr[13].getValue(), k39Var);
                    i2 |= 8192;
                    z3 = z2;
                    str8 = str;
                case 14:
                    z2 = z3;
                    str = str8;
                    str5 = (String) a2.B(serialDescriptor, 14, b2i.a, str5);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    z3 = z2;
                    str8 = str;
                case 15:
                    z2 = z3;
                    str = str8;
                    str6 = (String) a2.B(serialDescriptor, 15, b2i.a, str6);
                    i = 32768;
                    i2 |= i;
                    z3 = z2;
                    str8 = str;
                case 16:
                    z2 = z3;
                    str = str8;
                    d47Var = (d47) a2.D(serialDescriptor, 16, l47.a, d47Var);
                    i = 65536;
                    i2 |= i;
                    z3 = z2;
                    str8 = str;
                case 17:
                    z = z3;
                    z7 = a2.z(serialDescriptor, 17);
                    i2 |= 131072;
                    z3 = z;
                default:
                    dmk.b(p);
                    return null;
            }
        }
        a2.b(serialDescriptor);
        return new o29(i2, str11, z5, z6, z3, str7, str8, str9, str4, str3, str2, str10, h39Var, c39Var, k39Var, str5, str6, d47Var, z7);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r13, r0) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x018b, code lost:
    
        if (r0 != true) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
    
        if (defpackage.d47.d(r5, defpackage.h47.g(120, defpackage.m47.SECONDS)) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0126, code lost:
    
        if (r3 != defpackage.k39.LIGHT) goto L71;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        k39 k39Var;
        long j;
        boolean z;
        o29 o29Var = (o29) obj;
        o29Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = o29.t;
        String str = o29Var.a;
        boolean z2 = o29Var.s;
        long j2 = o29Var.r;
        String str2 = o29Var.p;
        String str3 = o29Var.o;
        k39 k39Var2 = o29Var.n;
        c39 c39Var = o29Var.m;
        h39 h39Var = o29Var.l;
        String str4 = o29Var.k;
        String str5 = o29Var.j;
        String str6 = o29Var.i;
        String str7 = o29Var.h;
        String str8 = o29Var.g;
        String str9 = o29Var.f;
        String str10 = o29Var.e;
        boolean z3 = o29Var.d;
        boolean z4 = o29Var.c;
        boolean z5 = o29Var.b;
        a2.A(serialDescriptor, 0, str);
        if (a2.r(serialDescriptor) || !z5) {
            a2.z(serialDescriptor, 1, z5);
        }
        if (a2.r(serialDescriptor) || !z4) {
            a2.z(serialDescriptor, 2, z4);
        }
        if (a2.r(serialDescriptor) || z3) {
            a2.z(serialDescriptor, 3, z3);
        }
        if (a2.r(serialDescriptor) || str10 != null) {
            a2.j(serialDescriptor, 4, b2i.a, str10);
        }
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(str9, "https://js.hcaptcha.com/1/api.js")) {
            a2.A(serialDescriptor, 5, str9);
        }
        if (a2.r(serialDescriptor) || str8 != null) {
            a2.j(serialDescriptor, 6, b2i.a, str8);
        }
        if (a2.r(serialDescriptor) || str7 != null) {
            a2.j(serialDescriptor, 7, b2i.a, str7);
        }
        if (a2.r(serialDescriptor) || str6 != null) {
            a2.j(serialDescriptor, 8, b2i.a, str6);
        }
        if (a2.r(serialDescriptor) || str5 != null) {
            a2.j(serialDescriptor, 9, b2i.a, str5);
        }
        if (!a2.r(serialDescriptor)) {
            String language = Locale.getDefault().getLanguage();
            language.getClass();
        }
        a2.A(serialDescriptor, 10, str4);
        if (a2.r(serialDescriptor) || h39Var != h39.INVISIBLE) {
            a2.f(serialDescriptor, 11, (KSerializer) lazyArr[11].getValue(), h39Var);
        }
        if (a2.r(serialDescriptor) || c39Var != c39.PORTRAIT) {
            a2.f(serialDescriptor, 12, (KSerializer) lazyArr[12].getValue(), c39Var);
        }
        if (a2.r(serialDescriptor)) {
            k39Var = k39Var2;
        } else {
            k39Var = k39Var2;
        }
        a2.f(serialDescriptor, 13, (KSerializer) lazyArr[13].getValue(), k39Var);
        if (a2.r(serialDescriptor) || str3 != null) {
            a2.j(serialDescriptor, 14, b2i.a, str3);
        }
        if (a2.r(serialDescriptor) || str2 != null) {
            a2.j(serialDescriptor, 15, b2i.a, str2);
        }
        if (a2.r(serialDescriptor)) {
            j = j2;
        } else {
            c47 c47Var = d47.b;
            j = j2;
        }
        a2.f(serialDescriptor, 16, l47.a, new d47(j));
        if (a2.r(serialDescriptor)) {
            z = z2;
        } else {
            z = z2;
        }
        a2.z(serialDescriptor, 17, z);
        a2.b(serialDescriptor);
    }
}
