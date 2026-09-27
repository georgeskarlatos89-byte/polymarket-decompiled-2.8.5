package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class oic {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ oic[] $VALUES;
    public static final oic Expanded;
    public static final oic HalfExpanded;
    public static final oic Hidden;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, oic] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, oic] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, oic] */
    static {
        ?? r0 = new Enum("Hidden", 0);
        Hidden = r0;
        ?? r1 = new Enum("Expanded", 1);
        Expanded = r1;
        ?? r2 = new Enum("HalfExpanded", 2);
        HalfExpanded = r2;
        oic[] oicVarArr = {r0, r1, r2};
        $VALUES = oicVarArr;
        $ENTRIES = new wg7(oicVarArr);
    }

    public static oic valueOf(String str) {
        return (oic) Enum.valueOf(oic.class, str);
    }

    public static oic[] values() {
        return (oic[]) $VALUES.clone();
    }
}
