package defpackage;

import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class m35 implements eb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eb8 b;
    public final /* synthetic */ Charset c;
    public final /* synthetic */ zgj d;
    public final /* synthetic */ fv1 e;

    public /* synthetic */ m35(eb8 eb8Var, Charset charset, zgj zgjVar, fv1 fv1Var, int i) {
        this.a = i;
        this.b = eb8Var;
        this.c = charset;
        this.d = zgjVar;
        this.e = fv1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r4.emit(r12, r0) != r14) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r12 == r14) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if (r4.emit(r12, r0) != r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
    
        if (r12 == r14) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        l35 l35Var;
        int i;
        rta rtaVar;
        int i2;
        int i3 = this.a;
        fv1 fv1Var = this.e;
        zgj zgjVar = this.d;
        Charset charset = this.c;
        eb8 eb8Var = this.b;
        switch (i3) {
            case 0:
                if (continuation instanceof l35) {
                    l35Var = (l35) continuation;
                    int i4 = l35Var.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        l35Var.l = i4 - Integer.MIN_VALUE;
                        Object obj2 = l35Var.k;
                        u85 u85Var = u85.COROUTINE_SUSPENDED;
                        i = l35Var.l;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    ResultKt.a(obj2);
                                    return Unit.INSTANCE;
                                }
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            eb8Var = l35Var.m;
                            ResultKt.a(obj2);
                        } else {
                            ResultKt.a(obj2);
                            l35Var.m = eb8Var;
                            l35Var.l = 1;
                            obj2 = ((xta) obj).a(charset, zgjVar, fv1Var, l35Var);
                            break;
                        }
                        l35Var.m = null;
                        l35Var.l = 2;
                        break;
                    }
                }
                l35Var = new l35(this, continuation);
                Object obj22 = l35Var.k;
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                i = l35Var.l;
                if (i == 0) {
                }
                l35Var.m = null;
                l35Var.l = 2;
            default:
                if (continuation instanceof rta) {
                    rtaVar = (rta) continuation;
                    int i5 = rtaVar.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rtaVar.l = i5 - Integer.MIN_VALUE;
                        Object obj3 = rtaVar.k;
                        u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                        i2 = rtaVar.l;
                        if (i2 == 0) {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    ResultKt.a(obj3);
                                    return Unit.INSTANCE;
                                }
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            eb8Var = rtaVar.m;
                            ResultKt.a(obj3);
                        } else {
                            ResultKt.a(obj3);
                            rtaVar.m = eb8Var;
                            rtaVar.l = 1;
                            obj3 = ((cua) obj).a(charset, zgjVar, fv1Var, rtaVar);
                            break;
                        }
                        rtaVar.m = null;
                        rtaVar.l = 2;
                        break;
                    }
                }
                rtaVar = new rta(this, continuation);
                Object obj32 = rtaVar.k;
                u85 u85Var32 = u85.COROUTINE_SUSPENDED;
                i2 = rtaVar.l;
                if (i2 == 0) {
                }
                rtaVar.m = null;
                rtaVar.l = 2;
        }
    }
}
