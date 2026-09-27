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
public final class vba {
    private static final /* synthetic */ vba[] $VALUES;
    public static final vba BOOLEAN;
    public static final vba BYTE_STRING;
    public static final vba DOUBLE;
    public static final vba ENUM;
    public static final vba FLOAT;
    public static final vba INT;
    public static final vba LONG;
    public static final vba MESSAGE;
    public static final vba STRING;
    public static final vba VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        vba vbaVar = new vba("VOID", 0, Void.class, Void.class, null);
        VOID = vbaVar;
        Class cls = Integer.TYPE;
        vba vbaVar2 = new vba("INT", 1, cls, Integer.class, 0);
        INT = vbaVar2;
        vba vbaVar3 = new vba("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = vbaVar3;
        vba vbaVar4 = new vba("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = vbaVar4;
        vba vbaVar5 = new vba("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(ConstantsKt.UNSET));
        DOUBLE = vbaVar5;
        vba vbaVar6 = new vba("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = vbaVar6;
        vba vbaVar7 = new vba("STRING", 6, String.class, String.class, "");
        STRING = vbaVar7;
        vba vbaVar8 = new vba("BYTE_STRING", 7, dw1.class, dw1.class, dw1.c);
        BYTE_STRING = vbaVar8;
        vba vbaVar9 = new vba("ENUM", 8, cls, Integer.class, null);
        ENUM = vbaVar9;
        vba vbaVar10 = new vba("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = vbaVar10;
        $VALUES = new vba[]{vbaVar, vbaVar2, vbaVar3, vbaVar4, vbaVar5, vbaVar6, vbaVar7, vbaVar8, vbaVar9, vbaVar10};
    }

    public vba(String str, int i, Class cls, Class cls2, Serializable serializable) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static vba valueOf(String str) {
        return (vba) Enum.valueOf(vba.class, str);
    }

    public static vba[] values() {
        return (vba[]) $VALUES.clone();
    }

    public final Class a() {
        return this.boxedType;
    }
}
