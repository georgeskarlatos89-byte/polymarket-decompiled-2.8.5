package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class j1f implements Function1 {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public /* synthetic */ j1f(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        w6h w6hVar = (w6h) obj;
        switch (i) {
            case 0:
                w6hVar.getClass();
                aca acaVar = l1f.b;
                w6hVar.a(str2, acaVar);
                aca acaVar2 = l1f.a;
                w6hVar.a(str, acaVar, acaVar, acaVar2, acaVar2);
                w6hVar.c(str2, acaVar2);
                return Unit.INSTANCE;
            case 1:
                w6hVar.getClass();
                aca acaVar3 = l1f.b;
                w6hVar.a(str2, acaVar3);
                w6hVar.a(str, acaVar3, acaVar3, acaVar3);
                w6hVar.c(str2, acaVar3);
                return Unit.INSTANCE;
            case 2:
                w6hVar.getClass();
                aca acaVar4 = l1f.b;
                w6hVar.a(str2, acaVar4);
                aca acaVar5 = l1f.c;
                aca acaVar6 = l1f.a;
                w6hVar.a(str, acaVar4, acaVar4, acaVar5, acaVar6);
                w6hVar.c(str2, acaVar6);
                return Unit.INSTANCE;
            case 3:
                w6hVar.getClass();
                aca acaVar7 = l1f.b;
                w6hVar.a(str2, acaVar7);
                aca acaVar8 = l1f.c;
                w6hVar.a(str2, acaVar8);
                aca acaVar9 = l1f.a;
                w6hVar.a(str, acaVar7, acaVar8, acaVar8, acaVar9);
                w6hVar.c(str2, acaVar9);
                return Unit.INSTANCE;
            case 4:
                w6hVar.getClass();
                aca acaVar10 = l1f.c;
                w6hVar.a(str2, acaVar10);
                w6hVar.c(str, l1f.b, acaVar10);
                v6g v6gVar = v6g.MustUse;
                return Unit.INSTANCE;
            default:
                w6hVar.getClass();
                w6hVar.a(str2, l1f.a);
                w6hVar.c(str, l1f.b, l1f.c);
                v6g v6gVar2 = v6g.MustUse;
                return Unit.INSTANCE;
        }
    }
}
