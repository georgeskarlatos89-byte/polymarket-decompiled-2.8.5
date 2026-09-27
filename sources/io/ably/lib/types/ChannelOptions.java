package io.ably.lib.types;

import io.ably.lib.util.Base64Coder;
import io.ably.lib.util.Crypto;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class ChannelOptions {
    public boolean attachOnSubscribe = true;
    public Object cipherParams;
    public boolean encrypted;
    public ChannelMode[] modes;
    public Map<String, String> params;

    @Deprecated
    public static ChannelOptions fromCipherKey(String str) {
        return fromCipherKey(Base64Coder.decode(str));
    }

    public static ChannelOptions withCipherKey(byte[] bArr) {
        ChannelOptions channelOptions = new ChannelOptions();
        channelOptions.encrypted = true;
        channelOptions.cipherParams = Crypto.getDefaultParams(bArr);
        return channelOptions;
    }

    public synchronized Crypto.CipherParams getCipherParamsOrDefault() {
        Crypto.CipherParams checkCipherParams;
        checkCipherParams = Crypto.checkCipherParams(this.cipherParams);
        if (this.cipherParams == null) {
            this.cipherParams = checkCipherParams;
        }
        return checkCipherParams;
    }

    public int getModeFlags() {
        int i = 0;
        for (ChannelMode channelMode : this.modes) {
            i |= channelMode.getMask();
        }
        return i;
    }

    public boolean hasModes() {
        ChannelMode[] channelModeArr = this.modes;
        if (channelModeArr != null && channelModeArr.length != 0) {
            return true;
        }
        return false;
    }

    public boolean hasParams() {
        Map<String, String> map = this.params;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static ChannelOptions fromCipherKey(byte[] bArr) {
        return withCipherKey(bArr);
    }

    public static ChannelOptions withCipherKey(String str) {
        return withCipherKey(Base64Coder.decode(str));
    }
}
