package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class xa4 extends p1 {
    public final KSerializer a;

    public xa4(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // defpackage.p1
    public void f(xq4 xq4Var, int i, Object obj) {
        i(i, obj, xq4Var.D(getDescriptor(), i, this.a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        int d = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        yq4 l = encoder.l(descriptor, d);
        Iterator c = c(obj);
        for (int i = 0; i < d; i++) {
            l.f(getDescriptor(), i, this.a, c.next());
        }
        l.b(descriptor);
    }
}
