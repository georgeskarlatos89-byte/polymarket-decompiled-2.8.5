package defpackage;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l90 extends zei implements Function2 {
    public final /* synthetic */ int k;
    public final /* synthetic */ Drawable l;
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ Function0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l90(Drawable drawable, Function0 function0, Function0 function02, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.l = drawable;
        this.m = function0;
        this.n = function02;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.k) {
            case 0:
                return new l90(this.l, this.m, this.n, continuation, 0);
            default:
                return new l90(this.l, this.m, this.n, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t85 t85Var = (t85) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.k) {
            case 0:
                return ((l90) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((l90) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        int i = this.k;
        Function0 function0 = this.n;
        Function0 function02 = this.m;
        Drawable drawable = this.l;
        switch (i) {
            case 0:
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                ((AnimatedImageDrawable) drawable).registerAnimationCallback(new i(function02, function0, 1));
                return Unit.INSTANCE;
            default:
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                ((AnimatedImageDrawable) drawable).registerAnimationCallback(new i(function02, function0, 0));
                return Unit.INSTANCE;
        }
    }
}
