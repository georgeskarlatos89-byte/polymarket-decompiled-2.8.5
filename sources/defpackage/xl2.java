package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xl2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xl2[] $VALUES;
    public static final xl2 Expanded;
    public static final xl2 Hidden;
    public static final xl2 PartiallyExpanded;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xl2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xl2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xl2] */
    static {
        ?? r0 = new Enum("Hidden", 0);
        Hidden = r0;
        ?? r1 = new Enum("PartiallyExpanded", 1);
        PartiallyExpanded = r1;
        ?? r2 = new Enum("Expanded", 2);
        Expanded = r2;
        xl2[] xl2VarArr = {r0, r1, r2};
        $VALUES = xl2VarArr;
        $ENTRIES = new wg7(xl2VarArr);
    }

    public static xl2 valueOf(String str) {
        return (xl2) Enum.valueOf(xl2.class, str);
    }

    public static xl2[] values() {
        return (xl2[]) $VALUES.clone();
    }
}
