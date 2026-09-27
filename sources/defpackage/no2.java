package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class no2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ no2[] $VALUES;
    public static final no2 Center;
    public static final no2 Leading;
    public static final no2 Trailing;

    /* JADX WARN: Type inference failed for: r0v0, types: [no2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [no2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [no2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Leading", 0);
        Leading = r0;
        ?? r1 = new Enum("Center", 1);
        Center = r1;
        ?? r2 = new Enum("Trailing", 2);
        Trailing = r2;
        no2[] no2VarArr = {r0, r1, r2};
        $VALUES = no2VarArr;
        $ENTRIES = new wg7(no2VarArr);
    }

    public static no2 valueOf(String str) {
        return (no2) Enum.valueOf(no2.class, str);
    }

    public static no2[] values() {
        return (no2[]) $VALUES.clone();
    }
}
