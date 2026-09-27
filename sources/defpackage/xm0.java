package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xm0 implements nwh {
    public final List a;
    public final vij b;
    public final Function1 c;
    public final kvd d;
    public boolean e = true;

    public xm0(List list, Object obj, vij vijVar, ysk yskVar, Function1 function1, q20 q20Var) {
        this.a = list;
        this.b = vijVar;
        this.c = function1;
        this.d = ikl.c(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0034, B:16:0x00a1, B:23:0x004c, B:25:0x0051, B:28:0x0079, B:33:0x0094), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a1 -> B:14:0x00aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q55 q55Var) {
        wm0 wm0Var;
        int i;
        Function1 function1;
        kvd kvdVar;
        int size;
        List list;
        int i2;
        try {
            if (q55Var instanceof wm0) {
                wm0Var = (wm0) q55Var;
                int i3 = wm0Var.q;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    wm0Var.q = i3 - Integer.MIN_VALUE;
                    Object obj = wm0Var.o;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = wm0Var.q;
                    function1 = this.c;
                    kvdVar = this.d;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                size = wm0Var.n;
                                i2 = wm0Var.m;
                                list = wm0Var.k;
                                ResultKt.a(obj);
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            int i4 = wm0Var.n;
                            int i5 = wm0Var.m;
                            u3g u3gVar = wm0Var.l;
                            List list2 = wm0Var.k;
                            ResultKt.a(obj);
                            if (obj != null) {
                                vij vijVar = this.b;
                                kvdVar.setValue(apl.d(vijVar.d, obj, u3gVar, vijVar.b, vijVar.c));
                                return Unit.INSTANCE;
                            }
                            wm0Var.k = list2;
                            wm0Var.l = null;
                            wm0Var.m = i5;
                            wm0Var.n = i4;
                            wm0Var.q = 2;
                            if (x7n.d(wm0Var) == u85Var) {
                                return u85Var;
                            }
                            size = i4;
                            i2 = i5;
                            list = list2;
                        }
                        i2++;
                        if (i2 < size) {
                            ((u3g) list.get(i2)).getClass();
                            i2++;
                            if (i2 < size) {
                                boolean k = xym.k(wm0Var.getContext());
                                this.e = false;
                                function1.invoke(new xij(kvdVar.getValue(), k));
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        ResultKt.a(obj);
                        List list3 = this.a;
                        size = list3.size();
                        list = list3;
                        i2 = 0;
                        if (i2 < size) {
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } finally {
            boolean k2 = xym.k(wm0Var.getContext());
            this.e = false;
            function1.invoke(new xij(kvdVar.getValue(), k2));
        }
        wm0Var = new wm0(this, q55Var);
        Object obj2 = wm0Var.o;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = wm0Var.q;
        function1 = this.c;
        kvdVar = this.d;
    }

    @Override // defpackage.nwh
    public final Object getValue() {
        return this.d.getValue();
    }
}
