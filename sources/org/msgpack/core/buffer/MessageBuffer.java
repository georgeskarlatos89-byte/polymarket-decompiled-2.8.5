package org.msgpack.core.buffer;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.dmk;
import defpackage.qp7;
import defpackage.xbc;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.msgpack.core.Preconditions;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int ARRAY_BYTE_BASE_OFFSET;
    private static final String BIGENDIAN_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferBE";
    private static final String DEFAULT_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBuffer";
    private static final String UNIVERSAL_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferU";
    static final boolean isUniversalBuffer;
    static final int javaVersion;
    private static final Constructor<?> mbArrConstructor;
    private static final Constructor<?> mbBBConstructor;
    static final Unsafe unsafe;
    protected final long address;
    protected final Object base;
    protected final ByteBuffer reference;
    protected final int size;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[Catch: all -> 0x0020, Exception -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0019, B:7:0x0025, B:10:0x0042, B:14:0x0054, B:19:0x0063), top: B:3:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf A[Catch: Exception -> 0x00de, TRY_ENTER, TryCatch #1 {Exception -> 0x00de, blocks: (B:37:0x00bf, B:38:0x00db, B:65:0x0136, B:49:0x00fa), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0136 A[Catch: Exception -> 0x00de, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00de, blocks: (B:37:0x00bf, B:38:0x00db, B:65:0x0136, B:49:0x00fa), top: B:2:0x0019 }] */
    static {
        Unsafe unsafe2;
        Unsafe unsafe3;
        Constructor<?> declaredConstructor;
        boolean contains;
        boolean z;
        String str = BIGENDIAN_MESSAGE_BUFFER;
        Class cls = Integer.TYPE;
        String str2 = UNIVERSAL_MESSAGE_BUFFER;
        javaVersion = getJavaVersion();
        boolean z2 = false;
        int i = 16;
        try {
            try {
                try {
                    Class.forName("sun.misc.Unsafe");
                    unsafe2 = 1;
                } catch (Throwable th) {
                    th = th;
                    unsafe2 = null;
                    unsafe = unsafe2;
                    ARRAY_BYTE_BASE_OFFSET = 16;
                    isUniversalBuffer = z2;
                    if (!z2) {
                        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                            str = DEFAULT_MESSAGE_BUFFER;
                        }
                        str2 = str;
                    }
                    if (!DEFAULT_MESSAGE_BUFFER.equals(str2)) {
                        mbArrConstructor = null;
                        mbBBConstructor = null;
                    } else {
                        Class<?> cls2 = Class.forName(str2);
                        Constructor<?> declaredConstructor2 = cls2.getDeclaredConstructor(byte[].class, cls, cls);
                        declaredConstructor2.setAccessible(true);
                        mbArrConstructor = declaredConstructor2;
                        Constructor<?> declaredConstructor3 = cls2.getDeclaredConstructor(ByteBuffer.class);
                        declaredConstructor3.setAccessible(true);
                        mbBBConstructor = declaredConstructor3;
                    }
                    throw th;
                }
            } catch (Exception unused) {
                unsafe2 = null;
            }
            try {
                try {
                    contains = System.getProperty("java.runtime.name", "").toLowerCase().contains("android");
                    if (System.getProperty("com.google.appengine.runtime.version") != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    unsafe = unsafe2;
                    ARRAY_BYTE_BASE_OFFSET = 16;
                    isUniversalBuffer = z2;
                    if (!z2) {
                    }
                    if (!DEFAULT_MESSAGE_BUFFER.equals(str2)) {
                    }
                    throw th;
                }
            } catch (Exception e) {
                e = e;
                unsafe3 = null;
            }
            if (!Boolean.parseBoolean(System.getProperty("msgpack.universal-buffer", "false"))) {
                if (!contains) {
                    if (!z) {
                        if (javaVersion >= 7) {
                            if (unsafe2 == null) {
                            }
                            if (z2) {
                                Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                                declaredField.setAccessible(true);
                                unsafe3 = (Unsafe) declaredField.get(null);
                                try {
                                    if (unsafe3 != null) {
                                        i = unsafe3.arrayBaseOffset(byte[].class);
                                        int arrayIndexScale = unsafe3.arrayIndexScale(byte[].class);
                                        if (arrayIndexScale != 1) {
                                            throw new IllegalStateException("Byte array index scale must be 1, but is " + arrayIndexScale);
                                        }
                                    } else {
                                        throw new RuntimeException("Unsafe is unavailable");
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    e.printStackTrace(System.err);
                                    unsafe = unsafe3;
                                    ARRAY_BYTE_BASE_OFFSET = 16;
                                    isUniversalBuffer = true;
                                    if (!DEFAULT_MESSAGE_BUFFER.equals(UNIVERSAL_MESSAGE_BUFFER)) {
                                        Class<?> cls3 = Class.forName(UNIVERSAL_MESSAGE_BUFFER);
                                        Constructor<?> declaredConstructor4 = cls3.getDeclaredConstructor(byte[].class, cls, cls);
                                        declaredConstructor4.setAccessible(true);
                                        mbArrConstructor = declaredConstructor4;
                                        declaredConstructor = cls3.getDeclaredConstructor(ByteBuffer.class);
                                        declaredConstructor.setAccessible(true);
                                        mbBBConstructor = declaredConstructor;
                                        return;
                                    }
                                    mbArrConstructor = null;
                                    mbBBConstructor = null;
                                }
                            } else {
                                unsafe3 = null;
                            }
                            unsafe = unsafe3;
                            ARRAY_BYTE_BASE_OFFSET = i;
                            isUniversalBuffer = z2;
                            if (!z2) {
                                if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                                    str = DEFAULT_MESSAGE_BUFFER;
                                }
                                str2 = str;
                            }
                            if (!DEFAULT_MESSAGE_BUFFER.equals(str2)) {
                                Class<?> cls4 = Class.forName(str2);
                                Constructor<?> declaredConstructor5 = cls4.getDeclaredConstructor(byte[].class, cls, cls);
                                declaredConstructor5.setAccessible(true);
                                mbArrConstructor = declaredConstructor5;
                                declaredConstructor = cls4.getDeclaredConstructor(ByteBuffer.class);
                                declaredConstructor.setAccessible(true);
                                mbBBConstructor = declaredConstructor;
                                return;
                            }
                            mbArrConstructor = null;
                            mbBBConstructor = null;
                        }
                    }
                }
            }
            z2 = true;
            if (z2) {
            }
            unsafe = unsafe3;
            ARRAY_BYTE_BASE_OFFSET = i;
            isUniversalBuffer = z2;
            if (!z2) {
            }
            if (!DEFAULT_MESSAGE_BUFFER.equals(str2)) {
            }
            mbArrConstructor = null;
            mbBBConstructor = null;
        } catch (Exception e3) {
            e3.printStackTrace(System.err);
            qp7.n(e3);
        }
    }

    public MessageBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (isUniversalBuffer) {
                this.base = null;
                this.address = 0L;
                this.size = byteBuffer.remaining();
                this.reference = null;
                return;
            }
            this.base = null;
            this.address = DirectBufferAccess.getAddress(byteBuffer) + byteBuffer.position();
            this.size = byteBuffer.remaining();
            this.reference = byteBuffer;
            return;
        }
        if (byteBuffer.hasArray()) {
            this.base = byteBuffer.array();
            this.address = byteBuffer.position() + byteBuffer.arrayOffset() + ARRAY_BYTE_BASE_OFFSET;
            this.size = byteBuffer.remaining();
            this.reference = null;
            return;
        }
        dmk.v("Only the array-backed ByteBuffer or DirectBuffer is supported");
        throw null;
    }

    public static MessageBuffer allocate(int i) {
        if (i >= 0) {
            return wrap(new byte[i]);
        }
        dmk.v("size must not be negative");
        return null;
    }

    private static int getJavaVersion() {
        String property = System.getProperty("java.specification.version", "");
        int indexOf = property.indexOf(46);
        if (indexOf != -1) {
            try {
                int parseInt = Integer.parseInt(property.substring(0, indexOf));
                int parseInt2 = Integer.parseInt(property.substring(indexOf + 1));
                if (parseInt > 1) {
                    return parseInt;
                }
                return parseInt2;
            } catch (NumberFormatException e) {
                e.printStackTrace(System.err);
                return 6;
            }
        }
        try {
            return Integer.parseInt(property);
        } catch (NumberFormatException e2) {
            e2.printStackTrace(System.err);
            return 6;
        }
    }

    private static MessageBuffer newInstance(Constructor<?> constructor, Object... objArr) {
        try {
            return (MessageBuffer) constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            xbc.m(e);
            return null;
        } catch (InstantiationException e2) {
            xbc.m(e2);
            return null;
        } catch (InvocationTargetException e3) {
            if (!(e3.getCause() instanceof RuntimeException)) {
                if (!(e3.getCause() instanceof Error)) {
                    xbc.m(e3.getCause());
                    return null;
                }
                throw ((Error) e3.getCause());
            }
            throw ((RuntimeException) e3.getCause());
        }
    }

    private static MessageBuffer newMessageBuffer(byte[] bArr, int i, int i2) {
        Preconditions.checkNotNull(bArr);
        Constructor<?> constructor = mbArrConstructor;
        if (constructor != null) {
            return newInstance(constructor, bArr, Integer.valueOf(i), Integer.valueOf(i2));
        }
        return new MessageBuffer(bArr, i, i2);
    }

    public static void releaseBuffer(MessageBuffer messageBuffer) {
        if (!isUniversalBuffer && !messageBuffer.hasArray()) {
            if (DirectBufferAccess.isDirectByteBufferInstance(messageBuffer.reference)) {
                DirectBufferAccess.clean(messageBuffer.reference);
            } else {
                unsafe.freeMemory(messageBuffer.address);
            }
        }
    }

    public static MessageBuffer wrap(byte[] bArr) {
        return newMessageBuffer(bArr, 0, bArr.length);
    }

    public byte[] array() {
        return (byte[]) this.base;
    }

    public int arrayOffset() {
        return ((int) this.address) - ARRAY_BYTE_BASE_OFFSET;
    }

    public void copyTo(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + i, messageBuffer.base, messageBuffer.address + i2, i3);
    }

    public boolean getBoolean(int i) {
        return unsafe.getBoolean(this.base, this.address + i);
    }

    public byte getByte(int i) {
        return unsafe.getByte(this.base, this.address + i);
    }

    public void getBytes(int i, int i2, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= i2) {
            byteBuffer.put(sliceAsByteBuffer(i, i2));
            return;
        }
        throw new BufferOverflowException();
    }

    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    public int getInt(int i) {
        return Integer.reverseBytes(unsafe.getInt(this.base, this.address + i));
    }

    public long getLong(int i) {
        return Long.reverseBytes(unsafe.getLong(this.base, this.address + i));
    }

    public short getShort(int i) {
        return Short.reverseBytes(unsafe.getShort(this.base, this.address + i));
    }

    public boolean hasArray() {
        if (this.base != null) {
            return true;
        }
        return false;
    }

    public void putBoolean(int i, boolean z) {
        unsafe.putBoolean(this.base, this.address + i, z);
    }

    public void putByte(int i, byte b) {
        unsafe.putByte(this.base, this.address + i, b);
    }

    public void putByteBuffer(int i, ByteBuffer byteBuffer, int i2) {
        if (byteBuffer.isDirect()) {
            unsafe.copyMemory((Object) null, DirectBufferAccess.getAddress(byteBuffer) + byteBuffer.position(), this.base, this.address + i, i2);
            byteBuffer.position(byteBuffer.position() + i2);
            return;
        }
        if (byteBuffer.hasArray()) {
            unsafe.copyMemory(byteBuffer.array(), byteBuffer.position() + ARRAY_BYTE_BASE_OFFSET, this.base, this.address + i, i2);
            byteBuffer.position(byteBuffer.position() + i2);
            return;
        }
        if (hasArray()) {
            byteBuffer.get((byte[]) this.base, i, i2);
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            unsafe.putByte(this.base, this.address + i, byteBuffer.get());
        }
    }

    public void putBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(bArr, ARRAY_BYTE_BASE_OFFSET + i2, this.base, this.address + i, i3);
    }

    public void putDouble(int i, double d) {
        putLong(i, Double.doubleToRawLongBits(d));
    }

    public void putFloat(int i, float f) {
        putInt(i, Float.floatToRawIntBits(f));
    }

    public void putInt(int i, int i2) {
        unsafe.putInt(this.base, this.address + i, Integer.reverseBytes(i2));
    }

    public void putLong(int i, long j) {
        unsafe.putLong(this.base, this.address + i, Long.reverseBytes(j));
    }

    public void putMessageBuffer(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(messageBuffer.base, messageBuffer.address + i2, this.base, this.address + i, i3);
    }

    public void putShort(int i, short s) {
        unsafe.putShort(this.base, this.address + i, Short.reverseBytes(s));
    }

    public int size() {
        return this.size;
    }

    public MessageBuffer slice(int i, int i2) {
        boolean z;
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i + i2 <= size()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return new MessageBuffer(this.base, this.address + i, i2);
    }

    public ByteBuffer sliceAsByteBuffer(int i, int i2) {
        if (hasArray()) {
            return ByteBuffer.wrap((byte[]) this.base, (int) ((this.address - ARRAY_BYTE_BASE_OFFSET) + i), i2);
        }
        return DirectBufferAccess.newByteBuffer(this.address, i, i2, this.reference);
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        unsafe.copyMemory(this.base, this.address, bArr, ARRAY_BYTE_BASE_OFFSET, size());
        return bArr;
    }

    public String toHexString(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < i2; i3++) {
            if (i3 != i) {
                sb.append(ApiConstant.SPACE);
            }
            sb.append(String.format("%02x", Byte.valueOf(getByte(i3))));
        }
        return sb.toString();
    }

    public static MessageBuffer wrap(byte[] bArr, int i, int i2) {
        return newMessageBuffer(bArr, i, i2);
    }

    public static MessageBuffer wrap(ByteBuffer byteBuffer) {
        return newMessageBuffer(byteBuffer);
    }

    public void getBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + i, bArr, ARRAY_BYTE_BASE_OFFSET + i2, i3);
    }

    private static MessageBuffer newMessageBuffer(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        Constructor<?> constructor = mbBBConstructor;
        if (constructor != null) {
            return newInstance(constructor, byteBuffer);
        }
        return new MessageBuffer(byteBuffer);
    }

    public ByteBuffer sliceAsByteBuffer() {
        return sliceAsByteBuffer(0, size());
    }

    public MessageBuffer(byte[] bArr, int i, int i2) {
        this.base = bArr;
        this.address = ARRAY_BYTE_BASE_OFFSET + i;
        this.size = i2;
        this.reference = null;
    }

    public MessageBuffer(Object obj, long j, int i) {
        this.base = obj;
        this.address = j;
        this.size = i;
        this.reference = null;
    }
}
