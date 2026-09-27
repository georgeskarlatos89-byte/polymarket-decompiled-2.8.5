package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class t0c extends p1 {
    public final KSerializer a;
    public final KSerializer b;

    public t0c(KSerializer kSerializer, KSerializer kSerializer2) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    @Override // defpackage.p1
    public final void f(xq4 xq4Var, int i, Object obj) {
        Object D;
        Map map = (Map) obj;
        map.getClass();
        Object D2 = xq4Var.D(getDescriptor(), i, this.a, null);
        int p = xq4Var.p(getDescriptor());
        if (p == i + 1) {
            boolean containsKey = map.containsKey(D2);
            KSerializer kSerializer = this.b;
            if (containsKey && !(kSerializer.getDescriptor().getKind() instanceof q5f)) {
                D = xq4Var.D(getDescriptor(), p, kSerializer, d1c.c(map, D2));
            } else {
                D = xq4Var.D(getDescriptor(), p, kSerializer, null);
            }
            map.put(D2, D);
            return;
        }
        f27.q(woa.l(i, p, "Value must follow key in a map, index for key: ", ", returned index for value: "));
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int d = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        yq4 l = encoder.l(descriptor, d);
        Iterator c = c(obj);
        int i = 0;
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            l.f(getDescriptor(), i, this.a, key);
            i += 2;
            l.f(getDescriptor(), i2, this.b, value);
        }
        l.b(descriptor);
    }
}
