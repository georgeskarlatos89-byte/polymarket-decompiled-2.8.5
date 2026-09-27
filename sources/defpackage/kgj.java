package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class kgj {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kgj[] $VALUES;
    public static final kgj CHECK_ONLY_LOWER;
    public static final kgj CHECK_SUBTYPE_AND_LOWER;
    public static final kgj SKIP_LOWER;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kgj] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kgj] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kgj] */
    static {
        ?? r0 = new Enum("CHECK_ONLY_LOWER", 0);
        CHECK_ONLY_LOWER = r0;
        ?? r1 = new Enum("CHECK_SUBTYPE_AND_LOWER", 1);
        CHECK_SUBTYPE_AND_LOWER = r1;
        ?? r2 = new Enum("SKIP_LOWER", 2);
        SKIP_LOWER = r2;
        kgj[] kgjVarArr = {r0, r1, r2};
        $VALUES = kgjVarArr;
        $ENTRIES = new wg7(kgjVarArr);
    }

    public static kgj valueOf(String str) {
        return (kgj) Enum.valueOf(kgj.class, str);
    }

    public static kgj[] values() {
        return (kgj[]) $VALUES.clone();
    }
}
