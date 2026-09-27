package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class dx1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ dx1[] $VALUES;
    public static final dx1 Compact;
    public static final dx1 Regular;
    private final s12 buttonSize;
    private final float spacing = 8.0f;

    static {
        dx1 dx1Var = new dx1("Regular", 0, s12.Large);
        Regular = dx1Var;
        dx1 dx1Var2 = new dx1("Compact", 1, s12.Medium);
        Compact = dx1Var2;
        dx1[] dx1VarArr = {dx1Var, dx1Var2};
        $VALUES = dx1VarArr;
        $ENTRIES = new wg7(dx1VarArr);
    }

    public dx1(String str, int i, s12 s12Var) {
        this.buttonSize = s12Var;
    }

    public static dx1 valueOf(String str) {
        return (dx1) Enum.valueOf(dx1.class, str);
    }

    public static dx1[] values() {
        return (dx1[]) $VALUES.clone();
    }

    public final s12 a() {
        return this.buttonSize;
    }

    public final float b() {
        return this.spacing;
    }
}
