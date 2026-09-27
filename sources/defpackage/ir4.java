package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ir4 implements a0i {
    public final List a;

    public ir4(a0i... a0iVarArr) {
        List e0 = ArraysKt.e0(a0iVarArr);
        e0.getClass();
        this.a = e0;
    }

    @Override // defpackage.a0i
    public final void a(g6f g6fVar, String str, String str2, Throwable th) {
        g6fVar.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a0i) it.next()).a(g6fVar, str, str2, th);
        }
    }
}
