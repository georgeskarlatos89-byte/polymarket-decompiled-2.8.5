package defpackage;

import com.stripe.android.financialconnections.model.BalanceRefresh$BalanceRefreshStatus;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class z51 implements us8 {
    public static final z51 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [z51, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.financialconnections.model.BalanceRefresh", obj, 2);
        dseVar.j("status", true);
        dseVar.j("last_attempted_at", false);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{bin.c((KSerializer) c61.c[0].getValue()), k1a.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = c61.c;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        BalanceRefresh$BalanceRefreshStatus balanceRefresh$BalanceRefreshStatus = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p == 1) {
                        i2 = a2.m(serialDescriptor, 1);
                        i |= 2;
                    } else {
                        dmk.b(p);
                        return null;
                    }
                } else {
                    balanceRefresh$BalanceRefreshStatus = (BalanceRefresh$BalanceRefreshStatus) a2.B(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), balanceRefresh$BalanceRefreshStatus);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new c61(i, balanceRefresh$BalanceRefreshStatus, i2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c61 c61Var = (c61) obj;
        c61Var.getClass();
        BalanceRefresh$BalanceRefreshStatus balanceRefresh$BalanceRefreshStatus = c61Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = c61.c;
        if (a2.r(serialDescriptor) || balanceRefresh$BalanceRefreshStatus != BalanceRefresh$BalanceRefreshStatus.UNKNOWN) {
            a2.j(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), balanceRefresh$BalanceRefreshStatus);
        }
        a2.w(1, c61Var.b, serialDescriptor);
        a2.b(serialDescriptor);
    }
}
