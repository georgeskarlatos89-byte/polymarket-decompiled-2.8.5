package defpackage;

import io.getstream.chat.android.models.UploadAttachmentsNetworkType;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class axj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UploadAttachmentsNetworkType.values().length];
        try {
            iArr[UploadAttachmentsNetworkType.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UploadAttachmentsNetworkType.UNMETERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UploadAttachmentsNetworkType.NOT_ROAMING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UploadAttachmentsNetworkType.METERED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
