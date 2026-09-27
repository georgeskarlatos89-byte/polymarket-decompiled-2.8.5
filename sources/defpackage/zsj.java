package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class zsj implements KSerializer {
    public static final zsj a = new Object();
    public static final gw9 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [zsj, java.lang.Object] */
    static {
        q5h.a.getClass();
        b = qlm.a("kotlin.UShort", s5h.a);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new vsj(decoder.r(b).s());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.n(b).t(((vsj) obj).a);
    }
}
