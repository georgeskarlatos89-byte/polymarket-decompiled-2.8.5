package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class okc implements KSerializer {
    public static final okc a = new Object();
    public static final Lazy b = LazyKt.a(w4b.PUBLICATION, new zob(28));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        xq4 a2 = decoder.a(descriptor);
        boolean z = false;
        int i = 0;
        while (true) {
            okc okcVar = a;
            int p = a2.p(okcVar.getDescriptor());
            if (p != -1) {
                if (p == 0) {
                    i = a2.m(okcVar.getDescriptor(), 0);
                    z = true;
                } else {
                    hun.b(p);
                    throw null;
                }
            } else {
                a2.b(descriptor);
                if (z) {
                    return new uv5(i);
                }
                throw new vgc("months", getDescriptor().h());
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uv5 uv5Var = (uv5) obj;
        uv5Var.getClass();
        SerialDescriptor descriptor = getDescriptor();
        yq4 a2 = encoder.a(descriptor);
        a2.w(0, uv5Var.b, a.getDescriptor());
        a2.b(descriptor);
    }
}
