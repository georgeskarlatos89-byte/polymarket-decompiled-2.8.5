package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class vyi implements yif {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vyi[] $VALUES;
    public static final uyi Companion;
    public static final vyi DARK;
    public static final vyi LIGHT;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vyi] */
    /* JADX WARN: Type inference failed for: r0v2, types: [uyi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vyi] */
    static {
        ?? r0 = new Enum("LIGHT", 0);
        LIGHT = r0;
        ?? r1 = new Enum("DARK", 1);
        DARK = r1;
        vyi[] vyiVarArr = {r0, r1};
        $VALUES = vyiVarArr;
        $ENTRIES = new wg7(vyiVarArr);
        Companion = new Object();
    }

    public static vyi valueOf(String str) {
        return (vyi) Enum.valueOf(vyi.class, str);
    }

    public static vyi[] values() {
        return (vyi[]) $VALUES.clone();
    }
}
