package org.msgpack.core;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ExtensionTypeHeader {
    private final int length;
    private final byte type;

    public ExtensionTypeHeader(byte b, int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "length must be >= 0");
        this.type = b;
        this.length = i;
    }

    public static byte checkedCastToByte(int i) {
        boolean z;
        if (-128 <= i && i <= 127) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Extension type code must be within the range of byte");
        return (byte) i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExtensionTypeHeader) {
            ExtensionTypeHeader extensionTypeHeader = (ExtensionTypeHeader) obj;
            if (this.type == extensionTypeHeader.type && this.length == extensionTypeHeader.length) {
                return true;
            }
        }
        return false;
    }

    public int getLength() {
        return this.length;
    }

    public byte getType() {
        return this.type;
    }

    public int hashCode() {
        return ((this.type + 31) * 31) + this.length;
    }

    public boolean isTimestampType() {
        if (this.type == -1) {
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("ExtensionTypeHeader(type:%d, length:%,d)", Byte.valueOf(this.type), Integer.valueOf(this.length));
    }
}
