package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class kz1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kz1[] $VALUES;
    public static final kz1 None;
    public static final kz1 Removal;
    public static final kz1 Standard;

    /* JADX WARN: Type inference failed for: r0v0, types: [kz1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kz1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kz1, java.lang.Enum] */
    static {
        ?? r0 = new Enum("None", 0);
        None = r0;
        ?? r1 = new Enum("Standard", 1);
        Standard = r1;
        ?? r2 = new Enum("Removal", 2);
        Removal = r2;
        kz1[] kz1VarArr = {r0, r1, r2};
        $VALUES = kz1VarArr;
        $ENTRIES = new wg7(kz1VarArr);
    }

    public static kz1 valueOf(String str) {
        return (kz1) Enum.valueOf(kz1.class, str);
    }

    public static kz1[] values() {
        return (kz1[]) $VALUES.clone();
    }
}
