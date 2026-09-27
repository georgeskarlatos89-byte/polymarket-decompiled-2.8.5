package defpackage;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.net.Uri;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ap3 extends zei implements Function2 {
    public final /* synthetic */ int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Context m;
    public final /* synthetic */ Uri n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ap3(Context context, Uri uri, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.m = context;
        this.n = uri;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.k;
        Uri uri = this.n;
        Context context = this.m;
        switch (i) {
            case 0:
                ap3 ap3Var = new ap3(context, uri, continuation, 0);
                ap3Var.l = obj;
                return ap3Var;
            case 1:
                ap3 ap3Var2 = new ap3(context, uri, continuation, 1);
                ap3Var2.l = obj;
                return ap3Var2;
            default:
                ap3 ap3Var3 = new ap3(context, uri, continuation, 2);
                ap3Var3.l = obj;
                return ap3Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t85 t85Var = (t85) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.k) {
            case 0:
                return ((ap3) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((ap3) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((ap3) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        Object m882constructorimpl;
        Object m882constructorimpl2;
        Object m882constructorimpl3;
        int i = this.k;
        Uri uri = this.n;
        Context context = this.m;
        switch (i) {
            case 0:
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m882constructorimpl = Result.m882constructorimpl(new Integer(context.getContentResolver().delete(uri, null, null)));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
                }
                return new Result(m882constructorimpl);
            case 1:
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    ImageDecoder.Source createSource = ImageDecoder.createSource(context.getContentResolver(), uri);
                    createSource.getClass();
                    m882constructorimpl2 = Result.m882constructorimpl(ImageDecoder.decodeBitmap(createSource, new zs3(1)));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m882constructorimpl2 = Result.m882constructorimpl(ResultKt.createFailure(th2));
                }
                if (m882constructorimpl2 instanceof r5g) {
                    return null;
                }
                return m882constructorimpl2;
            default:
                u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    ImageDecoder.Source createSource2 = ImageDecoder.createSource(context.getContentResolver(), uri);
                    createSource2.getClass();
                    m882constructorimpl3 = Result.m882constructorimpl(ImageDecoder.decodeBitmap(createSource2, new zs3(2)));
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.INSTANCE;
                    m882constructorimpl3 = Result.m882constructorimpl(ResultKt.createFailure(th3));
                }
                if (m882constructorimpl3 instanceof r5g) {
                    return null;
                }
                return m882constructorimpl3;
        }
    }
}
