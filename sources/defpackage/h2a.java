package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h2a {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ h2a[] $VALUES;
    public static final h2a CUSTOM;
    public static final g2a Companion;
    public static final h2a DROP_IN;
    private final String stringValue;

    /* JADX WARN: Type inference failed for: r0v2, types: [g2a, java.lang.Object] */
    static {
        h2a h2aVar = new h2a("CUSTOM", 0, "custom");
        CUSTOM = h2aVar;
        h2a h2aVar2 = new h2a("DROP_IN", 1, "dropin");
        DROP_IN = h2aVar2;
        h2a[] h2aVarArr = {h2aVar, h2aVar2};
        $VALUES = h2aVarArr;
        $ENTRIES = new wg7(h2aVarArr);
        Companion = new Object();
    }

    public h2a(String str, int i, String str2) {
        this.stringValue = str2;
    }

    public static h2a valueOf(String str) {
        return (h2a) Enum.valueOf(h2a.class, str);
    }

    public static h2a[] values() {
        return (h2a[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringValue;
    }
}
