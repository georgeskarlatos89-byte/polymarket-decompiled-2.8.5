package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class eng {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ eng[] $VALUES;
    public static final eng Inherit;
    public static final eng SecureOff;
    public static final eng SecureOn;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eng] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eng] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, eng] */
    static {
        ?? r0 = new Enum("Inherit", 0);
        Inherit = r0;
        ?? r1 = new Enum("SecureOn", 1);
        SecureOn = r1;
        ?? r2 = new Enum("SecureOff", 2);
        SecureOff = r2;
        eng[] engVarArr = {r0, r1, r2};
        $VALUES = engVarArr;
        $ENTRIES = new wg7(engVarArr);
    }

    public static eng valueOf(String str) {
        return (eng) Enum.valueOf(eng.class, str);
    }

    public static eng[] values() {
        return (eng[]) $VALUES.clone();
    }
}
