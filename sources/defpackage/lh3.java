package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class lh3 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ lh3[] $VALUES;
    public static final lh3 FROM_NEWEST;
    public static final lh3 FROM_OLDEST;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lh3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lh3] */
    static {
        ?? r0 = new Enum("FROM_OLDEST", 0);
        FROM_OLDEST = r0;
        ?? r1 = new Enum("FROM_NEWEST", 1);
        FROM_NEWEST = r1;
        lh3[] lh3VarArr = {r0, r1};
        $VALUES = lh3VarArr;
        $ENTRIES = new wg7(lh3VarArr);
    }

    public static lh3 valueOf(String str) {
        return (lh3) Enum.valueOf(lh3.class, str);
    }

    public static lh3[] values() {
        return (lh3[]) $VALUES.clone();
    }
}
