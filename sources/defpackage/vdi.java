package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vdi {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final by0 g;
    public int h;
    public int i;
    public lei k;
    public udi l;
    public boolean j = false;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public vdi(int i, int i2, by0 by0Var, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = by0Var;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.l = new udi(by0Var.a, i2);
    }

    public final void a() {
        grn.g("Edge is already closed.", !this.n);
    }

    public final void b() {
        xkm.a();
        this.l.a();
        this.n = true;
        this.o.clear();
        this.m.clear();
    }

    public final lei c(a13 a13Var, boolean z) {
        xkm.a();
        a();
        by0 by0Var = this.g;
        lei leiVar = new lei(by0Var.a, a13Var, z, by0Var.c, new rdi(this, 0));
        try {
            pq9 pq9Var = leiVar.k;
            udi udiVar = this.l;
            if (udiVar.g(pq9Var, new sdi(udiVar, 0))) {
                t79.e(udiVar.e).addListener(new tdi(pq9Var, 0), qt6.a());
            }
            this.k = leiVar;
            e();
            return leiVar;
        } catch (ei6 e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            leiVar.c();
            throw e2;
        }
    }

    public final void d() {
        boolean z;
        xkm.a();
        a();
        udi udiVar = this.l;
        xkm.a();
        if (udiVar.q == null) {
            synchronized (udiVar.a) {
                z = udiVar.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new udi(this.g.a, this.a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void e() {
        kei keiVar;
        Executor executor;
        xkm.a();
        hy0 hy0Var = new hy0(this.d, this.i, this.h, this.c, this.b, this.e);
        lei leiVar = this.k;
        if (leiVar != null) {
            synchronized (leiVar.a) {
                leiVar.l = hy0Var;
                keiVar = leiVar.m;
                executor = leiVar.n;
            }
            if (keiVar != null && executor != null) {
                executor.execute(new hei(keiVar, hy0Var, 0));
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((l05) it.next()).accept(hy0Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceEdge{targets=");
        sb.append(this.f);
        sb.append(", format=");
        sb.append(this.a);
        sb.append(", resolution=");
        sb.append(this.g.a);
        sb.append(", cropRect=");
        sb.append(this.d);
        sb.append(", rotationDegrees=");
        sb.append(this.i);
        sb.append(", mirroring=");
        sb.append(this.e);
        sb.append(", sensorToBufferTransform= ");
        Matrix matrix = this.b;
        sb.append(matrix);
        sb.append(", rotationInTransform= ");
        sb.append(kbj.b(matrix));
        sb.append(", isMirrorInTransform= ");
        sb.append(kbj.e(matrix));
        sb.append(", isClosed=");
        return hdi.t(sb, this.n, '}');
    }
}
