package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class x4b implements p3k {
    public final Lazy a;

    public x4b(Function0 function0) {
        this.a = LazyKt.lazy(function0);
    }

    @Override // defpackage.p3k
    public final Object a(sje sjeVar) {
        return this.a.getValue();
    }
}
