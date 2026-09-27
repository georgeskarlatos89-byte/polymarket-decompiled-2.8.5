package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class cng {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ cng[] $VALUES;
    public static final cng Bordered;
    public static final cng Borderless;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, cng] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, cng] */
    static {
        ?? r0 = new Enum("Bordered", 0);
        Bordered = r0;
        ?? r1 = new Enum("Borderless", 1);
        Borderless = r1;
        cng[] cngVarArr = {r0, r1};
        $VALUES = cngVarArr;
        $ENTRIES = new wg7(cngVarArr);
    }

    public static cng valueOf(String str) {
        return (cng) Enum.valueOf(cng.class, str);
    }

    public static cng[] values() {
        return (cng[]) $VALUES.clone();
    }
}
