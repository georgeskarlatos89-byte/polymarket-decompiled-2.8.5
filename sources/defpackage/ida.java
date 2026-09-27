package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ida implements KSerializer {
    public static final ida a = new Object();
    public static final hda b = hda.b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        ezm.a(decoder);
        return new fda((List) new yk0(fea.a, 0).e(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fda fdaVar = (fda) obj;
        fdaVar.getClass();
        ezm.b(encoder);
        fea feaVar = fea.a;
        SerialDescriptor descriptor = feaVar.getDescriptor();
        descriptor.getClass();
        sk0 sk0Var = new sk0(descriptor, 1);
        int size = fdaVar.size();
        yq4 l = encoder.l(sk0Var, size);
        Iterator<bea> it = fdaVar.iterator();
        for (int i = 0; i < size; i++) {
            l.f(sk0Var, i, feaVar, it.next());
        }
        l.b(sk0Var);
    }
}
