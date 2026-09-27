package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tmh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tmh[] $VALUES;
    public static final tmh Empty;
    public static final tmh Error;
    public static final tmh List;
    public static final tmh Skeleton;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tmh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tmh] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, tmh] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, tmh] */
    static {
        ?? r0 = new Enum("Error", 0);
        Error = r0;
        ?? r1 = new Enum("Skeleton", 1);
        Skeleton = r1;
        ?? r2 = new Enum("Empty", 2);
        Empty = r2;
        ?? r3 = new Enum("List", 3);
        List = r3;
        tmh[] tmhVarArr = {r0, r1, r2, r3};
        $VALUES = tmhVarArr;
        $ENTRIES = new wg7(tmhVarArr);
    }

    public static tmh valueOf(String str) {
        return (tmh) Enum.valueOf(tmh.class, str);
    }

    public static tmh[] values() {
        return (tmh[]) $VALUES.clone();
    }
}
