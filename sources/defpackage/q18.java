package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class q18 implements Iterator, xja {
    public final /* synthetic */ int a;
    public final Iterator b;
    public int c;
    public Object d;
    public final /* synthetic */ Sequence e;

    public q18(xs8 xs8Var) {
        this.a = 2;
        this.e = xs8Var;
        this.b = ((Sequence) xs8Var.b).iterator();
        this.c = -1;
    }

    public void a() {
        Object next;
        r18 r18Var = (r18) this.e;
        do {
            Iterator it = this.b;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.c = 0;
                return;
            }
        } while (((Boolean) r18Var.c.invoke(next)).booleanValue() != r18Var.b);
        this.d = next;
        this.c = 1;
    }

    public void b() {
        Iterator it = this.b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((Function1) ((xs8) this.e).c).invoke(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    public boolean c() {
        Iterator it;
        Iterator it2 = (Iterator) this.d;
        if (it2 != null && it2.hasNext()) {
            this.c = 1;
            return true;
        }
        do {
            Iterator it3 = this.b;
            if (it3.hasNext()) {
                Object next = it3.next();
                q78 q78Var = (q78) this.e;
                it = (Iterator) q78Var.c.invoke(q78Var.b.invoke(next));
            } else {
                this.c = 2;
                this.d = null;
                return false;
            }
        } while (!it.hasNext());
        this.d = it;
        this.c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 1) {
                    return true;
                }
                return false;
            case 1:
                int i = this.c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return c();
            default:
                if (this.c == -1) {
                    b();
                }
                if (this.c == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c != 0) {
                    Object obj = this.d;
                    this.d = null;
                    this.c = -1;
                    return obj;
                }
                dmk.t();
                return null;
            case 1:
                int i = this.c;
                if (i != 2) {
                    if (i == 0 && !c()) {
                        dmk.t();
                        return null;
                    }
                    this.c = 0;
                    Iterator it = (Iterator) this.d;
                    it.getClass();
                    return it.next();
                }
                dmk.t();
                return null;
            default:
                if (this.c == -1) {
                    b();
                }
                if (this.c != 0) {
                    Object obj2 = this.d;
                    this.d = null;
                    this.c = -1;
                    return obj2;
                }
                dmk.t();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q18(q78 q78Var) {
        this.a = 1;
        this.e = q78Var;
        this.b = q78Var.a.iterator();
    }

    public q18(r18 r18Var) {
        this.a = 0;
        this.e = r18Var;
        this.b = r18Var.a.iterator();
        this.c = -1;
    }
}
