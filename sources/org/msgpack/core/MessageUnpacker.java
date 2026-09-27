package org.msgpack.core;

import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import com.socure.docv.capturesdk.common.utils.SelfieConstants;
import defpackage.ace;
import defpackage.as9;
import defpackage.b4k;
import defpackage.bd0;
import defpackage.br9;
import defpackage.dmk;
import defpackage.h3k;
import defpackage.kr9;
import defpackage.or9;
import defpackage.pr9;
import defpackage.rq9;
import defpackage.sq9;
import defpackage.sv6;
import defpackage.vq9;
import defpackage.w2;
import defpackage.x3k;
import defpackage.yq9;
import defpackage.zh4;
import defpackage.zr9;
import io.intercom.android.sdk.models.AttributeType;
import java.io.Closeable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import org.msgpack.core.MessagePack;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class MessageUnpacker implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final MessageBuffer EMPTY_BUFFER = MessageBuffer.wrap(new byte[0]);
    private static final String EMPTY_STRING = "";
    private static final int GRADUAL_ALLOCATION_THRESHOLD = 67108864;
    private final CodingErrorAction actionOnMalformedString;
    private final CodingErrorAction actionOnUnmappableString;
    private final boolean allowReadingBinaryAsString;
    private final boolean allowReadingStringAsBinary;
    private CharBuffer decodeBuffer;
    private StringBuilder decodeStringBuffer;
    private CharsetDecoder decoder;
    private MessageBufferInput in;
    private int nextReadPosition;
    private int position;
    private final int stringDecoderBufferSize;
    private final int stringSizeLimit;
    private long totalReadBytes;
    private MessageBuffer buffer = EMPTY_BUFFER;
    private final MessageBuffer numberBuffer = MessageBuffer.allocate(8);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* renamed from: org.msgpack.core.MessageUnpacker$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$core$MessageFormat;
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$value$ValueType;

        static {
            int[] iArr = new int[x3k.values().length];
            $SwitchMap$org$msgpack$value$ValueType = iArr;
            try {
                iArr[x3k.NIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[x3k.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[x3k.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[x3k.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[x3k.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[x3k.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[x3k.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[x3k.MAP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[x3k.EXTENSION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[MessageFormat.values().length];
            $SwitchMap$org$msgpack$core$MessageFormat = iArr2;
            try {
                iArr2[MessageFormat.POSFIXINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.NEGFIXINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.NIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXMAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXSTR.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT8.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT8.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT16.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT16.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FLOAT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FLOAT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BIN8.ordinal()] = 18;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.STR8.ordinal()] = 19;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BIN16.ordinal()] = 20;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.STR16.ordinal()] = 21;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BIN32.ordinal()] = 22;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.STR32.ordinal()] = 23;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT1.ordinal()] = 24;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT2.ordinal()] = 25;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT4.ordinal()] = 26;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT8.ordinal()] = 27;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT16.ordinal()] = 28;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.EXT8.ordinal()] = 29;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.EXT16.ordinal()] = 30;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.EXT32.ordinal()] = 31;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.ARRAY16.ordinal()] = 32;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.ARRAY32.ordinal()] = 33;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.MAP16.ordinal()] = 34;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.MAP32.ordinal()] = 35;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.NEVER_USED.ordinal()] = 36;
            } catch (NoSuchFieldError unused45) {
            }
        }
    }

    public MessageUnpacker(MessageBufferInput messageBufferInput, MessagePack.UnpackerConfig unpackerConfig) {
        this.in = (MessageBufferInput) Preconditions.checkNotNull(messageBufferInput, "MessageBufferInput is null");
        this.allowReadingStringAsBinary = unpackerConfig.getAllowReadingStringAsBinary();
        this.allowReadingBinaryAsString = unpackerConfig.getAllowReadingBinaryAsString();
        this.actionOnMalformedString = unpackerConfig.getActionOnMalformedString();
        this.actionOnUnmappableString = unpackerConfig.getActionOnUnmappableString();
        this.stringSizeLimit = unpackerConfig.getStringSizeLimit();
        this.stringDecoderBufferSize = unpackerConfig.getStringDecoderBufferSize();
    }

    private String decodeStringFastPath(int i) {
        CodingErrorAction codingErrorAction = this.actionOnMalformedString;
        CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
        if (codingErrorAction == codingErrorAction2 && this.actionOnUnmappableString == codingErrorAction2 && this.buffer.hasArray()) {
            String str = new String(this.buffer.array(), this.buffer.arrayOffset() + this.position, i, MessagePack.UTF8);
            this.position += i;
            return str;
        }
        try {
            CharBuffer decode = this.decoder.decode(this.buffer.sliceAsByteBuffer(this.position, i));
            this.position += i;
            return decode.toString();
        } catch (CharacterCodingException e) {
            throw new MessageStringCodingException(e);
        }
    }

    private boolean ensureBuffer() {
        while (this.buffer.size() <= this.position) {
            MessageBuffer next = this.in.next();
            if (next == null) {
                return false;
            }
            this.totalReadBytes += this.buffer.size();
            this.buffer = next;
            this.position = 0;
        }
        return true;
    }

    private MessageBuffer getNextBuffer() {
        MessageBuffer next = this.in.next();
        if (next != null) {
            this.totalReadBytes += this.buffer.size();
            return next;
        }
        throw new MessageInsufficientBufferException();
    }

    private void handleCoderError(CoderResult coderResult) {
        if ((coderResult.isMalformed() && this.actionOnMalformedString == CodingErrorAction.REPORT) || (coderResult.isUnmappable() && this.actionOnUnmappableString == CodingErrorAction.REPORT)) {
            coderResult.throwException();
        }
    }

    private void nextBuffer() {
        this.buffer = getNextBuffer();
        this.position = 0;
    }

    private static MessageIntegerOverflowException overflowI16(short s) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(s));
    }

    private static MessageIntegerOverflowException overflowI32(int i) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(i));
    }

    private static MessageIntegerOverflowException overflowI64(long j) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j));
    }

    private static MessageIntegerOverflowException overflowU16(short s) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(s & 65535));
    }

    private static MessageIntegerOverflowException overflowU32(int i) {
        return new MessageIntegerOverflowException(BigInteger.valueOf((i & bd0.API_PRIORITY_OTHER) + 2147483648L));
    }

    private static MessageSizeException overflowU32Size(int i) {
        return new MessageSizeException((i & bd0.API_PRIORITY_OTHER) + 2147483648L);
    }

    private static MessageIntegerOverflowException overflowU64(long j) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j - Long.MIN_VALUE).setBit(63));
    }

    private static MessageIntegerOverflowException overflowU8(byte b) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(b & MessagePack.Code.EXT_TIMESTAMP));
    }

    private MessageBuffer prepareNumberBuffer(int i) {
        int size = this.buffer.size();
        int i2 = this.position;
        int i3 = size - i2;
        if (i3 >= i) {
            this.nextReadPosition = i2;
            this.position = i2 + i;
            return this.buffer;
        }
        if (i3 > 0) {
            this.numberBuffer.putMessageBuffer(0, this.buffer, i2, i3);
            i -= i3;
        } else {
            i3 = 0;
        }
        while (true) {
            nextBuffer();
            int size2 = this.buffer.size();
            MessageBuffer messageBuffer = this.numberBuffer;
            if (size2 >= i) {
                messageBuffer.putMessageBuffer(i3, this.buffer, 0, i);
                this.position = i;
                this.nextReadPosition = 0;
                return this.numberBuffer;
            }
            messageBuffer.putMessageBuffer(i3, this.buffer, 0, size2);
            i -= size2;
            i3 += size2;
        }
    }

    private byte readByte() {
        int size = this.buffer.size();
        int i = this.position;
        if (size > i) {
            byte b = this.buffer.getByte(i);
            this.position++;
            return b;
        }
        nextBuffer();
        if (this.buffer.size() > 0) {
            byte b2 = this.buffer.getByte(0);
            this.position = 1;
            return b2;
        }
        return readByte();
    }

    private double readDouble() {
        return prepareNumberBuffer(8).getDouble(this.nextReadPosition);
    }

    private float readFloat() {
        return prepareNumberBuffer(4).getFloat(this.nextReadPosition);
    }

    private int readInt() {
        return prepareNumberBuffer(4).getInt(this.nextReadPosition);
    }

    private long readLong() {
        return prepareNumberBuffer(8).getLong(this.nextReadPosition);
    }

    private int readNextLength16() {
        return readShort() & 65535;
    }

    private int readNextLength32() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw overflowU32Size(readInt);
    }

    private int readNextLength8() {
        return readByte() & MessagePack.Code.EXT_TIMESTAMP;
    }

    private byte[] readPayloadGradually(int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int size = this.buffer.size() - this.position;
            if (size == 0) {
                MessageBuffer next = this.in.next();
                if (next != null) {
                    this.totalReadBytes += this.buffer.size();
                    this.buffer = next;
                    this.position = 0;
                    size = next.size();
                } else {
                    throw new MessageSizeException(String.format("Payload declared %,d bytes but input ended after %,d bytes", Integer.valueOf(i), Integer.valueOf(i3)), i);
                }
            }
            int min = Math.min(i2, size);
            byte[] bArr = new byte[min];
            this.buffer.getBytes(this.position, bArr, 0, min);
            arrayList.add(bArr);
            i3 += min;
            this.position += min;
            i2 -= min;
        }
        if (arrayList.size() == 1) {
            return (byte[]) arrayList.get(0);
        }
        byte[] bArr2 = new byte[i];
        Iterator it = arrayList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i4, bArr3.length);
            i4 += bArr3.length;
        }
        return bArr2;
    }

    private short readShort() {
        return prepareNumberBuffer(2).getShort(this.nextReadPosition);
    }

    private void resetDecoder() {
        CharsetDecoder charsetDecoder = this.decoder;
        if (charsetDecoder == null) {
            this.decodeBuffer = CharBuffer.allocate(this.stringDecoderBufferSize);
            this.decoder = MessagePack.UTF8.newDecoder().onMalformedInput(this.actionOnMalformedString).onUnmappableCharacter(this.actionOnUnmappableString);
        } else {
            charsetDecoder.reset();
        }
        StringBuilder sb = this.decodeStringBuffer;
        if (sb == null) {
            this.decodeStringBuffer = new StringBuilder();
        } else {
            sb.setLength(0);
        }
    }

    private void skipPayload(int i) {
        if (i < 0) {
            dmk.v(ace.f(i, "payload size must be >= 0: "));
            return;
        }
        while (true) {
            int size = this.buffer.size();
            int i2 = this.position;
            int i3 = size - i2;
            if (i3 >= i) {
                this.position = i2 + i;
                return;
            } else {
                this.position = i2 + i3;
                i -= i3;
                nextBuffer();
            }
        }
    }

    private int tryReadBinaryHeader(byte b) {
        switch (b) {
            case -60:
                return readNextLength8();
            case -59:
                return readNextLength16();
            case -58:
                return readNextLength32();
            default:
                return -1;
        }
    }

    private int tryReadStringHeader(byte b) {
        switch (b) {
            case -39:
                return readNextLength8();
            case -38:
                return readNextLength16();
            case -37:
                return readNextLength32();
            default:
                return -1;
        }
    }

    private static MessagePackException unexpected(String str, byte b) {
        MessageFormat valueOf = MessageFormat.valueOf(b);
        if (valueOf == MessageFormat.NEVER_USED) {
            return new MessageNeverUsedFormatException(sv6.n("Expected ", str, ", but encountered 0xC1 \"NEVER_USED\" byte"));
        }
        String name = valueOf.getValueType().name();
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", str, name.substring(0, 1) + name.substring(1).toLowerCase(), Byte.valueOf(b)));
    }

    private static MessagePackException unexpectedExtension(String str, int i, int i2) {
        return new MessageTypeException(String.format("Expected extension type %s (%d), but got extension type %d", str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private static int utf8MultibyteCharacterSize(byte b) {
        return Integer.numberOfLeadingZeros((~(b & MessagePack.Code.EXT_TIMESTAMP)) << 24);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.totalReadBytes += this.position;
        this.buffer = EMPTY_BUFFER;
        this.position = 0;
        this.in.close();
    }

    public MessageFormat getNextFormat() {
        if (ensureBuffer()) {
            return MessageFormat.valueOf(this.buffer.getByte(this.position));
        }
        throw new MessageInsufficientBufferException();
    }

    public long getTotalReadBytes() {
        return this.totalReadBytes + this.position;
    }

    public boolean hasNext() {
        return ensureBuffer();
    }

    public void readPayload(ByteBuffer byteBuffer) {
        while (true) {
            int remaining = byteBuffer.remaining();
            int size = this.buffer.size();
            int i = this.position;
            int i2 = size - i;
            MessageBuffer messageBuffer = this.buffer;
            if (i2 >= remaining) {
                messageBuffer.getBytes(i, remaining, byteBuffer);
                this.position += remaining;
                return;
            } else {
                messageBuffer.getBytes(i, i2, byteBuffer);
                this.position += i2;
                nextBuffer();
            }
        }
    }

    public MessageBuffer readPayloadAsReference(int i) {
        int size = this.buffer.size();
        int i2 = this.position;
        if (size - i2 >= i) {
            MessageBuffer slice = this.buffer.slice(i2, i);
            this.position += i;
            return slice;
        }
        MessageBuffer allocate = MessageBuffer.allocate(i);
        readPayload(allocate, 0, i);
        return allocate;
    }

    public MessageBufferInput reset(MessageBufferInput messageBufferInput) {
        MessageBufferInput messageBufferInput2 = (MessageBufferInput) Preconditions.checkNotNull(messageBufferInput, "MessageBufferInput is null");
        MessageBufferInput messageBufferInput3 = this.in;
        this.in = messageBufferInput2;
        this.buffer = EMPTY_BUFFER;
        this.position = 0;
        this.totalReadBytes = 0L;
        return messageBufferInput3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0014. Please report as an issue. */
    public void skipValue(int i) {
        int i2;
        int i3;
        while (i > 0) {
            byte readByte = readByte();
            switch (AnonymousClass1.$SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.valueOf(readByte).ordinal()]) {
                case 5:
                    i2 = readByte & 15;
                    i += i2 * 2;
                    i--;
                case 6:
                    i3 = readByte & 15;
                    i += i3;
                    i--;
                case 7:
                    skipPayload(readByte & 31);
                    i--;
                case 8:
                case 9:
                    skipPayload(1);
                    i--;
                case 10:
                case 11:
                    skipPayload(2);
                    i--;
                case 12:
                case 13:
                case 14:
                    skipPayload(4);
                    i--;
                case 15:
                case 16:
                case 17:
                    skipPayload(8);
                    i--;
                case MlKitException.UNSUPPORTED /* 18 */:
                case zh4.REMOTE_EXCEPTION /* 19 */:
                    skipPayload(readNextLength8());
                    i--;
                case 20:
                case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    skipPayload(readNextLength16());
                    i--;
                case 22:
                case 23:
                    skipPayload(readNextLength32());
                    i--;
                case 24:
                    skipPayload(2);
                    i--;
                case 25:
                    skipPayload(3);
                    i--;
                case 26:
                    skipPayload(5);
                    i--;
                case 27:
                    skipPayload(9);
                    i--;
                case 28:
                    skipPayload(17);
                    i--;
                case 29:
                    skipPayload(readNextLength8() + 1);
                    i--;
                case SelfieConstants.EXPAND_GUIDING_BOX_PERCENTAGE /* 30 */:
                    skipPayload(readNextLength16() + 1);
                    i--;
                case 31:
                    int readNextLength32 = readNextLength32();
                    skipPayload(1);
                    skipPayload(readNextLength32);
                    i--;
                case 32:
                    i3 = readNextLength16();
                    i += i3;
                    i--;
                case 33:
                    i3 = readNextLength32();
                    i += i3;
                    i--;
                case 34:
                    i2 = readNextLength16();
                    i += i2 * 2;
                    i--;
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                    i2 = readNextLength32();
                    i += i2 * 2;
                    i--;
                case 36:
                    throw new MessageNeverUsedFormatException("Encountered 0xC1 \"NEVER_USED\" byte");
                default:
                    i--;
            }
        }
    }

    public boolean tryUnpackNil() {
        if (ensureBuffer()) {
            if (this.buffer.getByte(this.position) == -64) {
                readByte();
                return true;
            }
            return false;
        }
        throw new MessageInsufficientBufferException();
    }

    public int unpackArrayHeader() {
        byte readByte = readByte();
        if (MessagePack.Code.isFixedArray(readByte)) {
            return readByte & 15;
        }
        if (readByte != -36) {
            if (readByte == -35) {
                return readNextLength32();
            }
            throw unexpected("Array", readByte);
        }
        return readNextLength16();
    }

    public BigInteger unpackBigInteger() {
        byte readByte = readByte();
        if (MessagePack.Code.isFixInt(readByte)) {
            return BigInteger.valueOf(readByte);
        }
        switch (readByte) {
            case -52:
                return BigInteger.valueOf(readByte() & MessagePack.Code.EXT_TIMESTAMP);
            case -51:
                return BigInteger.valueOf(readShort() & 65535);
            case -50:
                int readInt = readInt();
                if (readInt < 0) {
                    return BigInteger.valueOf((readInt & bd0.API_PRIORITY_OTHER) + 2147483648L);
                }
                return BigInteger.valueOf(readInt);
            case -49:
                long readLong = readLong();
                if (readLong < 0) {
                    return BigInteger.valueOf(readLong - Long.MIN_VALUE).setBit(63);
                }
                return BigInteger.valueOf(readLong);
            case -48:
                return BigInteger.valueOf(readByte());
            case -47:
                return BigInteger.valueOf(readShort());
            case -46:
                return BigInteger.valueOf(readInt());
            case -45:
                return BigInteger.valueOf(readLong());
            default:
                throw unexpected("Integer", readByte);
        }
    }

    public int unpackBinaryHeader() {
        int tryReadStringHeader;
        byte readByte = readByte();
        if (MessagePack.Code.isFixedRaw(readByte)) {
            return readByte & 31;
        }
        int tryReadBinaryHeader = tryReadBinaryHeader(readByte);
        if (tryReadBinaryHeader >= 0) {
            return tryReadBinaryHeader;
        }
        if (this.allowReadingStringAsBinary && (tryReadStringHeader = tryReadStringHeader(readByte)) >= 0) {
            return tryReadStringHeader;
        }
        throw unexpected("Binary", readByte);
    }

    public boolean unpackBoolean() {
        byte readByte = readByte();
        if (readByte == -62) {
            return false;
        }
        if (readByte == -61) {
            return true;
        }
        throw unexpected(AttributeType.BOOLEAN, readByte);
    }

    public byte unpackByte() {
        long readLong;
        byte readByte = readByte();
        if (MessagePack.Code.isFixInt(readByte)) {
            return readByte;
        }
        switch (readByte) {
            case -52:
                byte readByte2 = readByte();
                if (readByte2 >= 0) {
                    return readByte2;
                }
                throw overflowU8(readByte2);
            case -51:
                short readShort = readShort();
                if (readShort >= 0 && readShort <= 127) {
                    return (byte) readShort;
                }
                throw overflowU16(readShort);
            case -50:
                int readInt = readInt();
                if (readInt >= 0 && readInt <= 127) {
                    return (byte) readInt;
                }
                throw overflowU32(readInt);
            case -49:
                readLong = readLong();
                if (readLong < 0 || readLong > 127) {
                    throw overflowU64(readLong);
                }
                break;
            case -48:
                return readByte();
            case -47:
                short readShort2 = readShort();
                if (readShort2 >= -128 && readShort2 <= 127) {
                    return (byte) readShort2;
                }
                throw overflowI16(readShort2);
            case -46:
                int readInt2 = readInt();
                if (readInt2 >= -128 && readInt2 <= 127) {
                    return (byte) readInt2;
                }
                throw overflowI32(readInt2);
            case -45:
                readLong = readLong();
                if (readLong < -128 || readLong > 127) {
                    throw overflowI64(readLong);
                }
                break;
            default:
                throw unexpected("Integer", readByte);
        }
        return (byte) readLong;
    }

    public double unpackDouble() {
        byte readByte = readByte();
        if (readByte != -54) {
            if (readByte == -53) {
                return readDouble();
            }
            throw unexpected("Float", readByte);
        }
        return readFloat();
    }

    public ExtensionTypeHeader unpackExtensionTypeHeader() {
        byte readByte = readByte();
        switch (readByte) {
            case -57:
                MessageBuffer prepareNumberBuffer = prepareNumberBuffer(2);
                return new ExtensionTypeHeader(prepareNumberBuffer.getByte(this.nextReadPosition + 1), prepareNumberBuffer.getByte(this.nextReadPosition) & MessagePack.Code.EXT_TIMESTAMP);
            case -56:
                MessageBuffer prepareNumberBuffer2 = prepareNumberBuffer(3);
                return new ExtensionTypeHeader(prepareNumberBuffer2.getByte(this.nextReadPosition + 2), prepareNumberBuffer2.getShort(this.nextReadPosition) & 65535);
            case -55:
                MessageBuffer prepareNumberBuffer3 = prepareNumberBuffer(5);
                int i = prepareNumberBuffer3.getInt(this.nextReadPosition);
                if (i >= 0) {
                    return new ExtensionTypeHeader(prepareNumberBuffer3.getByte(this.nextReadPosition + 4), i);
                }
                throw overflowU32Size(i);
            default:
                switch (readByte) {
                    case -44:
                        return new ExtensionTypeHeader(readByte(), 1);
                    case -43:
                        return new ExtensionTypeHeader(readByte(), 2);
                    case -42:
                        return new ExtensionTypeHeader(readByte(), 4);
                    case -41:
                        return new ExtensionTypeHeader(readByte(), 8);
                    case -40:
                        return new ExtensionTypeHeader(readByte(), 16);
                    default:
                        throw unexpected("Ext", readByte);
                }
        }
    }

    public float unpackFloat() {
        byte readByte = readByte();
        if (readByte != -54) {
            if (readByte == -53) {
                return (float) readDouble();
            }
            throw unexpected("Float", readByte);
        }
        return readFloat();
    }

    public int unpackInt() {
        byte readByte = readByte();
        if (MessagePack.Code.isFixInt(readByte)) {
            return readByte;
        }
        switch (readByte) {
            case -52:
                return readByte() & MessagePack.Code.EXT_TIMESTAMP;
            case -51:
                return readShort() & 65535;
            case -50:
                int readInt = readInt();
                if (readInt >= 0) {
                    return readInt;
                }
                throw overflowU32(readInt);
            case -49:
                long readLong = readLong();
                if (readLong >= 0 && readLong <= 2147483647L) {
                    return (int) readLong;
                }
                throw overflowU64(readLong);
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                long readLong2 = readLong();
                if (readLong2 >= -2147483648L && readLong2 <= 2147483647L) {
                    return (int) readLong2;
                }
                throw overflowI64(readLong2);
            default:
                throw unexpected("Integer", readByte);
        }
    }

    public long unpackLong() {
        byte readByte = readByte();
        if (MessagePack.Code.isFixInt(readByte)) {
            return readByte;
        }
        switch (readByte) {
            case -52:
                return readByte() & MessagePack.Code.EXT_TIMESTAMP;
            case -51:
                return readShort() & 65535;
            case -50:
                int readInt = readInt();
                if (readInt < 0) {
                    return (readInt & bd0.API_PRIORITY_OTHER) + 2147483648L;
                }
                return readInt;
            case -49:
                long readLong = readLong();
                if (readLong >= 0) {
                    return readLong;
                }
                throw overflowU64(readLong);
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                return readLong();
            default:
                throw unexpected("Integer", readByte);
        }
    }

    public int unpackMapHeader() {
        byte readByte = readByte();
        if (MessagePack.Code.isFixedMap(readByte)) {
            return readByte & 15;
        }
        if (readByte != -34) {
            if (readByte == -33) {
                return readNextLength32();
            }
            throw unexpected("Map", readByte);
        }
        return readNextLength16();
    }

    public void unpackNil() {
        byte readByte = readByte();
        if (readByte == -64) {
        } else {
            throw unexpected("Nil", readByte);
        }
    }

    public int unpackRawStringHeader() {
        int tryReadBinaryHeader;
        byte readByte = readByte();
        if (MessagePack.Code.isFixedRaw(readByte)) {
            return readByte & 31;
        }
        int tryReadStringHeader = tryReadStringHeader(readByte);
        if (tryReadStringHeader >= 0) {
            return tryReadStringHeader;
        }
        if (this.allowReadingBinaryAsString && (tryReadBinaryHeader = tryReadBinaryHeader(readByte)) >= 0) {
            return tryReadBinaryHeader;
        }
        throw unexpected("String", readByte);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0010. Please report as an issue. */
    public short unpackShort() {
        int readByte;
        long readLong;
        byte readByte2 = readByte();
        if (MessagePack.Code.isFixInt(readByte2)) {
            return readByte2;
        }
        switch (readByte2) {
            case -52:
                readByte = readByte() & MessagePack.Code.EXT_TIMESTAMP;
                return (short) readByte;
            case -51:
                short readShort = readShort();
                if (readShort >= 0) {
                    return readShort;
                }
                throw overflowU16(readShort);
            case -50:
                int readInt = readInt();
                if (readInt >= 0 && readInt <= 32767) {
                    return (short) readInt;
                }
                throw overflowU32(readInt);
            case -49:
                readLong = readLong();
                if (readLong < 0 || readLong > 32767) {
                    throw overflowU64(readLong);
                }
                readByte = (int) readLong;
                return (short) readByte;
            case -48:
                readByte = readByte();
                return (short) readByte;
            case -47:
                return readShort();
            case -46:
                int readInt2 = readInt();
                if (readInt2 >= -32768 && readInt2 <= 32767) {
                    return (short) readInt2;
                }
                throw overflowI32(readInt2);
            case -45:
                readLong = readLong();
                if (readLong < -32768 || readLong > 32767) {
                    throw overflowI64(readLong);
                }
                readByte = (int) readLong;
                return (short) readByte;
            default:
                throw unexpected("Integer", readByte2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
    
        r3.throwException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fc, code lost:
    
        throw new org.msgpack.core.MessageFormatException("Unexpected UTF-8 multibyte sequence");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String unpackString() {
        int remaining;
        MessageBuffer messageBuffer;
        int unpackRawStringHeader = unpackRawStringHeader();
        if (unpackRawStringHeader == 0) {
            return "";
        }
        if (unpackRawStringHeader <= this.stringSizeLimit) {
            resetDecoder();
            if (this.buffer.size() - this.position >= unpackRawStringHeader) {
                return decodeStringFastPath(unpackRawStringHeader);
            }
            while (true) {
                if (unpackRawStringHeader <= 0) {
                    break;
                }
                try {
                    int size = this.buffer.size();
                    int i = this.position;
                    int i2 = size - i;
                    if (i2 >= unpackRawStringHeader) {
                        this.decodeStringBuffer.append(decodeStringFastPath(unpackRawStringHeader));
                        break;
                    }
                    if (i2 == 0) {
                        nextBuffer();
                    } else {
                        ByteBuffer sliceAsByteBuffer = this.buffer.sliceAsByteBuffer(i, i2);
                        int position = sliceAsByteBuffer.position();
                        this.decodeBuffer.clear();
                        CoderResult decode = this.decoder.decode(sliceAsByteBuffer, this.decodeBuffer, false);
                        int position2 = sliceAsByteBuffer.position() - position;
                        this.position += position2;
                        unpackRawStringHeader -= position2;
                        this.decodeStringBuffer.append(this.decodeBuffer.flip());
                        if (decode.isError()) {
                            handleCoderError(decode);
                        }
                        if (decode.isUnderflow() && position2 < i2) {
                            ByteBuffer allocate = ByteBuffer.allocate(utf8MultibyteCharacterSize(this.buffer.getByte(this.position)));
                            MessageBuffer messageBuffer2 = this.buffer;
                            messageBuffer2.getBytes(this.position, messageBuffer2.size() - this.position, allocate);
                            while (true) {
                                nextBuffer();
                                remaining = allocate.remaining();
                                int size2 = this.buffer.size();
                                messageBuffer = this.buffer;
                                if (size2 >= remaining) {
                                    break;
                                }
                                messageBuffer.getBytes(0, messageBuffer.size(), allocate);
                                this.position = this.buffer.size();
                            }
                            messageBuffer.getBytes(0, remaining, allocate);
                            this.position = remaining;
                            allocate.position(0);
                            this.decodeBuffer.clear();
                            CoderResult decode2 = this.decoder.decode(allocate, this.decodeBuffer, false);
                            if (decode2.isError()) {
                                handleCoderError(decode2);
                            }
                            if (!decode2.isOverflow() && (!decode2.isUnderflow() || allocate.position() >= allocate.limit())) {
                                unpackRawStringHeader -= allocate.limit();
                                this.decodeStringBuffer.append(this.decodeBuffer.flip());
                            } else {
                                try {
                                    break;
                                } catch (Exception e) {
                                    throw new MessageFormatException("Unexpected UTF-8 multibyte sequence", e);
                                }
                            }
                        }
                    }
                } catch (CharacterCodingException e2) {
                    throw new MessageStringCodingException(e2);
                }
            }
            return this.decodeStringBuffer.toString();
        }
        throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", Integer.valueOf(this.stringSizeLimit), Integer.valueOf(unpackRawStringHeader)), unpackRawStringHeader);
    }

    public Instant unpackTimestamp(ExtensionTypeHeader extensionTypeHeader) {
        if (extensionTypeHeader.getType() == -1) {
            int length = extensionTypeHeader.getLength();
            if (length != 4) {
                if (length != 8) {
                    if (length == 12) {
                        return Instant.ofEpochSecond(readLong(), readInt() & 4294967295L);
                    }
                    throw new MessageFormatException(String.format("Timestamp extension type (%d) expects 4, 8, or 12 bytes of payload but got %d bytes", (byte) -1, Integer.valueOf(extensionTypeHeader.getLength())));
                }
                return Instant.ofEpochSecond(readLong() & 17179869183L, (int) (r5 >>> 34));
            }
            return Instant.ofEpochSecond(readInt() & 4294967295L);
        }
        throw unexpectedExtension("Timestamp", -1, extensionTypeHeader.getType());
    }

    public as9 unpackValue() {
        MessageFormat nextFormat = getNextFormat();
        int i = 0;
        switch (AnonymousClass1.$SwitchMap$org$msgpack$value$ValueType[nextFormat.getValueType().ordinal()]) {
            case 1:
                readByte();
                return pr9.a;
            case 2:
                if (unpackBoolean()) {
                    return vq9.b;
                }
                return vq9.c;
            case 3:
                if (nextFormat == MessageFormat.UINT64) {
                    return new sq9(unpackBigInteger());
                }
                return new kr9(unpackLong());
            case 4:
                return new yq9(unpackDouble());
            case 5:
                int unpackRawStringHeader = unpackRawStringHeader();
                if (unpackRawStringHeader <= this.stringSizeLimit) {
                    return new w2(readPayload(unpackRawStringHeader));
                }
                throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", Integer.valueOf(this.stringSizeLimit), Integer.valueOf(unpackRawStringHeader)), unpackRawStringHeader);
            case 6:
                return new w2(readPayload(unpackBinaryHeader()));
            case 7:
                int unpackArrayHeader = unpackArrayHeader();
                h3k[] h3kVarArr = new h3k[unpackArrayHeader];
                while (i < unpackArrayHeader) {
                    h3kVarArr[i] = unpackValue();
                    i++;
                }
                if (unpackArrayHeader == 0) {
                    return rq9.b;
                }
                return new rq9(h3kVarArr);
            case 8:
                int unpackMapHeader = unpackMapHeader() * 2;
                h3k[] h3kVarArr2 = new h3k[unpackMapHeader];
                while (i < unpackMapHeader) {
                    h3kVarArr2[i] = unpackValue();
                    h3kVarArr2[i + 1] = unpackValue();
                    i += 2;
                }
                if (unpackMapHeader == 0) {
                    return or9.b;
                }
                return new or9(h3kVarArr2);
            case 9:
                ExtensionTypeHeader unpackExtensionTypeHeader = unpackExtensionTypeHeader();
                if (unpackExtensionTypeHeader.getType() != -1) {
                    return new br9(unpackExtensionTypeHeader.getType(), readPayload(unpackExtensionTypeHeader.getLength()));
                }
                return new zr9(unpackTimestamp(unpackExtensionTypeHeader));
            default:
                throw new MessageNeverUsedFormatException("Unknown value type");
        }
    }

    public void readPayload(MessageBuffer messageBuffer, int i, int i2) {
        while (true) {
            int size = this.buffer.size();
            int i3 = this.position;
            int i4 = size - i3;
            MessageBuffer messageBuffer2 = this.buffer;
            if (i4 >= i2) {
                messageBuffer.putMessageBuffer(i, messageBuffer2, i3, i2);
                this.position += i2;
                return;
            } else {
                messageBuffer.putMessageBuffer(i, messageBuffer2, i3, i4);
                i += i4;
                i2 -= i4;
                this.position += i4;
                nextBuffer();
            }
        }
    }

    public void readPayload(byte[] bArr) {
        readPayload(bArr, 0, bArr.length);
    }

    public byte[] readPayload(int i) {
        if (i <= GRADUAL_ALLOCATION_THRESHOLD) {
            byte[] bArr = new byte[i];
            readPayload(bArr);
            return bArr;
        }
        return readPayloadGradually(i);
    }

    public void readPayload(byte[] bArr, int i, int i2) {
        while (true) {
            int size = this.buffer.size();
            int i3 = this.position;
            int i4 = size - i3;
            MessageBuffer messageBuffer = this.buffer;
            if (i4 >= i2) {
                messageBuffer.getBytes(i3, bArr, i, i2);
                this.position += i2;
                return;
            } else {
                messageBuffer.getBytes(i3, bArr, i, i4);
                i += i4;
                i2 -= i4;
                this.position += i4;
                nextBuffer();
            }
        }
    }

    public Instant unpackTimestamp() {
        return unpackTimestamp(unpackExtensionTypeHeader());
    }

    public void skipValue() {
        skipValue(1);
    }

    public b4k unpackValue(b4k b4kVar) {
        MessageFormat nextFormat = getNextFormat();
        int i = 0;
        switch (AnonymousClass1.$SwitchMap$org$msgpack$value$ValueType[nextFormat.getValueType().ordinal()]) {
            case 1:
                readByte();
                throw null;
            case 2:
                unpackBoolean();
                throw null;
            case 3:
                if (AnonymousClass1.$SwitchMap$org$msgpack$core$MessageFormat[nextFormat.ordinal()] != 16) {
                    unpackLong();
                    throw null;
                }
                unpackBigInteger();
                throw null;
            case 4:
                unpackDouble();
                throw null;
            case 5:
                int unpackRawStringHeader = unpackRawStringHeader();
                if (unpackRawStringHeader > this.stringSizeLimit) {
                    throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", Integer.valueOf(this.stringSizeLimit), Integer.valueOf(unpackRawStringHeader)), unpackRawStringHeader);
                }
                readPayload(unpackRawStringHeader);
                throw null;
            case 6:
                readPayload(unpackBinaryHeader());
                throw null;
            case 7:
                int unpackArrayHeader = unpackArrayHeader();
                h3k[] h3kVarArr = new h3k[unpackArrayHeader];
                while (i < unpackArrayHeader) {
                    h3kVarArr[i] = unpackValue();
                    i++;
                }
                throw null;
            case 8:
                int unpackMapHeader = unpackMapHeader() * 2;
                h3k[] h3kVarArr2 = new h3k[unpackMapHeader];
                while (i < unpackMapHeader) {
                    h3kVarArr2[i] = unpackValue();
                    h3kVarArr2[i + 1] = unpackValue();
                    i += 2;
                }
                throw null;
            case 9:
                ExtensionTypeHeader unpackExtensionTypeHeader = unpackExtensionTypeHeader();
                if (unpackExtensionTypeHeader.getType() != -1) {
                    unpackExtensionTypeHeader.getType();
                    readPayload(unpackExtensionTypeHeader.getLength());
                    throw null;
                }
                unpackTimestamp(unpackExtensionTypeHeader);
                throw null;
            default:
                throw new MessageFormatException("Unknown value type");
        }
    }
}
