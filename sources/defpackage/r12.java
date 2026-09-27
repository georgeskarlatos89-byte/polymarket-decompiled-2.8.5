package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class r12 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ r12[] $VALUES;
    public static final r12 Pill;
    public static final r12 Rounded;

    /* JADX WARN: Type inference failed for: r0v0, types: [r12, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [r12, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Rounded", 0);
        Rounded = r0;
        ?? r1 = new Enum("Pill", 1);
        Pill = r1;
        r12[] r12VarArr = {r0, r1};
        $VALUES = r12VarArr;
        $ENTRIES = new wg7(r12VarArr);
    }

    public static r12 valueOf(String str) {
        return (r12) Enum.valueOf(r12.class, str);
    }

    public static r12[] values() {
        return (r12[]) $VALUES.clone();
    }
}
