package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gc0 implements ec0 {
    public final /* synthetic */ int a;
    public final Object b;

    public gc0(List list, int i) {
        this.a = i;
        switch (i) {
            case 1:
                list.getClass();
                this.b = list;
                return;
            default:
                this.b = list;
                return;
        }
    }

    @Override // defpackage.ec0
    public final sb0 A0(xl8 xl8Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return zdn.b(this, xl8Var);
            case 1:
                xl8Var.getClass();
                return (sb0) pwg.j(pwg.o(CollectionsKt.r((List) obj), new wq4(xl8Var, 0)));
            default:
                xl8Var.getClass();
                if (Intrinsics.areEqual(xl8Var, (xl8) obj)) {
                    return mf7.a;
                }
                return null;
        }
    }

    @Override // defpackage.ec0
    public final boolean isEmpty() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((List) obj).isEmpty();
            case 1:
                List list = (List) obj;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((ec0) it.next()).isEmpty()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((List) obj).iterator();
            case 1:
                return new q18(pwg.k(CollectionsKt.r((List) obj), ys.o));
            default:
                return CollectionsKt.emptyList().iterator();
        }
    }

    @Override // defpackage.ec0
    public final boolean p0(xl8 xl8Var) {
        switch (this.a) {
            case 0:
                return zdn.c(this, xl8Var);
            case 1:
                xl8Var.getClass();
                Iterator it = ((Iterable) CollectionsKt.r((List) this.b).b).iterator();
                while (it.hasNext()) {
                    if (((ec0) it.next()).p0(xl8Var)) {
                        return true;
                    }
                }
                return false;
            default:
                return zdn.c(this, xl8Var);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((List) this.b).toString();
            default:
                return super.toString();
        }
    }

    public gc0(xl8 xl8Var) {
        this.a = 2;
        xl8Var.getClass();
        this.b = xl8Var;
    }
}
