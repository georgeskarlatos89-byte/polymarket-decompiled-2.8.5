package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class zqa {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ zqa[] $VALUES;
    public static final zqa AT_LEAST_ONCE;
    public static final zqa AT_MOST_ONCE;
    public static final zqa EXACTLY_ONCE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zqa] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zqa] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zqa] */
    static {
        ?? r0 = new Enum("AT_MOST_ONCE", 0);
        AT_MOST_ONCE = r0;
        ?? r1 = new Enum("EXACTLY_ONCE", 1);
        EXACTLY_ONCE = r1;
        ?? r2 = new Enum("AT_LEAST_ONCE", 2);
        AT_LEAST_ONCE = r2;
        zqa[] zqaVarArr = {r0, r1, r2};
        $VALUES = zqaVarArr;
        $ENTRIES = new wg7(zqaVarArr);
    }

    public static zqa valueOf(String str) {
        return (zqa) Enum.valueOf(zqa.class, str);
    }

    public static zqa[] values() {
        return (zqa[]) $VALUES.clone();
    }
}
