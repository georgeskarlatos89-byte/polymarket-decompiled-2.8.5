package defpackage;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ws8 implements Iterator, xja {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    public ws8(mqc mqcVar) {
        this.a = 2;
        this.d = mqcVar;
        this.b = -1;
        this.c = iwg.a(new lqc(mqcVar, this, null));
    }

    public void a() {
        Object invoke;
        int i;
        int i2 = this.b;
        xs8 xs8Var = (xs8) this.d;
        if (i2 == -2) {
            invoke = ((Function0) xs8Var.b).invoke();
        } else {
            Function1 function1 = (Function1) xs8Var.c;
            Object obj = this.c;
            obj.getClass();
            invoke = function1.invoke(obj);
        }
        this.c = invoke;
        if (invoke == null) {
            i = 0;
        } else {
            i = 1;
        }
        this.b = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b != 1) {
                    return false;
                }
                return true;
            case 1:
                return ((ewg) this.c).hasNext();
            case 2:
                return ((ewg) this.c).hasNext();
            case 3:
                gai gaiVar = (gai) this.d;
                Iterator it = (Iterator) this.c;
                while (this.b < gaiVar.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                if (this.b >= gaiVar.c || !it.hasNext()) {
                    return false;
                }
                return true;
            default:
                return ((Iterator) this.c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b != 0) {
                    Object obj2 = this.c;
                    obj2.getClass();
                    this.b = -1;
                    return obj2;
                }
                dmk.t();
                return null;
            case 1:
                return ((ewg) this.c).next();
            case 2:
                return ((ewg) this.c).next();
            case 3:
                gai gaiVar = (gai) obj;
                Iterator it = (Iterator) this.c;
                while (this.b < gaiVar.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                int i2 = this.b;
                if (i2 < gaiVar.c) {
                    this.b = i2 + 1;
                    return it.next();
                }
                dmk.t();
                return null;
            default:
                Function2 function2 = (Function2) ((xs8) obj).c;
                int i3 = this.b;
                this.b = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                return function2.invoke(Integer.valueOf(i3), ((Iterator) this.c).next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.b;
                if (i2 != -1) {
                    ((zpc) obj).b.h(i2);
                    this.b = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.b;
                if (i3 != -1) {
                    ((mqc) obj).b.m(i3);
                    this.b = -1;
                    return;
                }
                return;
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ws8(gai gaiVar) {
        this.a = 3;
        this.d = gaiVar;
        this.c = gaiVar.a.iterator();
    }

    public ws8(xs8 xs8Var) {
        this.a = 0;
        this.d = xs8Var;
        this.b = -2;
    }

    public ws8(xs8 xs8Var, byte b) {
        this.a = 4;
        this.d = xs8Var;
        this.c = new q18((q78) xs8Var.b);
    }

    public ws8(zpc zpcVar) {
        this.a = 1;
        this.d = zpcVar;
        this.b = -1;
        this.c = iwg.a(new ypc(zpcVar, this, null));
    }
}
