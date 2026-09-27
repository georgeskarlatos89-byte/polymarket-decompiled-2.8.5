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
public final /* synthetic */ class w2h implements us8 {
    public static final w2h a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, us8, w2h] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.ui.core.elements.SharedDataSpec", obj, 3);
        dseVar.j("type", false);
        dseVar.j("fields", true);
        dseVar.j("selector_icon", true);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{b2i.a, y2h.d[1].getValue(), bin.c(spg.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = y2h.d;
        boolean z = true;
        int i = 0;
        String str = null;
        ArrayList arrayList = null;
        upg upgVar = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p == 2) {
                            upgVar = (upg) a2.B(serialDescriptor, 2, spg.a, upgVar);
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
                    str = a2.o(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new y2h(i, str, arrayList, upgVar);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y2h y2hVar = (y2h) obj;
        y2hVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = y2h.d;
        String str = y2hVar.a;
        upg upgVar = y2hVar.c;
        ArrayList arrayList = y2hVar.b;
        a2.A(serialDescriptor, 0, str);
        if (a2.r(serialDescriptor) || !Intrinsics.areEqual(arrayList, new ArrayList())) {
            a2.f(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), arrayList);
        }
        if (a2.r(serialDescriptor) || upgVar != null) {
            a2.j(serialDescriptor, 2, spg.a, upgVar);
        }
        a2.b(serialDescriptor);
    }
}
