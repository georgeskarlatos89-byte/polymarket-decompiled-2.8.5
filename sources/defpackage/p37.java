package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class p37 implements us8 {
    public static final p37 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [p37, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.ui.core.elements.DropdownSpec", obj, 3);
        dseVar.j("api_path", false);
        dseVar.j("translation_id", false);
        dseVar.j("items", false);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = r37.d;
        return new KSerializer[]{jl9.a, lazyArr[1].getValue(), lazyArr[2].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = r37.d;
        boolean z = true;
        int i = 0;
        ll9 ll9Var = null;
        cdj cdjVar = null;
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
                        cdjVar = (cdj) a2.D(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), cdjVar);
                        i |= 2;
                    }
                } else {
                    ll9Var = (ll9) a2.D(serialDescriptor, 0, jl9.a, ll9Var);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new r37(i, ll9Var, cdjVar, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r37 r37Var = (r37) obj;
        r37Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = r37.d;
        a2.f(serialDescriptor, 0, jl9.a, r37Var.a);
        a2.f(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), r37Var.b);
        a2.f(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), r37Var.c);
        a2.b(serialDescriptor);
    }
}
