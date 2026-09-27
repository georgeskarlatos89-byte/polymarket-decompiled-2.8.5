package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class cw5 implements KSerializer {
    public static final cw5 a = new Object();
    public static final Lazy b = LazyKt.a(w4b.PUBLICATION, new k65(25));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        xq4 a2 = decoder.a(descriptor);
        boolean z = false;
        int i = 0;
        while (true) {
            cw5 cw5Var = a;
            int p = a2.p(cw5Var.getDescriptor());
            if (p != -1) {
                if (p == 0) {
                    i = a2.m(cw5Var.getDescriptor(), 0);
                    z = true;
                } else {
                    hun.b(p);
                    throw null;
                }
            } else {
                a2.b(descriptor);
                if (z) {
                    return new sv5(i);
                }
                throw new vgc("days", getDescriptor().h());
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        sv5 sv5Var = (sv5) obj;
        sv5Var.getClass();
        SerialDescriptor descriptor = getDescriptor();
        yq4 a2 = encoder.a(descriptor);
        a2.w(0, sv5Var.b, a.getDescriptor());
        a2.b(descriptor);
    }
}
