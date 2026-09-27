package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class cdd implements KSerializer {
    public final KSerializer a;
    public final ywg b;

    public cdd(KSerializer kSerializer) {
        kSerializer.getClass();
        this.a = kSerializer;
        this.b = new ywg(kSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        if (decoder.A()) {
            return decoder.q(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cdd.class == obj.getClass() && Intrinsics.areEqual(this.a, ((cdd) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        if (obj != null) {
            encoder.o(this.a, obj);
        } else {
            encoder.s();
        }
    }
}
