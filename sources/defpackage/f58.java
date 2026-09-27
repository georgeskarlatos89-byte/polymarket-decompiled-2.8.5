package defpackage;

import com.fingerprintjs.android.fpjs_pro.Error;
import com.fingerprintjs.android.fpjs_pro.FingerprintJSProResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f58 extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ rcg i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f58(rcg rcgVar, int i) {
        super(1);
        this.h = i;
        this.i = rcgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.h;
        rcg rcgVar = this.i;
        switch (i) {
            case 0:
                FingerprintJSProResponse fingerprintJSProResponse = (FingerprintJSProResponse) obj;
                fingerprintJSProResponse.getClass();
                Result.Companion companion = Result.INSTANCE;
                rcgVar.resumeWith(Result.m882constructorimpl(new d58(fingerprintJSProResponse.a)));
                return Unit.INSTANCE;
            default:
                Error error = (Error) obj;
                error.getClass();
                String str = error.b;
                if (str == null) {
                    str = "Unknown error";
                }
                rcgVar.resumeWith(Result.m882constructorimpl(new c58(str)));
                return Unit.INSTANCE;
        }
    }
}
