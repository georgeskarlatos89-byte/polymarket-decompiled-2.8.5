package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class p18 implements ec0 {
    public final ec0 a;
    public final pqk b;

    public p18(ec0 ec0Var, pqk pqkVar) {
        this.a = ec0Var;
        this.b = pqkVar;
    }

    @Override // defpackage.ec0
    public final sb0 A0(xl8 xl8Var) {
        xl8Var.getClass();
        if (((Boolean) this.b.invoke(xl8Var)).booleanValue()) {
            return this.a.A0(xl8Var);
        }
        return null;
    }

    @Override // defpackage.ec0
    public final boolean isEmpty() {
        ec0 ec0Var = this.a;
        if ((ec0Var instanceof Collection) && ((Collection) ec0Var).isEmpty()) {
            return false;
        }
        Iterator it = ec0Var.iterator();
        while (it.hasNext()) {
            xl8 b = ((sb0) it.next()).b();
            if (b != null && ((Boolean) this.b.invoke(b)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            xl8 b = ((sb0) obj).b();
            if (b != null && ((Boolean) this.b.invoke(b)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // defpackage.ec0
    public final boolean p0(xl8 xl8Var) {
        xl8Var.getClass();
        if (((Boolean) this.b.invoke(xl8Var)).booleanValue()) {
            return this.a.p0(xl8Var);
        }
        return false;
    }
}
