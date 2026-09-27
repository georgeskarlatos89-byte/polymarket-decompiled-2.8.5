package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m9k extends Lambda implements Function0 {
    public final /* synthetic */ Ref.ObjectRef h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9k(Ref.ObjectRef objectRef) {
        super(0);
        this.h = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((Function0) this.h.a).invoke();
        return Unit.INSTANCE;
    }
}
