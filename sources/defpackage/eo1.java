package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class eo1 implements bo1 {
    public final zqc a = new zqc(new fo1[16]);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:10:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zrf zrfVar, q55 q55Var) {
        do1 do1Var;
        int i;
        int i2;
        zrf zrfVar2;
        int i3;
        Object[] objArr;
        if (q55Var instanceof do1) {
            do1Var = (do1) q55Var;
            int i4 = do1Var.q;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                do1Var.q = i4 - Integer.MIN_VALUE;
                Object obj = do1Var.o;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = do1Var.q;
                if (i == 0) {
                    if (i == 1) {
                        i2 = do1Var.n;
                        i3 = do1Var.m;
                        objArr = do1Var.l;
                        zrf zrfVar3 = do1Var.k;
                        ResultKt.a(obj);
                        zrfVar2 = zrfVar3;
                        i3++;
                        if (i3 < i2) {
                            fo1 fo1Var = (fo1) objArr[i3];
                            bn1 bn1Var = new bn1(zrfVar2, 4);
                            do1Var.k = zrfVar2;
                            do1Var.l = objArr;
                            do1Var.m = i3;
                            do1Var.n = i2;
                            do1Var.q = 1;
                            if (phn.a(fo1Var, bn1Var, do1Var) == u85Var) {
                                return u85Var;
                            }
                            i3++;
                            if (i3 < i2) {
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    zqc zqcVar = this.a;
                    Object[] objArr2 = zqcVar.a;
                    i2 = zqcVar.c;
                    zrfVar2 = zrfVar;
                    i3 = 0;
                    objArr = objArr2;
                    if (i3 < i2) {
                    }
                }
            }
        }
        do1Var = new do1(this, q55Var);
        Object obj2 = do1Var.o;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = do1Var.q;
        if (i == 0) {
        }
    }
}
