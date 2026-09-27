package defpackage;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class use extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ vse i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ use(vse vseVar, int i) {
        super(1);
        this.h = i;
        this.i = vseVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.h;
        vse vseVar = this.i;
        switch (i) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                d70 d70Var = vseVar.a;
                if (d70Var != null) {
                    d70Var.invoke(motionEvent);
                    return Unit.INSTANCE;
                }
                Intrinsics.i("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                d70 d70Var2 = vseVar.a;
                if (d70Var2 != null) {
                    d70Var2.invoke(motionEvent2);
                    return Unit.INSTANCE;
                }
                Intrinsics.i("onTouchEvent");
                throw null;
        }
    }
}
