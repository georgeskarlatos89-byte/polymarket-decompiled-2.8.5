package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yv5 extends t4 {
    public static final yv5 a = new Object();
    public static final Lazy b = LazyKt.a(w4b.PUBLICATION, new k65(22));

    @Override // defpackage.t4
    public final KSerializer a(xq4 xq4Var, String str) {
        return ((nlg) b.getValue()).a(xq4Var, str);
    }

    @Override // defpackage.t4
    public final KSerializer b(Encoder encoder, Object obj) {
        xv5 xv5Var = (xv5) obj;
        xv5Var.getClass();
        return ((nlg) b.getValue()).b(encoder, xv5Var);
    }

    @Override // defpackage.t4
    public final KClass c() {
        return lvf.a.getOrCreateKotlinClass(xv5.class);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return ((nlg) b.getValue()).getDescriptor();
    }
}
