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
/* loaded from: classes.dex */
public class knk {
    private static final /* synthetic */ knk[] $VALUES;
    public static final knk BOOL;
    public static final knk BYTES;
    public static final knk DOUBLE;
    public static final knk ENUM;
    public static final knk FIXED32;
    public static final knk FIXED64;
    public static final knk FLOAT;
    public static final knk GROUP;
    public static final knk INT32;
    public static final knk INT64;
    public static final knk MESSAGE;
    public static final knk SFIXED32;
    public static final knk SFIXED64;
    public static final knk SINT32;
    public static final knk SINT64;
    public static final knk STRING;
    public static final knk UINT32;
    public static final knk UINT64;
    private final mnk javaType;
    private final int wireType;

    static {
        knk knkVar = new knk("DOUBLE", 0, mnk.DOUBLE, 1);
        DOUBLE = knkVar;
        knk knkVar2 = new knk("FLOAT", 1, mnk.FLOAT, 5);
        FLOAT = knkVar2;
        mnk mnkVar = mnk.LONG;
        knk knkVar3 = new knk("INT64", 2, mnkVar, 0);
        INT64 = knkVar3;
        knk knkVar4 = new knk("UINT64", 3, mnkVar, 0);
        UINT64 = knkVar4;
        mnk mnkVar2 = mnk.INT;
        knk knkVar5 = new knk("INT32", 4, mnkVar2, 0);
        INT32 = knkVar5;
        knk knkVar6 = new knk("FIXED64", 5, mnkVar, 1);
        FIXED64 = knkVar6;
        knk knkVar7 = new knk("FIXED32", 6, mnkVar2, 5);
        FIXED32 = knkVar7;
        knk knkVar8 = new knk("BOOL", 7, mnk.BOOLEAN, 0);
        BOOL = knkVar8;
        knk knkVar9 = new knk("STRING", 8, mnk.STRING, 2);
        STRING = knkVar9;
        mnk mnkVar3 = mnk.MESSAGE;
        knk knkVar10 = new knk("GROUP", 9, mnkVar3, 3);
        GROUP = knkVar10;
        knk knkVar11 = new knk("MESSAGE", 10, mnkVar3, 2);
        MESSAGE = knkVar11;
        knk knkVar12 = new knk("BYTES", 11, mnk.BYTE_STRING, 2);
        BYTES = knkVar12;
        knk knkVar13 = new knk("UINT32", 12, mnkVar2, 0);
        UINT32 = knkVar13;
        knk knkVar14 = new knk("ENUM", 13, mnk.ENUM, 0);
        ENUM = knkVar14;
        knk knkVar15 = new knk("SFIXED32", 14, mnkVar2, 5);
        SFIXED32 = knkVar15;
        knk knkVar16 = new knk("SFIXED64", 15, mnkVar, 1);
        SFIXED64 = knkVar16;
        knk knkVar17 = new knk("SINT32", 16, mnkVar2, 0);
        SINT32 = knkVar17;
        knk knkVar18 = new knk("SINT64", 17, mnkVar, 0);
        SINT64 = knkVar18;
        $VALUES = new knk[]{knkVar, knkVar2, knkVar3, knkVar4, knkVar5, knkVar6, knkVar7, knkVar8, knkVar9, knkVar10, knkVar11, knkVar12, knkVar13, knkVar14, knkVar15, knkVar16, knkVar17, knkVar18};
    }

    public knk(String str, int i, mnk mnkVar, int i2) {
        this.javaType = mnkVar;
        this.wireType = i2;
    }

    public static knk valueOf(String str) {
        return (knk) Enum.valueOf(knk.class, str);
    }

    public static knk[] values() {
        return (knk[]) $VALUES.clone();
    }

    public final mnk a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }
}
