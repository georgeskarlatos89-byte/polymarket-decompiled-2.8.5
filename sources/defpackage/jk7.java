package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jk7 implements us8 {
    public static final jk7 a;
    private static final /* synthetic */ dse descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [jk7, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.amplitude.experiment.evaluation.EvaluationDistribution", obj, 2);
        dseVar.j("variant", false);
        dseVar.j("range", false);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{b2i.a, lk7.c[1]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        dse dseVar = descriptor;
        xq4 a2 = decoder.a(dseVar);
        KSerializer[] kSerializerArr = lk7.c;
        boolean z = true;
        int i = 0;
        String str = null;
        Object obj = null;
        while (z) {
            int p = a2.p(dseVar);
            if (p != -1) {
                if (p != 0) {
                    if (p == 1) {
                        obj = a2.D(dseVar, 1, kSerializerArr[1], obj);
                        i |= 2;
                    } else {
                        dmk.b(p);
                        return null;
                    }
                } else {
                    str = a2.o(dseVar, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(dseVar);
        return new lk7(i, str, (List) obj);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lk7 lk7Var = (lk7) obj;
        lk7Var.getClass();
        dse dseVar = descriptor;
        yq4 a2 = encoder.a(dseVar);
        KSerializer[] kSerializerArr = lk7.c;
        a2.A(dseVar, 0, lk7Var.a);
        a2.f(dseVar, 1, kSerializerArr[1], lk7Var.b);
        a2.b(dseVar);
    }

    @Override // defpackage.us8
    public final KSerializer[] typeParametersSerializers() {
        return iwm.a;
    }
}
