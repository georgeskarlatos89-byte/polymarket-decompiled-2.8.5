package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class gee {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ gee[] $VALUES;
    public static final gee Automatic;
    public static final gee Horizontal;
    public static final gee Vertical;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gee] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gee] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, gee] */
    static {
        ?? r0 = new Enum("Horizontal", 0);
        Horizontal = r0;
        ?? r1 = new Enum("Vertical", 1);
        Vertical = r1;
        ?? r2 = new Enum("Automatic", 2);
        Automatic = r2;
        gee[] geeVarArr = {r0, r1, r2};
        $VALUES = geeVarArr;
        $ENTRIES = new wg7(geeVarArr);
    }

    public static gee valueOf(String str) {
        return (gee) Enum.valueOf(gee.class, str);
    }

    public static gee[] values() {
        return (gee[]) $VALUES.clone();
    }
}
