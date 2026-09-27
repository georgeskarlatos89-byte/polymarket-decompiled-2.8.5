package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class o0f {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ o0f[] $VALUES;
    public static final o0f Global;
    public static final o0f US;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, o0f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, o0f] */
    static {
        ?? r0 = new Enum("Global", 0);
        Global = r0;
        ?? r1 = new Enum("US", 1);
        US = r1;
        o0f[] o0fVarArr = {r0, r1};
        $VALUES = o0fVarArr;
        $ENTRIES = new wg7(o0fVarArr);
    }

    public static o0f valueOf(String str) {
        return (o0f) Enum.valueOf(o0f.class, str);
    }

    public static o0f[] values() {
        return (o0f[]) $VALUES.clone();
    }
}
