package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xta {
    public final ada a;
    public final ArrayList b;

    public xta(ada adaVar) {
        this.a = adaVar;
        List list = ut7.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((yta) it.next()).getClass();
            arrayList.add(new cua(adaVar));
        }
        this.b = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Charset charset, zgj zgjVar, fv1 fv1Var, q55 q55Var) {
        sta staVar;
        sta staVar2;
        u85 u85Var;
        int i;
        ArrayList arrayList;
        ada adaVar;
        fv1 fv1Var2;
        zgj zgjVar2;
        Object i2;
        Charset charset2;
        KSerializer kSerializer;
        if (q55Var instanceof sta) {
            staVar = (sta) q55Var;
            int i3 = staVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                staVar.p = i3 - Integer.MIN_VALUE;
                staVar2 = staVar;
                Object obj = staVar2.n;
                u85Var = u85.COROUTINE_SUSPENDED;
                i = staVar2.p;
                arrayList = this.b;
                adaVar = this.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            kSerializer = (KSerializer) staVar2.l;
                            charset2 = staVar2.k;
                            ResultKt.a(obj);
                            try {
                                return adaVar.b(yql.e((leh) obj, charset2, 2), kSerializer);
                            } catch (Throwable th) {
                                throw new Exception("Illegal input: " + th.getMessage(), th);
                            }
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fv1 fv1Var3 = staVar2.m;
                    zgjVar2 = (zgj) staVar2.l;
                    Charset charset3 = staVar2.k;
                    ResultKt.a(obj);
                    fv1Var2 = fv1Var3;
                    charset = charset3;
                } else {
                    ResultKt.a(obj);
                    fv1Var2 = fv1Var;
                    n35 n35Var = new n35(new q71(arrayList, 6), charset, zgjVar, fv1Var2, 1);
                    p35 p35Var = new p35(fv1Var2, null, 1);
                    staVar2.k = charset;
                    staVar2.l = zgjVar;
                    staVar2.m = fv1Var2;
                    staVar2.p = 1;
                    obj = od8.d(n35Var, p35Var, staVar2);
                    if (obj != u85Var) {
                        zgjVar2 = zgjVar;
                    }
                    return u85Var;
                }
                if (arrayList.isEmpty() && (obj != null || fv1Var2.e())) {
                    return obj;
                }
                KSerializer c = a8l.c(adaVar.b, zgjVar2);
                staVar2.k = charset;
                staVar2.l = c;
                staVar2.m = null;
                staVar2.p = 2;
                i2 = sv1.i(fv1Var2, staVar2);
                if (i2 != u85Var) {
                    charset2 = charset;
                    kSerializer = c;
                    obj = i2;
                    return adaVar.b(yql.e((leh) obj, charset2, 2), kSerializer);
                }
                return u85Var;
            }
        }
        staVar = new sta(this, q55Var);
        staVar2 = staVar;
        Object obj2 = staVar2.n;
        u85Var = u85.COROUTINE_SUSPENDED;
        i = staVar2.p;
        arrayList = this.b;
        adaVar = this.a;
        if (i == 0) {
        }
        if (arrayList.isEmpty()) {
        }
        KSerializer c2 = a8l.c(adaVar.b, zgjVar2);
        staVar2.k = charset;
        staVar2.l = c2;
        staVar2.m = null;
        staVar2.p = 2;
        i2 = sv1.i(fv1Var2, staVar2);
        if (i2 != u85Var) {
        }
        return u85Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(y45 y45Var, Charset charset, zgj zgjVar, Object obj, q55 q55Var) {
        wta wtaVar;
        int i;
        Charset charset2;
        zgj zgjVar2;
        y45 y45Var2;
        Object obj2;
        gnd gndVar;
        KSerializer b;
        ada adaVar = this.a;
        sxg sxgVar = adaVar.b;
        if (q55Var instanceof wta) {
            wtaVar = (wta) q55Var;
            int i2 = wtaVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wtaVar.q = i2 - Integer.MIN_VALUE;
                Object obj3 = wtaVar.o;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = wtaVar.q;
                if (i == 0) {
                    if (i == 1) {
                        obj2 = wtaVar.n;
                        zgj zgjVar3 = wtaVar.m;
                        Charset charset3 = wtaVar.l;
                        y45 y45Var3 = wtaVar.k;
                        ResultKt.a(obj3);
                        y45Var2 = y45Var3;
                        zgjVar2 = zgjVar3;
                        charset2 = charset3;
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj3);
                    charset2 = charset;
                    zgjVar2 = zgjVar;
                    vta vtaVar = new vta(new q71(this.b, 6), y45Var, charset2, zgjVar2, obj);
                    wg1 wg1Var = new wg1(2, 10, null);
                    wtaVar.k = y45Var;
                    wtaVar.l = charset2;
                    wtaVar.m = zgjVar2;
                    wtaVar.n = obj;
                    wtaVar.q = 1;
                    obj3 = od8.d(vtaVar, wg1Var, wtaVar);
                    if (obj3 == u85Var) {
                        return u85Var;
                    }
                    y45Var2 = y45Var;
                    obj2 = obj;
                }
                gndVar = (gnd) obj3;
                if (gndVar == null) {
                    return gndVar;
                }
                try {
                    b = a8l.c(sxgVar, zgjVar2);
                } catch (hxg unused) {
                    b = a8l.b(obj2, sxgVar);
                }
                return new dri(adaVar.c(b, obj2), rrn.e(y45Var2, charset2));
            }
        }
        wtaVar = new wta(this, q55Var);
        Object obj32 = wtaVar.o;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = wtaVar.q;
        if (i == 0) {
        }
        gndVar = (gnd) obj32;
        if (gndVar == null) {
        }
    }
}
