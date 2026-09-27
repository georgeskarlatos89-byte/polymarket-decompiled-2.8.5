package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount$Category;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount$Status;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount$Subcategory;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class z18 implements us8 {
    public static final z18 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [z18, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.financialconnections.model.FinancialConnectionsAccount", obj, 16);
        dseVar.j("category", true);
        dseVar.j("created", false);
        dseVar.j(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, false);
        dseVar.j("institution_name", false);
        dseVar.j("livemode", false);
        dseVar.j("status", true);
        dseVar.j("subcategory", true);
        dseVar.j("supported_payment_method_types", false);
        dseVar.j("balance", true);
        dseVar.j("balance_refresh", true);
        dseVar.j("display_name", true);
        dseVar.j("last4", true);
        dseVar.j("ownership", true);
        dseVar.j("ownership_refresh", true);
        dseVar.j("permissions", true);
        dseVar.j("object", false);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = l28.q;
        b2i b2iVar = b2i.a;
        return new KSerializer[]{b28.e, k1a.a, b2iVar, b2iVar, lh1.a, g28.e, i28.e, lazyArr[7].getValue(), bin.c(v51.a), bin.c(z51.a), bin.c(b2iVar), bin.c(b2iVar), bin.c(b2iVar), bin.c(hpd.a), bin.c((KSerializer) lazyArr[14].getValue()), b2iVar};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002a. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = l28.q;
        String str3 = null;
        String str4 = null;
        c61 c61Var = null;
        y51 y51Var = null;
        String str5 = null;
        List list = null;
        int i = 0;
        FinancialConnectionsAccount$Category financialConnectionsAccount$Category = null;
        kpd kpdVar = null;
        List list2 = null;
        String str6 = null;
        boolean z2 = false;
        FinancialConnectionsAccount$Status financialConnectionsAccount$Status = null;
        FinancialConnectionsAccount$Subcategory financialConnectionsAccount$Subcategory = null;
        boolean z3 = true;
        int i2 = 0;
        String str7 = null;
        String str8 = null;
        while (z3) {
            int p = a2.p(serialDescriptor);
            switch (p) {
                case -1:
                    str = str6;
                    z3 = false;
                    str6 = str;
                case 0:
                    str2 = str6;
                    z = z2;
                    financialConnectionsAccount$Category = (FinancialConnectionsAccount$Category) a2.D(serialDescriptor, 0, b28.e, financialConnectionsAccount$Category);
                    i |= 1;
                    str6 = str2;
                    z2 = z;
                case 1:
                    str = str6;
                    i2 = a2.m(serialDescriptor, 1);
                    i |= 2;
                    str6 = str;
                case 2:
                    str = str6;
                    str7 = a2.o(serialDescriptor, 2);
                    i |= 4;
                    str6 = str;
                case 3:
                    str6 = a2.o(serialDescriptor, 3);
                    i |= 8;
                case 4:
                    str = str6;
                    z2 = a2.z(serialDescriptor, 4);
                    i |= 16;
                    str6 = str;
                case 5:
                    str2 = str6;
                    z = z2;
                    financialConnectionsAccount$Status = (FinancialConnectionsAccount$Status) a2.D(serialDescriptor, 5, g28.e, financialConnectionsAccount$Status);
                    i |= 32;
                    str6 = str2;
                    z2 = z;
                case 6:
                    str2 = str6;
                    z = z2;
                    financialConnectionsAccount$Subcategory = (FinancialConnectionsAccount$Subcategory) a2.D(serialDescriptor, 6, i28.e, financialConnectionsAccount$Subcategory);
                    i |= 64;
                    str6 = str2;
                    z2 = z;
                case 7:
                    str2 = str6;
                    z = z2;
                    list = (List) a2.D(serialDescriptor, 7, (KSerializer) lazyArr[7].getValue(), list);
                    i |= 128;
                    str6 = str2;
                    z2 = z;
                case 8:
                    str2 = str6;
                    z = z2;
                    y51Var = (y51) a2.B(serialDescriptor, 8, v51.a, y51Var);
                    i |= 256;
                    str6 = str2;
                    z2 = z;
                case 9:
                    str2 = str6;
                    z = z2;
                    c61Var = (c61) a2.B(serialDescriptor, 9, z51.a, c61Var);
                    i |= Barcode.FORMAT_UPC_A;
                    str6 = str2;
                    z2 = z;
                case 10:
                    str2 = str6;
                    z = z2;
                    str4 = (String) a2.B(serialDescriptor, 10, b2i.a, str4);
                    i |= Barcode.FORMAT_UPC_E;
                    str6 = str2;
                    z2 = z;
                case 11:
                    str2 = str6;
                    z = z2;
                    str3 = (String) a2.B(serialDescriptor, 11, b2i.a, str3);
                    i |= 2048;
                    str6 = str2;
                    z2 = z;
                case 12:
                    str2 = str6;
                    z = z2;
                    str5 = (String) a2.B(serialDescriptor, 12, b2i.a, str5);
                    i |= 4096;
                    str6 = str2;
                    z2 = z;
                case 13:
                    str2 = str6;
                    z = z2;
                    kpdVar = (kpd) a2.B(serialDescriptor, 13, hpd.a, kpdVar);
                    i |= 8192;
                    str6 = str2;
                    z2 = z;
                case 14:
                    str2 = str6;
                    z = z2;
                    list2 = (List) a2.B(serialDescriptor, 14, (KSerializer) lazyArr[14].getValue(), list2);
                    i |= Http2.INITIAL_MAX_FRAME_SIZE;
                    str6 = str2;
                    z2 = z;
                case 15:
                    str = str6;
                    str8 = a2.o(serialDescriptor, 15);
                    i |= 32768;
                    str6 = str;
                default:
                    dmk.b(p);
                    return null;
            }
        }
        a2.b(serialDescriptor);
        return new l28(i, financialConnectionsAccount$Category, i2, str7, str6, z2, financialConnectionsAccount$Status, financialConnectionsAccount$Subcategory, list, y51Var, c61Var, str4, str3, str5, kpdVar, list2, str8);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l28 l28Var = (l28) obj;
        l28Var.getClass();
        FinancialConnectionsAccount$Category financialConnectionsAccount$Category = l28Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = l28.q;
        if (a2.r(serialDescriptor) || financialConnectionsAccount$Category != FinancialConnectionsAccount$Category.UNKNOWN) {
            a2.f(serialDescriptor, 0, b28.e, financialConnectionsAccount$Category);
        }
        int i = l28Var.b;
        List list = l28Var.o;
        kpd kpdVar = l28Var.n;
        String str = l28Var.m;
        String str2 = l28Var.l;
        String str3 = l28Var.k;
        c61 c61Var = l28Var.j;
        y51 y51Var = l28Var.i;
        FinancialConnectionsAccount$Subcategory financialConnectionsAccount$Subcategory = l28Var.g;
        FinancialConnectionsAccount$Status financialConnectionsAccount$Status = l28Var.f;
        a2.w(1, i, serialDescriptor);
        a2.A(serialDescriptor, 2, l28Var.c);
        a2.A(serialDescriptor, 3, l28Var.d);
        a2.z(serialDescriptor, 4, l28Var.e);
        if (a2.r(serialDescriptor) || financialConnectionsAccount$Status != FinancialConnectionsAccount$Status.UNKNOWN) {
            a2.f(serialDescriptor, 5, g28.e, financialConnectionsAccount$Status);
        }
        if (a2.r(serialDescriptor) || financialConnectionsAccount$Subcategory != FinancialConnectionsAccount$Subcategory.UNKNOWN) {
            a2.f(serialDescriptor, 6, i28.e, financialConnectionsAccount$Subcategory);
        }
        a2.f(serialDescriptor, 7, (KSerializer) lazyArr[7].getValue(), l28Var.h);
        if (a2.r(serialDescriptor) || y51Var != null) {
            a2.j(serialDescriptor, 8, v51.a, y51Var);
        }
        if (a2.r(serialDescriptor) || c61Var != null) {
            a2.j(serialDescriptor, 9, z51.a, c61Var);
        }
        if (a2.r(serialDescriptor) || str3 != null) {
            a2.j(serialDescriptor, 10, b2i.a, str3);
        }
        if (a2.r(serialDescriptor) || str2 != null) {
            a2.j(serialDescriptor, 11, b2i.a, str2);
        }
        if (a2.r(serialDescriptor) || str != null) {
            a2.j(serialDescriptor, 12, b2i.a, str);
        }
        if (a2.r(serialDescriptor) || kpdVar != null) {
            a2.j(serialDescriptor, 13, hpd.a, kpdVar);
        }
        if (a2.r(serialDescriptor) || list != null) {
            a2.j(serialDescriptor, 14, (KSerializer) lazyArr[14].getValue(), list);
        }
        a2.A(serialDescriptor, 15, l28Var.p);
        a2.b(serialDescriptor);
    }
}
