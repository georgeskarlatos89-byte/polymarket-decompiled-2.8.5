package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ugh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ugh[] $VALUES;
    public static final ugh FALSE;
    public static final ugh INDEX;
    public static final ugh MAP_GET_OR_DEFAULT;
    public static final ugh NULL;
    private final Object defaultValue;

    static {
        ugh ughVar = new ugh("NULL", 0, null);
        NULL = ughVar;
        ugh ughVar2 = new ugh("INDEX", 1, -1);
        INDEX = ughVar2;
        ugh ughVar3 = new ugh("FALSE", 2, Boolean.FALSE);
        FALSE = ughVar3;
        ugh ughVar4 = new ugh("MAP_GET_OR_DEFAULT", 3, null);
        MAP_GET_OR_DEFAULT = ughVar4;
        ugh[] ughVarArr = {ughVar, ughVar2, ughVar3, ughVar4};
        $VALUES = ughVarArr;
        $ENTRIES = new wg7(ughVarArr);
    }

    public ugh(String str, int i, Object obj) {
        this.defaultValue = obj;
    }

    public static ugh valueOf(String str) {
        return (ugh) Enum.valueOf(ugh.class, str);
    }

    public static ugh[] values() {
        return (ugh[]) $VALUES.clone();
    }
}
