package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/MatchResult$Destructured;", "p0", "Lcom/fingerprintjs/android/fpjs_pro_internal/f1;", "a", "(Lkotlin/text/MatchResult$Destructured;)Lcom/fingerprintjs/android/fpjs_pro_internal/f1;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class g1 extends Lambda implements Function1<MatchResult.Destructured, f1> {
    public static final g1 h = new Lambda(1);

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.g1, kotlin.jvm.internal.Lambda] */
    static {
        if (37 % 2 == 0) {
            int i = 12 / 0;
        }
    }

    public g1() {
        super(1);
    }

    public final f1 a(MatchResult.Destructured destructured) {
        Object m882constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(new f1(destructured.getMatch().getGroupValues().get(1), destructured.getMatch().getGroupValues().get(2)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        return (f1) component9.D8871(bf.D8871(m882constructorimpl), null);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ f1 invoke(MatchResult.Destructured destructured) {
        return a(destructured);
    }
}
