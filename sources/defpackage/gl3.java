package defpackage;

import io.getstream.chat.android.models.EventType;
import java.util.Date;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class gl3 extends zei implements Function2 {
    public final /* synthetic */ int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ Map o;
    public final /* synthetic */ Date p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gl3(String str, String str2, Map map, Date date, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.m = str;
        this.n = str2;
        this.o = map;
        this.p = date;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.k) {
            case 0:
                gl3 gl3Var = new gl3(this.m, this.n, this.o, this.p, continuation, 0);
                gl3Var.l = obj;
                return gl3Var;
            default:
                gl3 gl3Var2 = new gl3(this.m, this.n, this.o, this.p, continuation, 1);
                gl3Var2.l = obj;
                return gl3Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        xre xreVar = (xre) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.k) {
            case 0:
                return ((gl3) create(xreVar, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((gl3) create(xreVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        switch (this.k) {
            case 0:
                xre xreVar = (xre) this.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return xreVar.p(EventType.TYPING_START, this.m, this.n, this.o, this.p);
            default:
                xre xreVar2 = (xre) this.l;
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return xreVar2.p(EventType.TYPING_STOP, this.m, this.n, this.o, this.p);
        }
    }
}
