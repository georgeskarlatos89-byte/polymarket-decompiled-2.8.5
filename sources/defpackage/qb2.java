package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class qb2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ qb2[] $VALUES;
    public static final qb2 Pill;
    public static final qb2 Rounded;

    /* JADX WARN: Type inference failed for: r0v0, types: [qb2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qb2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Rounded", 0);
        Rounded = r0;
        ?? r1 = new Enum("Pill", 1);
        Pill = r1;
        qb2[] qb2VarArr = {r0, r1};
        $VALUES = qb2VarArr;
        $ENTRIES = new wg7(qb2VarArr);
    }

    public static qb2 valueOf(String str) {
        return (qb2) Enum.valueOf(qb2.class, str);
    }

    public static qb2[] values() {
        return (qb2[]) $VALUES.clone();
    }
}
