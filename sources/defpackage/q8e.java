package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class q8e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ q8e[] $VALUES;
    public static final q8e Automatic;
    public static final q8e MerchantSpecified;
    private final String paramValue;

    static {
        q8e q8eVar = new q8e("Automatic", 0, MetricTracker.CarouselSource.AUTOMATIC);
        Automatic = q8eVar;
        q8e q8eVar2 = new q8e("MerchantSpecified", 1, "merchant_specified");
        MerchantSpecified = q8eVar2;
        q8e[] q8eVarArr = {q8eVar, q8eVar2};
        $VALUES = q8eVarArr;
        $ENTRIES = new wg7(q8eVarArr);
    }

    public q8e(String str, int i, String str2) {
        this.paramValue = str2;
    }

    public static q8e valueOf(String str) {
        return (q8e) Enum.valueOf(q8e.class, str);
    }

    public static q8e[] values() {
        return (q8e[]) $VALUES.clone();
    }

    public final String a() {
        return this.paramValue;
    }
}
