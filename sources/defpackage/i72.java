package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class i72 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ i72[] $VALUES;
    public static final i72 InFeaturedCarousel;
    public static final i72 OnHomeScreen;
    public static final i72 Regular;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i72] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i72] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i72] */
    static {
        ?? r0 = new Enum("OnHomeScreen", 0);
        OnHomeScreen = r0;
        ?? r1 = new Enum("InFeaturedCarousel", 1);
        InFeaturedCarousel = r1;
        ?? r2 = new Enum("Regular", 2);
        Regular = r2;
        i72[] i72VarArr = {r0, r1, r2};
        $VALUES = i72VarArr;
        $ENTRIES = new wg7(i72VarArr);
    }

    public static i72 valueOf(String str) {
        return (i72) Enum.valueOf(i72.class, str);
    }

    public static i72[] values() {
        return (i72[]) $VALUES.clone();
    }
}
