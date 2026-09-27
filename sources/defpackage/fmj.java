package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class fmj {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ fmj[] $VALUES;
    public static final fmj Rail;
    public static final fmj Spine;

    /* JADX WARN: Type inference failed for: r0v0, types: [fmj, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fmj, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Spine", 0);
        Spine = r0;
        ?? r1 = new Enum("Rail", 1);
        Rail = r1;
        fmj[] fmjVarArr = {r0, r1};
        $VALUES = fmjVarArr;
        $ENTRIES = new wg7(fmjVarArr);
    }

    public static fmj valueOf(String str) {
        return (fmj) Enum.valueOf(fmj.class, str);
    }

    public static fmj[] values() {
        return (fmj[]) $VALUES.clone();
    }
}
