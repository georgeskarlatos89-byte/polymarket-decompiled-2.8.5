package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class py4 {
    public int b;
    public boolean c;
    public final nz4 d;
    public final oy4 e;
    public py4 f;
    public ceh i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public py4(nz4 nz4Var, oy4 oy4Var) {
        this.d = nz4Var;
        this.e = oy4Var;
    }

    public final void a(py4 py4Var, int i) {
        b(py4Var, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(py4 py4Var, int i, int i2, boolean z) {
        if (py4Var == null) {
            j();
            return true;
        }
        if (!z && !i(py4Var)) {
            return false;
        }
        this.f = py4Var;
        if (py4Var.a == null) {
            py4Var.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, gkk gkkVar, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                rsl.a(((py4) it.next()).d, i, arrayList, gkkVar);
            }
        }
    }

    public final int d() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    public final int e() {
        py4 py4Var;
        if (this.d.h0 == 8) {
            return 0;
        }
        int i = this.h;
        if (i != Integer.MIN_VALUE && (py4Var = this.f) != null && py4Var.d.h0 == 8) {
            return i;
        }
        return this.g;
    }

    public final py4 f() {
        oy4 oy4Var = this.e;
        int ordinal = oy4Var.ordinal();
        nz4 nz4Var = this.d;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return nz4Var.K;
            case 2:
                return nz4Var.L;
            case 3:
                return nz4Var.I;
            case 4:
                return nz4Var.J;
            default:
                dmk.i(oy4Var.name());
                return null;
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((py4) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(py4 py4Var) {
        boolean z;
        boolean z2;
        if (py4Var != null) {
            nz4 nz4Var = py4Var.d;
            oy4 oy4Var = py4Var.e;
            oy4 oy4Var2 = this.e;
            if (oy4Var == oy4Var2) {
                if (oy4Var2 != oy4.BASELINE || (nz4Var.E && this.d.E)) {
                    return true;
                }
            } else {
                switch (oy4Var2.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        if (oy4Var != oy4.LEFT && oy4Var != oy4.RIGHT) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (nz4Var instanceof s19) {
                            if (z || oy4Var == oy4.CENTER_X) {
                            }
                        } else {
                            return z;
                        }
                        break;
                    case 2:
                    case 4:
                        if (oy4Var != oy4.TOP && oy4Var != oy4.BOTTOM) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (nz4Var instanceof s19) {
                            if (z2 || oy4Var == oy4.CENTER_Y) {
                            }
                        } else {
                            return z2;
                        }
                        break;
                    case 5:
                        if (oy4Var == oy4.LEFT || oy4Var == oy4.RIGHT) {
                        }
                        break;
                    case 6:
                        if (oy4Var == oy4.BASELINE || oy4Var == oy4.CENTER_X || oy4Var == oy4.CENTER_Y) {
                        }
                        break;
                    default:
                        dmk.i(oy4Var2.name());
                        return false;
                }
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        py4 py4Var = this.f;
        if (py4Var != null && (hashSet = py4Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        ceh cehVar = this.i;
        if (cehVar == null) {
            this.i = new ceh(beh.UNRESTRICTED);
        } else {
            cehVar.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.i0 + ":" + this.e.toString();
    }
}
