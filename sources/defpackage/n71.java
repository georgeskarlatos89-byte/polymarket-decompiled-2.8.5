package defpackage;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n71 implements eb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public n71(int i, qqc qqcVar) {
        this.a = 2;
        this.c = i;
        this.b = qqcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        m71 m71Var;
        int i;
        brd brdVar;
        int i2;
        int i3 = this.a;
        int i4 = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                if (continuation instanceof m71) {
                    m71Var = (m71) continuation;
                    int i5 = m71Var.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        m71Var.l = i5 - Integer.MIN_VALUE;
                        Object obj3 = m71Var.k;
                        u85 u85Var = u85.COROUTINE_SUSPENDED;
                        i = m71Var.l;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.a(obj3);
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            ResultKt.a(obj3);
                            eb8 eb8Var = (eb8) obj2;
                            Pair pair = (Pair) obj;
                            boolean booleanValue = ((Boolean) pair.first).booleanValue();
                            int intValue = ((Number) pair.second).intValue();
                            if (!booleanValue && intValue >= 0 && intValue < i4) {
                                m71Var.l = 1;
                                if (eb8Var.emit(obj, m71Var) == u85Var) {
                                    return u85Var;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                m71Var = new m71(this, continuation);
                Object obj32 = m71Var.k;
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                i = m71Var.l;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            case 1:
                if (continuation instanceof brd) {
                    brdVar = (brd) continuation;
                    int i6 = brdVar.l;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        brdVar.l = i6 - Integer.MIN_VALUE;
                        Object obj4 = brdVar.k;
                        u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                        i2 = brdVar.l;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                ResultKt.a(obj4);
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            ResultKt.a(obj4);
                            vs8 vs8Var = new vs8(i4, (dck) obj);
                            brdVar.l = 1;
                            if (((eb8) obj2).emit(vs8Var, brdVar) == u85Var3) {
                                return u85Var3;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                brdVar = new brd(this, continuation);
                Object obj42 = brdVar.k;
                u85 u85Var32 = u85.COROUTINE_SUSPENDED;
                i2 = brdVar.l;
                if (i2 == 0) {
                }
                return Unit.INSTANCE;
            default:
                ((qqc) obj2).setValue(Integer.valueOf(((Number) obj).intValue() % i4));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n71(eb8 eb8Var, int i, int i2) {
        this.a = i2;
        this.b = eb8Var;
        this.c = i;
    }
}
