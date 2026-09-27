package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class yna {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ yna[] $VALUES;
    public static final yna Chips;
    public static final yna Plain;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, yna] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, yna] */
    static {
        ?? r0 = new Enum("Chips", 0);
        Chips = r0;
        ?? r1 = new Enum("Plain", 1);
        Plain = r1;
        yna[] ynaVarArr = {r0, r1};
        $VALUES = ynaVarArr;
        $ENTRIES = new wg7(ynaVarArr);
    }

    public static yna valueOf(String str) {
        return (yna) Enum.valueOf(yna.class, str);
    }

    public static yna[] values() {
        return (yna[]) $VALUES.clone();
    }
}
