package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class zj3 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ zj3[] $VALUES;
    public static final zj3 ChartOnly;
    public static final zj3 WithLabels;

    /* JADX WARN: Type inference failed for: r0v0, types: [zj3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [zj3, java.lang.Enum] */
    static {
        ?? r0 = new Enum("WithLabels", 0);
        WithLabels = r0;
        ?? r1 = new Enum("ChartOnly", 1);
        ChartOnly = r1;
        zj3[] zj3VarArr = {r0, r1};
        $VALUES = zj3VarArr;
        $ENTRIES = new wg7(zj3VarArr);
    }

    public static zj3 valueOf(String str) {
        return (zj3) Enum.valueOf(zj3.class, str);
    }

    public static zj3[] values() {
        return (zj3[]) $VALUES.clone();
    }
}
