package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class rsl {
    public static final w97 a = new w97(4);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [gkk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [gkk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static gkk a(nz4 nz4Var, int i, ArrayList arrayList, gkk gkkVar) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = nz4Var.o0;
        } else {
            i2 = nz4Var.p0;
        }
        int i4 = 0;
        if (i2 != -1 && (gkkVar == 0 || i2 != gkkVar.b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                gkk gkkVar2 = (gkk) arrayList.get(i5);
                if (gkkVar2.b == i2) {
                    if (gkkVar != 0) {
                        gkkVar.c(i, gkkVar2);
                        arrayList.remove((Object) gkkVar);
                    }
                    gkkVar = gkkVar2;
                } else {
                    i5++;
                }
            }
        } else if (i2 != -1) {
            return gkkVar;
        }
        gkk gkkVar3 = gkkVar;
        if (gkkVar == 0) {
            if (nz4Var instanceof p69) {
                p69 p69Var = (p69) nz4Var;
                int i6 = 0;
                while (true) {
                    if (i6 < p69Var.r0) {
                        nz4 nz4Var2 = p69Var.q0[i6];
                        if ((i == 0 && (i3 = nz4Var2.o0) != -1) || (i == 1 && (i3 = nz4Var2.p0) != -1)) {
                            break;
                        }
                        i6++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        gkk gkkVar4 = (gkk) arrayList.get(i7);
                        if (gkkVar4.b == i3) {
                            gkkVar = gkkVar4;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (gkkVar == 0) {
                gkkVar = new Object();
                gkkVar.a = new ArrayList();
                gkkVar.d = null;
                gkkVar.e = -1;
                int i8 = gkk.f;
                gkk.f = i8 + 1;
                gkkVar.b = i8;
                gkkVar.c = i;
            }
            arrayList.add(gkkVar);
            gkkVar3 = gkkVar;
        }
        ArrayList arrayList2 = gkkVar3.a;
        if (arrayList2.contains(nz4Var)) {
            return gkkVar3;
        }
        arrayList2.add(nz4Var);
        if (nz4Var instanceof s19) {
            s19 s19Var = (s19) nz4Var;
            py4 py4Var = s19Var.t0;
            if (s19Var.u0 == 0) {
                i4 = 1;
            }
            py4Var.c(i4, gkkVar3, arrayList);
        }
        int i9 = gkkVar3.b;
        if (i == 0) {
            nz4Var.o0 = i9;
            nz4Var.I.c(i, gkkVar3, arrayList);
            nz4Var.K.c(i, gkkVar3, arrayList);
        } else {
            nz4Var.p0 = i9;
            nz4Var.J.c(i, gkkVar3, arrayList);
            nz4Var.M.c(i, gkkVar3, arrayList);
            nz4Var.L.c(i, gkkVar3, arrayList);
        }
        nz4Var.P.c(i, gkkVar3, arrayList);
        return gkkVar3;
    }

    public static /* synthetic */ int b(c8i c8iVar) {
        c8iVar.getClass();
        if (c8iVar instanceof l4e) {
            return 50000;
        }
        return 50001;
    }

    public static boolean c(mz4 mz4Var, mz4 mz4Var2, mz4 mz4Var3, mz4 mz4Var4) {
        boolean z;
        boolean z2;
        mz4 mz4Var5;
        mz4 mz4Var6;
        mz4 mz4Var7 = mz4.FIXED;
        if (mz4Var3 != mz4Var7 && mz4Var3 != (mz4Var6 = mz4.WRAP_CONTENT) && (mz4Var3 != mz4.MATCH_PARENT || mz4Var == mz4Var6)) {
            z = false;
        } else {
            z = true;
        }
        if (mz4Var4 != mz4Var7 && mz4Var4 != (mz4Var5 = mz4.WRAP_CONTENT) && (mz4Var4 != mz4.MATCH_PARENT || mz4Var2 == mz4Var5)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }
}
