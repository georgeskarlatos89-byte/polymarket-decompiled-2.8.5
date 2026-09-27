package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xe8 extends ye8 {
    public final /* synthetic */ Iterable[] a;

    public xe8(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [k9a, java.util.Iterator, java.lang.Object] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        we8 we8Var = new we8(this, this.a.length);
        ?? obj = new Object();
        obj.b = j9a.e;
        obj.c = we8Var;
        return obj;
    }
}
