package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fj7 implements t1g, l1g {
    public final Object a;
    public final t1g b;
    public volatile l1g c;
    public volatile l1g d;
    public s1g e;
    public s1g f;

    public fj7(Object obj, t1g t1gVar) {
        s1g s1gVar = s1g.CLEARED;
        this.e = s1gVar;
        this.f = s1gVar;
        this.a = obj;
        this.b = t1gVar;
    }

    @Override // defpackage.t1g, defpackage.l1g
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                if (!this.c.a() && !this.d.a()) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.t1g
    public final boolean b(l1g l1gVar) {
        boolean z;
        synchronized (this.a) {
            t1g t1gVar = this.b;
            if ((t1gVar == null || t1gVar.b(this)) && l1gVar.equals(this.c)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.l1g
    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            try {
                s1g s1gVar = this.e;
                s1g s1gVar2 = s1g.SUCCESS;
                if (s1gVar != s1gVar2 && this.f != s1gVar2) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.l1g
    public final void clear() {
        synchronized (this.a) {
            try {
                s1g s1gVar = s1g.CLEARED;
                this.e = s1gVar;
                this.c.clear();
                if (this.f != s1gVar) {
                    this.f = s1gVar;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.t1g
    public final boolean d(l1g l1gVar) {
        boolean z;
        synchronized (this.a) {
            t1g t1gVar = this.b;
            if (t1gVar != null && !t1gVar.d(this)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // defpackage.t1g
    public final void e(l1g l1gVar) {
        synchronized (this.a) {
            try {
                if (!l1gVar.equals(this.d)) {
                    this.e = s1g.FAILED;
                    s1g s1gVar = this.f;
                    s1g s1gVar2 = s1g.RUNNING;
                    if (s1gVar != s1gVar2) {
                        this.f = s1gVar2;
                        this.d.j();
                    }
                    return;
                }
                this.f = s1g.FAILED;
                t1g t1gVar = this.b;
                if (t1gVar != null) {
                    t1gVar.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l1g
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            try {
                s1g s1gVar = this.e;
                s1g s1gVar2 = s1g.CLEARED;
                if (s1gVar == s1gVar2 && this.f == s1gVar2) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.l1g
    public final boolean g(l1g l1gVar) {
        if (l1gVar instanceof fj7) {
            fj7 fj7Var = (fj7) l1gVar;
            if (this.c.g(fj7Var.c) && this.d.g(fj7Var.d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [t1g] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.t1g
    public final t1g getRoot() {
        ?? r2;
        synchronized (this.a) {
            try {
                t1g t1gVar = this.b;
                this = this;
                if (t1gVar != null) {
                    r2 = t1gVar.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r2;
    }

    @Override // defpackage.t1g
    public final boolean h(l1g l1gVar) {
        boolean z;
        boolean z2;
        s1g s1gVar;
        synchronized (this.a) {
            t1g t1gVar = this.b;
            z = false;
            if (t1gVar == null || t1gVar.h(this)) {
                s1g s1gVar2 = this.e;
                s1g s1gVar3 = s1g.FAILED;
                if (s1gVar2 != s1gVar3) {
                    z2 = l1gVar.equals(this.c);
                } else if (l1gVar.equals(this.d) && ((s1gVar = this.f) == s1g.SUCCESS || s1gVar == s1gVar3)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.t1g
    public final void i(l1g l1gVar) {
        synchronized (this.a) {
            try {
                if (l1gVar.equals(this.c)) {
                    this.e = s1g.SUCCESS;
                } else if (l1gVar.equals(this.d)) {
                    this.f = s1g.SUCCESS;
                }
                t1g t1gVar = this.b;
                if (t1gVar != null) {
                    t1gVar.i(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l1g
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                s1g s1gVar = this.e;
                s1g s1gVar2 = s1g.RUNNING;
                if (s1gVar != s1gVar2 && this.f != s1gVar2) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.l1g
    public final void j() {
        synchronized (this.a) {
            try {
                s1g s1gVar = this.e;
                s1g s1gVar2 = s1g.RUNNING;
                if (s1gVar != s1gVar2) {
                    this.e = s1gVar2;
                    this.c.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l1g
    public final void pause() {
        synchronized (this.a) {
            try {
                s1g s1gVar = this.e;
                s1g s1gVar2 = s1g.RUNNING;
                if (s1gVar == s1gVar2) {
                    this.e = s1g.PAUSED;
                    this.c.pause();
                }
                if (this.f == s1gVar2) {
                    this.f = s1g.PAUSED;
                    this.d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
