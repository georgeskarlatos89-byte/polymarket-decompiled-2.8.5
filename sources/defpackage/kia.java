package defpackage;

import com.socure.docv.capturesdk.api.Keys;
import io.intercom.android.sdk.models.AttributeType;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum kia {
    BOOLEAN(c6f.BOOLEAN, AttributeType.BOOLEAN, "Z", "java.lang.Boolean"),
    CHAR(c6f.CHAR, "char", "C", "java.lang.Character"),
    BYTE(c6f.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(c6f.SHORT, "short", "S", "java.lang.Short"),
    INT(c6f.INT, "int", "I", "java.lang.Integer"),
    FLOAT(c6f.FLOAT, AttributeType.FLOAT, "F", "java.lang.Float"),
    LONG(c6f.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(c6f.DOUBLE, "double", "D", "java.lang.Double");

    private final String desc;
    private final String name;
    private final c6f primitiveType;
    private final xl8 wrapperFqName;
    private static final Map<String, kia> TYPE_BY_NAME = new HashMap();
    private static final Map<c6f, kia> TYPE_BY_PRIMITIVE_TYPE = new EnumMap(c6f.class);
    private static final Map<String, kia> TYPE_BY_DESC = new HashMap();
    private static final Set<String> WRAPPER_CLASS_INTERNAL_NAMES = new HashSet();
    private static final Map<String, String> OWNER_TO_BOXING_METHOD_DESCRIPTOR = new HashMap();

    static {
        for (kia kiaVar : values()) {
            TYPE_BY_NAME.put(kiaVar.e(), kiaVar);
            TYPE_BY_PRIMITIVE_TYPE.put(kiaVar.f(), kiaVar);
            TYPE_BY_DESC.put(kiaVar.d(), kiaVar);
            String replace = kiaVar.wrapperFqName.a.a.replace('.', '/');
            WRAPPER_CLASS_INTERNAL_NAMES.add(replace);
            OWNER_TO_BOXING_METHOD_DESCRIPTOR.put(replace, sv6.p(new StringBuilder("("), kiaVar.desc, ")L", replace, ";"));
        }
    }

    kia(c6f c6fVar, String str, String str2, String str3) {
        if (c6fVar != null) {
            this.primitiveType = c6fVar;
            this.name = str;
            this.desc = str2;
            this.wrapperFqName = new xl8(str3);
            return;
        }
        a(8);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Object[] objArr;
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 4 && i != 6) {
                switch (i) {
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                objArr = new Object[i2];
                switch (i) {
                    case 1:
                        objArr[0] = "owner";
                        break;
                    case 2:
                        objArr[0] = "methodDescriptor";
                        break;
                    case 3:
                    case 9:
                        objArr[0] = Keys.KEY_NAME;
                        break;
                    case 4:
                    case 6:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                        break;
                    case 5:
                        objArr[0] = "type";
                        break;
                    case 7:
                    case 10:
                        objArr[0] = "desc";
                        break;
                    case 8:
                        objArr[0] = "primitiveType";
                        break;
                    case 11:
                        objArr[0] = "wrapperClassName";
                        break;
                    default:
                        objArr[0] = "internalName";
                        break;
                }
                if (i == 4 && i != 6) {
                    switch (i) {
                        case 12:
                            objArr[1] = "getPrimitiveType";
                            break;
                        case 13:
                            objArr[1] = "getJavaKeywordName";
                            break;
                        case 14:
                            objArr[1] = "getDesc";
                            break;
                        case 15:
                            objArr[1] = "getWrapperFqName";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                            break;
                    }
                } else {
                    objArr[1] = "get";
                }
                switch (i) {
                    case 1:
                    case 2:
                        objArr[2] = "isBoxingMethodDescriptor";
                        break;
                    case 3:
                    case 5:
                        objArr[2] = "get";
                        break;
                    case 4:
                    case 6:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 7:
                        objArr[2] = "getByDesc";
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        objArr[2] = "<init>";
                        break;
                    default:
                        objArr[2] = "isWrapperClassInternalName";
                        break;
                }
                String format = String.format(str, objArr);
                if (i != 4 && i != 6) {
                    switch (i) {
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i2 = 2;
            objArr = new Object[i2];
            switch (i) {
            }
            if (i == 4) {
            }
            objArr[1] = "get";
            switch (i) {
            }
            String format2 = String.format(str, objArr);
            if (i != 4) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 4) {
            switch (i) {
            }
            objArr = new Object[i2];
            switch (i) {
            }
            if (i == 4) {
            }
            objArr[1] = "get";
            switch (i) {
            }
            String format22 = String.format(str, objArr);
            if (i != 4) {
            }
            throw new IllegalStateException(format22);
        }
        i2 = 2;
        objArr = new Object[i2];
        switch (i) {
        }
        if (i == 4) {
        }
        objArr[1] = "get";
        switch (i) {
        }
        String format222 = String.format(str, objArr);
        if (i != 4) {
        }
        throw new IllegalStateException(format222);
    }

    public static kia b(c6f c6fVar) {
        kia kiaVar = TYPE_BY_PRIMITIVE_TYPE.get(c6fVar);
        if (kiaVar != null) {
            return kiaVar;
        }
        a(6);
        throw null;
    }

    public static kia c(String str) {
        kia kiaVar = TYPE_BY_NAME.get(str);
        if (kiaVar != null) {
            return kiaVar;
        }
        dmk.i("Non-primitive type name passed: ".concat(str));
        return null;
    }

    public final String d() {
        String str = this.desc;
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final String e() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        a(13);
        throw null;
    }

    public final c6f f() {
        c6f c6fVar = this.primitiveType;
        if (c6fVar != null) {
            return c6fVar;
        }
        a(12);
        throw null;
    }

    public final xl8 g() {
        xl8 xl8Var = this.wrapperFqName;
        if (xl8Var != null) {
            return xl8Var;
        }
        a(15);
        throw null;
    }
}
