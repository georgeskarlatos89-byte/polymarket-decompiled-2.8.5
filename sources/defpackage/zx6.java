package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class zx6 implements KSerializer {
    public static final zx6 a = new Object();
    public static final v5f b = new v5f("kotlin.Double", q5f.j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Double.valueOf(decoder.u());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.e(((Number) obj).doubleValue());
    }
}
