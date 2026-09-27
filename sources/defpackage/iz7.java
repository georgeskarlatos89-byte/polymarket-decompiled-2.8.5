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
public final class iz7 {
    private static final /* synthetic */ iz7[] $VALUES;
    public static final iz7 BOOL;
    public static final iz7 BOOL_LIST;
    public static final iz7 BOOL_LIST_PACKED;
    public static final iz7 BYTES;
    public static final iz7 BYTES_LIST;
    public static final iz7 DOUBLE;
    public static final iz7 DOUBLE_LIST;
    public static final iz7 DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final iz7 ENUM;
    public static final iz7 ENUM_LIST;
    public static final iz7 ENUM_LIST_PACKED;
    public static final iz7 FIXED32;
    public static final iz7 FIXED32_LIST;
    public static final iz7 FIXED32_LIST_PACKED;
    public static final iz7 FIXED64;
    public static final iz7 FIXED64_LIST;
    public static final iz7 FIXED64_LIST_PACKED;
    public static final iz7 FLOAT;
    public static final iz7 FLOAT_LIST;
    public static final iz7 FLOAT_LIST_PACKED;
    public static final iz7 GROUP;
    public static final iz7 GROUP_LIST;
    public static final iz7 INT32;
    public static final iz7 INT32_LIST;
    public static final iz7 INT32_LIST_PACKED;
    public static final iz7 INT64;
    public static final iz7 INT64_LIST;
    public static final iz7 INT64_LIST_PACKED;
    public static final iz7 MAP;
    public static final iz7 MESSAGE;
    public static final iz7 MESSAGE_LIST;
    public static final iz7 SFIXED32;
    public static final iz7 SFIXED32_LIST;
    public static final iz7 SFIXED32_LIST_PACKED;
    public static final iz7 SFIXED64;
    public static final iz7 SFIXED64_LIST;
    public static final iz7 SFIXED64_LIST_PACKED;
    public static final iz7 SINT32;
    public static final iz7 SINT32_LIST;
    public static final iz7 SINT32_LIST_PACKED;
    public static final iz7 SINT64;
    public static final iz7 SINT64_LIST;
    public static final iz7 SINT64_LIST_PACKED;
    public static final iz7 STRING;
    public static final iz7 STRING_LIST;
    public static final iz7 UINT32;
    public static final iz7 UINT32_LIST;
    public static final iz7 UINT32_LIST_PACKED;
    public static final iz7 UINT64;
    public static final iz7 UINT64_LIST;
    public static final iz7 UINT64_LIST_PACKED;
    private static final iz7[] VALUES;
    private final dz7 collection;
    private final Class<?> elementType;
    private final int id;
    private final uba javaType;
    private final boolean primitiveScalar;

    static {
        dz7 dz7Var = dz7.SCALAR;
        uba ubaVar = uba.DOUBLE;
        iz7 iz7Var = new iz7("DOUBLE", 0, 0, dz7Var, ubaVar);
        DOUBLE = iz7Var;
        uba ubaVar2 = uba.FLOAT;
        iz7 iz7Var2 = new iz7("FLOAT", 1, 1, dz7Var, ubaVar2);
        FLOAT = iz7Var2;
        uba ubaVar3 = uba.LONG;
        iz7 iz7Var3 = new iz7("INT64", 2, 2, dz7Var, ubaVar3);
        INT64 = iz7Var3;
        iz7 iz7Var4 = new iz7("UINT64", 3, 3, dz7Var, ubaVar3);
        UINT64 = iz7Var4;
        uba ubaVar4 = uba.INT;
        iz7 iz7Var5 = new iz7("INT32", 4, 4, dz7Var, ubaVar4);
        INT32 = iz7Var5;
        iz7 iz7Var6 = new iz7("FIXED64", 5, 5, dz7Var, ubaVar3);
        FIXED64 = iz7Var6;
        iz7 iz7Var7 = new iz7("FIXED32", 6, 6, dz7Var, ubaVar4);
        FIXED32 = iz7Var7;
        uba ubaVar5 = uba.BOOLEAN;
        iz7 iz7Var8 = new iz7("BOOL", 7, 7, dz7Var, ubaVar5);
        BOOL = iz7Var8;
        uba ubaVar6 = uba.STRING;
        iz7 iz7Var9 = new iz7("STRING", 8, 8, dz7Var, ubaVar6);
        STRING = iz7Var9;
        uba ubaVar7 = uba.MESSAGE;
        iz7 iz7Var10 = new iz7("MESSAGE", 9, 9, dz7Var, ubaVar7);
        MESSAGE = iz7Var10;
        uba ubaVar8 = uba.BYTE_STRING;
        iz7 iz7Var11 = new iz7("BYTES", 10, 10, dz7Var, ubaVar8);
        BYTES = iz7Var11;
        iz7 iz7Var12 = new iz7("UINT32", 11, 11, dz7Var, ubaVar4);
        UINT32 = iz7Var12;
        uba ubaVar9 = uba.ENUM;
        iz7 iz7Var13 = new iz7("ENUM", 12, 12, dz7Var, ubaVar9);
        ENUM = iz7Var13;
        iz7 iz7Var14 = new iz7("SFIXED32", 13, 13, dz7Var, ubaVar4);
        SFIXED32 = iz7Var14;
        iz7 iz7Var15 = new iz7("SFIXED64", 14, 14, dz7Var, ubaVar3);
        SFIXED64 = iz7Var15;
        iz7 iz7Var16 = new iz7("SINT32", 15, 15, dz7Var, ubaVar4);
        SINT32 = iz7Var16;
        iz7 iz7Var17 = new iz7("SINT64", 16, 16, dz7Var, ubaVar3);
        SINT64 = iz7Var17;
        iz7 iz7Var18 = new iz7("GROUP", 17, 17, dz7Var, ubaVar7);
        GROUP = iz7Var18;
        dz7 dz7Var2 = dz7.VECTOR;
        iz7 iz7Var19 = new iz7("DOUBLE_LIST", 18, 18, dz7Var2, ubaVar);
        DOUBLE_LIST = iz7Var19;
        iz7 iz7Var20 = new iz7("FLOAT_LIST", 19, 19, dz7Var2, ubaVar2);
        FLOAT_LIST = iz7Var20;
        iz7 iz7Var21 = new iz7("INT64_LIST", 20, 20, dz7Var2, ubaVar3);
        INT64_LIST = iz7Var21;
        iz7 iz7Var22 = new iz7("UINT64_LIST", 21, 21, dz7Var2, ubaVar3);
        UINT64_LIST = iz7Var22;
        iz7 iz7Var23 = new iz7("INT32_LIST", 22, 22, dz7Var2, ubaVar4);
        INT32_LIST = iz7Var23;
        iz7 iz7Var24 = new iz7("FIXED64_LIST", 23, 23, dz7Var2, ubaVar3);
        FIXED64_LIST = iz7Var24;
        iz7 iz7Var25 = new iz7("FIXED32_LIST", 24, 24, dz7Var2, ubaVar4);
        FIXED32_LIST = iz7Var25;
        iz7 iz7Var26 = new iz7("BOOL_LIST", 25, 25, dz7Var2, ubaVar5);
        BOOL_LIST = iz7Var26;
        iz7 iz7Var27 = new iz7("STRING_LIST", 26, 26, dz7Var2, ubaVar6);
        STRING_LIST = iz7Var27;
        iz7 iz7Var28 = new iz7("MESSAGE_LIST", 27, 27, dz7Var2, ubaVar7);
        MESSAGE_LIST = iz7Var28;
        iz7 iz7Var29 = new iz7("BYTES_LIST", 28, 28, dz7Var2, ubaVar8);
        BYTES_LIST = iz7Var29;
        iz7 iz7Var30 = new iz7("UINT32_LIST", 29, 29, dz7Var2, ubaVar4);
        UINT32_LIST = iz7Var30;
        iz7 iz7Var31 = new iz7("ENUM_LIST", 30, 30, dz7Var2, ubaVar9);
        ENUM_LIST = iz7Var31;
        iz7 iz7Var32 = new iz7("SFIXED32_LIST", 31, 31, dz7Var2, ubaVar4);
        SFIXED32_LIST = iz7Var32;
        iz7 iz7Var33 = new iz7("SFIXED64_LIST", 32, 32, dz7Var2, ubaVar3);
        SFIXED64_LIST = iz7Var33;
        iz7 iz7Var34 = new iz7("SINT32_LIST", 33, 33, dz7Var2, ubaVar4);
        SINT32_LIST = iz7Var34;
        iz7 iz7Var35 = new iz7("SINT64_LIST", 34, 34, dz7Var2, ubaVar3);
        SINT64_LIST = iz7Var35;
        dz7 dz7Var3 = dz7.PACKED_VECTOR;
        iz7 iz7Var36 = new iz7("DOUBLE_LIST_PACKED", 35, 35, dz7Var3, ubaVar);
        DOUBLE_LIST_PACKED = iz7Var36;
        iz7 iz7Var37 = new iz7("FLOAT_LIST_PACKED", 36, 36, dz7Var3, ubaVar2);
        FLOAT_LIST_PACKED = iz7Var37;
        iz7 iz7Var38 = new iz7("INT64_LIST_PACKED", 37, 37, dz7Var3, ubaVar3);
        INT64_LIST_PACKED = iz7Var38;
        iz7 iz7Var39 = new iz7("UINT64_LIST_PACKED", 38, 38, dz7Var3, ubaVar3);
        UINT64_LIST_PACKED = iz7Var39;
        iz7 iz7Var40 = new iz7("INT32_LIST_PACKED", 39, 39, dz7Var3, ubaVar4);
        INT32_LIST_PACKED = iz7Var40;
        iz7 iz7Var41 = new iz7("FIXED64_LIST_PACKED", 40, 40, dz7Var3, ubaVar3);
        FIXED64_LIST_PACKED = iz7Var41;
        iz7 iz7Var42 = new iz7("FIXED32_LIST_PACKED", 41, 41, dz7Var3, ubaVar4);
        FIXED32_LIST_PACKED = iz7Var42;
        iz7 iz7Var43 = new iz7("BOOL_LIST_PACKED", 42, 42, dz7Var3, ubaVar5);
        BOOL_LIST_PACKED = iz7Var43;
        iz7 iz7Var44 = new iz7("UINT32_LIST_PACKED", 43, 43, dz7Var3, ubaVar4);
        UINT32_LIST_PACKED = iz7Var44;
        iz7 iz7Var45 = new iz7("ENUM_LIST_PACKED", 44, 44, dz7Var3, ubaVar9);
        ENUM_LIST_PACKED = iz7Var45;
        iz7 iz7Var46 = new iz7("SFIXED32_LIST_PACKED", 45, 45, dz7Var3, ubaVar4);
        SFIXED32_LIST_PACKED = iz7Var46;
        iz7 iz7Var47 = new iz7("SFIXED64_LIST_PACKED", 46, 46, dz7Var3, ubaVar3);
        SFIXED64_LIST_PACKED = iz7Var47;
        iz7 iz7Var48 = new iz7("SINT32_LIST_PACKED", 47, 47, dz7Var3, ubaVar4);
        SINT32_LIST_PACKED = iz7Var48;
        iz7 iz7Var49 = new iz7("SINT64_LIST_PACKED", 48, 48, dz7Var3, ubaVar3);
        SINT64_LIST_PACKED = iz7Var49;
        iz7 iz7Var50 = new iz7("GROUP_LIST", 49, 49, dz7Var2, ubaVar7);
        GROUP_LIST = iz7Var50;
        iz7 iz7Var51 = new iz7("MAP", 50, 50, dz7.MAP, uba.VOID);
        MAP = iz7Var51;
        $VALUES = new iz7[]{iz7Var, iz7Var2, iz7Var3, iz7Var4, iz7Var5, iz7Var6, iz7Var7, iz7Var8, iz7Var9, iz7Var10, iz7Var11, iz7Var12, iz7Var13, iz7Var14, iz7Var15, iz7Var16, iz7Var17, iz7Var18, iz7Var19, iz7Var20, iz7Var21, iz7Var22, iz7Var23, iz7Var24, iz7Var25, iz7Var26, iz7Var27, iz7Var28, iz7Var29, iz7Var30, iz7Var31, iz7Var32, iz7Var33, iz7Var34, iz7Var35, iz7Var36, iz7Var37, iz7Var38, iz7Var39, iz7Var40, iz7Var41, iz7Var42, iz7Var43, iz7Var44, iz7Var45, iz7Var46, iz7Var47, iz7Var48, iz7Var49, iz7Var50, iz7Var51};
        EMPTY_TYPES = new Type[0];
        iz7[] values = values();
        VALUES = new iz7[values.length];
        for (iz7 iz7Var52 : values) {
            VALUES[iz7Var52.id] = iz7Var52;
        }
    }

    public iz7(String str, int i, int i2, dz7 dz7Var, uba ubaVar) {
        int i3;
        this.id = i2;
        this.collection = dz7Var;
        this.javaType = ubaVar;
        int i4 = bz7.a[dz7Var.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                this.elementType = null;
            } else {
                this.elementType = ubaVar.a();
            }
        } else {
            this.elementType = ubaVar.a();
        }
        this.primitiveScalar = (dz7Var != dz7.SCALAR || (i3 = bz7.b[ubaVar.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    public static iz7 valueOf(String str) {
        return (iz7) Enum.valueOf(iz7.class, str);
    }

    public static iz7[] values() {
        return (iz7[]) $VALUES.clone();
    }

    public final int a() {
        return this.id;
    }
}
