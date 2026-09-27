package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ilg implements yj9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ilg[] $VALUES;
    public static final ilg CORDOVA;
    public static final ilg FLUTTER;
    public static final ilg MPARTICLE;
    public static final ilg REACT;
    public static final ilg SEGMENT;
    public static final ilg TEALIUM;
    public static final ilg UNITY;
    public static final ilg XAMARIN;
    private final String jsonKey;

    static {
        ilg ilgVar = new ilg("UNITY", 0, "unity");
        UNITY = ilgVar;
        ilg ilgVar2 = new ilg("REACT", 1, "react");
        REACT = ilgVar2;
        ilg ilgVar3 = new ilg("CORDOVA", 2, "cordova");
        CORDOVA = ilgVar3;
        ilg ilgVar4 = new ilg("XAMARIN", 3, "xamarin");
        XAMARIN = ilgVar4;
        ilg ilgVar5 = new ilg("FLUTTER", 4, "flutter");
        FLUTTER = ilgVar5;
        ilg ilgVar6 = new ilg("SEGMENT", 5, "segment");
        SEGMENT = ilgVar6;
        ilg ilgVar7 = new ilg("TEALIUM", 6, "tealium");
        TEALIUM = ilgVar7;
        ilg ilgVar8 = new ilg("MPARTICLE", 7, "mparticle");
        MPARTICLE = ilgVar8;
        ilg[] ilgVarArr = {ilgVar, ilgVar2, ilgVar3, ilgVar4, ilgVar5, ilgVar6, ilgVar7, ilgVar8};
        $VALUES = ilgVarArr;
        $ENTRIES = new wg7(ilgVarArr);
    }

    public ilg(String str, int i, String str2) {
        this.jsonKey = str2;
    }

    public static ilg valueOf(String str) {
        return (ilg) Enum.valueOf(ilg.class, str);
    }

    public static ilg[] values() {
        return (ilg[]) $VALUES.clone();
    }

    public final String b() {
        return this.jsonKey;
    }

    @Override // defpackage.yj9
    public final Object forJsonPut() {
        return this.jsonKey;
    }
}
