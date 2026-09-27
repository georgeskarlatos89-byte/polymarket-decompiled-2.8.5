package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class id8 implements eb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Ref.ObjectRef c;

    public /* synthetic */ id8(Function2 function2, Ref.ObjectRef objectRef, int i) {
        this.a = i;
        this.b = function2;
        this.c = objectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        hd8 hd8Var;
        Object obj2;
        int i;
        ld8 ld8Var;
        Object obj3;
        int i2;
        int i3 = this.a;
        Ref.ObjectRef objectRef = this.c;
        Function2 function2 = this.b;
        switch (i3) {
            case 0:
                if (continuation instanceof hd8) {
                    hd8Var = (hd8) continuation;
                    int i4 = hd8Var.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        hd8Var.l = i4 - Integer.MIN_VALUE;
                        obj2 = hd8Var.k;
                        u85 u85Var = u85.COROUTINE_SUSPENDED;
                        i = hd8Var.l;
                        if (i == 0) {
                            if (i == 1) {
                                obj = hd8Var.n;
                                ResultKt.a(obj2);
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            ResultKt.a(obj2);
                            hd8Var.n = obj;
                            hd8Var.l = 1;
                            obj2 = function2.invoke(obj, hd8Var);
                            if (obj2 == u85Var) {
                                return u85Var;
                            }
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        objectRef.a = obj;
                        throw new i0(this);
                    }
                }
                hd8Var = new hd8(this, continuation);
                obj2 = hd8Var.k;
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                i = hd8Var.l;
                if (i == 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            default:
                if (continuation instanceof ld8) {
                    ld8Var = (ld8) continuation;
                    int i5 = ld8Var.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ld8Var.l = i5 - Integer.MIN_VALUE;
                        obj3 = ld8Var.k;
                        u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                        i2 = ld8Var.l;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                obj = ld8Var.n;
                                ResultKt.a(obj3);
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            ResultKt.a(obj3);
                            ld8Var.n = obj;
                            ld8Var.l = 1;
                            obj3 = function2.invoke(obj, ld8Var);
                            if (obj3 == u85Var3) {
                                return u85Var3;
                            }
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        objectRef.a = obj;
                        throw new i0(this);
                    }
                }
                ld8Var = new ld8(this, continuation);
                obj3 = ld8Var.k;
                u85 u85Var32 = u85.COROUTINE_SUSPENDED;
                i2 = ld8Var.l;
                if (i2 == 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
        }
    }
}
