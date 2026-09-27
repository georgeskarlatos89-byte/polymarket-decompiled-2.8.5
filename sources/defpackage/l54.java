package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l54 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ l54[] $VALUES;
    public static final l54 NONE;
    public static final l54 URI;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l54] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l54] */
    static {
        ?? r0 = new Enum("URI", 0);
        URI = r0;
        ?? r1 = new Enum("NONE", 1);
        NONE = r1;
        l54[] l54VarArr = {r0, r1};
        $VALUES = l54VarArr;
        $ENTRIES = new wg7(l54VarArr);
    }

    public static l54 valueOf(String str) {
        return (l54) Enum.valueOf(l54.class, str);
    }

    public static l54[] values() {
        return (l54[]) $VALUES.clone();
    }
}
