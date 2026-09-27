package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class k1f implements Function1 {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ k1f(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        w6h w6hVar = (w6h) obj;
        switch (i) {
            case 0:
                w6hVar.getClass();
                w6hVar.c(str, l1f.b);
                return Unit.INSTANCE;
            case 1:
                w6hVar.getClass();
                aca acaVar = l1f.b;
                w6hVar.c(str, acaVar, acaVar);
                v6g v6gVar = v6g.MustUse;
                return Unit.INSTANCE;
            case 2:
                w6hVar.getClass();
                aca acaVar2 = l1f.b;
                w6hVar.a(str, acaVar2, acaVar2);
                return Unit.INSTANCE;
            case 3:
                w6hVar.getClass();
                w6hVar.a(str, l1f.b);
                return Unit.INSTANCE;
            case 4:
                w6hVar.getClass();
                w6hVar.a(str, l1f.b);
                return Unit.INSTANCE;
            case 5:
                w6hVar.getClass();
                w6hVar.c(str, l1f.b);
                return Unit.INSTANCE;
            default:
                w6hVar.getClass();
                w6hVar.c(str, l1f.b);
                return Unit.INSTANCE;
        }
    }
}
