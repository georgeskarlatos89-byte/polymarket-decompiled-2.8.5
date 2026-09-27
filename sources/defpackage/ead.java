package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ead implements KSerializer {
    public static final ead a = new Object();
    public static final dad b = dad.a;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        throw new IllegalArgumentException("'kotlin.Nothing' does not have instances");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ((Void) obj).getClass();
        throw new IllegalArgumentException("'kotlin.Nothing' cannot be serialized");
    }
}
