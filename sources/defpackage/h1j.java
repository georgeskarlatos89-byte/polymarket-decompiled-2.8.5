package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class h1j implements KSerializer {
    public static final h1j a = new Object();
    public static final Lazy b = LazyKt.a(w4b.PUBLICATION, new nyi(8));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        xq4 a2 = decoder.a(descriptor);
        long j = 0;
        boolean z = false;
        while (true) {
            h1j h1jVar = a;
            int p = a2.p(h1jVar.getDescriptor());
            if (p != -1) {
                if (p == 0) {
                    j = a2.g(h1jVar.getDescriptor(), 0);
                    z = true;
                } else {
                    hun.b(p);
                    throw null;
                }
            } else {
                a2.b(descriptor);
                if (z) {
                    return new wv5(j);
                }
                throw new vgc("nanoseconds", getDescriptor().h());
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wv5 wv5Var = (wv5) obj;
        wv5Var.getClass();
        SerialDescriptor descriptor = getDescriptor();
        yq4 a2 = encoder.a(descriptor);
        a2.E(a.getDescriptor(), 0, wv5Var.b);
        a2.b(descriptor);
    }
}
