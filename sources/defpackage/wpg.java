package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class wpg {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wpg[] $VALUES;
    public static final vpg Companion;
    public static final wpg FullSelfie;
    public static final wpg Poster;
    public static final wpg Receipt;
    private final int page;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vpg] */
    static {
        wpg wpgVar = new wpg("Receipt", 0, 0);
        Receipt = wpgVar;
        wpg wpgVar2 = new wpg("Poster", 1, 1);
        Poster = wpgVar2;
        wpg wpgVar3 = new wpg("FullSelfie", 2, 2);
        FullSelfie = wpgVar3;
        wpg[] wpgVarArr = {wpgVar, wpgVar2, wpgVar3};
        $VALUES = wpgVarArr;
        $ENTRIES = new wg7(wpgVarArr);
        Companion = new Object();
    }

    public wpg(String str, int i, int i2) {
        this.page = i2;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static wpg valueOf(String str) {
        return (wpg) Enum.valueOf(wpg.class, str);
    }

    public static wpg[] values() {
        return (wpg[]) $VALUES.clone();
    }

    public final int b() {
        return this.page;
    }
}
