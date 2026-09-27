package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xj7 implements us8 {
    public static final xj7 a;
    private static final /* synthetic */ dse descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [xj7, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.amplitude.experiment.evaluation.EvaluationAllocation", obj, 2);
        dseVar.j("range", false);
        dseVar.j("distributions", false);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = zj7.c;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        dse dseVar = descriptor;
        xq4 a2 = decoder.a(dseVar);
        KSerializer[] kSerializerArr = zj7.c;
        boolean z = true;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        while (z) {
            int p = a2.p(dseVar);
            if (p != -1) {
                if (p != 0) {
                    if (p == 1) {
                        obj2 = a2.D(dseVar, 1, kSerializerArr[1], obj2);
                        i |= 2;
                    } else {
                        dmk.b(p);
                        return null;
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
        return new zj7(i, (List) obj, (List) obj2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zj7 zj7Var = (zj7) obj;
        zj7Var.getClass();
        dse dseVar = descriptor;
        yq4 a2 = encoder.a(dseVar);
        KSerializer[] kSerializerArr = zj7.c;
        a2.f(dseVar, 0, kSerializerArr[0], zj7Var.a);
        a2.f(dseVar, 1, kSerializerArr[1], zj7Var.b);
        a2.b(dseVar);
    }

    @Override // defpackage.us8
    public final KSerializer[] typeParametersSerializers() {
        return iwm.a;
    }
}
