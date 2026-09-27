package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class n5f extends xa4 {
    public final m5f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5f(KSerializer kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.b = new m5f(kSerializer.getDescriptor());
    }

    @Override // defpackage.p1
    public final Object a() {
        return (l5f) g(j());
    }

    @Override // defpackage.p1
    public final int b(Object obj) {
        l5f l5fVar = (l5f) obj;
        l5fVar.getClass();
        return l5fVar.d();
    }

    @Override // defpackage.p1
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.p1, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // defpackage.p1
    public final Object h(Object obj) {
        l5f l5fVar = (l5f) obj;
        l5fVar.getClass();
        return l5fVar.a();
    }

    @Override // defpackage.xa4
    public final void i(int i, Object obj, Object obj2) {
        ((l5f) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(yq4 yq4Var, Object obj, int i);

    @Override // defpackage.xa4, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int d = d(obj);
        m5f m5fVar = this.b;
        yq4 l = encoder.l(m5fVar, d);
        k(l, obj, d);
        l.b(m5fVar);
    }
}
