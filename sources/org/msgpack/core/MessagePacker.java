package org.msgpack.core;

import defpackage.dmk;
import defpackage.h3k;
import java.io.Closeable;
import java.io.Flushable;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.time.Instant;
import org.msgpack.core.MessagePack;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class MessagePacker implements Closeable, Flushable {
    private static final boolean CORRUPTED_CHARSET_ENCODER;
    private static final long NANOS_PER_SECOND = 1000000000;
    private static final int UTF_8_MAX_CHAR_SIZE = 6;
    private MessageBuffer buffer;
    private final int bufferFlushThreshold;
    private CharsetEncoder encoder;
    protected MessageBufferOutput out;
    private final int smallStringOptimizationThreshold;
    private final boolean str8FormatSupport;
    private int position = 0;
    private long totalFlushBytes = 0;

    static {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            int i = cls.getField("SDK_INT").getInt(cls.getConstructor(null).newInstance(null));
            if (i >= 14 && i < 21) {
                z = true;
            }
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
        CORRUPTED_CHARSET_ENCODER = z;
    }

    public MessagePacker(MessageBufferOutput messageBufferOutput, MessagePack.PackerConfig packerConfig) {
        this.out = (MessageBufferOutput) Preconditions.checkNotNull(messageBufferOutput, "MessageBufferOutput is null");
        this.smallStringOptimizationThreshold = packerConfig.getSmallStringOptimizationThreshold();
        this.bufferFlushThreshold = packerConfig.getBufferFlushThreshold();
        this.str8FormatSupport = packerConfig.isStr8FormatSupport();
    }

    private int encodeStringToBufferAt(int i, String str) {
        prepareEncoder();
        MessageBuffer messageBuffer = this.buffer;
        ByteBuffer sliceAsByteBuffer = messageBuffer.sliceAsByteBuffer(i, messageBuffer.size() - i);
        int position = sliceAsByteBuffer.position();
        CoderResult encode = this.encoder.encode(CharBuffer.wrap(str), sliceAsByteBuffer, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        }
        if (!encode.isUnderflow() || encode.isOverflow() || !this.encoder.flush(sliceAsByteBuffer).isUnderflow()) {
            return -1;
        }
        return sliceAsByteBuffer.position() - position;
    }

    private void ensureCapacity(int i) {
        MessageBuffer messageBuffer = this.buffer;
        if (messageBuffer == null) {
            this.buffer = this.out.next(i);
        } else if (this.position + i >= messageBuffer.size()) {
            flushBuffer();
            this.buffer = this.out.next(i);
        }
    }

    private void flushBuffer() {
        this.out.writeBuffer(this.position);
        this.buffer = null;
        this.totalFlushBytes += this.position;
        this.position = 0;
    }

    private void packStringWithGetBytes(String str) {
        byte[] bytes = str.getBytes(MessagePack.UTF8);
        packRawStringHeader(bytes.length);
        addPayload(bytes);
    }

    private void prepareEncoder() {
        CharsetEncoder charsetEncoder = this.encoder;
        if (charsetEncoder == null) {
            CharsetEncoder newEncoder = MessagePack.UTF8.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            charsetEncoder = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
            this.encoder = charsetEncoder;
        }
        charsetEncoder.reset();
    }

    private void writeByte(byte b) {
        ensureCapacity(1);
        MessageBuffer messageBuffer = this.buffer;
        int i = this.position;
        this.position = i + 1;
        messageBuffer.putByte(i, b);
    }

    private void writeByteAndByte(byte b, byte b2) {
        ensureCapacity(2);
        MessageBuffer messageBuffer = this.buffer;
        int i = this.position;
        this.position = i + 1;
        messageBuffer.putByte(i, b);
        MessageBuffer messageBuffer2 = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        messageBuffer2.putByte(i2, b2);
    }

    private void writeByteAndDouble(byte b, double d) {
        ensureCapacity(9);
        MessageBuffer messageBuffer = this.buffer;
        int i = this.position;
        this.position = i + 1;
        messageBuffer.putByte(i, b);
        this.buffer.putDouble(this.position, d);
        this.position += 8;
    }

    private void writeByteAndFloat(byte b, float f) {
        ensureCapacity(5);
        MessageBuffer messageBuffer = this.buffer;
        int i = this.position;
        this.position = i + 1;
        messageBuffer.putByte(i, b);
        this.buffer.putFloat(this.position, f);
        this.position += 4;
    }

    private void writeByteAndInt(byte b, int i) {
        ensureCapacity(5);
        MessageBuffer messageBuffer = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        messageBuffer.putByte(i2, b);
        this.buffer.putInt(this.position, i);
        this.position += 4;
    }

    private void writeByteAndLong(byte b, long j) {
        ensureCapacity(9);
        MessageBuffer messageBuffer = this.buffer;
        int i = this.position;
        this.position = i + 1;
        messageBuffer.putByte(i, b);
        this.buffer.putLong(this.position, j);
        this.position += 8;
    }

    private void writeByteAndShort(byte b, short s) {
        ensureCapacity(3);
        MessageBuffer messageBuffer = this.buffer;
        int i = this.position;
        this.position = i + 1;
        messageBuffer.putByte(i, b);
        this.buffer.putShort(this.position, s);
        this.position += 2;
    }

    private void writeInt(int i) {
        ensureCapacity(4);
        this.buffer.putInt(this.position, i);
        this.position += 4;
    }

    private void writeLong(long j) {
        ensureCapacity(8);
        this.buffer.putLong(this.position, j);
        this.position += 8;
    }

    private void writeShort(short s) {
        ensureCapacity(2);
        this.buffer.putShort(this.position, s);
        this.position += 2;
    }

    private void writeTimestamp32(int i) {
        ensureCapacity(6);
        MessageBuffer messageBuffer = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        messageBuffer.putByte(i2, MessagePack.Code.FIXEXT4);
        MessageBuffer messageBuffer2 = this.buffer;
        int i3 = this.position;
        this.position = i3 + 1;
        messageBuffer2.putByte(i3, (byte) -1);
        this.buffer.putInt(this.position, i);
        this.position += 4;
    }

    private void writeTimestamp64(long j) {
        ensureCapacity(10);
        MessageBuffer messageBuffer = this.buffer;
        int i = this.position;
        this.position = i + 1;
        messageBuffer.putByte(i, MessagePack.Code.FIXEXT8);
        MessageBuffer messageBuffer2 = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        messageBuffer2.putByte(i2, (byte) -1);
        this.buffer.putLong(this.position, j);
        this.position += 8;
    }

    private void writeTimestamp96(long j, int i) {
        ensureCapacity(15);
        MessageBuffer messageBuffer = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        messageBuffer.putByte(i2, MessagePack.Code.EXT8);
        MessageBuffer messageBuffer2 = this.buffer;
        int i3 = this.position;
        this.position = i3 + 1;
        messageBuffer2.putByte(i3, (byte) 12);
        MessageBuffer messageBuffer3 = this.buffer;
        int i4 = this.position;
        this.position = i4 + 1;
        messageBuffer3.putByte(i4, (byte) -1);
        this.buffer.putInt(this.position, i);
        int i5 = this.position + 4;
        this.position = i5;
        this.buffer.putLong(i5, j);
        this.position += 8;
    }

    public MessagePacker addPayload(byte[] bArr, int i, int i2) {
        MessageBuffer messageBuffer = this.buffer;
        if (messageBuffer != null) {
            int size = messageBuffer.size();
            int i3 = this.position;
            if (size - i3 >= i2 && i2 <= this.bufferFlushThreshold) {
                this.buffer.putBytes(i3, bArr, i, i2);
                this.position += i2;
                return this;
            }
        }
        flush();
        this.out.add(bArr, i, i2);
        this.totalFlushBytes += i2;
        return this;
    }

    public void clear() {
        this.position = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
        } finally {
            this.out.close();
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.position > 0) {
            flushBuffer();
        }
        this.out.flush();
    }

    public long getTotalWrittenBytes() {
        return this.totalFlushBytes + this.position;
    }

    public MessagePacker packArrayHeader(int i) {
        if (i >= 0) {
            if (i < 16) {
                writeByte((byte) (i | (-112)));
                return this;
            }
            if (i < 65536) {
                writeByteAndShort(MessagePack.Code.ARRAY16, (short) i);
                return this;
            }
            writeByteAndInt(MessagePack.Code.ARRAY32, i);
            return this;
        }
        dmk.v("array size must be >= 0");
        return null;
    }

    public MessagePacker packBigInteger(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            packLong(bigInteger.longValue());
            return this;
        }
        if (bigInteger.bitLength() == 64 && bigInteger.signum() == 1) {
            writeByteAndLong(MessagePack.Code.UINT64, bigInteger.longValue());
            return this;
        }
        dmk.v("MessagePack cannot serialize BigInteger larger than 2^64-1");
        return null;
    }

    public MessagePacker packBinaryHeader(int i) {
        if (i < 256) {
            writeByteAndByte(MessagePack.Code.BIN8, (byte) i);
            return this;
        }
        if (i < 65536) {
            writeByteAndShort(MessagePack.Code.BIN16, (short) i);
            return this;
        }
        writeByteAndInt(MessagePack.Code.BIN32, i);
        return this;
    }

    public MessagePacker packBoolean(boolean z) {
        byte b;
        if (z) {
            b = MessagePack.Code.TRUE;
        } else {
            b = MessagePack.Code.FALSE;
        }
        writeByte(b);
        return this;
    }

    public MessagePacker packByte(byte b) {
        if (b < -32) {
            writeByteAndByte(MessagePack.Code.INT8, b);
            return this;
        }
        writeByte(b);
        return this;
    }

    public MessagePacker packDouble(double d) {
        writeByteAndDouble(MessagePack.Code.FLOAT64, d);
        return this;
    }

    public MessagePacker packExtensionTypeHeader(byte b, int i) {
        if (i < 256) {
            if (i > 0 && ((i - 1) & i) == 0) {
                if (i == 1) {
                    writeByteAndByte(MessagePack.Code.FIXEXT1, b);
                    return this;
                }
                if (i == 2) {
                    writeByteAndByte(MessagePack.Code.FIXEXT2, b);
                    return this;
                }
                if (i == 4) {
                    writeByteAndByte(MessagePack.Code.FIXEXT4, b);
                    return this;
                }
                if (i == 8) {
                    writeByteAndByte(MessagePack.Code.FIXEXT8, b);
                    return this;
                }
                if (i == 16) {
                    writeByteAndByte(MessagePack.Code.FIXEXT16, b);
                    return this;
                }
                writeByteAndByte(MessagePack.Code.EXT8, (byte) i);
                writeByte(b);
                return this;
            }
            writeByteAndByte(MessagePack.Code.EXT8, (byte) i);
            writeByte(b);
            return this;
        }
        if (i < 65536) {
            writeByteAndShort(MessagePack.Code.EXT16, (short) i);
            writeByte(b);
            return this;
        }
        writeByteAndInt(MessagePack.Code.EXT32, i);
        writeByte(b);
        return this;
    }

    public MessagePacker packFloat(float f) {
        writeByteAndFloat(MessagePack.Code.FLOAT32, f);
        return this;
    }

    public MessagePacker packInt(int i) {
        if (i < -32) {
            if (i < -32768) {
                writeByteAndInt(MessagePack.Code.INT32, i);
                return this;
            }
            if (i < -128) {
                writeByteAndShort(MessagePack.Code.INT16, (short) i);
                return this;
            }
            writeByteAndByte(MessagePack.Code.INT8, (byte) i);
            return this;
        }
        if (i < 128) {
            writeByte((byte) i);
            return this;
        }
        if (i < 256) {
            writeByteAndByte(MessagePack.Code.UINT8, (byte) i);
            return this;
        }
        if (i < 65536) {
            writeByteAndShort(MessagePack.Code.UINT16, (short) i);
            return this;
        }
        writeByteAndInt(MessagePack.Code.UINT32, i);
        return this;
    }

    public MessagePacker packLong(long j) {
        if (j < -32) {
            if (j < -32768) {
                if (j < -2147483648L) {
                    writeByteAndLong(MessagePack.Code.INT64, j);
                    return this;
                }
                writeByteAndInt(MessagePack.Code.INT32, (int) j);
                return this;
            }
            if (j < -128) {
                writeByteAndShort(MessagePack.Code.INT16, (short) j);
                return this;
            }
            writeByteAndByte(MessagePack.Code.INT8, (byte) j);
            return this;
        }
        if (j < 128) {
            writeByte((byte) j);
            return this;
        }
        if (j < 65536) {
            if (j < 256) {
                writeByteAndByte(MessagePack.Code.UINT8, (byte) j);
                return this;
            }
            writeByteAndShort(MessagePack.Code.UINT16, (short) j);
            return this;
        }
        if (j < 4294967296L) {
            writeByteAndInt(MessagePack.Code.UINT32, (int) j);
            return this;
        }
        writeByteAndLong(MessagePack.Code.UINT64, j);
        return this;
    }

    public MessagePacker packMapHeader(int i) {
        if (i >= 0) {
            if (i < 16) {
                writeByte((byte) (i | (-128)));
                return this;
            }
            if (i < 65536) {
                writeByteAndShort(MessagePack.Code.MAP16, (short) i);
                return this;
            }
            writeByteAndInt(MessagePack.Code.MAP32, i);
            return this;
        }
        dmk.v("map size must be >= 0");
        return null;
    }

    public MessagePacker packNil() {
        writeByte(MessagePack.Code.NIL);
        return this;
    }

    public MessagePacker packRawStringHeader(int i) {
        if (i < 32) {
            writeByte((byte) (i | (-96)));
            return this;
        }
        if (this.str8FormatSupport && i < 256) {
            writeByteAndByte(MessagePack.Code.STR8, (byte) i);
            return this;
        }
        if (i < 65536) {
            writeByteAndShort(MessagePack.Code.STR16, (short) i);
            return this;
        }
        writeByteAndInt(MessagePack.Code.STR32, i);
        return this;
    }

    public MessagePacker packShort(short s) {
        if (s < -32) {
            if (s < -128) {
                writeByteAndShort(MessagePack.Code.INT16, s);
                return this;
            }
            writeByteAndByte(MessagePack.Code.INT8, (byte) s);
            return this;
        }
        if (s < 128) {
            writeByte((byte) s);
            return this;
        }
        if (s < 256) {
            writeByteAndByte(MessagePack.Code.UINT8, (byte) s);
            return this;
        }
        writeByteAndShort(MessagePack.Code.UINT16, s);
        return this;
    }

    public MessagePacker packString(String str) {
        if (str.length() <= 0) {
            packRawStringHeader(0);
            return this;
        }
        if (!CORRUPTED_CHARSET_ENCODER && str.length() >= this.smallStringOptimizationThreshold) {
            if (str.length() < 256) {
                ensureCapacity((str.length() * 6) + 3);
                int encodeStringToBufferAt = encodeStringToBufferAt(this.position + 2, str);
                if (encodeStringToBufferAt >= 0) {
                    if (this.str8FormatSupport && encodeStringToBufferAt < 256) {
                        MessageBuffer messageBuffer = this.buffer;
                        int i = this.position;
                        this.position = i + 1;
                        messageBuffer.putByte(i, MessagePack.Code.STR8);
                        MessageBuffer messageBuffer2 = this.buffer;
                        int i2 = this.position;
                        this.position = i2 + 1;
                        messageBuffer2.putByte(i2, (byte) encodeStringToBufferAt);
                        this.position += encodeStringToBufferAt;
                        return this;
                    }
                    if (encodeStringToBufferAt < 65536) {
                        MessageBuffer messageBuffer3 = this.buffer;
                        int i3 = this.position;
                        messageBuffer3.putMessageBuffer(i3 + 3, messageBuffer3, i3 + 2, encodeStringToBufferAt);
                        MessageBuffer messageBuffer4 = this.buffer;
                        int i4 = this.position;
                        this.position = i4 + 1;
                        messageBuffer4.putByte(i4, MessagePack.Code.STR16);
                        this.buffer.putShort(this.position, (short) encodeStringToBufferAt);
                        this.position = this.position + 2 + encodeStringToBufferAt;
                        return this;
                    }
                    dmk.v("Unexpected UTF-8 encoder state");
                    return null;
                }
            } else if (str.length() < 65536) {
                ensureCapacity((str.length() * 6) + 5);
                int encodeStringToBufferAt2 = encodeStringToBufferAt(this.position + 3, str);
                if (encodeStringToBufferAt2 >= 0) {
                    MessageBuffer messageBuffer5 = this.buffer;
                    if (encodeStringToBufferAt2 < 65536) {
                        int i5 = this.position;
                        this.position = i5 + 1;
                        messageBuffer5.putByte(i5, MessagePack.Code.STR16);
                        this.buffer.putShort(this.position, (short) encodeStringToBufferAt2);
                        this.position = this.position + 2 + encodeStringToBufferAt2;
                        return this;
                    }
                    int i6 = this.position;
                    messageBuffer5.putMessageBuffer(i6 + 5, messageBuffer5, i6 + 3, encodeStringToBufferAt2);
                    MessageBuffer messageBuffer6 = this.buffer;
                    int i7 = this.position;
                    this.position = i7 + 1;
                    messageBuffer6.putByte(i7, MessagePack.Code.STR32);
                    this.buffer.putInt(this.position, encodeStringToBufferAt2);
                    this.position = this.position + 4 + encodeStringToBufferAt2;
                    return this;
                }
            }
            packStringWithGetBytes(str);
            return this;
        }
        packStringWithGetBytes(str);
        return this;
    }

    public MessagePacker packTimestamp(long j, int i) {
        long j2 = i;
        long addExact = Math.addExact(j, Math.floorDiv(j2, 1000000000L));
        long floorMod = Math.floorMod(j2, 1000000000L);
        if ((addExact >>> 34) == 0) {
            long j3 = (floorMod << 34) | addExact;
            if (((-4294967296L) & j3) == 0) {
                writeTimestamp32((int) addExact);
                return this;
            }
            writeTimestamp64(j3);
            return this;
        }
        writeTimestamp96(addExact, (int) floorMod);
        return this;
    }

    public MessagePacker packValue(h3k h3kVar) {
        h3kVar.f(this);
        return this;
    }

    public MessageBufferOutput reset(MessageBufferOutput messageBufferOutput) {
        MessageBufferOutput messageBufferOutput2 = (MessageBufferOutput) Preconditions.checkNotNull(messageBufferOutput, "MessageBufferOutput is null");
        flush();
        MessageBufferOutput messageBufferOutput3 = this.out;
        this.out = messageBufferOutput2;
        this.totalFlushBytes = 0L;
        return messageBufferOutput3;
    }

    public MessagePacker writePayload(byte[] bArr, int i, int i2) {
        MessageBuffer messageBuffer = this.buffer;
        if (messageBuffer != null) {
            int size = messageBuffer.size();
            int i3 = this.position;
            if (size - i3 >= i2 && i2 <= this.bufferFlushThreshold) {
                this.buffer.putBytes(i3, bArr, i, i2);
                this.position += i2;
                return this;
            }
        }
        flush();
        this.out.write(bArr, i, i2);
        this.totalFlushBytes += i2;
        return this;
    }

    public MessagePacker addPayload(byte[] bArr) {
        return addPayload(bArr, 0, bArr.length);
    }

    public MessagePacker writePayload(byte[] bArr) {
        return writePayload(bArr, 0, bArr.length);
    }

    public MessagePacker packTimestamp(long j) {
        return packTimestamp(Instant.ofEpochMilli(j));
    }

    public MessagePacker packTimestamp(Instant instant) {
        return packTimestamp(instant.getEpochSecond(), instant.getNano());
    }
}
