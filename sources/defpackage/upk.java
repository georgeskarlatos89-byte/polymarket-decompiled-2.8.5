package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class upk {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ upk[] $VALUES;
    public static final upk LIST;
    public static final upk MAP;
    public static final upk OBJ;
    public static final upk POLY_OBJ;
    public final char begin;
    public final char end;

    static {
        upk upkVar = new upk("OBJ", 0, '{', '}');
        OBJ = upkVar;
        upk upkVar2 = new upk("LIST", 1, '[', ']');
        LIST = upkVar2;
        upk upkVar3 = new upk("MAP", 2, '{', '}');
        MAP = upkVar3;
        upk upkVar4 = new upk("POLY_OBJ", 3, '[', ']');
        POLY_OBJ = upkVar4;
        upk[] upkVarArr = {upkVar, upkVar2, upkVar3, upkVar4};
        $VALUES = upkVarArr;
        $ENTRIES = new wg7(upkVarArr);
    }

    public upk(String str, int i, char c, char c2) {
        this.begin = c;
        this.end = c2;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static upk valueOf(String str) {
        return (upk) Enum.valueOf(upk.class, str);
    }

    public static upk[] values() {
        return (upk[]) $VALUES.clone();
    }
}
