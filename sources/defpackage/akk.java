package defpackage;

import org.webrtc.PeerConnection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class akk {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PeerConnection.IceConnectionState.values().length];
        try {
            iArr[PeerConnection.IceConnectionState.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PeerConnection.IceConnectionState.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PeerConnection.IceConnectionState.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
