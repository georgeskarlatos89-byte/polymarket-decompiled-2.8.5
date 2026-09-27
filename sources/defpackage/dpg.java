package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dpg {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ dpg[] $VALUES;
    public static final dpg EditableText;
    public static final dpg StaticText;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dpg] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dpg] */
    static {
        ?? r0 = new Enum("EditableText", 0);
        EditableText = r0;
        ?? r1 = new Enum("StaticText", 1);
        StaticText = r1;
        dpg[] dpgVarArr = {r0, r1};
        $VALUES = dpgVarArr;
        $ENTRIES = new wg7(dpgVarArr);
    }

    public static dpg valueOf(String str) {
        return (dpg) Enum.valueOf(dpg.class, str);
    }

    public static dpg[] values() {
        return (dpg[]) $VALUES.clone();
    }
}
