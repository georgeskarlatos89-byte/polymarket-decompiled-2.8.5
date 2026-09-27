package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yf7 extends Lambda implements Function1 {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf7(boolean z, Function0 function0) {
        super(1);
        this.h = z;
        this.i = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        d7g d7gVar = (d7g) obj;
        if (!this.h && ((Boolean) this.i.invoke()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        d7gVar.f(z);
        return Unit.INSTANCE;
    }
}
