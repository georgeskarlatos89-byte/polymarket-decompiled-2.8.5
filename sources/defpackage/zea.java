package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class zea implements KSerializer {
    public static final zea a = new Object();
    public static final zwg b = a2l.f("kotlinx.serialization.json.JsonNull", cxg.g, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        ezm.a(decoder);
        if (!decoder.A()) {
            return xea.INSTANCE;
        }
        throw new IllegalArgumentException("Expected 'null' literal");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ((xea) obj).getClass();
        ezm.b(encoder);
        encoder.s();
    }
}
