package defpackage;

import android.os.Looper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pb8 implements eb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g7f b;

    public /* synthetic */ pb8(g7f g7fVar, int i) {
        this.a = i;
        this.b = g7fVar;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.setValue(obj);
                return Unit.INSTANCE;
            case 1:
                this.b.setValue(obj);
                return Unit.INSTANCE;
            case 2:
                this.b.setValue(obj);
                return Unit.INSTANCE;
            case 3:
                this.b.setValue(obj);
                return Unit.INSTANCE;
            case 4:
                Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper());
                this.b.setValue(obj);
                return Unit.INSTANCE;
            default:
                this.b.setValue(obj);
                return Unit.INSTANCE;
        }
    }
}
