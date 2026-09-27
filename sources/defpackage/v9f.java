package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class v9f {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ v9f[] $VALUES;
    public static final v9f Activity;
    public static final v9f Orders;
    public static final v9f Positions;

    /* JADX WARN: Type inference failed for: r0v0, types: [v9f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [v9f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [v9f, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Positions", 0);
        Positions = r0;
        ?? r1 = new Enum("Orders", 1);
        Orders = r1;
        ?? r2 = new Enum("Activity", 2);
        Activity = r2;
        v9f[] v9fVarArr = {r0, r1, r2};
        $VALUES = v9fVarArr;
        $ENTRIES = new wg7(v9fVarArr);
    }

    public static v9f valueOf(String str) {
        return (v9f) Enum.valueOf(v9f.class, str);
    }

    public static v9f[] values() {
        return (v9f[]) $VALUES.clone();
    }
}
