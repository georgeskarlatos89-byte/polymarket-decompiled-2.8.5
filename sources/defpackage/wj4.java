package defpackage;

import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class wj4 {
    public static final Object a(Object obj) {
        if (obj instanceof uj4) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m882constructorimpl(ResultKt.createFailure(((uj4) obj).a));
        }
        return Result.m882constructorimpl(obj);
    }
}
