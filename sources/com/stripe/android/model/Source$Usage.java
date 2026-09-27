package com.stripe.android.model;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.jeh;
import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0005j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/stripe/android/model/Source$Usage", "", "Lcom/stripe/android/model/Source$Usage;", "", "toString", "()Ljava/lang/String;", ApiConstant.KEY_CODE, "Ljava/lang/String;", "a", "Companion", "jeh", "Reusable", "SingleUse", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Source$Usage {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ Source$Usage[] $VALUES;
    public static final jeh Companion;
    public static final Source$Usage Reusable;
    public static final Source$Usage SingleUse;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jeh] */
    static {
        Source$Usage source$Usage = new Source$Usage("Reusable", 0, "reusable");
        Reusable = source$Usage;
        Source$Usage source$Usage2 = new Source$Usage("SingleUse", 1, "single_use");
        SingleUse = source$Usage2;
        Source$Usage[] source$UsageArr = {source$Usage, source$Usage2};
        $VALUES = source$UsageArr;
        $ENTRIES = new wg7(source$UsageArr);
        Companion = new Object();
    }

    public Source$Usage(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static Source$Usage valueOf(String str) {
        return (Source$Usage) Enum.valueOf(Source$Usage.class, str);
    }

    public static Source$Usage[] values() {
        return (Source$Usage[]) $VALUES.clone();
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
