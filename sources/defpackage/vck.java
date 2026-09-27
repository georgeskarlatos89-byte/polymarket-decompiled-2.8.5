package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class vck {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vck[] $VALUES;
    public static final vck INTERNAL;
    public static final vck LOCAL;
    public static final vck PRIVATE;
    public static final vck PRIVATE_TO_THIS;
    public static final vck PROTECTED;
    public static final vck PUBLIC;
    private final d78 flag;

    static {
        vck vckVar = new vck("INTERNAL", 0, 0);
        INTERNAL = vckVar;
        vck vckVar2 = new vck("PRIVATE", 1, 1);
        PRIVATE = vckVar2;
        vck vckVar3 = new vck("PROTECTED", 2, 2);
        PROTECTED = vckVar3;
        vck vckVar4 = new vck("PUBLIC", 3, 3);
        PUBLIC = vckVar4;
        vck vckVar5 = new vck("PRIVATE_TO_THIS", 4, 4);
        PRIVATE_TO_THIS = vckVar5;
        vck vckVar6 = new vck("LOCAL", 5, 5);
        LOCAL = vckVar6;
        vck[] vckVarArr = {vckVar, vckVar2, vckVar3, vckVar4, vckVar5, vckVar6};
        $VALUES = vckVarArr;
        $ENTRIES = new wg7(vckVarArr);
    }

    public vck(String str, int i, int i2) {
        h78 h78Var = j78.d;
        h78Var.getClass();
        this.flag = new d78(h78Var, i2);
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static vck valueOf(String str) {
        return (vck) Enum.valueOf(vck.class, str);
    }

    public static vck[] values() {
        return (vck[]) $VALUES.clone();
    }

    public final d78 b() {
        return this.flag;
    }
}
