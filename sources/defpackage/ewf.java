package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ewf {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ewf[] $VALUES;
    public static final ewf CANON_EQ;
    public static final ewf COMMENTS;
    public static final ewf DOT_MATCHES_ALL;
    public static final ewf IGNORE_CASE;
    public static final ewf LITERAL;
    public static final ewf MULTILINE;
    public static final ewf UNIX_LINES;
    private final int mask;
    private final int value;

    static {
        ewf ewfVar = new ewf("IGNORE_CASE", 0, 2, 0, 2, null);
        IGNORE_CASE = ewfVar;
        ewf ewfVar2 = new ewf("MULTILINE", 1, 8, 0, 2, null);
        MULTILINE = ewfVar2;
        ewf ewfVar3 = new ewf("LITERAL", 2, 16, 0, 2, null);
        LITERAL = ewfVar3;
        ewf ewfVar4 = new ewf("UNIX_LINES", 3, 1, 0, 2, null);
        UNIX_LINES = ewfVar4;
        ewf ewfVar5 = new ewf("COMMENTS", 4, 4, 0, 2, null);
        COMMENTS = ewfVar5;
        ewf ewfVar6 = new ewf("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
        DOT_MATCHES_ALL = ewfVar6;
        ewf ewfVar7 = new ewf("CANON_EQ", 6, 128, 0, 2, null);
        CANON_EQ = ewfVar7;
        ewf[] ewfVarArr = {ewfVar, ewfVar2, ewfVar3, ewfVar4, ewfVar5, ewfVar6, ewfVar7};
        $VALUES = ewfVarArr;
        $ENTRIES = new wg7(ewfVarArr);
    }

    public ewf(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        i3 = (i4 & 2) != 0 ? i2 : i3;
        this.value = i2;
        this.mask = i3;
    }

    public static ewf valueOf(String str) {
        return (ewf) Enum.valueOf(ewf.class, str);
    }

    public static ewf[] values() {
        return (ewf[]) $VALUES.clone();
    }

    public final int a() {
        return this.value;
    }
}
