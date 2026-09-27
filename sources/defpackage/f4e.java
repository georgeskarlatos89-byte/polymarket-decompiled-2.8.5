package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class f4e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ f4e[] $VALUES;
    public static final f4e Automatic;
    public static final e4e Companion;
    public static final f4e Manual;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [e4e, java.lang.Object] */
    static {
        f4e f4eVar = new f4e("Automatic", 0, MetricTracker.CarouselSource.AUTOMATIC);
        Automatic = f4eVar;
        f4e f4eVar2 = new f4e("Manual", 1, "manual");
        Manual = f4eVar2;
        f4e[] f4eVarArr = {f4eVar, f4eVar2};
        $VALUES = f4eVarArr;
        $ENTRIES = new wg7(f4eVarArr);
        Companion = new Object();
    }

    public f4e(String str, int i, String str2) {
        this.code = str2;
    }

    public static final /* synthetic */ String a(f4e f4eVar) {
        return f4eVar.code;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static f4e valueOf(String str) {
        return (f4e) Enum.valueOf(f4e.class, str);
    }

    public static f4e[] values() {
        return (f4e[]) $VALUES.clone();
    }
}
