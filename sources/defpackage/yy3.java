package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class yy3 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ yy3[] $VALUES;
    public static final yy3 Idle;
    public static final yy3 Loading;
    public static final yy3 Success;

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [yy3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [yy3, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Idle", 0);
        Idle = r0;
        ?? r1 = new Enum("Loading", 1);
        Loading = r1;
        ?? r2 = new Enum("Success", 2);
        Success = r2;
        yy3[] yy3VarArr = {r0, r1, r2};
        $VALUES = yy3VarArr;
        $ENTRIES = new wg7(yy3VarArr);
    }

    public static yy3 valueOf(String str) {
        return (yy3) Enum.valueOf(yy3.class, str);
    }

    public static yy3[] values() {
        return (yy3[]) $VALUES.clone();
    }
}
