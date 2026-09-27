package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hg2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ hg2[] $VALUES;
    public static final hg2 ButtonOverlay;
    public static final hg2 None;
    public static final hg2 RowIcon;

    /* JADX WARN: Type inference failed for: r0v0, types: [hg2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hg2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [hg2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("RowIcon", 0);
        RowIcon = r0;
        ?? r1 = new Enum("ButtonOverlay", 1);
        ButtonOverlay = r1;
        ?? r2 = new Enum("None", 2);
        None = r2;
        hg2[] hg2VarArr = {r0, r1, r2};
        $VALUES = hg2VarArr;
        $ENTRIES = new wg7(hg2VarArr);
    }

    public static hg2 valueOf(String str) {
        return (hg2) Enum.valueOf(hg2.class, str);
    }

    public static hg2[] values() {
        return (hg2[]) $VALUES.clone();
    }
}
