package io.ably.lib.types;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class DecodingContext {
    private byte[] lastMessageBinary = null;
    private String lastMessageString = null;

    public byte[] getLastMessageData() {
        byte[] bArr = this.lastMessageBinary;
        if (bArr != null) {
            return bArr;
        }
        String str = this.lastMessageString;
        if (str != null) {
            return str.getBytes(Charset.forName("UTF-8"));
        }
        return null;
    }

    public void setLastMessageData(String str) {
        this.lastMessageString = str;
        this.lastMessageBinary = null;
    }

    public void setLastMessageData(byte[] bArr) {
        this.lastMessageBinary = bArr;
        this.lastMessageString = null;
    }
}
