package defpackage;

import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class auh {
    public static final /* synthetic */ int a = 0;

    static {
        Object m882constructorimpl;
        Object m882constructorimpl2;
        jsn.a(ask.class.getSimpleName(), new Exception());
        try {
            Result.Companion companion = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(l81.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m883exceptionOrNullimpl(m882constructorimpl) != null) {
            m882constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            m882constructorimpl2 = Result.m882constructorimpl(auh.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m882constructorimpl2 = Result.m882constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m883exceptionOrNullimpl(m882constructorimpl2) != null) {
            m882constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
