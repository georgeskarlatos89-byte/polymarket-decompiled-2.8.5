package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ki8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ki8[] $VALUES;
    public static final ki8 Italic;
    public static final ki8 Normal;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ki8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ki8] */
    static {
        ?? r0 = new Enum("Normal", 0);
        Normal = r0;
        ?? r1 = new Enum("Italic", 1);
        Italic = r1;
        ki8[] ki8VarArr = {r0, r1};
        $VALUES = ki8VarArr;
        $ENTRIES = new wg7(ki8VarArr);
    }

    public static ki8 valueOf(String str) {
        return (ki8) Enum.valueOf(ki8.class, str);
    }

    public static ki8[] values() {
        return (ki8[]) $VALUES.clone();
    }
}
