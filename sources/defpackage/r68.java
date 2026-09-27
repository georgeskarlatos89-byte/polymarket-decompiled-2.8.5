package defpackage;

import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class r68 extends c3 {
    public static int G(int i, byte[] bArr) {
        return (bArr[i + 3] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i] & MessagePack.Code.EXT_TIMESTAMP) << 24) | ((bArr[i + 1] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[i + 2] & MessagePack.Code.EXT_TIMESTAMP) << 8);
    }
}
