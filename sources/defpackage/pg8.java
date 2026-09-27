package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pg8 implements ng8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ pg8[] $VALUES;
    public static final pg8 Active;
    public static final pg8 ActiveParent;
    public static final pg8 Captured;
    public static final pg8 Inactive;

    /* JADX WARN: Type inference failed for: r0v0, types: [pg8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [pg8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [pg8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [pg8, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Active", 0);
        Active = r0;
        ?? r1 = new Enum("ActiveParent", 1);
        ActiveParent = r1;
        ?? r2 = new Enum("Captured", 2);
        Captured = r2;
        ?? r3 = new Enum("Inactive", 3);
        Inactive = r3;
        pg8[] pg8VarArr = {r0, r1, r2, r3};
        $VALUES = pg8VarArr;
        $ENTRIES = new wg7(pg8VarArr);
    }

    public static pg8 valueOf(String str) {
        return (pg8) Enum.valueOf(pg8.class, str);
    }

    public static pg8[] values() {
        return (pg8[]) $VALUES.clone();
    }

    public final boolean a() {
        int i = og8.a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        dmk.a();
        return false;
    }

    public final boolean b() {
        int i = og8.a[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            dmk.a();
            return false;
        }
        return false;
    }
}
