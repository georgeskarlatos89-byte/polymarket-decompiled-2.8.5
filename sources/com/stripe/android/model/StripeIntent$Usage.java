package com.stripe.android.model;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.b8i;
import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0005j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/stripe/android/model/StripeIntent$Usage", "", "Lcom/stripe/android/model/StripeIntent$Usage;", "", "toString", "()Ljava/lang/String;", ApiConstant.KEY_CODE, "Ljava/lang/String;", "a", "Companion", "b8i", "OnSession", "OffSession", "OneTime", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeIntent$Usage {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ StripeIntent$Usage[] $VALUES;
    public static final b8i Companion;
    public static final StripeIntent$Usage OffSession;
    public static final StripeIntent$Usage OnSession;
    public static final StripeIntent$Usage OneTime;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [b8i, java.lang.Object] */
    static {
        StripeIntent$Usage stripeIntent$Usage = new StripeIntent$Usage("OnSession", 0, "on_session");
        OnSession = stripeIntent$Usage;
        StripeIntent$Usage stripeIntent$Usage2 = new StripeIntent$Usage("OffSession", 1, "off_session");
        OffSession = stripeIntent$Usage2;
        StripeIntent$Usage stripeIntent$Usage3 = new StripeIntent$Usage("OneTime", 2, "one_time");
        OneTime = stripeIntent$Usage3;
        StripeIntent$Usage[] stripeIntent$UsageArr = {stripeIntent$Usage, stripeIntent$Usage2, stripeIntent$Usage3};
        $VALUES = stripeIntent$UsageArr;
        $ENTRIES = new wg7(stripeIntent$UsageArr);
        Companion = new Object();
    }

    public StripeIntent$Usage(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static StripeIntent$Usage valueOf(String str) {
        return (StripeIntent$Usage) Enum.valueOf(StripeIntent$Usage.class, str);
    }

    public static StripeIntent$Usage[] values() {
        return (StripeIntent$Usage[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.code;
    }
}
