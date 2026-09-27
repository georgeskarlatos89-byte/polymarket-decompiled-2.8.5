package defpackage;

import io.radar.sdk.RadarTripOptions;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qk7 implements us8 {
    public static final qk7 a;
    private static final /* synthetic */ dse descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, us8, qk7] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.amplitude.experiment.evaluation.EvaluationSegment", obj, 4);
        dseVar.j("bucket", true);
        dseVar.j("conditions", true);
        dseVar.j("variant", true);
        dseVar.j(RadarTripOptions.KEY_METADATA, true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = sk7.e;
        return new KSerializer[]{bin.c(ak7.a), bin.c(kSerializerArr[1]), bin.c(b2i.a), bin.c(kSerializerArr[3])};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        dse dseVar = descriptor;
        xq4 a2 = decoder.a(dseVar);
        KSerializer[] kSerializerArr = sk7.e;
        boolean z = true;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (z) {
            int p = a2.p(dseVar);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p != 2) {
                            if (p == 3) {
                                obj4 = a2.B(dseVar, 3, kSerializerArr[3], obj4);
                                i |= 8;
                            } else {
                                dmk.b(p);
                                return null;
                            }
                        } else {
                            obj3 = a2.B(dseVar, 2, b2i.a, obj3);
                            i |= 4;
                        }
                    } else {
                        obj2 = a2.B(dseVar, 1, kSerializerArr[1], obj2);
                        i |= 2;
                    }
                } else {
                    obj = a2.B(dseVar, 0, ak7.a, obj);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(dseVar);
        return new sk7(i, (ck7) obj, (List) obj2, (String) obj3, (Map) obj4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        sk7 sk7Var = (sk7) obj;
        sk7Var.getClass();
        Map map = sk7Var.d;
        String str = sk7Var.c;
        List list = sk7Var.b;
        ck7 ck7Var = sk7Var.a;
        dse dseVar = descriptor;
        yq4 a2 = encoder.a(dseVar);
        KSerializer[] kSerializerArr = sk7.e;
        if (a2.r(dseVar) || ck7Var != null) {
            a2.j(dseVar, 0, ak7.a, ck7Var);
        }
        if (a2.r(dseVar) || list != null) {
            a2.j(dseVar, 1, kSerializerArr[1], list);
        }
        if (a2.r(dseVar) || str != null) {
            a2.j(dseVar, 2, b2i.a, str);
        }
        if (a2.r(dseVar) || map != null) {
            a2.j(dseVar, 3, kSerializerArr[3], map);
        }
        a2.b(dseVar);
    }

    @Override // defpackage.us8
    public final KSerializer[] typeParametersSerializers() {
        return iwm.a;
    }
}
