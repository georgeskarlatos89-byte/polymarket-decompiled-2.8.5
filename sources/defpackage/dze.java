package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class dze {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ dze[] $VALUES;
    public static final dze Compact;
    public static final dze Expanded;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dze] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dze] */
    static {
        ?? r0 = new Enum("Compact", 0);
        Compact = r0;
        ?? r1 = new Enum("Expanded", 1);
        Expanded = r1;
        dze[] dzeVarArr = {r0, r1};
        $VALUES = dzeVarArr;
        $ENTRIES = new wg7(dzeVarArr);
    }

    public static dze valueOf(String str) {
        return (dze) Enum.valueOf(dze.class, str);
    }

    public static dze[] values() {
        return (dze[]) $VALUES.clone();
    }
}
