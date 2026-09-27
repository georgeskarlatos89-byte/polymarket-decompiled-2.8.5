package defpackage;

import com.stripe.android.financialconnections.model.OwnershipRefresh$Status;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class hpd implements us8 {
    public static final hpd a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, us8, hpd] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.financialconnections.model.OwnershipRefresh", obj, 2);
        dseVar.j("last_attempted_at", false);
        dseVar.j("status", true);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{k1a.a, kpd.c[1].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = kpd.c;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        OwnershipRefresh$Status ownershipRefresh$Status = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p == 1) {
                        ownershipRefresh$Status = (OwnershipRefresh$Status) a2.D(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), ownershipRefresh$Status);
                        i |= 2;
                    } else {
                        dmk.b(p);
                        return null;
                    }
                } else {
                    i2 = a2.m(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new kpd(i, i2, ownershipRefresh$Status);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kpd kpdVar = (kpd) obj;
        kpdVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = kpd.c;
        int i = kpdVar.a;
        OwnershipRefresh$Status ownershipRefresh$Status = kpdVar.b;
        a2.w(0, i, serialDescriptor);
        if (a2.r(serialDescriptor) || ownershipRefresh$Status != OwnershipRefresh$Status.UNKNOWN) {
            a2.f(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), ownershipRefresh$Status);
        }
        a2.b(serialDescriptor);
    }
}
