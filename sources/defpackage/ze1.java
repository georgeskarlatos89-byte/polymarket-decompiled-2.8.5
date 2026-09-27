package defpackage;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ze1 implements tx5 {
    public final up9 a;
    public final kld b;
    public final vug c;
    public final jq7 d;

    public ze1(up9 up9Var, kld kldVar, vug vugVar, jq7 jq7Var) {
        this.a = up9Var;
        this.b = kldVar;
        this.c = vugVar;
        this.d = jq7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (r8.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.tx5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decode(Continuation continuation) {
        xe1 xe1Var;
        u85 u85Var;
        int i;
        vug vugVar;
        Throwable th;
        Object obj;
        Object c;
        try {
            if (continuation instanceof xe1) {
                xe1Var = (xe1) continuation;
                int i2 = xe1Var.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xe1Var.o = i2 - Integer.MIN_VALUE;
                    Object obj2 = xe1Var.m;
                    u85Var = u85.COROUTINE_SUSPENDED;
                    i = xe1Var.o;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                obj = (rug) xe1Var.k;
                                try {
                                    ResultKt.a(obj2);
                                    mx5 mx5Var = (mx5) obj2;
                                    ((uug) obj).d();
                                    return mx5Var;
                                } catch (Throwable th2) {
                                    th = th2;
                                    ((uug) obj).d();
                                    throw th;
                                }
                            }
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vug vugVar2 = xe1Var.l;
                        ze1 ze1Var = (ze1) xe1Var.k;
                        ResultKt.a(obj2);
                        vugVar = vugVar2;
                        this = ze1Var;
                    } else {
                        ResultKt.a(obj2);
                        xe1Var.k = this;
                        vugVar = this.c;
                        xe1Var.l = vugVar;
                        xe1Var.o = 1;
                    }
                    ke keVar = new ke(this, 23);
                    xe1Var.k = vugVar;
                    xe1Var.l = null;
                    xe1Var.o = 2;
                    c = nvm.c(keVar, xe1Var);
                    if (c != u85Var) {
                        vug vugVar3 = vugVar;
                        obj2 = c;
                        obj = vugVar3;
                        mx5 mx5Var2 = (mx5) obj2;
                        ((uug) obj).d();
                        return mx5Var2;
                    }
                    return u85Var;
                }
            }
            ke keVar2 = new ke(this, 23);
            xe1Var.k = vugVar;
            xe1Var.l = null;
            xe1Var.o = 2;
            c = nvm.c(keVar2, xe1Var);
            if (c != u85Var) {
            }
            return u85Var;
        } catch (Throwable th3) {
            vug vugVar4 = vugVar;
            th = th3;
            obj = vugVar4;
            ((uug) obj).d();
            throw th;
        }
        xe1Var = new xe1(this, (q55) continuation);
        Object obj22 = xe1Var.m;
        u85Var = u85.COROUTINE_SUSPENDED;
        i = xe1Var.o;
        if (i == 0) {
        }
    }
}
