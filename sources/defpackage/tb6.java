package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tb6 {
    public final String a;
    public int b;
    public long c;
    public final x7c d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ ub6 g;

    public tb6(ub6 ub6Var, String str, int i, x7c x7cVar) {
        long j;
        this.g = ub6Var;
        this.a = str;
        this.b = i;
        if (x7cVar == null) {
            j = -1;
        } else {
            j = x7cVar.d;
        }
        this.c = j;
        if (x7cVar != null && x7cVar.b()) {
            this.d = x7cVar;
        }
    }

    public final boolean a(lp lpVar) {
        x7c x7cVar = lpVar.d;
        v2j v2jVar = lpVar.b;
        if (x7cVar == null) {
            if (this.b != lpVar.c) {
                return true;
            }
            return false;
        }
        long j = this.c;
        if (j != -1) {
            if (x7cVar.d <= j) {
                x7c x7cVar2 = this.d;
                if (x7cVar2 != null) {
                    int i = x7cVar2.b;
                    int b = v2jVar.b(x7cVar.a);
                    int b2 = v2jVar.b(x7cVar2.a);
                    if (x7cVar.d >= x7cVar2.d && b >= b2) {
                        if (b <= b2) {
                            if (x7cVar.b()) {
                                int i2 = x7cVar.b;
                                int i3 = x7cVar.c;
                                if (i2 <= i) {
                                    if (i2 == i && i3 > x7cVar2.c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i4 = x7cVar.e;
                            if (i4 == -1 || i4 > i) {
                                return true;
                            }
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(v2j v2jVar, v2j v2jVar2) {
        x7c x7cVar;
        int i = this.b;
        if (i < v2jVar.o()) {
            ub6 ub6Var = this.g;
            o2j o2jVar = ub6Var.a;
            v2jVar.n(i, o2jVar);
            for (int i2 = o2jVar.n; i2 <= o2jVar.o; i2++) {
                int b = v2jVar2.b(v2jVar.l(i2));
                if (b != -1) {
                    i = v2jVar2.f(b, ub6Var.b, false).c;
                    break;
                }
            }
            i = -1;
        }
        this.b = i;
        if (i == -1 || ((x7cVar = this.d) != null && v2jVar2.b(x7cVar.a) == -1)) {
            return false;
        }
        return true;
    }
}
