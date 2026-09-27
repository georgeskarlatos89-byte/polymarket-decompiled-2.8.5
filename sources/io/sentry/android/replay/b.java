package io.sentry.android.replay;

import defpackage.r2i;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b extends Lambda implements Function1 {
    public static final b i = new b(1, 0);
    public static final b j = new b(1, 1);
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                String upperCase = String.valueOf(r2i.F(matchResult.getValue())).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                return upperCase;
            default:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
        }
    }
}
