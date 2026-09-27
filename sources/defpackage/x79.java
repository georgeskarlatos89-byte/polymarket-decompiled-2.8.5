package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class x79 implements us8 {
    public static final x79 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x79, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.checkout.components.kmp.rememberme.shared.model.Hint", obj, 3);
        dseVar.j("ordinal", false);
        dseVar.j("type", false);
        dseVar.j("value", false);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{k1a.a, z79.d[1].getValue(), b2i.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = z79.d;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        c89 c89Var = null;
        String str = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p == 2) {
                            str = a2.o(serialDescriptor, 2);
                            i |= 4;
                        } else {
                            dmk.b(p);
                            return null;
                        }
                    } else {
                        c89Var = (c89) a2.D(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), c89Var);
                        i |= 2;
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
        return new z79(i, i2, c89Var, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        z79 z79Var = (z79) obj;
        z79Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = z79.d;
        a2.w(0, z79Var.a, serialDescriptor);
        a2.f(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), z79Var.b);
        a2.A(serialDescriptor, 2, z79Var.c);
        a2.b(serialDescriptor);
    }

    @Override // defpackage.us8
    public final KSerializer[] typeParametersSerializers() {
        return iwm.a;
    }
}
