package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class jnk {
    private static final /* synthetic */ jnk[] $VALUES;
    public static final jnk BOOL;
    public static final jnk BYTES;
    public static final jnk DOUBLE;
    public static final jnk ENUM;
    public static final jnk FIXED32;
    public static final jnk FIXED64;
    public static final jnk FLOAT;
    public static final jnk GROUP;
    public static final jnk INT32;
    public static final jnk INT64;
    public static final jnk MESSAGE;
    public static final jnk SFIXED32;
    public static final jnk SFIXED64;
    public static final jnk SINT32;
    public static final jnk SINT64;
    public static final jnk STRING;
    public static final jnk UINT32;
    public static final jnk UINT64;
    private final lnk javaType;
    private final int wireType;

    static {
        jnk jnkVar = new jnk("DOUBLE", 0, lnk.DOUBLE, 1);
        DOUBLE = jnkVar;
        jnk jnkVar2 = new jnk("FLOAT", 1, lnk.FLOAT, 5);
        FLOAT = jnkVar2;
        lnk lnkVar = lnk.LONG;
        jnk jnkVar3 = new jnk("INT64", 2, lnkVar, 0);
        INT64 = jnkVar3;
        jnk jnkVar4 = new jnk("UINT64", 3, lnkVar, 0);
        UINT64 = jnkVar4;
        lnk lnkVar2 = lnk.INT;
        jnk jnkVar5 = new jnk("INT32", 4, lnkVar2, 0);
        INT32 = jnkVar5;
        jnk jnkVar6 = new jnk("FIXED64", 5, lnkVar, 1);
        FIXED64 = jnkVar6;
        jnk jnkVar7 = new jnk("FIXED32", 6, lnkVar2, 5);
        FIXED32 = jnkVar7;
        jnk jnkVar8 = new jnk("BOOL", 7, lnk.BOOLEAN, 0);
        BOOL = jnkVar8;
        jnk jnkVar9 = new jnk("STRING", 8, lnk.STRING, 2);
        STRING = jnkVar9;
        lnk lnkVar3 = lnk.MESSAGE;
        jnk jnkVar10 = new jnk("GROUP", 9, lnkVar3, 3);
        GROUP = jnkVar10;
        jnk jnkVar11 = new jnk("MESSAGE", 10, lnkVar3, 2);
        MESSAGE = jnkVar11;
        jnk jnkVar12 = new jnk("BYTES", 11, lnk.BYTE_STRING, 2);
        BYTES = jnkVar12;
        jnk jnkVar13 = new jnk("UINT32", 12, lnkVar2, 0);
        UINT32 = jnkVar13;
        jnk jnkVar14 = new jnk("ENUM", 13, lnk.ENUM, 0);
        ENUM = jnkVar14;
        jnk jnkVar15 = new jnk("SFIXED32", 14, lnkVar2, 5);
        SFIXED32 = jnkVar15;
        jnk jnkVar16 = new jnk("SFIXED64", 15, lnkVar, 1);
        SFIXED64 = jnkVar16;
        jnk jnkVar17 = new jnk("SINT32", 16, lnkVar2, 0);
        SINT32 = jnkVar17;
        jnk jnkVar18 = new jnk("SINT64", 17, lnkVar, 0);
        SINT64 = jnkVar18;
        $VALUES = new jnk[]{jnkVar, jnkVar2, jnkVar3, jnkVar4, jnkVar5, jnkVar6, jnkVar7, jnkVar8, jnkVar9, jnkVar10, jnkVar11, jnkVar12, jnkVar13, jnkVar14, jnkVar15, jnkVar16, jnkVar17, jnkVar18};
    }

    public jnk(String str, int i, lnk lnkVar, int i2) {
        this.javaType = lnkVar;
        this.wireType = i2;
    }

    public static jnk valueOf(String str) {
        return (jnk) Enum.valueOf(jnk.class, str);
    }

    public static jnk[] values() {
        return (jnk[]) $VALUES.clone();
    }

    public final lnk a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }

    public boolean c() {
        return !(this instanceof bnk);
    }
}
