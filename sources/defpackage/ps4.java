package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ps4 implements Iterator, xja {
    public final Function2 a;
    public int b = -1;
    public Object c;
    public Object d;
    public final /* synthetic */ qs4 e;

    public ps4(qs4 qs4Var, Function2 function2) {
        this.e = qs4Var;
        this.a = function2;
        a();
    }

    public final void a() {
        T t;
        while (true) {
            int i = this.b + 1;
            this.b = i;
            qs4 qs4Var = this.e;
            if (i < qs4Var.a) {
                t49 t49Var = (t49) qs4Var.d.get(i);
                if (t49Var != null && (t = t49Var.get()) != 0) {
                    this.c = t;
                    Object obj = qs4Var.e.get(this.b);
                    if (obj instanceof o2c) {
                        obj = ((o2c) obj).a;
                    }
                    if (obj != null) {
                        this.d = obj;
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.e.a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b < this.e.a) {
            Object obj = this.c;
            if (obj != null) {
                Object obj2 = this.d;
                if (obj2 != null) {
                    Object invoke = this.a.invoke(obj, obj2);
                    a();
                    return invoke;
                }
                Intrinsics.i("value");
                throw null;
            }
            Intrinsics.i("key");
            throw null;
        }
        dmk.t();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("not implemented");
    }
}
