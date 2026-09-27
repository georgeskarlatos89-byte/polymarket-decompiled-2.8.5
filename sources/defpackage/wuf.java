package defpackage;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wuf extends quf implements taa {
    public final xl8 a;

    public wuf(xl8 xl8Var) {
        xl8Var.getClass();
        this.a = xl8Var;
    }

    @Override // defpackage.taa
    public final cuf a(xl8 xl8Var) {
        xl8Var.getClass();
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wuf) {
            if (Intrinsics.areEqual(this.a, ((wuf) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.taa
    public final Collection getAnnotations() {
        return CollectionsKt.emptyList();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wuf.class.getName() + ": " + this.a;
    }
}
