package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class cue {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ cue[] $VALUES;
    public static final cue Hidden;
    public static final cue LoadingPending;
    public static final cue LoadingVisible;
    public static final cue SuccessDrawing;
    public static final cue SuccessStatic;

    /* JADX WARN: Type inference failed for: r0v0, types: [cue, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [cue, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [cue, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [cue, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [cue, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Hidden", 0);
        Hidden = r0;
        ?? r1 = new Enum("LoadingPending", 1);
        LoadingPending = r1;
        ?? r2 = new Enum("LoadingVisible", 2);
        LoadingVisible = r2;
        ?? r3 = new Enum("SuccessDrawing", 3);
        SuccessDrawing = r3;
        ?? r4 = new Enum("SuccessStatic", 4);
        SuccessStatic = r4;
        cue[] cueVarArr = {r0, r1, r2, r3, r4};
        $VALUES = cueVarArr;
        $ENTRIES = new wg7(cueVarArr);
    }

    public static cue valueOf(String str) {
        return (cue) Enum.valueOf(cue.class, str);
    }

    public static cue[] values() {
        return (cue[]) $VALUES.clone();
    }
}
