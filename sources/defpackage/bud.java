package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class bud {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        dyi[] dyiVarArr = cyi.b;
        a = cyi.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0033, code lost:
    
        if (defpackage.cyi.a(r3, r17.c) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final aud a(aud audVar, int i, int i2, long j, rvi rviVar, poe poeVar, l8b l8bVar, int i3, int i4, kxi kxiVar) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        rvi rviVar2 = rviVar;
        poe poeVar2 = poeVar;
        l8b l8bVar2 = l8bVar;
        int i7 = i3;
        int i8 = i4;
        kxi kxiVar2 = kxiVar;
        if (i5 == 0 || i5 == audVar.a) {
            dyi[] dyiVarArr = cyi.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
            }
            if ((rviVar2 == null || Intrinsics.areEqual(rviVar2, audVar.d)) && ((i6 == 0 || i6 == audVar.b) && ((poeVar2 == null || Intrinsics.areEqual(poeVar2, audVar.e)) && ((l8bVar2 == null || Intrinsics.areEqual(l8bVar2, audVar.f)) && ((i7 == 0 || i7 == audVar.g) && ((i8 == 0 || i8 == audVar.h) && (kxiVar2 == null || Intrinsics.areEqual(kxiVar2, audVar.i)))))))) {
                return audVar;
            }
        } else {
            j2 = 0;
        }
        dyi[] dyiVarArr2 = cyi.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = audVar.c;
        }
        if (rviVar2 == null) {
            rviVar2 = audVar.d;
        }
        if (i5 == 0) {
            i5 = audVar.a;
        }
        if (i6 == 0) {
            i6 = audVar.b;
        }
        poe poeVar3 = audVar.e;
        if (poeVar3 != null && poeVar2 == null) {
            poeVar2 = poeVar3;
        }
        if (l8bVar2 == null) {
            l8bVar2 = audVar.f;
        }
        if (i7 == 0) {
            i7 = audVar.g;
        }
        if (i8 == 0) {
            i8 = audVar.h;
        }
        if (kxiVar2 == null) {
            kxiVar2 = audVar.i;
        }
        return new aud(i5, i6, j3, rviVar2, poeVar2, l8bVar2, i7, i8, kxiVar2);
    }
}
