package defpackage;

import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class uta implements eb8 {
    public final /* synthetic */ eb8 a;
    public final /* synthetic */ y45 b;
    public final /* synthetic */ Charset c;
    public final /* synthetic */ zgj d;
    public final /* synthetic */ Object e;

    public uta(eb8 eb8Var, y45 y45Var, Charset charset, zgj zgjVar, Object obj) {
        this.a = eb8Var;
        this.b = y45Var;
        this.c = charset;
        this.d = zgjVar;
        this.e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        if (r12.emit(r14, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        tta ttaVar;
        int i;
        eb8 eb8Var;
        if (continuation instanceof tta) {
            ttaVar = (tta) continuation;
            int i2 = ttaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ttaVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = ttaVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ttaVar.l;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj2);
                            return Unit.INSTANCE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eb8Var = ttaVar.m;
                    ResultKt.a(obj2);
                } else {
                    ResultKt.a(obj2);
                    cua cuaVar = (cua) obj;
                    eb8 eb8Var2 = this.a;
                    ttaVar.m = eb8Var2;
                    ttaVar.l = 1;
                    cuaVar.getClass();
                    Charset charset = Charsets.UTF_8;
                    Charset charset2 = this.c;
                    if (Intrinsics.areEqual(charset2, charset)) {
                        zgj zgjVar = this.d;
                        if (Intrinsics.areEqual(zgjVar.a, lvf.a.getOrCreateKotlinClass(Flow.class))) {
                            obj2 = new mi3(new d30(cuaVar, this.e, a8l.c(cuaVar.a.b, c3n.a(zgjVar)), charset2, (Continuation) null, 16), rrn.e(this.b, charset2));
                            if (obj2 != u85Var) {
                                eb8Var = eb8Var2;
                            }
                            return u85Var;
                        }
                    }
                    obj2 = null;
                    if (obj2 != u85Var) {
                    }
                    return u85Var;
                }
                ttaVar.m = null;
                ttaVar.l = 2;
            }
        }
        ttaVar = new tta(this, continuation);
        Object obj22 = ttaVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ttaVar.l;
        if (i == 0) {
        }
        ttaVar.m = null;
        ttaVar.l = 2;
    }
}
