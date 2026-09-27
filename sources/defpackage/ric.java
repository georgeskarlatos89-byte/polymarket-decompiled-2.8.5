package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ric {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ric[] $VALUES;
    public static final ric ABSTRACT;
    public static final ric FINAL;
    public static final ric OPEN;
    public static final ric SEALED;
    private final d78 flag;

    static {
        ric ricVar = new ric("FINAL", 0, 0);
        FINAL = ricVar;
        ric ricVar2 = new ric("OPEN", 1, 1);
        OPEN = ricVar2;
        ric ricVar3 = new ric("ABSTRACT", 2, 2);
        ABSTRACT = ricVar3;
        ric ricVar4 = new ric("SEALED", 3, 3);
        SEALED = ricVar4;
        ric[] ricVarArr = {ricVar, ricVar2, ricVar3, ricVar4};
        $VALUES = ricVarArr;
        $ENTRIES = new wg7(ricVarArr);
    }

    public ric(String str, int i, int i2) {
        h78 h78Var = j78.e;
        h78Var.getClass();
        this.flag = new d78(h78Var, i2);
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static ric valueOf(String str) {
        return (ric) Enum.valueOf(ric.class, str);
    }

    public static ric[] values() {
        return (ric[]) $VALUES.clone();
    }

    public final d78 b() {
        return this.flag;
    }
}
