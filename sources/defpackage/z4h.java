package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z4h {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ z4h[] $VALUES;
    public static final z4h Expanded;
    public static final z4h Hidden;
    public static final z4h PartiallyExpanded;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z4h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z4h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, z4h] */
    static {
        ?? r0 = new Enum("Hidden", 0);
        Hidden = r0;
        ?? r1 = new Enum("Expanded", 1);
        Expanded = r1;
        ?? r2 = new Enum("PartiallyExpanded", 2);
        PartiallyExpanded = r2;
        z4h[] z4hVarArr = {r0, r1, r2};
        $VALUES = z4hVarArr;
        $ENTRIES = new wg7(z4hVarArr);
    }

    public static z4h valueOf(String str) {
        return (z4h) Enum.valueOf(z4h.class, str);
    }

    public static z4h[] values() {
        return (z4h[]) $VALUES.clone();
    }
}
