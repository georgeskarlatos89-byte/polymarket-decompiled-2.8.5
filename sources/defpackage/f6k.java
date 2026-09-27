package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f6k {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ f6k[] $VALUES;
    public static final f6k MULTI_USE;
    public static final f6k SINGLE_USE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f6k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f6k] */
    static {
        ?? r0 = new Enum("SINGLE_USE", 0);
        SINGLE_USE = r0;
        ?? r1 = new Enum("MULTI_USE", 1);
        MULTI_USE = r1;
        f6k[] f6kVarArr = {r0, r1};
        $VALUES = f6kVarArr;
        $ENTRIES = new wg7(f6kVarArr);
    }

    public static f6k valueOf(String str) {
        return (f6k) Enum.valueOf(f6k.class, str);
    }

    public static f6k[] values() {
        return (f6k[]) $VALUES.clone();
    }
}
