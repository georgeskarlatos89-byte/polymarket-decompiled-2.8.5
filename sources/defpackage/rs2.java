package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class rs2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ rs2[] $VALUES;
    public static final rs2 Left;
    public static final rs2 Right;

    /* JADX WARN: Type inference failed for: r0v0, types: [rs2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rs2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Left", 0);
        Left = r0;
        ?? r1 = new Enum("Right", 1);
        Right = r1;
        rs2[] rs2VarArr = {r0, r1};
        $VALUES = rs2VarArr;
        $ENTRIES = new wg7(rs2VarArr);
    }

    public static rs2 valueOf(String str) {
        return (rs2) Enum.valueOf(rs2.class, str);
    }

    public static rs2[] values() {
        return (rs2[]) $VALUES.clone();
    }
}
