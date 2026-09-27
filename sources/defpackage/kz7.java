package defpackage;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class kz7 {
    private static final /* synthetic */ kz7[] $VALUES;
    public static final kz7 BOOL;
    public static final kz7 BOOL_LIST;
    public static final kz7 BOOL_LIST_PACKED;
    public static final kz7 BYTES;
    public static final kz7 BYTES_LIST;
    public static final kz7 DOUBLE;
    public static final kz7 DOUBLE_LIST;
    public static final kz7 DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final kz7 ENUM;
    public static final kz7 ENUM_LIST;
    public static final kz7 ENUM_LIST_PACKED;
    public static final kz7 FIXED32;
    public static final kz7 FIXED32_LIST;
    public static final kz7 FIXED32_LIST_PACKED;
    public static final kz7 FIXED64;
    public static final kz7 FIXED64_LIST;
    public static final kz7 FIXED64_LIST_PACKED;
    public static final kz7 FLOAT;
    public static final kz7 FLOAT_LIST;
    public static final kz7 FLOAT_LIST_PACKED;
    public static final kz7 GROUP;
    public static final kz7 GROUP_LIST;
    public static final kz7 INT32;
    public static final kz7 INT32_LIST;
    public static final kz7 INT32_LIST_PACKED;
    public static final kz7 INT64;
    public static final kz7 INT64_LIST;
    public static final kz7 INT64_LIST_PACKED;
    public static final kz7 MAP;
    public static final kz7 MESSAGE;
    public static final kz7 MESSAGE_LIST;
    public static final kz7 SFIXED32;
    public static final kz7 SFIXED32_LIST;
    public static final kz7 SFIXED32_LIST_PACKED;
    public static final kz7 SFIXED64;
    public static final kz7 SFIXED64_LIST;
    public static final kz7 SFIXED64_LIST_PACKED;
    public static final kz7 SINT32;
    public static final kz7 SINT32_LIST;
    public static final kz7 SINT32_LIST_PACKED;
    public static final kz7 SINT64;
    public static final kz7 SINT64_LIST;
    public static final kz7 SINT64_LIST_PACKED;
    public static final kz7 STRING;
    public static final kz7 STRING_LIST;
    public static final kz7 UINT32;
    public static final kz7 UINT32_LIST;
    public static final kz7 UINT32_LIST_PACKED;
    public static final kz7 UINT64;
    public static final kz7 UINT64_LIST;
    public static final kz7 UINT64_LIST_PACKED;
    private static final kz7[] VALUES;
    private final ez7 collection;
    private final Class<?> elementType;
    private final int id;
    private final vba javaType;
    private final boolean primitiveScalar;

    static {
        ez7 ez7Var = ez7.SCALAR;
        vba vbaVar = vba.DOUBLE;
        kz7 kz7Var = new kz7("DOUBLE", 0, 0, ez7Var, vbaVar);
        DOUBLE = kz7Var;
        vba vbaVar2 = vba.FLOAT;
        kz7 kz7Var2 = new kz7("FLOAT", 1, 1, ez7Var, vbaVar2);
        FLOAT = kz7Var2;
        vba vbaVar3 = vba.LONG;
        kz7 kz7Var3 = new kz7("INT64", 2, 2, ez7Var, vbaVar3);
        INT64 = kz7Var3;
        kz7 kz7Var4 = new kz7("UINT64", 3, 3, ez7Var, vbaVar3);
        UINT64 = kz7Var4;
        vba vbaVar4 = vba.INT;
        kz7 kz7Var5 = new kz7("INT32", 4, 4, ez7Var, vbaVar4);
        INT32 = kz7Var5;
        kz7 kz7Var6 = new kz7("FIXED64", 5, 5, ez7Var, vbaVar3);
        FIXED64 = kz7Var6;
        kz7 kz7Var7 = new kz7("FIXED32", 6, 6, ez7Var, vbaVar4);
        FIXED32 = kz7Var7;
        vba vbaVar5 = vba.BOOLEAN;
        kz7 kz7Var8 = new kz7("BOOL", 7, 7, ez7Var, vbaVar5);
        BOOL = kz7Var8;
        vba vbaVar6 = vba.STRING;
        kz7 kz7Var9 = new kz7("STRING", 8, 8, ez7Var, vbaVar6);
        STRING = kz7Var9;
        vba vbaVar7 = vba.MESSAGE;
        kz7 kz7Var10 = new kz7("MESSAGE", 9, 9, ez7Var, vbaVar7);
        MESSAGE = kz7Var10;
        vba vbaVar8 = vba.BYTE_STRING;
        kz7 kz7Var11 = new kz7("BYTES", 10, 10, ez7Var, vbaVar8);
        BYTES = kz7Var11;
        kz7 kz7Var12 = new kz7("UINT32", 11, 11, ez7Var, vbaVar4);
        UINT32 = kz7Var12;
        vba vbaVar9 = vba.ENUM;
        kz7 kz7Var13 = new kz7("ENUM", 12, 12, ez7Var, vbaVar9);
        ENUM = kz7Var13;
        kz7 kz7Var14 = new kz7("SFIXED32", 13, 13, ez7Var, vbaVar4);
        SFIXED32 = kz7Var14;
        kz7 kz7Var15 = new kz7("SFIXED64", 14, 14, ez7Var, vbaVar3);
        SFIXED64 = kz7Var15;
        kz7 kz7Var16 = new kz7("SINT32", 15, 15, ez7Var, vbaVar4);
        SINT32 = kz7Var16;
        kz7 kz7Var17 = new kz7("SINT64", 16, 16, ez7Var, vbaVar3);
        SINT64 = kz7Var17;
        kz7 kz7Var18 = new kz7("GROUP", 17, 17, ez7Var, vbaVar7);
        GROUP = kz7Var18;
        ez7 ez7Var2 = ez7.VECTOR;
        kz7 kz7Var19 = new kz7("DOUBLE_LIST", 18, 18, ez7Var2, vbaVar);
        DOUBLE_LIST = kz7Var19;
        kz7 kz7Var20 = new kz7("FLOAT_LIST", 19, 19, ez7Var2, vbaVar2);
        FLOAT_LIST = kz7Var20;
        kz7 kz7Var21 = new kz7("INT64_LIST", 20, 20, ez7Var2, vbaVar3);
        INT64_LIST = kz7Var21;
        kz7 kz7Var22 = new kz7("UINT64_LIST", 21, 21, ez7Var2, vbaVar3);
        UINT64_LIST = kz7Var22;
        kz7 kz7Var23 = new kz7("INT32_LIST", 22, 22, ez7Var2, vbaVar4);
        INT32_LIST = kz7Var23;
        kz7 kz7Var24 = new kz7("FIXED64_LIST", 23, 23, ez7Var2, vbaVar3);
        FIXED64_LIST = kz7Var24;
        kz7 kz7Var25 = new kz7("FIXED32_LIST", 24, 24, ez7Var2, vbaVar4);
        FIXED32_LIST = kz7Var25;
        kz7 kz7Var26 = new kz7("BOOL_LIST", 25, 25, ez7Var2, vbaVar5);
        BOOL_LIST = kz7Var26;
        kz7 kz7Var27 = new kz7("STRING_LIST", 26, 26, ez7Var2, vbaVar6);
        STRING_LIST = kz7Var27;
        kz7 kz7Var28 = new kz7("MESSAGE_LIST", 27, 27, ez7Var2, vbaVar7);
        MESSAGE_LIST = kz7Var28;
        kz7 kz7Var29 = new kz7("BYTES_LIST", 28, 28, ez7Var2, vbaVar8);
        BYTES_LIST = kz7Var29;
        kz7 kz7Var30 = new kz7("UINT32_LIST", 29, 29, ez7Var2, vbaVar4);
        UINT32_LIST = kz7Var30;
        kz7 kz7Var31 = new kz7("ENUM_LIST", 30, 30, ez7Var2, vbaVar9);
        ENUM_LIST = kz7Var31;
        kz7 kz7Var32 = new kz7("SFIXED32_LIST", 31, 31, ez7Var2, vbaVar4);
        SFIXED32_LIST = kz7Var32;
        kz7 kz7Var33 = new kz7("SFIXED64_LIST", 32, 32, ez7Var2, vbaVar3);
        SFIXED64_LIST = kz7Var33;
        kz7 kz7Var34 = new kz7("SINT32_LIST", 33, 33, ez7Var2, vbaVar4);
        SINT32_LIST = kz7Var34;
        kz7 kz7Var35 = new kz7("SINT64_LIST", 34, 34, ez7Var2, vbaVar3);
        SINT64_LIST = kz7Var35;
        ez7 ez7Var3 = ez7.PACKED_VECTOR;
        kz7 kz7Var36 = new kz7("DOUBLE_LIST_PACKED", 35, 35, ez7Var3, vbaVar);
        DOUBLE_LIST_PACKED = kz7Var36;
        kz7 kz7Var37 = new kz7("FLOAT_LIST_PACKED", 36, 36, ez7Var3, vbaVar2);
        FLOAT_LIST_PACKED = kz7Var37;
        kz7 kz7Var38 = new kz7("INT64_LIST_PACKED", 37, 37, ez7Var3, vbaVar3);
        INT64_LIST_PACKED = kz7Var38;
        kz7 kz7Var39 = new kz7("UINT64_LIST_PACKED", 38, 38, ez7Var3, vbaVar3);
        UINT64_LIST_PACKED = kz7Var39;
        kz7 kz7Var40 = new kz7("INT32_LIST_PACKED", 39, 39, ez7Var3, vbaVar4);
        INT32_LIST_PACKED = kz7Var40;
        kz7 kz7Var41 = new kz7("FIXED64_LIST_PACKED", 40, 40, ez7Var3, vbaVar3);
        FIXED64_LIST_PACKED = kz7Var41;
        kz7 kz7Var42 = new kz7("FIXED32_LIST_PACKED", 41, 41, ez7Var3, vbaVar4);
        FIXED32_LIST_PACKED = kz7Var42;
        kz7 kz7Var43 = new kz7("BOOL_LIST_PACKED", 42, 42, ez7Var3, vbaVar5);
        BOOL_LIST_PACKED = kz7Var43;
        kz7 kz7Var44 = new kz7("UINT32_LIST_PACKED", 43, 43, ez7Var3, vbaVar4);
        UINT32_LIST_PACKED = kz7Var44;
        kz7 kz7Var45 = new kz7("ENUM_LIST_PACKED", 44, 44, ez7Var3, vbaVar9);
        ENUM_LIST_PACKED = kz7Var45;
        kz7 kz7Var46 = new kz7("SFIXED32_LIST_PACKED", 45, 45, ez7Var3, vbaVar4);
        SFIXED32_LIST_PACKED = kz7Var46;
        kz7 kz7Var47 = new kz7("SFIXED64_LIST_PACKED", 46, 46, ez7Var3, vbaVar3);
        SFIXED64_LIST_PACKED = kz7Var47;
        kz7 kz7Var48 = new kz7("SINT32_LIST_PACKED", 47, 47, ez7Var3, vbaVar4);
        SINT32_LIST_PACKED = kz7Var48;
        kz7 kz7Var49 = new kz7("SINT64_LIST_PACKED", 48, 48, ez7Var3, vbaVar3);
        SINT64_LIST_PACKED = kz7Var49;
        kz7 kz7Var50 = new kz7("GROUP_LIST", 49, 49, ez7Var2, vbaVar7);
        GROUP_LIST = kz7Var50;
        kz7 kz7Var51 = new kz7("MAP", 50, 50, ez7.MAP, vba.VOID);
        MAP = kz7Var51;
        $VALUES = new kz7[]{kz7Var, kz7Var2, kz7Var3, kz7Var4, kz7Var5, kz7Var6, kz7Var7, kz7Var8, kz7Var9, kz7Var10, kz7Var11, kz7Var12, kz7Var13, kz7Var14, kz7Var15, kz7Var16, kz7Var17, kz7Var18, kz7Var19, kz7Var20, kz7Var21, kz7Var22, kz7Var23, kz7Var24, kz7Var25, kz7Var26, kz7Var27, kz7Var28, kz7Var29, kz7Var30, kz7Var31, kz7Var32, kz7Var33, kz7Var34, kz7Var35, kz7Var36, kz7Var37, kz7Var38, kz7Var39, kz7Var40, kz7Var41, kz7Var42, kz7Var43, kz7Var44, kz7Var45, kz7Var46, kz7Var47, kz7Var48, kz7Var49, kz7Var50, kz7Var51};
        EMPTY_TYPES = new Type[0];
        kz7[] values = values();
        VALUES = new kz7[values.length];
        for (kz7 kz7Var52 : values) {
            VALUES[kz7Var52.id] = kz7Var52;
        }
    }

    public kz7(String str, int i, int i2, ez7 ez7Var, vba vbaVar) {
        int i3;
        this.id = i2;
        this.collection = ez7Var;
        this.javaType = vbaVar;
        int i4 = cz7.a[ez7Var.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                this.elementType = null;
            } else {
                this.elementType = vbaVar.a();
            }
        } else {
            this.elementType = vbaVar.a();
        }
        this.primitiveScalar = (ez7Var != ez7.SCALAR || (i3 = cz7.b[vbaVar.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    public static kz7 valueOf(String str) {
        return (kz7) Enum.valueOf(kz7.class, str);
    }

    public static kz7[] values() {
        return (kz7[]) $VALUES.clone();
    }

    public final int a() {
        return this.id;
    }
}
