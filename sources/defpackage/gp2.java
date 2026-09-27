package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class gp2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ gp2[] $VALUES;
    public static final gp2 Horizontal;
    public static final gp2 Vertical;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gp2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gp2] */
    static {
        ?? r0 = new Enum("Vertical", 0);
        Vertical = r0;
        ?? r1 = new Enum("Horizontal", 1);
        Horizontal = r1;
        gp2[] gp2VarArr = {r0, r1};
        $VALUES = gp2VarArr;
        $ENTRIES = new wg7(gp2VarArr);
    }

    public static gp2 valueOf(String str) {
        return (gp2) Enum.valueOf(gp2.class, str);
    }

    public static gp2[] values() {
        return (gp2[]) $VALUES.clone();
    }
}
