package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class pa5 implements us8 {
    public static final pa5 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [pa5, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.checkout.components.kmp.rememberme.data.model.CreateChallengeRequest.Hint", obj, 4);
        dseVar.j("merchant", false);
        dseVar.j("hint", false);
        dseVar.j("ordinal", false);
        dseVar.j("type", true);
        descriptor = dseVar;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        b2i b2iVar = b2i.a;
        return new KSerializer[]{b2iVar, b2iVar, k1a.a, b2iVar};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p != 2) {
                            if (p == 3) {
                                str3 = a2.o(serialDescriptor, 3);
                                i |= 8;
                            } else {
                                dmk.b(p);
                                return null;
                            }
                        } else {
                            i2 = a2.m(serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        str2 = a2.o(serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = a2.o(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new ra5(i, str, i2, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ra5 ra5Var = (ra5) obj;
        ra5Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        String str = ra5Var.a;
        String str2 = ra5Var.d;
        a2.A(serialDescriptor, 0, str);
        a2.A(serialDescriptor, 1, ra5Var.b);
        a2.w(2, ra5Var.c, serialDescriptor);
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(str2, "hint")) {
            a2.A(serialDescriptor, 3, str2);
        }
        a2.b(serialDescriptor);
    }

    @Override // defpackage.us8
    public final KSerializer[] typeParametersSerializers() {
        return iwm.a;
    }
}
