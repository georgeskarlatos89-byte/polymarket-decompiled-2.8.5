package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class mha {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ mha[] $VALUES;
    public static final mha DEPRECATED_LIST_METHODS;
    public static final mha DROP;
    public static final mha HIDDEN;
    public static final mha NOT_CONSIDERED;
    public static final mha VISIBLE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mha] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mha] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, mha] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, mha] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, mha] */
    static {
        ?? r0 = new Enum("HIDDEN", 0);
        HIDDEN = r0;
        ?? r1 = new Enum("VISIBLE", 1);
        VISIBLE = r1;
        ?? r2 = new Enum("DEPRECATED_LIST_METHODS", 2);
        DEPRECATED_LIST_METHODS = r2;
        ?? r3 = new Enum("NOT_CONSIDERED", 3);
        NOT_CONSIDERED = r3;
        ?? r4 = new Enum("DROP", 4);
        DROP = r4;
        mha[] mhaVarArr = {r0, r1, r2, r3, r4};
        $VALUES = mhaVarArr;
        $ENTRIES = new wg7(mhaVarArr);
    }

    public static mha valueOf(String str) {
        return (mha) Enum.valueOf(mha.class, str);
    }

    public static mha[] values() {
        return (mha[]) $VALUES.clone();
    }
}
