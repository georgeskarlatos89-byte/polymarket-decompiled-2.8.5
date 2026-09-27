package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class rde {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ rde[] $VALUES;
    public static final rde Automatic;
    public static final rde AutomaticAsync;
    public static final rde Manual;

    /* JADX WARN: Type inference failed for: r0v0, types: [rde, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rde, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [rde, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Automatic", 0);
        Automatic = r0;
        ?? r1 = new Enum("AutomaticAsync", 1);
        AutomaticAsync = r1;
        ?? r2 = new Enum("Manual", 2);
        Manual = r2;
        rde[] rdeVarArr = {r0, r1, r2};
        $VALUES = rdeVarArr;
        $ENTRIES = new wg7(rdeVarArr);
    }

    public static rde valueOf(String str) {
        return (rde) Enum.valueOf(rde.class, str);
    }

    public static rde[] values() {
        return (rde[]) $VALUES.clone();
    }
}
