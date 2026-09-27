package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o8g {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ o8g[] $VALUES;
    public static final o8g FRAMES;
    public static final o8g STANDALONE;
    private final String type;

    static {
        o8g o8gVar = new o8g("STANDALONE", 0, "RiskAndroidStandalone");
        STANDALONE = o8gVar;
        o8g o8gVar2 = new o8g("FRAMES", 1, "RiskAndroidInFramesAndroid");
        FRAMES = o8gVar2;
        o8g[] o8gVarArr = {o8gVar, o8gVar2};
        $VALUES = o8gVarArr;
        $ENTRIES = new wg7(o8gVarArr);
    }

    public o8g(String str, int i, String str2) {
        this.type = str2;
    }

    public static o8g valueOf(String str) {
        return (o8g) Enum.valueOf(o8g.class, str);
    }

    public static o8g[] values() {
        return (o8g[]) $VALUES.clone();
    }

    public final String a() {
        return this.type;
    }
}
