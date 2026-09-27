package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class r33 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ r33[] $VALUES;
    public static final r33 FOR_INCORPORATION;
    public static final r33 FOR_SUBTYPING;
    public static final r33 FROM_EXPRESSION;

    /* JADX WARN: Type inference failed for: r0v0, types: [r33, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [r33, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [r33, java.lang.Enum] */
    static {
        ?? r0 = new Enum("FOR_SUBTYPING", 0);
        FOR_SUBTYPING = r0;
        ?? r1 = new Enum("FOR_INCORPORATION", 1);
        FOR_INCORPORATION = r1;
        ?? r2 = new Enum("FROM_EXPRESSION", 2);
        FROM_EXPRESSION = r2;
        r33[] r33VarArr = {r0, r1, r2};
        $VALUES = r33VarArr;
        $ENTRIES = new wg7(r33VarArr);
    }

    public static r33 valueOf(String str) {
        return (r33) Enum.valueOf(r33.class, str);
    }

    public static r33[] values() {
        return (r33[]) $VALUES.clone();
    }
}
