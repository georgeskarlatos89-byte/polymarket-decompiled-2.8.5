package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class i9a extends tuj {
    public z2 b;
    public Object c;
    public final /* synthetic */ int d;
    public final Iterator e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i9a(rzg rzgVar) {
        this();
        this.d = 1;
        this.f = rzgVar;
        this.e = rzgVar.a.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        Object next;
        z2 z2Var = this.b;
        z2 z2Var2 = z2.FAILED;
        if (z2Var != z2Var2) {
            z = true;
        } else {
            z = false;
        }
        brn.s(z);
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            this.b = z2Var2;
            int i = this.d;
            Object obj = null;
            Object obj2 = this.f;
            Iterator it = this.e;
            switch (i) {
                case 0:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((o1f) obj2).apply(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.b = z2.DONE;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((rzg) obj2).b.contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.b = z2.DONE;
                    break;
            }
            this.c = obj;
            if (this.b != z2.DONE) {
                this.b = z2.READY;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.b = z2.NOT_READY;
            Object obj = this.c;
            this.c = null;
            return obj;
        }
        dmk.t();
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i9a(Iterator it, o1f o1fVar) {
        this();
        this.d = 0;
        this.e = it;
        this.f = o1fVar;
    }

    public i9a() {
        super(0);
        this.b = z2.NOT_READY;
    }
}
