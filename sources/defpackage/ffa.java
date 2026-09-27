package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ffa implements KSerializer {
    public static final ffa a = new Object();
    public static final efa b = efa.b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        ezm.a(decoder);
        bin.j(n1i.a);
        return new bfa((Map) bin.b(b2i.a, fea.a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        bfa bfaVar = (bfa) obj;
        bfaVar.getClass();
        ezm.b(encoder);
        bin.j(n1i.a);
        bin.b(b2i.a, fea.a).serialize(encoder, bfaVar);
    }
}
