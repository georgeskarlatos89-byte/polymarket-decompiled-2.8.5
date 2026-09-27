package defpackage;

import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dk7 implements us8 {
    public static final dk7 a;
    private static final /* synthetic */ dse descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [dk7, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.amplitude.experiment.evaluation.EvaluationCondition", obj, 3);
        dseVar.j("selector", false);
        dseVar.j("op", false);
        dseVar.j("values", false);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = fk7.d;
        return new KSerializer[]{kSerializerArr[0], b2i.a, kSerializerArr[2]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        dse dseVar = descriptor;
        xq4 a2 = decoder.a(dseVar);
        KSerializer[] kSerializerArr = fk7.d;
        boolean z = true;
        int i = 0;
        Object obj = null;
        String str = null;
        Object obj2 = null;
        while (z) {
            int p = a2.p(dseVar);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p == 2) {
                            obj2 = a2.D(dseVar, 2, kSerializerArr[2], obj2);
                            i |= 4;
                        } else {
                            dmk.b(p);
                            return null;
                        }
                    } else {
                        str = a2.o(dseVar, 1);
                        i |= 2;
                    }
                } else {
                    obj = a2.D(dseVar, 0, kSerializerArr[0], obj);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(dseVar);
        return new fk7(i, (List) obj, str, (Set) obj2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fk7 fk7Var = (fk7) obj;
        fk7Var.getClass();
        dse dseVar = descriptor;
        yq4 a2 = encoder.a(dseVar);
        KSerializer[] kSerializerArr = fk7.d;
        a2.f(dseVar, 0, kSerializerArr[0], fk7Var.a);
        a2.A(dseVar, 1, fk7Var.b);
        a2.f(dseVar, 2, kSerializerArr[2], fk7Var.c);
        a2.b(dseVar);
    }

    @Override // defpackage.us8
    public final KSerializer[] typeParametersSerializers() {
        return iwm.a;
    }
}
