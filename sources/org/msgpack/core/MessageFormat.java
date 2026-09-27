package org.msgpack.core;

import defpackage.x3k;
import org.msgpack.core.MessagePack;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'POSFIXINT' uses external variables
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
public final class MessageFormat {
    private static final /* synthetic */ MessageFormat[] $VALUES;
    public static final MessageFormat ARRAY16;
    public static final MessageFormat ARRAY32;
    public static final MessageFormat BIN16;
    public static final MessageFormat BIN32;
    public static final MessageFormat BIN8;
    public static final MessageFormat BOOLEAN;
    public static final MessageFormat EXT16;
    public static final MessageFormat EXT32;
    public static final MessageFormat EXT8;
    public static final MessageFormat FIXARRAY;
    public static final MessageFormat FIXEXT1;
    public static final MessageFormat FIXEXT16;
    public static final MessageFormat FIXEXT2;
    public static final MessageFormat FIXEXT4;
    public static final MessageFormat FIXEXT8;
    public static final MessageFormat FIXMAP;
    public static final MessageFormat FIXSTR;
    public static final MessageFormat FLOAT32;
    public static final MessageFormat FLOAT64;
    public static final MessageFormat INT16;
    public static final MessageFormat INT32;
    public static final MessageFormat INT64;
    public static final MessageFormat INT8;
    public static final MessageFormat MAP16;
    public static final MessageFormat MAP32;
    public static final MessageFormat NEGFIXINT;
    public static final MessageFormat NEVER_USED;
    public static final MessageFormat NIL;
    public static final MessageFormat POSFIXINT;
    public static final MessageFormat STR16;
    public static final MessageFormat STR32;
    public static final MessageFormat STR8;
    public static final MessageFormat UINT16;
    public static final MessageFormat UINT32;
    public static final MessageFormat UINT64;
    public static final MessageFormat UINT8;
    private static final MessageFormat[] formatTable;
    private final x3k valueType;

    static {
        x3k x3kVar = x3k.INTEGER;
        MessageFormat messageFormat = new MessageFormat("POSFIXINT", 0, x3kVar);
        POSFIXINT = messageFormat;
        x3k x3kVar2 = x3k.MAP;
        MessageFormat messageFormat2 = new MessageFormat("FIXMAP", 1, x3kVar2);
        FIXMAP = messageFormat2;
        x3k x3kVar3 = x3k.ARRAY;
        MessageFormat messageFormat3 = new MessageFormat("FIXARRAY", 2, x3kVar3);
        FIXARRAY = messageFormat3;
        x3k x3kVar4 = x3k.STRING;
        MessageFormat messageFormat4 = new MessageFormat("FIXSTR", 3, x3kVar4);
        FIXSTR = messageFormat4;
        MessageFormat messageFormat5 = new MessageFormat("NIL", 4, x3k.NIL);
        NIL = messageFormat5;
        MessageFormat messageFormat6 = new MessageFormat("NEVER_USED", 5, null);
        NEVER_USED = messageFormat6;
        MessageFormat messageFormat7 = new MessageFormat("BOOLEAN", 6, x3k.BOOLEAN);
        BOOLEAN = messageFormat7;
        x3k x3kVar5 = x3k.BINARY;
        MessageFormat messageFormat8 = new MessageFormat("BIN8", 7, x3kVar5);
        BIN8 = messageFormat8;
        MessageFormat messageFormat9 = new MessageFormat("BIN16", 8, x3kVar5);
        BIN16 = messageFormat9;
        MessageFormat messageFormat10 = new MessageFormat("BIN32", 9, x3kVar5);
        BIN32 = messageFormat10;
        x3k x3kVar6 = x3k.EXTENSION;
        MessageFormat messageFormat11 = new MessageFormat("EXT8", 10, x3kVar6);
        EXT8 = messageFormat11;
        MessageFormat messageFormat12 = new MessageFormat("EXT16", 11, x3kVar6);
        EXT16 = messageFormat12;
        MessageFormat messageFormat13 = new MessageFormat("EXT32", 12, x3kVar6);
        EXT32 = messageFormat13;
        x3k x3kVar7 = x3k.FLOAT;
        MessageFormat messageFormat14 = new MessageFormat("FLOAT32", 13, x3kVar7);
        FLOAT32 = messageFormat14;
        MessageFormat messageFormat15 = new MessageFormat("FLOAT64", 14, x3kVar7);
        FLOAT64 = messageFormat15;
        MessageFormat messageFormat16 = new MessageFormat("UINT8", 15, x3kVar);
        UINT8 = messageFormat16;
        MessageFormat messageFormat17 = new MessageFormat("UINT16", 16, x3kVar);
        UINT16 = messageFormat17;
        MessageFormat messageFormat18 = new MessageFormat("UINT32", 17, x3kVar);
        UINT32 = messageFormat18;
        MessageFormat messageFormat19 = new MessageFormat("UINT64", 18, x3kVar);
        UINT64 = messageFormat19;
        MessageFormat messageFormat20 = new MessageFormat("INT8", 19, x3kVar);
        INT8 = messageFormat20;
        MessageFormat messageFormat21 = new MessageFormat("INT16", 20, x3kVar);
        INT16 = messageFormat21;
        MessageFormat messageFormat22 = new MessageFormat("INT32", 21, x3kVar);
        INT32 = messageFormat22;
        MessageFormat messageFormat23 = new MessageFormat("INT64", 22, x3kVar);
        INT64 = messageFormat23;
        MessageFormat messageFormat24 = new MessageFormat("FIXEXT1", 23, x3kVar6);
        FIXEXT1 = messageFormat24;
        MessageFormat messageFormat25 = new MessageFormat("FIXEXT2", 24, x3kVar6);
        FIXEXT2 = messageFormat25;
        MessageFormat messageFormat26 = new MessageFormat("FIXEXT4", 25, x3kVar6);
        FIXEXT4 = messageFormat26;
        MessageFormat messageFormat27 = new MessageFormat("FIXEXT8", 26, x3kVar6);
        FIXEXT8 = messageFormat27;
        MessageFormat messageFormat28 = new MessageFormat("FIXEXT16", 27, x3kVar6);
        FIXEXT16 = messageFormat28;
        MessageFormat messageFormat29 = new MessageFormat("STR8", 28, x3kVar4);
        STR8 = messageFormat29;
        MessageFormat messageFormat30 = new MessageFormat("STR16", 29, x3kVar4);
        STR16 = messageFormat30;
        MessageFormat messageFormat31 = new MessageFormat("STR32", 30, x3kVar4);
        STR32 = messageFormat31;
        MessageFormat messageFormat32 = new MessageFormat("ARRAY16", 31, x3kVar3);
        ARRAY16 = messageFormat32;
        MessageFormat messageFormat33 = new MessageFormat("ARRAY32", 32, x3kVar3);
        ARRAY32 = messageFormat33;
        MessageFormat messageFormat34 = new MessageFormat("MAP16", 33, x3kVar2);
        MAP16 = messageFormat34;
        MessageFormat messageFormat35 = new MessageFormat("MAP32", 34, x3kVar2);
        MAP32 = messageFormat35;
        MessageFormat messageFormat36 = new MessageFormat("NEGFIXINT", 35, x3kVar);
        NEGFIXINT = messageFormat36;
        $VALUES = new MessageFormat[]{messageFormat, messageFormat2, messageFormat3, messageFormat4, messageFormat5, messageFormat6, messageFormat7, messageFormat8, messageFormat9, messageFormat10, messageFormat11, messageFormat12, messageFormat13, messageFormat14, messageFormat15, messageFormat16, messageFormat17, messageFormat18, messageFormat19, messageFormat20, messageFormat21, messageFormat22, messageFormat23, messageFormat24, messageFormat25, messageFormat26, messageFormat27, messageFormat28, messageFormat29, messageFormat30, messageFormat31, messageFormat32, messageFormat33, messageFormat34, messageFormat35, messageFormat36};
        formatTable = new MessageFormat[256];
        for (int i = 0; i <= 255; i++) {
            formatTable[i] = toMessageFormat((byte) i);
        }
    }

    private MessageFormat(String str, int i, x3k x3kVar) {
        this.valueType = x3kVar;
    }

    public static MessageFormat toMessageFormat(byte b) {
        if (MessagePack.Code.isPosFixInt(b)) {
            return POSFIXINT;
        }
        if (MessagePack.Code.isNegFixInt(b)) {
            return NEGFIXINT;
        }
        if (MessagePack.Code.isFixStr(b)) {
            return FIXSTR;
        }
        if (MessagePack.Code.isFixedArray(b)) {
            return FIXARRAY;
        }
        if (MessagePack.Code.isFixedMap(b)) {
            return FIXMAP;
        }
        switch (b) {
            case -64:
                return NIL;
            case -63:
            default:
                return NEVER_USED;
            case -62:
            case -61:
                return BOOLEAN;
            case -60:
                return BIN8;
            case -59:
                return BIN16;
            case -58:
                return BIN32;
            case -57:
                return EXT8;
            case -56:
                return EXT16;
            case -55:
                return EXT32;
            case -54:
                return FLOAT32;
            case -53:
                return FLOAT64;
            case -52:
                return UINT8;
            case -51:
                return UINT16;
            case -50:
                return UINT32;
            case -49:
                return UINT64;
            case -48:
                return INT8;
            case -47:
                return INT16;
            case -46:
                return INT32;
            case -45:
                return INT64;
            case -44:
                return FIXEXT1;
            case -43:
                return FIXEXT2;
            case -42:
                return FIXEXT4;
            case -41:
                return FIXEXT8;
            case -40:
                return FIXEXT16;
            case -39:
                return STR8;
            case -38:
                return STR16;
            case -37:
                return STR32;
            case -36:
                return ARRAY16;
            case -35:
                return ARRAY32;
            case -34:
                return MAP16;
            case -33:
                return MAP32;
        }
    }

    public static MessageFormat valueOf(String str) {
        return (MessageFormat) Enum.valueOf(MessageFormat.class, str);
    }

    public static MessageFormat[] values() {
        return (MessageFormat[]) $VALUES.clone();
    }

    public x3k getValueType() {
        if (this != NEVER_USED) {
            return this.valueType;
        }
        throw new MessageFormatException("Cannot convert NEVER_USED to ValueType");
    }

    public static MessageFormat valueOf(byte b) {
        return formatTable[b & MessagePack.Code.EXT_TIMESTAMP];
    }
}
