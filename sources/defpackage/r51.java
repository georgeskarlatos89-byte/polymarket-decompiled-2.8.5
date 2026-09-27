package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class r51 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ r51[] $VALUES;
    public static final r51 Circle;
    public static final r51 Pill;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r51] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r51] */
    static {
        ?? r0 = new Enum("Circle", 0);
        Circle = r0;
        ?? r1 = new Enum("Pill", 1);
        Pill = r1;
        r51[] r51VarArr = {r0, r1};
        $VALUES = r51VarArr;
        $ENTRIES = new wg7(r51VarArr);
    }

    public static r51 valueOf(String str) {
        return (r51) Enum.valueOf(r51.class, str);
    }

    public static r51[] values() {
        return (r51[]) $VALUES.clone();
    }
}
