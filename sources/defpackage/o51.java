package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class o51 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ o51[] $VALUES;
    public static final o51 Medium;
    public static final o51 Small;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, o51] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, o51] */
    static {
        ?? r0 = new Enum("Small", 0);
        Small = r0;
        ?? r1 = new Enum("Medium", 1);
        Medium = r1;
        o51[] o51VarArr = {r0, r1};
        $VALUES = o51VarArr;
        $ENTRIES = new wg7(o51VarArr);
    }

    public static o51 valueOf(String str) {
        return (o51) Enum.valueOf(o51.class, str);
    }

    public static o51[] values() {
        return (o51[]) $VALUES.clone();
    }
}
