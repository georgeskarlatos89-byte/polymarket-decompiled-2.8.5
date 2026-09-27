package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class saj {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ saj[] $VALUES;
    public static final saj DEFERRED;
    public static final saj EXCLUSIVE;
    public static final saj IMMEDIATE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, saj] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, saj] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, saj] */
    static {
        ?? r0 = new Enum("DEFERRED", 0);
        DEFERRED = r0;
        ?? r1 = new Enum("IMMEDIATE", 1);
        IMMEDIATE = r1;
        ?? r2 = new Enum("EXCLUSIVE", 2);
        EXCLUSIVE = r2;
        saj[] sajVarArr = {r0, r1, r2};
        $VALUES = sajVarArr;
        $ENTRIES = new wg7(sajVarArr);
    }

    public static saj valueOf(String str) {
        return (saj) Enum.valueOf(saj.class, str);
    }

    public static saj[] values() {
        return (saj[]) $VALUES.clone();
    }
}
