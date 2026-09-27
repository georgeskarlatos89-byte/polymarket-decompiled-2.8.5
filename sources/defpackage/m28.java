package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class m28 implements us8 {
    public static final m28 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [m28, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.financialconnections.model.FinancialConnectionsAccountList", obj, 5);
        dseVar.j(ApiConstant.KEY_DATA, false);
        dseVar.j("has_more", false);
        dseVar.j("url", false);
        dseVar.j("count", true);
        dseVar.j("total_count", true);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        k1a k1aVar = k1a.a;
        return new KSerializer[]{o28.f[0].getValue(), lh1.a, b2i.a, bin.c(k1aVar), bin.c(k1aVar)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = o28.f;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        List list = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p != 2) {
                            if (p != 3) {
                                if (p == 4) {
                                    num2 = (Integer) a2.B(serialDescriptor, 4, k1a.a, num2);
                                    i |= 16;
                                } else {
                                    dmk.b(p);
                                    return null;
                                }
                            } else {
                                num = (Integer) a2.B(serialDescriptor, 3, k1a.a, num);
                                i |= 8;
                            }
                        } else {
                            str = a2.o(serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        z2 = a2.z(serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    list = (List) a2.D(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), list);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new o28(i, list, z2, str, num, num2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o28 o28Var = (o28) obj;
        o28Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        KSerializer kSerializer = (KSerializer) o28.f[0].getValue();
        List list = o28Var.a;
        Integer num = o28Var.e;
        Integer num2 = o28Var.d;
        a2.f(serialDescriptor, 0, kSerializer, list);
        a2.z(serialDescriptor, 1, o28Var.b);
        a2.A(serialDescriptor, 2, o28Var.c);
        if (a2.r(serialDescriptor) || num2 != null) {
            a2.j(serialDescriptor, 3, k1a.a, num2);
        }
        if (a2.r(serialDescriptor) || num != null) {
            a2.j(serialDescriptor, 4, k1a.a, num);
        }
        a2.b(serialDescriptor);
    }
}
