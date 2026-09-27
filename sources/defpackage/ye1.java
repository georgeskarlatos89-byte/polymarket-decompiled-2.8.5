package defpackage;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ye1 implements ux5 {
    public final tp9 a;
    public final hld b;
    public final vug c;
    public final kq7 d;

    public ye1(tp9 tp9Var, hld hldVar, vug vugVar, kq7 kq7Var) {
        this.a = tp9Var;
        this.b = hldVar;
        this.c = vugVar;
        this.d = kq7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
    
        if (r7.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v3, types: [rug] */
    @Override // defpackage.ux5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decode(Continuation continuation) {
        we1 we1Var;
        u85 u85Var;
        int i;
        vug vugVar;
        Throwable th;
        Object obj;
        Object c;
        try {
            if (continuation instanceof we1) {
                we1Var = (we1) continuation;
                int i2 = we1Var.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    we1Var.n = i2 - Integer.MIN_VALUE;
                    Object obj2 = we1Var.l;
                    u85Var = u85.COROUTINE_SUSPENDED;
                    i = we1Var.n;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                obj = we1Var.k;
                                try {
                                    ResultKt.a(obj2);
                                    lx5 lx5Var = (lx5) obj2;
                                    ((uug) obj).d();
                                    return lx5Var;
                                } catch (Throwable th2) {
                                    th = th2;
                                    ((uug) obj).d();
                                    throw th;
                                }
                            }
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r2 = we1Var.k;
                        ResultKt.a(obj2);
                        vugVar = r2;
                    } else {
                        ResultKt.a(obj2);
                        vugVar = this.c;
                        we1Var.k = vugVar;
                        we1Var.n = 1;
                    }
                    ke keVar = new ke(this, 22);
                    we1Var.k = vugVar;
                    we1Var.n = 2;
                    c = nvm.c(keVar, we1Var);
                    if (c != u85Var) {
                        vug vugVar2 = vugVar;
                        obj2 = c;
                        obj = vugVar2;
                        lx5 lx5Var2 = (lx5) obj2;
                        ((uug) obj).d();
                        return lx5Var2;
                    }
                    return u85Var;
                }
            }
            ke keVar2 = new ke(this, 22);
            we1Var.k = vugVar;
            we1Var.n = 2;
            c = nvm.c(keVar2, we1Var);
            if (c != u85Var) {
            }
            return u85Var;
        } catch (Throwable th3) {
            vug vugVar3 = vugVar;
            th = th3;
            obj = vugVar3;
            ((uug) obj).d();
            throw th;
        }
        we1Var = new we1(this, (q55) continuation);
        Object obj22 = we1Var.l;
        u85Var = u85.COROUTINE_SUSPENDED;
        i = we1Var.n;
        if (i == 0) {
        }
    }
}
