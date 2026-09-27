package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class sb2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ sb2[] $VALUES;
    public static final sb2 Disabled;
    public static final sb2 Error;
    public static final sb2 Normal;
    public static final sb2 Warning;

    /* JADX WARN: Type inference failed for: r0v0, types: [sb2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sb2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [sb2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [sb2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Normal", 0);
        Normal = r0;
        ?? r1 = new Enum("Error", 1);
        Error = r1;
        ?? r2 = new Enum("Warning", 2);
        Warning = r2;
        ?? r3 = new Enum("Disabled", 3);
        Disabled = r3;
        sb2[] sb2VarArr = {r0, r1, r2, r3};
        $VALUES = sb2VarArr;
        $ENTRIES = new wg7(sb2VarArr);
    }

    public static sb2 valueOf(String str) {
        return (sb2) Enum.valueOf(sb2.class, str);
    }

    public static sb2[] values() {
        return (sb2[]) $VALUES.clone();
    }
}
