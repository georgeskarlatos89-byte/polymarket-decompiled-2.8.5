package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ss4 extends o4 {
    public final Function2 a;
    public final /* synthetic */ ts4 b;

    public ss4(ts4 ts4Var, Function2 function2) {
        this.b = ts4Var;
        this.a = function2;
    }

    @Override // defpackage.o4
    public final int a() {
        return this.b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("not implemented");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        qs4 qs4Var = (qs4) ts4.c.get(this.b);
        qs4Var.getClass();
        return new ps4(qs4Var, this.a);
    }
}
