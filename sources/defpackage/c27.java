package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c27 {
    public final int a;
    public final x7c b;
    public final CopyOnWriteArrayList c;

    public /* synthetic */ c27(CopyOnWriteArrayList copyOnWriteArrayList, int i, x7c x7cVar) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = x7cVar;
    }

    public void a(k05 k05Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            c8c c8cVar = (c8c) it.next();
            u1k.P(c8cVar.a, new vq8(20, k05Var, c8cVar.b));
        }
    }

    public void b(gnb gnbVar, int i, int i2, el8 el8Var, int i3, Object obj, long j, long j2) {
        a(new a8c(this, gnbVar, new l7c(i, i2, el8Var, i3, obj, u1k.W(j), u1k.W(j2)), 1));
    }

    public void c(gnb gnbVar, int i, int i2, el8 el8Var, int i3, Object obj, long j, long j2) {
        a(new a8c(this, gnbVar, new l7c(i, i2, el8Var, i3, obj, u1k.W(j), u1k.W(j2)), 0));
    }

    public void d(gnb gnbVar, int i, int i2, el8 el8Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        a(new b8c(this, gnbVar, new l7c(i, i2, el8Var, i3, obj, u1k.W(j), u1k.W(j2)), iOException, z));
    }

    public void e(gnb gnbVar, int i, int i2, el8 el8Var, int i3, Object obj, long j, long j2, int i4) {
        a(new z7c(this, gnbVar, new l7c(i, i2, el8Var, i3, obj, u1k.W(j), u1k.W(j2)), i4));
    }
}
