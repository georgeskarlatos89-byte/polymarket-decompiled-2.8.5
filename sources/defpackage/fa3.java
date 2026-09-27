package defpackage;

import java.util.Map;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class fa3 implements us8 {
    public static final fa3 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [fa3, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.financialconnections.model.CashBalance", obj, 1);
        dseVar.j("available", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{bin.c((KSerializer) ha3.b[0].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = ha3.b;
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p == 0) {
                    map = (Map) a2.B(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), map);
                    i = 1;
                } else {
                    dmk.b(p);
                    return null;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new ha3(i, map);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ha3 ha3Var = (ha3) obj;
        ha3Var.getClass();
        Map map = ha3Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = ha3.b;
        if (a2.r(serialDescriptor) || map != null) {
            a2.j(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), map);
        }
        a2.b(serialDescriptor);
    }
}
