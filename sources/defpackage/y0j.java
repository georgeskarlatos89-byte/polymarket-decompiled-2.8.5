package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y0j implements t1g, l1g {
    public final t1g a;
    public final Object b;
    public volatile h8h c;
    public volatile l1g d;
    public s1g e;
    public s1g f;
    public boolean g;

    public y0j(Object obj, t1g t1gVar) {
        s1g s1gVar = s1g.CLEARED;
        this.e = s1gVar;
        this.f = s1gVar;
        this.b = obj;
        this.a = t1gVar;
    }

    @Override // defpackage.t1g, defpackage.l1g
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                if (!this.d.a() && !this.c.a()) {
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
        synchronized (this.b) {
            try {
                t1g t1gVar = this.a;
                if ((t1gVar == null || t1gVar.b(this)) && l1gVar.equals(this.c) && this.e != s1g.PAUSED) {
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
    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            if (this.e == s1g.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.l1g
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            s1g s1gVar = s1g.CLEARED;
            this.e = s1gVar;
            this.f = s1gVar;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.t1g
    public final boolean d(l1g l1gVar) {
        boolean z;
        synchronized (this.b) {
            try {
                t1g t1gVar = this.a;
                if ((t1gVar != null && !t1gVar.d(this)) || (!l1gVar.equals(this.c) && this.e == s1g.SUCCESS)) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.t1g
    public final void e(l1g l1gVar) {
        synchronized (this.b) {
            try {
                if (!l1gVar.equals(this.c)) {
                    this.f = s1g.FAILED;
                    return;
                }
                this.e = s1g.FAILED;
                t1g t1gVar = this.a;
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
        synchronized (this.b) {
            if (this.e == s1g.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.l1g
    public final boolean g(l1g l1gVar) {
        if (l1gVar instanceof y0j) {
            y0j y0jVar = (y0j) l1gVar;
            if (this.c == null) {
                if (y0jVar.c != null) {
                    return false;
                }
            } else if (!this.c.g(y0jVar.c)) {
                return false;
            }
            if (this.d == null) {
                if (y0jVar.d == null) {
                    return true;
                }
                return false;
            }
            if (this.d.g(y0jVar.d)) {
                return true;
            }
            return false;
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
        synchronized (this.b) {
            try {
                t1g t1gVar = this.a;
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
        synchronized (this.b) {
            try {
                t1g t1gVar = this.a;
                if ((t1gVar == null || t1gVar.h(this)) && l1gVar.equals(this.c) && !a()) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.t1g
    public final void i(l1g l1gVar) {
        synchronized (this.b) {
            try {
                if (l1gVar.equals(this.d)) {
                    this.f = s1g.SUCCESS;
                    return;
                }
                this.e = s1g.SUCCESS;
                t1g t1gVar = this.a;
                if (t1gVar != null) {
                    t1gVar.i(this);
                }
                if (!this.f.a()) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l1g
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            if (this.e == s1g.RUNNING) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.l1g
    public final void j() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != s1g.SUCCESS) {
                        s1g s1gVar = this.f;
                        s1g s1gVar2 = s1g.RUNNING;
                        if (s1gVar != s1gVar2) {
                            this.f = s1gVar2;
                            this.d.j();
                        }
                    }
                    if (this.g) {
                        s1g s1gVar3 = this.e;
                        s1g s1gVar4 = s1g.RUNNING;
                        if (s1gVar3 != s1gVar4) {
                            this.e = s1gVar4;
                            this.c.j();
                        }
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.l1g
    public final void pause() {
        synchronized (this.b) {
            try {
                if (!this.f.a()) {
                    this.f = s1g.PAUSED;
                    this.d.pause();
                }
                if (!this.e.a()) {
                    this.e = s1g.PAUSED;
                    this.c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
