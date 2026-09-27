package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class phc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ phc(String str, Function0 function0, int i) {
        this.a = i;
        this.b = str;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function0 function0 = this.c;
        String str = this.b;
        pug pugVar = (pug) obj;
        switch (i) {
            case 0:
                mug.s(pugVar, 1.0f);
                mug.g(str, pugVar);
                mug.c(pugVar, new xi8(function0, 18));
                return Unit.INSTANCE;
            default:
                mug.g(str, pugVar);
                mug.c(pugVar, new xi8(function0, 17));
                return Unit.INSTANCE;
        }
    }
}
