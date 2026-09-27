package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class obg {
    public jkk a;
    public ArrayList b;

    public static long a(xl6 xl6Var, long j) {
        jkk jkkVar = xl6Var.d;
        ArrayList arrayList = xl6Var.k;
        if (jkkVar instanceof o69) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            ql6 ql6Var = (ql6) arrayList.get(i);
            if (ql6Var instanceof xl6) {
                xl6 xl6Var2 = (xl6) ql6Var;
                if (xl6Var2.d != jkkVar) {
                    j2 = Math.min(j2, a(xl6Var2, xl6Var2.f + j));
                }
            }
        }
        xl6 xl6Var3 = jkkVar.i;
        xl6 xl6Var4 = jkkVar.h;
        if (xl6Var == xl6Var3) {
            long j3 = j - jkkVar.j();
            return Math.min(Math.min(j2, a(xl6Var4, j3)), j3 - xl6Var4.f);
        }
        return j2;
    }

    public static long b(xl6 xl6Var, long j) {
        jkk jkkVar = xl6Var.d;
        ArrayList arrayList = xl6Var.k;
        if (jkkVar instanceof o69) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            ql6 ql6Var = (ql6) arrayList.get(i);
            if (ql6Var instanceof xl6) {
                xl6 xl6Var2 = (xl6) ql6Var;
                if (xl6Var2.d != jkkVar) {
                    j2 = Math.max(j2, b(xl6Var2, xl6Var2.f + j));
                }
            }
        }
        xl6 xl6Var3 = jkkVar.h;
        xl6 xl6Var4 = jkkVar.i;
        if (xl6Var == xl6Var3) {
            long j3 = jkkVar.j() + j;
            return Math.max(Math.max(j2, b(xl6Var4, j3)), j3 - xl6Var4.f);
        }
        return j2;
    }
}
