package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class p1 implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // kotlinx.serialization.KSerializer
    public Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    public final Object e(Decoder decoder) {
        Object a = a();
        int b = b(a);
        xq4 a2 = decoder.a(getDescriptor());
        while (true) {
            int p = a2.p(getDescriptor());
            if (p != -1) {
                f(a2, p + b, a);
            } else {
                a2.b(getDescriptor());
                return h(a);
            }
        }
    }

    public abstract void f(xq4 xq4Var, int i, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
