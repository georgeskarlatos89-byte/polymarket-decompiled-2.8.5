package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lei {
    public final Object a = new Object();
    public final Size b;
    public final c57 c;
    public final a13 d;
    public final boolean e;
    public final gw2 f;
    public final cw2 g;
    public final gw2 h;
    public final cw2 i;
    public final cw2 j;
    public final pq9 k;
    public hy0 l;
    public kei m;
    public Executor n;

    static {
        Range range = by0.h;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, cw2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, cw2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, cw2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [c3g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [c3g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [c3g, java.lang.Object] */
    public lei(Size size, a13 a13Var, boolean z, c57 c57Var, rdi rdiVar) {
        this.b = size;
        this.d = a13Var;
        this.e = z;
        grn.b("SurfaceRequest's DynamicRange must always be fully specified.", c57Var.b());
        this.c = c57Var;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        ?? obj = new Object();
        obj.c = new Object();
        gw2 gw2Var = new gw2(obj);
        obj.b = gw2Var;
        obj.a = ix2.class;
        try {
            atomicReference.set(obj);
            obj.a = str.concat("-cancellation");
        } catch (Exception e) {
            gw2Var.a(e);
        }
        cw2 cw2Var = (cw2) atomicReference.get();
        cw2Var.getClass();
        this.j = cw2Var;
        AtomicReference atomicReference2 = new AtomicReference(null);
        ?? obj2 = new Object();
        obj2.c = new Object();
        gw2 gw2Var2 = new gw2(obj2);
        obj2.b = gw2Var2;
        obj2.a = ix2.class;
        try {
            atomicReference2.set(obj2);
            obj2.a = str.concat("-status");
        } catch (Exception e2) {
            gw2Var2.a(e2);
        }
        this.h = gw2Var2;
        gw2Var2.addListener(new yq8(0, gw2Var2, new ry9(2, cw2Var, gw2Var)), qt6.a());
        cw2 cw2Var2 = (cw2) atomicReference2.get();
        cw2Var2.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        ?? obj3 = new Object();
        obj3.c = new Object();
        gw2 gw2Var3 = new gw2(obj3);
        obj3.b = gw2Var3;
        obj3.a = ix2.class;
        try {
            atomicReference3.set(obj3);
            obj3.a = str.concat("-Surface");
        } catch (Exception e3) {
            gw2Var3.a(e3);
        }
        this.f = gw2Var3;
        cw2 cw2Var3 = (cw2) atomicReference3.get();
        cw2Var3.getClass();
        this.g = cw2Var3;
        pq9 pq9Var = new pq9(this, size);
        this.k = pq9Var;
        ujb e4 = t79.e(pq9Var.e);
        gw2Var3.addListener(new yq8(0, gw2Var3, new ysk(e4, cw2Var2, str)), qt6.a());
        e4.addListener(new re6(this, 1), qt6.a());
        qt6 a = qt6.a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        gw2 a2 = kkn.a(new vt0(29, this, atomicReference4));
        a2.addListener(new yq8(0, a2, new e3g(rdiVar, 6)), a);
        cw2 cw2Var4 = (cw2) atomicReference4.get();
        cw2Var4.getClass();
        this.i = cw2Var4;
    }

    public final void a(final Surface surface, Executor executor, final l05 l05Var) {
        final int i = 0;
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: iei
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    Surface surface2 = surface;
                    l05 l05Var2 = l05Var;
                    switch (i2) {
                        case 0:
                            l05Var2.accept(new gy0(2, surface2));
                            return;
                        case 1:
                            l05Var2.accept(new gy0(3, surface2));
                            return;
                        default:
                            l05Var2.accept(new gy0(4, surface2));
                            return;
                    }
                }
            });
            return;
        }
        if (!this.g.a(surface)) {
            gw2 gw2Var = this.f;
            if (!gw2Var.isCancelled()) {
                grn.g(null, gw2Var.b.isDone());
                try {
                    gw2Var.get();
                    final int i2 = 1;
                    executor.execute(new Runnable() { // from class: iei
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22 = i2;
                            Surface surface2 = surface;
                            l05 l05Var2 = l05Var;
                            switch (i22) {
                                case 0:
                                    l05Var2.accept(new gy0(2, surface2));
                                    return;
                                case 1:
                                    l05Var2.accept(new gy0(3, surface2));
                                    return;
                                default:
                                    l05Var2.accept(new gy0(4, surface2));
                                    return;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i3 = 2;
                    executor.execute(new Runnable() { // from class: iei
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22 = i3;
                            Surface surface2 = surface;
                            l05 l05Var2 = l05Var;
                            switch (i22) {
                                case 0:
                                    l05Var2.accept(new gy0(2, surface2));
                                    return;
                                case 1:
                                    l05Var2.accept(new gy0(3, surface2));
                                    return;
                                default:
                                    l05Var2.accept(new gy0(4, surface2));
                                    return;
                            }
                        }
                    });
                    return;
                }
            }
        }
        r66 r66Var = new r66(4, l05Var, surface);
        gw2 gw2Var2 = this.h;
        gw2Var2.addListener(new yq8(0, gw2Var2, r66Var), executor);
    }

    public final void b(Executor executor, kei keiVar) {
        hy0 hy0Var;
        synchronized (this.a) {
            this.m = keiVar;
            this.n = executor;
            hy0Var = this.l;
        }
        if (hy0Var != null) {
            executor.execute(new hei(keiVar, hy0Var, 1));
        }
    }

    public final boolean c() {
        return this.g.b(new Exception("Surface request will not complete."));
    }
}
