package defpackage;

import io.radar.sdk.RadarTripOptions;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uk7 implements us8 {
    public static final uk7 a;
    private static final /* synthetic */ dse descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [uk7, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.amplitude.experiment.evaluation.EvaluationVariant", obj, 4);
        dseVar.j("key", false);
        dseVar.j("value", true);
        dseVar.j("payload", true);
        dseVar.j(RadarTripOptions.KEY_METADATA, true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = wk7.e;
        sc0 sc0Var = sc0.a;
        return new KSerializer[]{b2i.a, bin.c(sc0Var), bin.c(sc0Var), bin.c(kSerializerArr[3])};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        dse dseVar = descriptor;
        xq4 a2 = decoder.a(dseVar);
        KSerializer[] kSerializerArr = wk7.e;
        boolean z = true;
        int i = 0;
        Object obj = null;
        String str = null;
        Object obj2 = null;
        Object obj3 = null;
        while (z) {
            int p = a2.p(dseVar);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p != 2) {
                            if (p == 3) {
                                obj = a2.B(dseVar, 3, kSerializerArr[3], obj);
                                i |= 8;
                            } else {
                                dmk.b(p);
                                return null;
                            }
                        } else {
                            obj3 = a2.B(dseVar, 2, sc0.a, obj3);
                            i |= 4;
                        }
                    } else {
                        obj2 = a2.B(dseVar, 1, sc0.a, obj2);
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
        return new wk7(i, str, obj2, obj3, (Map) obj);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wk7 wk7Var = (wk7) obj;
        wk7Var.getClass();
        dse dseVar = descriptor;
        yq4 a2 = encoder.a(dseVar);
        KSerializer[] kSerializerArr = wk7.e;
        String str = wk7Var.a;
        Map map = wk7Var.d;
        Object obj2 = wk7Var.c;
        Object obj3 = wk7Var.b;
        a2.A(dseVar, 0, str);
        if (a2.r(dseVar) || obj3 != null) {
            a2.j(dseVar, 1, sc0.a, obj3);
        }
        if (a2.r(dseVar) || obj2 != null) {
            a2.j(dseVar, 2, sc0.a, obj2);
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
