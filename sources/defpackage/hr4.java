package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hr4 implements hwg {
    public final wwf a;
    public long b;

    public hr4(List list, List list2) {
        boolean z;
        dr9 k = jr9.k();
        if (list.size() == list2.size()) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        for (int i = 0; i < list.size(); i++) {
            k.a(new gr4((hwg) list.get(i), (List) list2.get(i)));
        }
        this.a = k.g();
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.hwg
    public final long c() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            wwf wwfVar = this.a;
            if (i >= wwfVar.d) {
                break;
            }
            long c = ((gr4) wwfVar.get(i)).a.c();
            if (c != Long.MIN_VALUE) {
                j = Math.min(j, c);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.hwg
    public final boolean g() {
        int i = 0;
        while (true) {
            wwf wwfVar = this.a;
            if (i >= wwfVar.d) {
                return false;
            }
            if (((gr4) wwfVar.get(i)).a.g()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.hwg
    public final boolean q(gob gobVar) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        do {
            long c = c();
            if (c == Long.MIN_VALUE) {
                return z3;
            }
            int i = 0;
            z = false;
            while (true) {
                wwf wwfVar = this.a;
                if (i >= wwfVar.d) {
                    break;
                }
                long c2 = ((gr4) wwfVar.get(i)).a.c();
                if (c2 != Long.MIN_VALUE && c2 <= gobVar.a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c2 == c || z2) {
                    z |= ((gr4) wwfVar.get(i)).a.q(gobVar);
                }
                i++;
            }
            z3 |= z;
        } while (z);
        return z3;
    }

    @Override // defpackage.hwg
    public final long s() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            wwf wwfVar = this.a;
            if (i >= wwfVar.d) {
                break;
            }
            gr4 gr4Var = (gr4) wwfVar.get(i);
            long s = gr4Var.a.s();
            jr9 jr9Var = gr4Var.b;
            if ((jr9Var.contains(1) || jr9Var.contains(2) || jr9Var.contains(4)) && s != Long.MIN_VALUE) {
                j = Math.min(j, s);
            }
            if (s != Long.MIN_VALUE) {
                j2 = Math.min(j2, s);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.b = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.b;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        return j2;
    }

    @Override // defpackage.hwg
    public final void v(long j) {
        int i = 0;
        while (true) {
            wwf wwfVar = this.a;
            if (i < wwfVar.d) {
                ((gr4) wwfVar.get(i)).v(j);
                i++;
            } else {
                return;
            }
        }
    }
}
