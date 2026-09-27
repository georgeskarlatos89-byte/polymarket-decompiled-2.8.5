package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class zb0 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ zb0[] $VALUES;
    public static final zb0 ALL;
    public static final zb0 CONSTRUCTOR_PARAMETER;
    public static final zb0 FIELD;
    public static final zb0 FILE;
    public static final zb0 PROPERTY;
    public static final zb0 PROPERTY_DELEGATE_FIELD;
    public static final zb0 PROPERTY_GETTER;
    public static final zb0 PROPERTY_SETTER;
    public static final zb0 RECEIVER;
    public static final zb0 SETTER_PARAMETER;
    private final String renderName;

    static {
        zb0 zb0Var = new zb0("ALL", 0, null);
        ALL = zb0Var;
        zb0 zb0Var2 = new zb0("FIELD", 1, null);
        FIELD = zb0Var2;
        zb0 zb0Var3 = new zb0("FILE", 2, null);
        FILE = zb0Var3;
        zb0 zb0Var4 = new zb0("PROPERTY", 3, null);
        PROPERTY = zb0Var4;
        zb0 zb0Var5 = new zb0("PROPERTY_GETTER", 4, "get");
        PROPERTY_GETTER = zb0Var5;
        zb0 zb0Var6 = new zb0("PROPERTY_SETTER", 5, "set");
        PROPERTY_SETTER = zb0Var6;
        zb0 zb0Var7 = new zb0("RECEIVER", 6, null);
        RECEIVER = zb0Var7;
        zb0 zb0Var8 = new zb0("CONSTRUCTOR_PARAMETER", 7, "param");
        CONSTRUCTOR_PARAMETER = zb0Var8;
        zb0 zb0Var9 = new zb0("SETTER_PARAMETER", 8, "setparam");
        SETTER_PARAMETER = zb0Var9;
        zb0 zb0Var10 = new zb0("PROPERTY_DELEGATE_FIELD", 9, "delegate");
        PROPERTY_DELEGATE_FIELD = zb0Var10;
        zb0[] zb0VarArr = {zb0Var, zb0Var2, zb0Var3, zb0Var4, zb0Var5, zb0Var6, zb0Var7, zb0Var8, zb0Var9, zb0Var10};
        $VALUES = zb0VarArr;
        $ENTRIES = new wg7(zb0VarArr);
    }

    public zb0(String str, int i, String str2) {
        this.renderName = str2 == null ? aln.c(name()) : str2;
    }

    public static zb0 valueOf(String str) {
        return (zb0) Enum.valueOf(zb0.class, str);
    }

    public static zb0[] values() {
        return (zb0[]) $VALUES.clone();
    }

    public final String a() {
        return this.renderName;
    }
}
