package defpackage;

import com.polymarket.data.APIEventTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j22 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ APIEventTag c;

    public /* synthetic */ j22(Function1 function1, APIEventTag aPIEventTag, int i) {
        this.a = i;
        this.b = function1;
        this.c = aPIEventTag;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        APIEventTag aPIEventTag = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(aPIEventTag);
                return Unit.INSTANCE;
            default:
                function1.invoke(aPIEventTag.getSlug());
                return Unit.INSTANCE;
        }
    }
}
