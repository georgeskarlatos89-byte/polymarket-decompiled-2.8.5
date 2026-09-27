package defpackage;

import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class es5 implements mof {
    public final bof a;
    public final byf b;

    public es5(bof bofVar, byf byfVar) {
        bofVar.getClass();
        this.a = bofVar;
        this.b = byfVar;
    }

    @Override // defpackage.mof
    public final Object T(Reaction reaction, q55 q55Var) {
        if (reaction.getMessageId().length() > 0) {
            if (reaction.getType().length() > 0) {
                if (reaction.getUserId().length() > 0) {
                    Object insert = this.a.insert(ntn.c(reaction), q55Var);
                    if (insert == u85.COROUTINE_SUSPENDED) {
                        return insert;
                    }
                    return Unit.INSTANCE;
                }
                dmk.v("user id can't be empty when creating a reaction");
                return null;
            }
            dmk.v("type can't be empty when creating a reaction");
            return null;
        }
        dmk.v("message id can't be empty when creating a reaction");
        return null;
    }

    @Override // defpackage.mof
    public final Object a0(String str, String str2, Date date, pvg pvgVar) {
        Object deleteAt = this.a.setDeleteAt(str, str2, date, pvgVar);
        if (deleteAt == u85.COROUTINE_SUSPENDED) {
            return deleteAt;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.mof
    public final Object clear(Continuation continuation) {
        Object deleteAll = this.a.deleteAll(continuation);
        if (deleteAll == u85.COROUTINE_SUSPENDED) {
            return deleteAll;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.mof
    public final Object f(Reaction reaction, byf byfVar) {
        Object delete = this.a.delete(ntn.c(reaction), byfVar);
        if (delete == u85.COROUTINE_SUSPENDED) {
            return delete;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.mof
    public final Object k(SyncStatus syncStatus, tgi tgiVar) {
        return this.a.selectIdsSyncStatus(syncStatus, -1, tgiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.mof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object selectReactionById(int i, Continuation continuation) {
        cs5 cs5Var;
        int i2;
        hof hofVar;
        if (continuation instanceof cs5) {
            cs5Var = (cs5) continuation;
            int i3 = cs5Var.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cs5Var.n = i3 - Integer.MIN_VALUE;
                Object obj = cs5Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i2 = cs5Var.n;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.a(obj);
                            return (Reaction) obj;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = cs5Var.k;
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    cs5Var.k = i;
                    cs5Var.n = 1;
                    obj = this.a.selectReactionById(i, cs5Var);
                }
                hofVar = (hof) obj;
                if (hofVar != null) {
                    return null;
                }
                cs5Var.k = i;
                cs5Var.n = 2;
                obj = ntn.d(hofVar, this.b, cs5Var);
            }
        }
        cs5Var = new cs5(this, (q55) continuation);
        Object obj2 = cs5Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i2 = cs5Var.n;
        if (i2 == 0) {
        }
        hofVar = (hof) obj2;
        if (hofVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.mof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(String str, String str2, String str3, q55 q55Var) {
        ds5 ds5Var;
        int i;
        hof hofVar;
        if (q55Var instanceof ds5) {
            ds5Var = (ds5) q55Var;
            int i2 = ds5Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ds5Var.m = i2 - Integer.MIN_VALUE;
                Object obj = ds5Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ds5Var.m;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj);
                            return (Reaction) obj;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    ds5Var.m = 1;
                    obj = this.a.selectUserReactionToMessage(str, str2, str3, ds5Var);
                }
                hofVar = (hof) obj;
                if (hofVar != null) {
                    return null;
                }
                ds5Var.m = 2;
                obj = ntn.d(hofVar, this.b, ds5Var);
            }
        }
        ds5Var = new ds5(this, q55Var);
        Object obj2 = ds5Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ds5Var.m;
        if (i == 0) {
        }
        hofVar = (hof) obj2;
        if (hofVar != null) {
        }
    }
}
