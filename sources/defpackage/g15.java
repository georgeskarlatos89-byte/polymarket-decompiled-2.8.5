package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.stripe.android.model.ConsumerSession$AuthenticationLevel;
import com.stripe.android.model.LinkBrand;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class g15 implements us8 {
    public static final g15 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, g15, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.model.ConsumerSession", obj, 12);
        dseVar.j("client_secret", true);
        dseVar.j("email_address", false);
        dseVar.j("redacted_formatted_phone_number", false);
        dseVar.j("redacted_phone_number", false);
        dseVar.j("unredacted_phone_number", true);
        dseVar.j("phone_number_country", true);
        dseVar.j("verification_sessions", true);
        dseVar.j("mobile_fallback_webview_params", true);
        dseVar.j("current_authentication_level", true);
        dseVar.j("minimum_authentication_level", true);
        dseVar.j("link_brand", true);
        dseVar.j("support_payment_details_types", true);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = r15.m;
        b2i b2iVar = b2i.a;
        return new KSerializer[]{b2iVar, b2iVar, b2iVar, b2iVar, bin.c(b2iVar), bin.c(b2iVar), lazyArr[6].getValue(), bin.c(dhc.a), bin.c((KSerializer) lazyArr[8].getValue()), bin.c((KSerializer) lazyArr[9].getValue()), bin.c(ocb.e), lazyArr[11].getValue()};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0022. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        String str;
        boolean z;
        boolean z2;
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = r15.m;
        List list = null;
        LinkBrand linkBrand = null;
        ConsumerSession$AuthenticationLevel consumerSession$AuthenticationLevel = null;
        ConsumerSession$AuthenticationLevel consumerSession$AuthenticationLevel2 = null;
        boolean z3 = true;
        ghc ghcVar = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        List list2 = null;
        while (z3) {
            int p = a2.p(serialDescriptor);
            switch (p) {
                case -1:
                    str = str2;
                    z3 = false;
                    str2 = str;
                case 0:
                    z2 = z3;
                    i |= 1;
                    str2 = a2.o(serialDescriptor, 0);
                    z3 = z2;
                case 1:
                    z2 = z3;
                    str3 = a2.o(serialDescriptor, 1);
                    i |= 2;
                    z3 = z2;
                case 2:
                    z2 = z3;
                    str4 = a2.o(serialDescriptor, 2);
                    i |= 4;
                    z3 = z2;
                case 3:
                    z2 = z3;
                    str5 = a2.o(serialDescriptor, 3);
                    i |= 8;
                    z3 = z2;
                case 4:
                    z = z3;
                    str = str2;
                    str6 = (String) a2.B(serialDescriptor, 4, b2i.a, str6);
                    i |= 16;
                    z3 = z;
                    str2 = str;
                case 5:
                    z = z3;
                    str = str2;
                    str7 = (String) a2.B(serialDescriptor, 5, b2i.a, str7);
                    i |= 32;
                    z3 = z;
                    str2 = str;
                case 6:
                    z = z3;
                    str = str2;
                    list2 = (List) a2.D(serialDescriptor, 6, (KSerializer) lazyArr[6].getValue(), list2);
                    i |= 64;
                    z3 = z;
                    str2 = str;
                case 7:
                    z = z3;
                    str = str2;
                    ghcVar = (ghc) a2.B(serialDescriptor, 7, dhc.a, ghcVar);
                    i |= 128;
                    z3 = z;
                    str2 = str;
                case 8:
                    z = z3;
                    str = str2;
                    consumerSession$AuthenticationLevel2 = (ConsumerSession$AuthenticationLevel) a2.B(serialDescriptor, 8, (KSerializer) lazyArr[8].getValue(), consumerSession$AuthenticationLevel2);
                    i |= 256;
                    z3 = z;
                    str2 = str;
                case 9:
                    z = z3;
                    str = str2;
                    consumerSession$AuthenticationLevel = (ConsumerSession$AuthenticationLevel) a2.B(serialDescriptor, 9, (KSerializer) lazyArr[9].getValue(), consumerSession$AuthenticationLevel);
                    i |= Barcode.FORMAT_UPC_A;
                    z3 = z;
                    str2 = str;
                case 10:
                    z = z3;
                    str = str2;
                    linkBrand = (LinkBrand) a2.B(serialDescriptor, 10, ocb.e, linkBrand);
                    i |= Barcode.FORMAT_UPC_E;
                    z3 = z;
                    str2 = str;
                case 11:
                    z = z3;
                    str = str2;
                    list = (List) a2.D(serialDescriptor, 11, (KSerializer) lazyArr[11].getValue(), list);
                    i |= 2048;
                    z3 = z;
                    str2 = str;
                default:
                    dmk.b(p);
                    return null;
            }
        }
        a2.b(serialDescriptor);
        return new r15(i, str2, str3, str4, str5, str6, str7, list2, ghcVar, consumerSession$AuthenticationLevel2, consumerSession$AuthenticationLevel, linkBrand, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r15 r15Var = (r15) obj;
        r15Var.getClass();
        String str = r15Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = r15.m;
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(str, "")) {
            a2.A(serialDescriptor, 0, str);
        }
        String str2 = r15Var.b;
        List list = r15Var.l;
        LinkBrand linkBrand = r15Var.k;
        ConsumerSession$AuthenticationLevel consumerSession$AuthenticationLevel = r15Var.j;
        ConsumerSession$AuthenticationLevel consumerSession$AuthenticationLevel2 = r15Var.i;
        ghc ghcVar = r15Var.h;
        List list2 = r15Var.g;
        String str3 = r15Var.f;
        String str4 = r15Var.e;
        a2.A(serialDescriptor, 1, str2);
        a2.A(serialDescriptor, 2, r15Var.c);
        a2.A(serialDescriptor, 3, r15Var.d);
        if (a2.r(serialDescriptor) || str4 != null) {
            a2.j(serialDescriptor, 4, b2i.a, str4);
        }
        if (a2.r(serialDescriptor) || str3 != null) {
            a2.j(serialDescriptor, 5, b2i.a, str3);
        }
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(list2, CollectionsKt.emptyList())) {
            a2.f(serialDescriptor, 6, (KSerializer) lazyArr[6].getValue(), list2);
        }
        if (a2.r(serialDescriptor) || ghcVar != null) {
            a2.j(serialDescriptor, 7, dhc.a, ghcVar);
        }
        if (a2.r(serialDescriptor) || consumerSession$AuthenticationLevel2 != null) {
            a2.j(serialDescriptor, 8, (KSerializer) lazyArr[8].getValue(), consumerSession$AuthenticationLevel2);
        }
        if (a2.r(serialDescriptor) || consumerSession$AuthenticationLevel != null) {
            a2.j(serialDescriptor, 9, (KSerializer) lazyArr[9].getValue(), consumerSession$AuthenticationLevel);
        }
        if (a2.r(serialDescriptor) || linkBrand != null) {
            a2.j(serialDescriptor, 10, ocb.e, linkBrand);
        }
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(list, CollectionsKt.emptyList())) {
            a2.f(serialDescriptor, 11, (KSerializer) lazyArr[11].getValue(), list);
        }
        a2.b(serialDescriptor);
    }
}
