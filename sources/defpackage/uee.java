package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class uee {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ uee[] $VALUES;
    public static final uee Always;
    public static final uee Automatic;
    public static final uee Never;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, uee] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, uee] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, uee] */
    static {
        ?? r0 = new Enum("Automatic", 0);
        Automatic = r0;
        ?? r1 = new Enum("Always", 1);
        Always = r1;
        ?? r2 = new Enum("Never", 2);
        Never = r2;
        uee[] ueeVarArr = {r0, r1, r2};
        $VALUES = ueeVarArr;
        $ENTRIES = new wg7(ueeVarArr);
    }

    public static uee valueOf(String str) {
        return (uee) Enum.valueOf(uee.class, str);
    }

    public static uee[] values() {
        return (uee[]) $VALUES.clone();
    }
}
