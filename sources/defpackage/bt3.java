package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class bt3 extends zei implements Function2 {
    public final /* synthetic */ Context k;
    public final /* synthetic */ Bitmap l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt3(Context context, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.k = context;
        this.l = bitmap;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new bt3(this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bt3) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        Bitmap bitmap = this.l;
        int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
        if (max > 2048) {
            float f = 2048.0f / max;
            bitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, i5c.e(bitmap.getWidth() * f)), Math.max(1, i5c.e(bitmap.getHeight() * f)), true);
            bitmap.getClass();
        }
        return ct3.a(this.k, bitmap);
    }
}
