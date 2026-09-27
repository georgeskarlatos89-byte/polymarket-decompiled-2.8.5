package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class byi {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ byi[] $VALUES;
    public static final byi Hidden;
    public static final byi Shown;

    /* JADX WARN: Type inference failed for: r0v0, types: [byi, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [byi, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Shown", 0);
        Shown = r0;
        ?? r1 = new Enum("Hidden", 1);
        Hidden = r1;
        byi[] byiVarArr = {r0, r1};
        $VALUES = byiVarArr;
        $ENTRIES = new wg7(byiVarArr);
    }

    public static byi valueOf(String str) {
        return (byi) Enum.valueOf(byi.class, str);
    }

    public static byi[] values() {
        return (byi[]) $VALUES.clone();
    }
}
