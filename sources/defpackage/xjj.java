package defpackage;

import kotlin.UByte;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xjj implements KSerializer {
    public static final xjj a = new Object();
    public static final gw9 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [xjj, java.lang.Object] */
    static {
        av1.a.getClass();
        b = qlm.a("kotlin.UByte", tv1.a);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return UByte.m884boximpl(UByte.m885constructorimpl(decoder.r(b).E()));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.n(b).g(((UByte) obj).a);
    }
}
