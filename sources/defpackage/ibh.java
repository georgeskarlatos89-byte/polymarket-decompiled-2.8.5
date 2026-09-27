package defpackage;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ibh {
    public final orc a = new orc();
    public final kvd b = ikl.c(null);

    public static Object b(ibh ibhVar, String str, String str2, bbh bbhVar, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        ibhVar.getClass();
        return ibhVar.a(new gbh(str, str2, bbhVar), (q55) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r7v0, types: [ibh] */
    /* JADX WARN: Type inference failed for: r7v1, types: [mrc] */
    /* JADX WARN: Type inference failed for: r7v4, types: [mrc] */
    /* JADX WARN: Type inference failed for: r7v5, types: [mrc] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(gbh gbhVar, q55 q55Var) {
        hbh hbhVar;
        int i;
        kvd kvdVar;
        orc orcVar;
        try {
            try {
                if (q55Var instanceof hbh) {
                    hbhVar = (hbh) q55Var;
                    int i2 = hbhVar.o;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        hbhVar.o = i2 - Integer.MIN_VALUE;
                        Object obj = hbhVar.m;
                        u85 u85Var = u85.COROUTINE_SUSPENDED;
                        i = hbhVar.o;
                        kvdVar = this.b;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    mrc mrcVar = hbhVar.l;
                                    ResultKt.a(obj);
                                    this = mrcVar;
                                    return obj;
                                }
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ?? r7 = hbhVar.l;
                            gbhVar = hbhVar.k;
                            ResultKt.a(obj);
                            orcVar = r7;
                        } else {
                            ResultKt.a(obj);
                            hbhVar.k = gbhVar;
                            orc orcVar2 = this.a;
                            hbhVar.l = orcVar2;
                            hbhVar.o = 1;
                            Object e = orcVar2.e(hbhVar);
                            orcVar = orcVar2;
                        }
                        hbhVar.k = gbhVar;
                        hbhVar.l = orcVar;
                        hbhVar.o = 2;
                        m23 m23Var = new m23(1, m7a.b(hbhVar));
                        m23Var.t();
                        kvdVar.setValue(new fbh(gbhVar, m23Var));
                        obj = m23Var.r();
                        this = orcVar;
                    }
                }
                if (i == 0) {
                }
                hbhVar.k = gbhVar;
                hbhVar.l = orcVar;
                hbhVar.o = 2;
                m23 m23Var2 = new m23(1, m7a.b(hbhVar));
                m23Var2.t();
                kvdVar.setValue(new fbh(gbhVar, m23Var2));
                obj = m23Var2.r();
                this = orcVar;
            } finally {
                kvdVar.setValue(null);
            }
        } finally {
            this.o(null);
        }
        hbhVar = new hbh(this, q55Var);
        Object obj2 = hbhVar.m;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = hbhVar.o;
        kvdVar = this.b;
    }
}
