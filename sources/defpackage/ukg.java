package defpackage;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ukg implements m1d {
    public final dlg a;
    public boolean b;

    public ukg(dlg dlgVar, boolean z) {
        this.a = dlgVar;
        this.b = z;
    }

    @Override // defpackage.m1d
    public final long M(int i, long j, long j2) {
        if (this.b) {
            dlg dlgVar = this.a;
            if (!dlgVar.a.b()) {
                return dlgVar.h(dlgVar.d(dlgVar.a.e(dlgVar.d(dlgVar.g(j2)))));
            }
            return 0L;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.m1d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(long j, long j2, Continuation continuation) {
        tkg tkgVar;
        int i;
        long j3;
        if (continuation instanceof tkg) {
            tkgVar = (tkg) continuation;
            int i2 = tkgVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tkgVar.n = i2 - Integer.MIN_VALUE;
                Object obj = tkgVar.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = tkgVar.n;
                if (i == 0) {
                    if (i == 1) {
                        j2 = tkgVar.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    j3 = 0;
                    if (this.b) {
                        dlg dlgVar = this.a;
                        if (!dlgVar.i) {
                            tkgVar.k = j2;
                            tkgVar.n = 1;
                            obj = dlgVar.a(j2, tkgVar);
                            if (obj == u85Var) {
                                return u85Var;
                            }
                        }
                        j3 = j5k.d(j2, j3);
                    }
                    return new j5k(j3);
                }
                j3 = ((j5k) obj).a;
                j3 = j5k.d(j2, j3);
                return new j5k(j3);
            }
        }
        tkgVar = new tkg(this, (q55) continuation);
        Object obj2 = tkgVar.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = tkgVar.n;
        if (i == 0) {
        }
        j3 = ((j5k) obj2).a;
        j3 = j5k.d(j2, j3);
        return new j5k(j3);
    }
}
