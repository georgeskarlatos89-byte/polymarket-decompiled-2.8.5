package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class drc {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ drc[] $VALUES;
    public static final drc Default;
    public static final drc PreventUserInput;
    public static final drc UserInput;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, drc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, drc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, drc] */
    static {
        ?? r0 = new Enum("Default", 0);
        Default = r0;
        ?? r1 = new Enum("UserInput", 1);
        UserInput = r1;
        ?? r2 = new Enum("PreventUserInput", 2);
        PreventUserInput = r2;
        drc[] drcVarArr = {r0, r1, r2};
        $VALUES = drcVarArr;
        $ENTRIES = new wg7(drcVarArr);
    }

    public static drc valueOf(String str) {
        return (drc) Enum.valueOf(drc.class, str);
    }

    public static drc[] values() {
        return (drc[]) $VALUES.clone();
    }
}
