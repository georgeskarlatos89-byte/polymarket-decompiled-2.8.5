package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tn2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tn2[] $VALUES;
    public static final tn2 Error;
    public static final tn2 Idle;
    public static final tn2 Loading;
    public static final tn2 Success;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tn2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tn2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, tn2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, tn2] */
    static {
        ?? r0 = new Enum("Idle", 0);
        Idle = r0;
        ?? r1 = new Enum("Loading", 1);
        Loading = r1;
        ?? r2 = new Enum("Success", 2);
        Success = r2;
        ?? r3 = new Enum("Error", 3);
        Error = r3;
        tn2[] tn2VarArr = {r0, r1, r2, r3};
        $VALUES = tn2VarArr;
        $ENTRIES = new wg7(tn2VarArr);
    }

    public static tn2 valueOf(String str) {
        return (tn2) Enum.valueOf(tn2.class, str);
    }

    public static tn2[] values() {
        return (tn2[]) $VALUES.clone();
    }
}
