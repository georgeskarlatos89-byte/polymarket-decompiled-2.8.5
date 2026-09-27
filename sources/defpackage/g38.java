package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession$Status;
import io.radar.sdk.RadarTrackingOptions;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class g38 implements us8 {
    public static final g38 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, us8, g38] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.financialconnections.model.FinancialConnectionsSession", obj, 11);
        dseVar.j("client_secret", false);
        dseVar.j(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, false);
        dseVar.j("linked_accounts", true);
        dseVar.j("accounts", true);
        dseVar.j("livemode", false);
        dseVar.j("payment_account", true);
        dseVar.j("return_url", true);
        dseVar.j("bank_account_token", true);
        dseVar.j("manual_entry", true);
        dseVar.j("status", true);
        dseVar.j("status_details", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        b2i b2iVar = b2i.a;
        m28 m28Var = m28.a;
        return new KSerializer[]{b2iVar, b2iVar, bin.c(m28Var), bin.c(m28Var), lh1.a, bin.c(m1e.d), bin.c(b2iVar), bin.c(kda.a), bin.c(ozb.a), bin.c(j38.e), bin.c(k38.a)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001d. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        r38 r38Var = null;
        FinancialConnectionsSession$Status financialConnectionsSession$Status = null;
        boolean z2 = true;
        qzb qzbVar = null;
        int i = 0;
        String str = null;
        String str2 = null;
        o28 o28Var = null;
        o28 o28Var2 = null;
        boolean z3 = false;
        l1e l1eVar = null;
        String str3 = null;
        String str4 = null;
        while (z2) {
            int p = a2.p(serialDescriptor);
            switch (p) {
                case -1:
                    z2 = false;
                case 0:
                    z = z2;
                    str = a2.o(serialDescriptor, 0);
                    i |= 1;
                    z2 = z;
                case 1:
                    str2 = a2.o(serialDescriptor, 1);
                    i |= 2;
                case 2:
                    z = z2;
                    o28Var = (o28) a2.B(serialDescriptor, 2, m28.a, o28Var);
                    i |= 4;
                    z2 = z;
                case 3:
                    z = z2;
                    o28Var2 = (o28) a2.B(serialDescriptor, 3, m28.a, o28Var2);
                    i |= 8;
                    z2 = z;
                case 4:
                    z3 = a2.z(serialDescriptor, 4);
                    i |= 16;
                case 5:
                    z = z2;
                    l1eVar = (l1e) a2.B(serialDescriptor, 5, m1e.d, l1eVar);
                    i |= 32;
                    z2 = z;
                case 6:
                    z = z2;
                    str3 = (String) a2.B(serialDescriptor, 6, b2i.a, str3);
                    i |= 64;
                    z2 = z;
                case 7:
                    z = z2;
                    str4 = (String) a2.B(serialDescriptor, 7, kda.a, str4);
                    i |= 128;
                    z2 = z;
                case 8:
                    z = z2;
                    qzbVar = (qzb) a2.B(serialDescriptor, 8, ozb.a, qzbVar);
                    i |= 256;
                    z2 = z;
                case 9:
                    z = z2;
                    financialConnectionsSession$Status = (FinancialConnectionsSession$Status) a2.B(serialDescriptor, 9, j38.e, financialConnectionsSession$Status);
                    i |= Barcode.FORMAT_UPC_A;
                    z2 = z;
                case 10:
                    z = z2;
                    r38Var = (r38) a2.B(serialDescriptor, 10, k38.a, r38Var);
                    i |= Barcode.FORMAT_UPC_E;
                    z2 = z;
                default:
                    dmk.b(p);
                    return null;
            }
        }
        a2.b(serialDescriptor);
        return new t38(i, str, str2, o28Var, o28Var2, z3, l1eVar, str3, str4, qzbVar, financialConnectionsSession$Status, r38Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        t38 t38Var = (t38) obj;
        t38Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        String str = t38Var.a;
        r38 r38Var = t38Var.k;
        FinancialConnectionsSession$Status financialConnectionsSession$Status = t38Var.j;
        qzb qzbVar = t38Var.i;
        String str2 = t38Var.h;
        String str3 = t38Var.g;
        l1e l1eVar = t38Var.f;
        o28 o28Var = t38Var.d;
        o28 o28Var2 = t38Var.c;
        a2.A(serialDescriptor, 0, str);
        a2.A(serialDescriptor, 1, t38Var.b);
        if (a2.r(serialDescriptor) || o28Var2 != null) {
            a2.j(serialDescriptor, 2, m28.a, o28Var2);
        }
        if (a2.r(serialDescriptor) || o28Var != null) {
            a2.j(serialDescriptor, 3, m28.a, o28Var);
        }
        a2.z(serialDescriptor, 4, t38Var.e);
        if (a2.r(serialDescriptor) || l1eVar != null) {
            a2.j(serialDescriptor, 5, m1e.d, l1eVar);
        }
        if (a2.r(serialDescriptor) || str3 != null) {
            a2.j(serialDescriptor, 6, b2i.a, str3);
        }
        if (a2.r(serialDescriptor) || str2 != null) {
            a2.j(serialDescriptor, 7, kda.a, str2);
        }
        if (a2.r(serialDescriptor) || qzbVar != null) {
            a2.j(serialDescriptor, 8, ozb.a, qzbVar);
        }
        if (a2.r(serialDescriptor) || financialConnectionsSession$Status != null) {
            a2.j(serialDescriptor, 9, j38.e, financialConnectionsSession$Status);
        }
        if (a2.r(serialDescriptor) || r38Var != null) {
            a2.j(serialDescriptor, 10, k38.a, r38Var);
        }
        a2.b(serialDescriptor);
    }
}
