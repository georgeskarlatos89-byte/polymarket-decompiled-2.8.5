package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ndi {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ndi[] $VALUES;
    public static final ndi CAPTURE_SESSION_TABLES;
    public static final ndi FEATURE_COMBINATION_TABLE;

    /* JADX WARN: Type inference failed for: r0v0, types: [ndi, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ndi, java.lang.Enum] */
    static {
        ?? r0 = new Enum("FEATURE_COMBINATION_TABLE", 0);
        FEATURE_COMBINATION_TABLE = r0;
        ?? r1 = new Enum("CAPTURE_SESSION_TABLES", 1);
        CAPTURE_SESSION_TABLES = r1;
        ndi[] ndiVarArr = {r0, r1};
        $VALUES = ndiVarArr;
        $ENTRIES = new wg7(ndiVarArr);
    }

    public static ndi valueOf(String str) {
        return (ndi) Enum.valueOf(ndi.class, str);
    }

    public static ndi[] values() {
        return (ndi[]) $VALUES.clone();
    }
}
