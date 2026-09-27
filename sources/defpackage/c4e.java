package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c4e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ c4e[] $VALUES;
    public static final c4e Automatic;
    public static final c4e AutomaticAsync;
    public static final b4e Companion;
    public static final c4e Manual;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [b4e, java.lang.Object] */
    static {
        c4e c4eVar = new c4e("Automatic", 0, MetricTracker.CarouselSource.AUTOMATIC);
        Automatic = c4eVar;
        c4e c4eVar2 = new c4e("AutomaticAsync", 1, "automatic_async");
        AutomaticAsync = c4eVar2;
        c4e c4eVar3 = new c4e("Manual", 2, "manual");
        Manual = c4eVar3;
        c4e[] c4eVarArr = {c4eVar, c4eVar2, c4eVar3};
        $VALUES = c4eVarArr;
        $ENTRIES = new wg7(c4eVarArr);
        Companion = new Object();
    }

    public c4e(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static c4e valueOf(String str) {
        return (c4e) Enum.valueOf(c4e.class, str);
    }

    public static c4e[] values() {
        return (c4e[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
