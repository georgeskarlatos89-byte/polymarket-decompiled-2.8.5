package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class n92 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ n92[] $VALUES;
    public static final n92 Clear;
    public static final n92 Frosted;
    public static final n92 Menu;
    public static final n92 Regular;
    public static final n92 SystemTinted;
    private final float blurRadius;
    private final float saturation;

    static {
        n92 n92Var = new n92("Clear", 0, 16.0f, 1.45f);
        Clear = n92Var;
        n92 n92Var2 = new n92("Regular", 1, 24.0f, 1.8f);
        Regular = n92Var2;
        n92 n92Var3 = new n92("SystemTinted", 2, 24.0f, 1.8f);
        SystemTinted = n92Var3;
        n92 n92Var4 = new n92("Frosted", 3, 20.0f, 1.8f);
        Frosted = n92Var4;
        n92 n92Var5 = new n92("Menu", 4, 6.0f, 1.8f);
        Menu = n92Var5;
        n92[] n92VarArr = {n92Var, n92Var2, n92Var3, n92Var4, n92Var5};
        $VALUES = n92VarArr;
        $ENTRIES = new wg7(n92VarArr);
    }

    public n92(String str, int i, float f, float f2) {
        this.blurRadius = f;
        this.saturation = f2;
    }

    public static n92 valueOf(String str) {
        return (n92) Enum.valueOf(n92.class, str);
    }

    public static n92[] values() {
        return (n92[]) $VALUES.clone();
    }

    public final float a() {
        return this.blurRadius;
    }

    public final float b() {
        return this.saturation;
    }
}
