package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class n0d {
    public h0d a;
    public boolean b;

    public final void a() {
        h0d h0dVar = this.a;
        if (h0dVar != null) {
            if (!this.b) {
                h0dVar.d(this, null);
            }
            o0d o0dVar = h0dVar.b;
            ca6 ca6Var = h0dVar.a;
            if (Intrinsics.areEqual(this, o0dVar.h) && -1 == o0dVar.g) {
                j0d j0dVar = o0dVar.f;
                if (j0dVar == null) {
                    j0dVar = o0dVar.c(-1);
                }
                o0dVar.f = null;
                o0dVar.g = 0;
                o0dVar.h = null;
                q0d q0dVar = q0d.a;
                if (j0dVar == null) {
                    ((zhd) ca6Var.b).a.run();
                } else {
                    j0dVar.d = q0dVar;
                    j0dVar.b();
                }
                o0dVar.a.m(null, q0dVar);
            }
            this.b = false;
            return;
        }
        dmk.n("This input is not added to any dispatcher.");
    }

    public void b(boolean z) {
    }
}
