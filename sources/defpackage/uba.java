package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
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
public final class uba {
    private static final /* synthetic */ uba[] $VALUES;
    public static final uba BOOLEAN;
    public static final uba BYTE_STRING;
    public static final uba DOUBLE;
    public static final uba ENUM;
    public static final uba FLOAT;
    public static final uba INT;
    public static final uba LONG;
    public static final uba MESSAGE;
    public static final uba STRING;
    public static final uba VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        uba ubaVar = new uba("VOID", 0, Void.class, Void.class, null);
        VOID = ubaVar;
        Class cls = Integer.TYPE;
        uba ubaVar2 = new uba("INT", 1, cls, Integer.class, 0);
        INT = ubaVar2;
        uba ubaVar3 = new uba("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = ubaVar3;
        uba ubaVar4 = new uba("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = ubaVar4;
        uba ubaVar5 = new uba("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(ConstantsKt.UNSET));
        DOUBLE = ubaVar5;
        uba ubaVar6 = new uba("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = ubaVar6;
        uba ubaVar7 = new uba("STRING", 6, String.class, String.class, "");
        STRING = ubaVar7;
        uba ubaVar8 = new uba("BYTE_STRING", 7, fw1.class, fw1.class, fw1.b);
        BYTE_STRING = ubaVar8;
        uba ubaVar9 = new uba("ENUM", 8, cls, Integer.class, null);
        ENUM = ubaVar9;
        uba ubaVar10 = new uba("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = ubaVar10;
        $VALUES = new uba[]{ubaVar, ubaVar2, ubaVar3, ubaVar4, ubaVar5, ubaVar6, ubaVar7, ubaVar8, ubaVar9, ubaVar10};
    }

    public uba(String str, int i, Class cls, Class cls2, Serializable serializable) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static uba valueOf(String str) {
        return (uba) Enum.valueOf(uba.class, str);
    }

    public static uba[] values() {
        return (uba[]) $VALUES.clone();
    }

    public final Class a() {
        return this.boxedType;
    }
}
