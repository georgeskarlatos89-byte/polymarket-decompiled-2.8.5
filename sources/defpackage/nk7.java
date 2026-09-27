package defpackage;

import io.radar.sdk.RadarTripOptions;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nk7 implements us8 {
    public static final nk7 a;
    private static final /* synthetic */ dse descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nk7, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.amplitude.experiment.evaluation.EvaluationFlag", obj, 5);
        dseVar.j("key", false);
        dseVar.j("variants", false);
        dseVar.j("segments", false);
        dseVar.j("dependencies", true);
        dseVar.j(RadarTripOptions.KEY_METADATA, true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = pk7.f;
        return new KSerializer[]{b2i.a, kSerializerArr[1], kSerializerArr[2], bin.c(kSerializerArr[3]), bin.c(kSerializerArr[4])};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        dse dseVar = descriptor;
        xq4 a2 = decoder.a(dseVar);
        KSerializer[] kSerializerArr = pk7.f;
        boolean z = true;
        int i = 0;
        Object obj = null;
        String str = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (z) {
            int p = a2.p(dseVar);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p != 2) {
                            if (p != 3) {
                                if (p == 4) {
                                    obj4 = a2.B(dseVar, 4, kSerializerArr[4], obj4);
                                    i |= 16;
                                } else {
                                    dmk.b(p);
                                    return null;
                                }
                            } else {
                                obj3 = a2.B(dseVar, 3, kSerializerArr[3], obj3);
                                i |= 8;
                            }
                        } else {
                            obj2 = a2.D(dseVar, 2, kSerializerArr[2], obj2);
                            i |= 4;
                        }
                    } else {
                        obj = a2.D(dseVar, 1, kSerializerArr[1], obj);
                        i |= 2;
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
        return new pk7(i, str, (Map) obj, (List) obj2, (Set) obj3, (Map) obj4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pk7 pk7Var = (pk7) obj;
        pk7Var.getClass();
        dse dseVar = descriptor;
        yq4 a2 = encoder.a(dseVar);
        KSerializer[] kSerializerArr = pk7.f;
        String str = pk7Var.a;
        Map map = pk7Var.e;
        Set set = pk7Var.d;
        a2.A(dseVar, 0, str);
        a2.f(dseVar, 1, kSerializerArr[1], pk7Var.b);
        a2.f(dseVar, 2, kSerializerArr[2], pk7Var.c);
        if (a2.r(dseVar) || set != null) {
            a2.j(dseVar, 3, kSerializerArr[3], set);
        }
        if (a2.r(dseVar) || map != null) {
            a2.j(dseVar, 4, kSerializerArr[4], map);
        }
        a2.b(dseVar);
    }

    @Override // defpackage.us8
    public final KSerializer[] typeParametersSerializers() {
        return iwm.a;
    }
}
