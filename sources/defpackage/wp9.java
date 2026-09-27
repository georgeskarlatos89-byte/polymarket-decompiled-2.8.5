package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wp9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wp9[] $VALUES;
    public static final wp9 GRAPHIC;
    public static final wp9 TOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [wp9, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [wp9, java.lang.Enum] */
    static {
        ?? r0 = new Enum("GRAPHIC", 0);
        GRAPHIC = r0;
        ?? r1 = new Enum("TOP", 1);
        TOP = r1;
        wp9[] wp9VarArr = {r0, r1};
        $VALUES = wp9VarArr;
        $ENTRIES = new wg7(wp9VarArr);
    }

    public static wp9 valueOf(String str) {
        return (wp9) Enum.valueOf(wp9.class, str);
    }

    public static wp9[] values() {
        return (wp9[]) $VALUES.clone();
    }
}
