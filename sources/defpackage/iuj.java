package defpackage;

import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class iuj implements KSerializer {
    public static final iuj b = new iuj();
    public final /* synthetic */ bh7 a = new bh7("kotlin.Unit", Unit.INSTANCE);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        this.a.deserialize(decoder);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Unit unit = (Unit) obj;
        unit.getClass();
        this.a.serialize(encoder, unit);
    }
}
