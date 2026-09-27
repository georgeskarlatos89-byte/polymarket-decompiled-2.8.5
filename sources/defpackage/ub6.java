package defpackage;

import android.media.metrics.PlaybackMetrics;
import io.ably.lib.BuildConfig;
import java.util.HashMap;
import java.util.Random;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ub6 {
    public static final sb6 h = new sb6(0);
    public static final Random i = new Random();
    public o7c d;
    public String f;
    public final o2j a = new o2j();
    public final n2j b = new n2j();
    public final HashMap c = new HashMap();
    public v2j e = v2j.a;
    public long g = -1;

    public final void a(tb6 tb6Var) {
        long j = tb6Var.c;
        if (j != -1) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tb6 b(int i2, x7c x7cVar) {
        long j;
        long j2;
        long j3;
        HashMap hashMap = this.c;
        tb6 tb6Var = null;
        long j4 = Long.MAX_VALUE;
        for (tb6 tb6Var2 : hashMap.values()) {
            long j5 = tb6Var2.c;
            x7c x7cVar2 = tb6Var2.d;
            if (j5 == -1 && i2 == tb6Var2.b && x7cVar != null) {
                long j6 = x7cVar.d;
                ub6 ub6Var = tb6Var2.g;
                j = -1;
                tb6 tb6Var3 = (tb6) ub6Var.c.get(ub6Var.f);
                if (tb6Var3 != null) {
                    j3 = tb6Var3.c;
                }
                j3 = ub6Var.g + 1;
                if (j6 >= j3) {
                    tb6Var2.c = j6;
                }
            } else {
                j = -1;
            }
            if (x7cVar == null) {
                if (i2 == tb6Var2.b) {
                    j2 = tb6Var2.c;
                    if (j2 != j && j2 >= j4) {
                        if (j2 == j4) {
                            int i3 = u1k.a;
                            if (tb6Var.d != null && x7cVar2 != null) {
                                tb6Var = tb6Var2;
                            }
                        }
                    } else {
                        tb6Var = tb6Var2;
                        j4 = j2;
                    }
                }
            } else {
                long j7 = x7cVar.d;
                if (x7cVar2 == null) {
                    if (!x7cVar.b() && j7 == tb6Var2.c) {
                        j2 = tb6Var2.c;
                        if (j2 != j) {
                        }
                        tb6Var = tb6Var2;
                        j4 = j2;
                    }
                } else if (j7 == x7cVar2.d && x7cVar.b == x7cVar2.b && x7cVar.c == x7cVar2.c) {
                    j2 = tb6Var2.c;
                    if (j2 != j) {
                    }
                    tb6Var = tb6Var2;
                    j4 = j2;
                }
            }
        }
        if (tb6Var == null) {
            String str = (String) h.get();
            tb6 tb6Var4 = new tb6(this, str, i2, x7cVar);
            hashMap.put(str, tb6Var4);
            return tb6Var4;
        }
        return tb6Var;
    }

    public final synchronized String c(v2j v2jVar, x7c x7cVar) {
        return b(v2jVar.g(x7cVar.a, this.b).c, x7cVar).a;
    }

    public final void d(lp lpVar) {
        x7c x7cVar;
        v2j v2jVar = lpVar.b;
        int i2 = lpVar.c;
        x7c x7cVar2 = lpVar.d;
        boolean p = v2jVar.p();
        String str = this.f;
        HashMap hashMap = this.c;
        if (p) {
            if (str != null) {
                tb6 tb6Var = (tb6) hashMap.get(str);
                tb6Var.getClass();
                a(tb6Var);
                return;
            }
            return;
        }
        tb6 tb6Var2 = (tb6) hashMap.get(str);
        this.f = b(i2, x7cVar2).a;
        e(lpVar);
        if (x7cVar2 != null) {
            long j = x7cVar2.d;
            if (x7cVar2.b()) {
                if (tb6Var2 == null || tb6Var2.c != j || (x7cVar = tb6Var2.d) == null || x7cVar.b != x7cVar2.b || x7cVar.c != x7cVar2.c) {
                    b(i2, new x7c(j, x7cVar2.a));
                    this.d.getClass();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0010, B:10:0x0014, B:12:0x0024, B:19:0x0036, B:21:0x0042, B:23:0x0048, B:27:0x002b, B:29:0x0053, B:31:0x005f, B:32:0x0063, B:34:0x0068, B:36:0x006e, B:38:0x0085, B:39:0x00b2, B:41:0x00b6, B:42:0x00bd, B:44:0x00c7, B:46:0x00cb, B:48:0x00d8, B:51:0x00df), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e(lp lpVar) {
        long j;
        this.d.getClass();
        if (lpVar.b.p()) {
            return;
        }
        x7c x7cVar = lpVar.d;
        if (x7cVar != null) {
            long j2 = x7cVar.d;
            tb6 tb6Var = (tb6) this.c.get(this.f);
            if (tb6Var != null) {
                j = tb6Var.c;
                if (j != -1) {
                    if (j2 >= j) {
                        return;
                    }
                    tb6 tb6Var2 = (tb6) this.c.get(this.f);
                    if (tb6Var2 != null && tb6Var2.c == -1 && tb6Var2.b != lpVar.c) {
                        return;
                    }
                }
            }
            j = this.g + 1;
            if (j2 >= j) {
            }
        }
        tb6 b = b(lpVar.c, lpVar.d);
        if (this.f == null) {
            this.f = b.a;
        }
        x7c x7cVar2 = lpVar.d;
        if (x7cVar2 != null && x7cVar2.b()) {
            x7c x7cVar3 = lpVar.d;
            tb6 b2 = b(lpVar.c, new x7c(x7cVar3.a, x7cVar3.d, x7cVar3.b));
            if (!b2.e) {
                b2.e = true;
                lpVar.b.g(lpVar.d.a, this.b);
                this.b.d(lpVar.d.b);
                Math.max(0L, u1k.W(0L) + u1k.W(this.b.e));
                this.d.getClass();
            }
        }
        if (!b.e) {
            b.e = true;
            this.d.getClass();
        }
        if (b.a.equals(this.f) && !b.f) {
            b.f = true;
            o7c o7cVar = this.d;
            String str = b.a;
            o7cVar.getClass();
            x7c x7cVar4 = lpVar.d;
            if (x7cVar4 == null || !x7cVar4.b()) {
                o7cVar.b();
                o7cVar.j = str;
                o7cVar.k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion(BuildConfig.VERSION);
                o7cVar.c(lpVar.b, x7cVar4);
            }
        }
    }
}
