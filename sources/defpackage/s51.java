package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class s51 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ s51[] $VALUES;
    public static final s51 ACCENT;
    public static final s51 COMBO;
    public static final s51 WHALE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, s51] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, s51] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, s51] */
    static {
        ?? r0 = new Enum("ACCENT", 0);
        ACCENT = r0;
        ?? r1 = new Enum("WHALE", 1);
        WHALE = r1;
        ?? r2 = new Enum("COMBO", 2);
        COMBO = r2;
        s51[] s51VarArr = {r0, r1, r2};
        $VALUES = s51VarArr;
        $ENTRIES = new wg7(s51VarArr);
    }

    public static s51 valueOf(String str) {
        return (s51) Enum.valueOf(s51.class, str);
    }

    public static s51[] values() {
        return (s51[]) $VALUES.clone();
    }
}
