package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ara {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ara[] $VALUES;
    public static final ara CALLS;
    public static final ara RETURNS_CONSTANT;
    public static final ara RETURNS_NOT_NULL;

    /* JADX WARN: Type inference failed for: r0v0, types: [ara, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ara, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ara, java.lang.Enum] */
    static {
        ?? r0 = new Enum("RETURNS_CONSTANT", 0);
        RETURNS_CONSTANT = r0;
        ?? r1 = new Enum("CALLS", 1);
        CALLS = r1;
        ?? r2 = new Enum("RETURNS_NOT_NULL", 2);
        RETURNS_NOT_NULL = r2;
        ara[] araVarArr = {r0, r1, r2};
        $VALUES = araVarArr;
        $ENTRIES = new wg7(araVarArr);
    }

    public static ara valueOf(String str) {
        return (ara) Enum.valueOf(ara.class, str);
    }

    public static ara[] values() {
        return (ara[]) $VALUES.clone();
    }
}
