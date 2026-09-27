package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class j0d {
    public m0d a;
    public List b;
    public List c;
    public s0d d;
    public boolean e;
    public boolean f;
    public h0d g;

    public j0d(m0d m0dVar, boolean z, int i) {
        m0dVar.getClass();
        this.a = m0dVar;
        this.b = CollectionsKt.emptyList();
        this.c = CollectionsKt.emptyList();
        this.d = q0d.a;
        this.e = z;
        this.f = false;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(g0d g0dVar);

    public abstract void d(g0d g0dVar);

    public final void f() {
        h0d h0dVar = this.g;
        if (h0dVar != null && h0dVar.c.remove(this)) {
            o0d o0dVar = h0dVar.b;
            if (Intrinsics.areEqual(this, o0dVar.f)) {
                int i = o0dVar.g;
                q0d q0dVar = q0d.a;
                if (i != -1) {
                    if (i == 1) {
                        this.d = q0dVar;
                        e();
                    }
                } else {
                    this.d = q0dVar;
                    a();
                }
                o0dVar.f = null;
                o0dVar.g = 0;
                o0dVar.h = null;
            }
            o0dVar.d.remove(this);
            o0dVar.e.remove(this);
            this.g = null;
            o0dVar.b();
        }
    }

    public final void g(boolean z) {
        if (this.e != z) {
            this.e = z;
            h0d h0dVar = this.g;
            if (h0dVar != null) {
                h0dVar.b.b();
            }
        }
    }

    public void e() {
    }
}
