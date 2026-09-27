package defpackage;

import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class uy7 implements us8 {
    public static final uy7 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [uy7, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.uicore.address.FieldSchema", obj, 3);
        dseVar.j("isNumeric", true);
        dseVar.j("examples", true);
        dseVar.j("nameType", false);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = wy7.d;
        return new KSerializer[]{lh1.a, lazyArr[1].getValue(), lazyArr[2].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = wy7.d;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        ArrayList arrayList = null;
        nsc nscVar = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p == 2) {
                            nscVar = (nsc) a2.D(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), nscVar);
                            i |= 4;
                        } else {
                            dmk.b(p);
                            return null;
                        }
                    } else {
                        arrayList = (ArrayList) a2.D(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), arrayList);
                        i |= 2;
                    }
                } else {
                    z2 = a2.z(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new wy7(i, z2, arrayList, nscVar);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wy7 wy7Var = (wy7) obj;
        wy7Var.getClass();
        ArrayList arrayList = wy7Var.b;
        boolean z = wy7Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = wy7.d;
        if (a2.r(serialDescriptor) || z) {
            a2.z(serialDescriptor, 0, z);
        }
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(arrayList, new ArrayList())) {
            a2.f(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), arrayList);
        }
        a2.f(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), wy7Var.c);
        a2.b(serialDescriptor);
    }
}
