package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g8e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ g8e[] $VALUES;
    public static final g8e Horizontal;
    public static final g8e Vertical;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g8e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g8e] */
    static {
        ?? r0 = new Enum("Horizontal", 0);
        Horizontal = r0;
        ?? r1 = new Enum("Vertical", 1);
        Vertical = r1;
        g8e[] g8eVarArr = {r0, r1};
        $VALUES = g8eVarArr;
        $ENTRIES = new wg7(g8eVarArr);
    }

    public static g8e valueOf(String str) {
        return (g8e) Enum.valueOf(g8e.class, str);
    }

    public static g8e[] values() {
        return (g8e[]) $VALUES.clone();
    }
}
