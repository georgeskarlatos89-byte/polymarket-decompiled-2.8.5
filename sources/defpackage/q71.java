package defpackage;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class q71 implements Flow {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q71(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0179  */
    /* JADX WARN: Type inference failed for: r9v42, types: [kotlin.jvm.internal.Ref$a, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0152 -> B:65:0x0156). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(eb8 eb8Var, Continuation continuation) {
        xb8 xb8Var;
        int i;
        Iterator it;
        int i2;
        yb8 yb8Var;
        int i3;
        int length;
        eb8 eb8Var2;
        int i4;
        tvh tvhVar;
        int i5;
        int i6 = this.a;
        int i7 = 0;
        Object obj = this.b;
        switch (i6) {
            case 0:
                Object collect = ((o71) obj).collect(new rg(eb8Var, 8), continuation);
                if (collect != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect;
            case 1:
                Object collect2 = ((o71) obj).collect(new rg(eb8Var, 9), continuation);
                if (collect2 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect2;
            case 2:
                Object collect3 = ((sg) obj).collect(new rg(eb8Var, 13), continuation);
                if (collect3 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect3;
            case 3:
                Object collect4 = ((pc8) obj).collect(new rg(eb8Var, 16), continuation);
                if (collect4 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect4;
            case 4:
                Object collect5 = ((aw4) obj).collect(new rg(eb8Var, 18), continuation);
                if (collect5 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect5;
            case 5:
                sc6 sc6Var = new sc6((Function3) obj, eb8Var, (Continuation) null, 15);
                gjg gjgVar = new gjg(continuation, continuation.getContext());
                Object h = izm.h(gjgVar, true, gjgVar, sc6Var);
                if (h != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return h;
            case 6:
                if (continuation instanceof xb8) {
                    xb8Var = (xb8) continuation;
                    int i8 = xb8Var.l;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        xb8Var.l = i8 - Integer.MIN_VALUE;
                        Object obj2 = xb8Var.k;
                        u85 u85Var = u85.COROUTINE_SUSPENDED;
                        i = xb8Var.l;
                        if (i == 0) {
                            if (i == 1) {
                                int i9 = xb8Var.q;
                                i7 = xb8Var.p;
                                it = xb8Var.o;
                                eb8 eb8Var3 = xb8Var.n;
                                ResultKt.a(obj2);
                                i2 = i9;
                                eb8Var = eb8Var3;
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            ResultKt.a(obj2);
                            it = ((Iterable) obj).iterator();
                            i2 = 0;
                        }
                        while (it.hasNext()) {
                            Object next = it.next();
                            xb8Var.n = eb8Var;
                            xb8Var.o = it;
                            xb8Var.p = i7;
                            xb8Var.q = i2;
                            xb8Var.l = 1;
                            if (eb8Var.emit(next, xb8Var) == u85Var) {
                                return u85Var;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                xb8Var = new xb8(this, continuation);
                Object obj22 = xb8Var.k;
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                i = xb8Var.l;
                if (i == 0) {
                }
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            case 7:
                Object[] objArr = (Object[]) obj;
                if (continuation instanceof yb8) {
                    yb8Var = (yb8) continuation;
                    int i10 = yb8Var.l;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        yb8Var.l = i10 - Integer.MIN_VALUE;
                        Object obj3 = yb8Var.k;
                        u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                        i3 = yb8Var.l;
                        if (i3 == 0) {
                            if (i3 == 1) {
                                length = yb8Var.q;
                                i7 = yb8Var.p;
                                i4 = yb8Var.o;
                                eb8 eb8Var4 = yb8Var.n;
                                ResultKt.a(obj3);
                                eb8Var2 = eb8Var4;
                                i7++;
                                if (i7 < length) {
                                    Object obj4 = objArr[i7];
                                    yb8Var.n = eb8Var2;
                                    yb8Var.o = i4;
                                    yb8Var.p = i7;
                                    yb8Var.q = length;
                                    yb8Var.l = 1;
                                    if (eb8Var2.emit(obj4, yb8Var) == u85Var3) {
                                        return u85Var3;
                                    }
                                    i7++;
                                    if (i7 < length) {
                                        return Unit.INSTANCE;
                                    }
                                }
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            ResultKt.a(obj3);
                            length = objArr.length;
                            eb8Var2 = eb8Var;
                            i4 = 0;
                            if (i7 < length) {
                            }
                        }
                    }
                }
                yb8Var = new yb8(this, continuation);
                Object obj32 = yb8Var.k;
                u85 u85Var32 = u85.COROUTINE_SUSPENDED;
                i3 = yb8Var.l;
                if (i3 == 0) {
                }
            case 8:
                Object emit = eb8Var.emit(obj, continuation);
                if (emit != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return emit;
            case 9:
                Object collect6 = ((q71) obj).collect(new rg(eb8Var, 25), continuation);
                if (collect6 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect6;
            case 10:
                Object collect7 = ((e62) obj).collect(new rg(eb8Var, 27), continuation);
                if (collect7 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect7;
            case 11:
                Object collect8 = ((tm6) obj).collect(new rg(eb8Var, 29), continuation);
                if (collect8 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect8;
            case 12:
                if (continuation instanceof tvh) {
                    tvhVar = (tvh) continuation;
                    int i11 = tvhVar.l;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        tvhVar.l = i11 - Integer.MIN_VALUE;
                        Object obj5 = tvhVar.k;
                        u85 u85Var4 = u85.COROUTINE_SUSPENDED;
                        i5 = tvhVar.l;
                        if (i5 == 0) {
                            if (i5 != 1) {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ResultKt.a(obj5);
                        } else {
                            ResultKt.a(obj5);
                            vvh vvhVar = new vvh(new Object(), eb8Var);
                            tvhVar.l = 1;
                            if (k3h.m((cbi) obj, vvhVar, tvhVar) == u85Var4) {
                                return u85Var4;
                            }
                        }
                        f05.c();
                        return null;
                    }
                }
                tvhVar = new tvh(this, continuation);
                Object obj52 = tvhVar.k;
                u85 u85Var42 = u85.COROUTINE_SUSPENDED;
                i5 = tvhVar.l;
                if (i5 == 0) {
                }
                f05.c();
                return null;
            case 13:
                Object collect9 = ((zt) obj).collect(new x3e(eb8Var, 5), continuation);
                if (collect9 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect9;
            case 14:
                Object collect10 = ((e62) obj).collect(new x3e(eb8Var, 6), continuation);
                if (collect10 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect10;
            case 15:
                Object collect11 = ((sg) obj).collect(new x3e(eb8Var, 8), continuation);
                if (collect11 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect11;
            case 16:
                Object collect12 = ((sg) obj).collect(new x3e(eb8Var, 10), continuation);
                if (collect12 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect12;
            default:
                Object collect13 = ((swh) obj).collect(new x3e(eb8Var, 11), continuation);
                if (collect13 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect13;
        }
    }
}
