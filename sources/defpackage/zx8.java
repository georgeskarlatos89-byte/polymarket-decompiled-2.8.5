package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class zx8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ zx8[] $VALUES;
    public static final zx8 Elements;
    public static final zx8 Launcher;
    public static final zx8 Manual;
    private final String code;

    static {
        zx8 zx8Var = new zx8("Launcher", 0, "android/stripe-launcher");
        Launcher = zx8Var;
        zx8 zx8Var2 = new zx8("Manual", 1, "android/stripe-manual-api");
        Manual = zx8Var2;
        zx8 zx8Var3 = new zx8("Elements", 2, "android/stripe-elements");
        Elements = zx8Var3;
        zx8[] zx8VarArr = {zx8Var, zx8Var2, zx8Var3};
        $VALUES = zx8VarArr;
        $ENTRIES = new wg7(zx8VarArr);
    }

    public zx8(String str, int i, String str2) {
        this.code = str2;
    }

    public static zx8 valueOf(String str) {
        return (zx8) Enum.valueOf(zx8.class, str);
    }

    public static zx8[] values() {
        return (zx8[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
