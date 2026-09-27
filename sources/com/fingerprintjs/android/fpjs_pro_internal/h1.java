package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/MatchResult;", "p0", "Lkotlin/text/MatchResult$Destructured;", "a", "(Lkotlin/text/MatchResult;)Lkotlin/text/MatchResult$Destructured;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class h1 extends Lambda implements Function1<MatchResult, MatchResult.Destructured> {
    public static final h1 h = new Lambda(1);
    public static int i = 0;
    public static int j = 1;

    public h1() {
        super(1);
    }

    public final MatchResult.Destructured a(MatchResult matchResult) {
        int i2 = i;
        int i3 = ((i2 | 31) << 1) - (i2 ^ 31);
        j = i3 % 128;
        if (i3 % 2 != 0) {
            MatchResult.Destructured destructured = matchResult.getDestructured();
            int i4 = i;
            int i5 = ((i4 | 99) << 1) - (i4 ^ 99);
            j = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 47 / 0;
            }
            return destructured;
        }
        matchResult.getDestructured();
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ MatchResult.Destructured invoke(MatchResult matchResult) {
        int i2 = j;
        i = ((i2 & 13) + (i2 | 13)) % 128;
        MatchResult.Destructured a = a(matchResult);
        int i3 = j + 71;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            return a;
        }
        throw null;
    }
}
