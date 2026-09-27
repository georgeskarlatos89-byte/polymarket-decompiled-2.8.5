package defpackage;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class dc0 implements ec0 {
    @Override // defpackage.ec0
    public final sb0 A0(xl8 xl8Var) {
        xl8Var.getClass();
        return null;
    }

    @Override // defpackage.ec0
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return CollectionsKt.emptyList().iterator();
    }

    @Override // defpackage.ec0
    public final /* bridge */ boolean p0(xl8 xl8Var) {
        return zdn.c(this, xl8Var);
    }

    public final String toString() {
        return "EMPTY";
    }
}
