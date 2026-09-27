package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class kd implements us8 {
    public static final kd a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kd, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.ui.core.elements.autocomplete.model.AddressComponent", obj, 3);
        dseVar.j("short_name", false);
        dseVar.j("long_name", false);
        dseVar.j("types", false);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = md.d;
        b2i b2iVar = b2i.a;
        return new KSerializer[]{bin.c(b2iVar), b2iVar, lazyArr[2].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = md.d;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p != 1) {
                        if (p == 2) {
                            list = (List) a2.D(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), list);
                            i |= 4;
                        } else {
                            dmk.b(p);
                            return null;
                        }
                    } else {
                        str2 = a2.o(serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = (String) a2.B(serialDescriptor, 0, b2i.a, str);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new md(i, str, str2, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        md mdVar = (md) obj;
        mdVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = md.d;
        a2.j(serialDescriptor, 0, b2i.a, mdVar.a);
        a2.A(serialDescriptor, 1, mdVar.b);
        a2.f(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), mdVar.c);
        a2.b(serialDescriptor);
    }
}
