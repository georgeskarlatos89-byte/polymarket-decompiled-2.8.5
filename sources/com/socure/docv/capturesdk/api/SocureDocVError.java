package com.socure.docv.capturesdk.api;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/socure/docv/capturesdk/api/SocureDocVError;", "", "<init>", "(Ljava/lang/String;I)V", "SESSION_INITIATION_FAILURE", "SESSION_EXPIRED", "INVALID_PUBLIC_KEY", "INVALID_DOCV_TRANSACTION_TOKEN", "DOCUMENT_UPLOAD_FAILURE", "CONSENT_DECLINED", "CAMERA_PERMISSION_DECLINED", "USER_CANCELED", "NO_INTERNET_CONNECTION", "UNKNOWN", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SocureDocVError {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ SocureDocVError[] $VALUES;
    public static final SocureDocVError SESSION_INITIATION_FAILURE = new SocureDocVError("SESSION_INITIATION_FAILURE", 0);
    public static final SocureDocVError SESSION_EXPIRED = new SocureDocVError("SESSION_EXPIRED", 1);
    public static final SocureDocVError INVALID_PUBLIC_KEY = new SocureDocVError("INVALID_PUBLIC_KEY", 2);
    public static final SocureDocVError INVALID_DOCV_TRANSACTION_TOKEN = new SocureDocVError("INVALID_DOCV_TRANSACTION_TOKEN", 3);
    public static final SocureDocVError DOCUMENT_UPLOAD_FAILURE = new SocureDocVError("DOCUMENT_UPLOAD_FAILURE", 4);
    public static final SocureDocVError CONSENT_DECLINED = new SocureDocVError("CONSENT_DECLINED", 5);
    public static final SocureDocVError CAMERA_PERMISSION_DECLINED = new SocureDocVError("CAMERA_PERMISSION_DECLINED", 6);
    public static final SocureDocVError USER_CANCELED = new SocureDocVError("USER_CANCELED", 7);
    public static final SocureDocVError NO_INTERNET_CONNECTION = new SocureDocVError("NO_INTERNET_CONNECTION", 8);
    public static final SocureDocVError UNKNOWN = new SocureDocVError("UNKNOWN", 9);

    private static final /* synthetic */ SocureDocVError[] $values() {
        return new SocureDocVError[]{SESSION_INITIATION_FAILURE, SESSION_EXPIRED, INVALID_PUBLIC_KEY, INVALID_DOCV_TRANSACTION_TOKEN, DOCUMENT_UPLOAD_FAILURE, CONSENT_DECLINED, CAMERA_PERMISSION_DECLINED, USER_CANCELED, NO_INTERNET_CONNECTION, UNKNOWN};
    }

    static {
        SocureDocVError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private SocureDocVError(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static SocureDocVError valueOf(String str) {
        return (SocureDocVError) Enum.valueOf(SocureDocVError.class, str);
    }

    public static SocureDocVError[] values() {
        return (SocureDocVError[]) $VALUES.clone();
    }
}
