package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class rn7 implements Runnable, Comparable, jw6 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public rn7(long j) {
        this.a = j;
    }

    public final int b(long j, sn7 sn7Var, tn7 tn7Var) {
        rn7 rn7Var;
        boolean z;
        synchronized (this) {
            if (this._heap == vsl.a) {
                return 2;
            }
            synchronized (sn7Var) {
                try {
                    rn7[] rn7VarArr = sn7Var.a;
                    if (rn7VarArr != null) {
                        rn7Var = rn7VarArr[0];
                    } else {
                        rn7Var = null;
                    }
                    int i = tn7.i;
                    if (oo4.a.getIntVolatile(tn7Var, tn7.g) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return 1;
                    }
                    if (rn7Var == null) {
                        sn7Var.c = j;
                    } else {
                        long j2 = rn7Var.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = sn7Var.c;
                        if (j - j3 > 0) {
                            sn7Var.c = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.a - j < 0) {
                        this.a = j;
                    }
                    sn7Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(sn7 sn7Var) {
        if (this._heap != vsl.a) {
            this._heap = sn7Var;
        } else {
            dmk.v("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((rn7) obj).a;
        if (j > 0) {
            return 1;
        }
        if (j < 0) {
            return -1;
        }
        return 0;
    }

    @Override // defpackage.jw6
    public final void dispose() {
        sn7 sn7Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                uk ukVar = vsl.a;
                if (obj == ukVar) {
                    return;
                }
                tzi tziVar = null;
                if (obj instanceof sn7) {
                    sn7Var = (sn7) obj;
                } else {
                    sn7Var = null;
                }
                if (sn7Var != null) {
                    synchronized (sn7Var) {
                        Object obj2 = this._heap;
                        if (obj2 instanceof tzi) {
                            tziVar = (tzi) obj2;
                        }
                        if (tziVar != null) {
                            sn7Var.c(this.b);
                        }
                    }
                }
                this._heap = ukVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return ix2.n(new StringBuilder("Delayed[nanos="), this.a, ']');
    }
}
