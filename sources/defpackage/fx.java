package defpackage;

import com.socure.docv.capturesdk.api.SocureDocVError;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class fx {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SocureDocVError.values().length];
        try {
            iArr[SocureDocVError.USER_CANCELED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SocureDocVError.CAMERA_PERMISSION_DECLINED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SocureDocVError.CONSENT_DECLINED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SocureDocVError.SESSION_EXPIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SocureDocVError.INVALID_DOCV_TRANSACTION_TOKEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SocureDocVError.SESSION_INITIATION_FAILURE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SocureDocVError.INVALID_PUBLIC_KEY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[SocureDocVError.NO_INTERNET_CONNECTION.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[SocureDocVError.DOCUMENT_UPLOAD_FAILURE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
