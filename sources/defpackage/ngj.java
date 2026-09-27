package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ngj {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ngj[] $VALUES;
    public static final ngj FLEXIBLE_LOWER;
    public static final ngj FLEXIBLE_UPPER;
    public static final ngj INFLEXIBLE;

    /* JADX WARN: Type inference failed for: r0v0, types: [ngj, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ngj, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ngj, java.lang.Enum] */
    static {
        ?? r0 = new Enum("FLEXIBLE_LOWER", 0);
        FLEXIBLE_LOWER = r0;
        ?? r1 = new Enum("FLEXIBLE_UPPER", 1);
        FLEXIBLE_UPPER = r1;
        ?? r2 = new Enum("INFLEXIBLE", 2);
        INFLEXIBLE = r2;
        ngj[] ngjVarArr = {r0, r1, r2};
        $VALUES = ngjVarArr;
        $ENTRIES = new wg7(ngjVarArr);
    }

    public static ngj valueOf(String str) {
        return (ngj) Enum.valueOf(ngj.class, str);
    }

    public static ngj[] values() {
        return (ngj[]) $VALUES.clone();
    }
}
