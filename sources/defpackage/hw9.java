package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class hw9 implements us8 {
    public final /* synthetic */ KSerializer a;

    public hw9(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{this.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.us8
    public final KSerializer[] typeParametersSerializers() {
        return iwm.a;
    }
}
