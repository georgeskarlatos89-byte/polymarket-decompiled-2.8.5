package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class nl3 extends zei implements Function1 {
    public Integer k;
    public Map l;
    public Iterator m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public final /* synthetic */ xl3 r;
    public final /* synthetic */ Integer s;
    public final /* synthetic */ Map t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl3(xl3 xl3Var, Integer num, Map map, boolean z, boolean z2, Continuation continuation) {
        super(1, continuation);
        this.r = xl3Var;
        this.s = num;
        this.t = map;
        this.u = z;
        this.v = z2;
    }

    @Override // defpackage.l81
    public final Continuation create(Continuation continuation) {
        return new nl3(this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((nl3) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0066 -> B:5:0x0069). Please report as a decompilation issue!!! */
    @Override // defpackage.l81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Integer num;
        Map map;
        boolean z;
        boolean z2;
        int i;
        Iterator it;
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        int i2 = this.q;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.p;
                boolean z3 = this.o;
                boolean z4 = this.n;
                it = this.m;
                Map map2 = this.l;
                Integer num2 = this.k;
                ResultKt.a(obj);
                nl3 nl3Var = this;
                z2 = z3;
                z = z4;
                map = map2;
                num = num2;
                this = nl3Var;
                if (it.hasNext()) {
                    xre xreVar = (xre) it.next();
                    this.k = num;
                    this.l = map;
                    this.m = it;
                    this.n = z;
                    this.o = z2;
                    this.p = i;
                    this.q = 1;
                    nl3Var = this;
                    if (xreVar.d(num, map, z, z2, nl3Var) == u85Var) {
                        return u85Var;
                    }
                    this = nl3Var;
                    if (it.hasNext()) {
                        return Unit.INSTANCE;
                    }
                }
            } else {
                dmk.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            ResultKt.a(obj);
            List list = this.r.G;
            Integer num3 = this.s;
            Map map3 = this.t;
            num = num3;
            map = map3;
            z = this.u;
            z2 = this.v;
            i = 0;
            it = list.iterator();
            if (it.hasNext()) {
            }
        }
    }
}
