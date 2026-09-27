package com.socure.idplus.device.error;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/socure/idplus/device/error/SigmaDeviceError;", "", "(Ljava/lang/String;I)V", "NetworkConnectionError", "DataUploadError", "DataFetchError", "UnknownError", "ContextFetchError", "SdkNotInitializedError", "SdkPausedError", "SessionNotActiveError", "InvalidArgumentError", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SigmaDeviceError {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ SigmaDeviceError[] $VALUES;
    public static final SigmaDeviceError NetworkConnectionError = new SigmaDeviceError("NetworkConnectionError", 0);
    public static final SigmaDeviceError DataUploadError = new SigmaDeviceError("DataUploadError", 1);
    public static final SigmaDeviceError DataFetchError = new SigmaDeviceError("DataFetchError", 2);
    public static final SigmaDeviceError UnknownError = new SigmaDeviceError("UnknownError", 3);
    public static final SigmaDeviceError ContextFetchError = new SigmaDeviceError("ContextFetchError", 4);
    public static final SigmaDeviceError SdkNotInitializedError = new SigmaDeviceError("SdkNotInitializedError", 5);
    public static final SigmaDeviceError SdkPausedError = new SigmaDeviceError("SdkPausedError", 6);
    public static final SigmaDeviceError SessionNotActiveError = new SigmaDeviceError("SessionNotActiveError", 7);
    public static final SigmaDeviceError InvalidArgumentError = new SigmaDeviceError("InvalidArgumentError", 8);

    private static final /* synthetic */ SigmaDeviceError[] $values() {
        return new SigmaDeviceError[]{NetworkConnectionError, DataUploadError, DataFetchError, UnknownError, ContextFetchError, SdkNotInitializedError, SdkPausedError, SessionNotActiveError, InvalidArgumentError};
    }

    static {
        SigmaDeviceError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private SigmaDeviceError(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static SigmaDeviceError valueOf(String str) {
        return (SigmaDeviceError) Enum.valueOf(SigmaDeviceError.class, str);
    }

    public static SigmaDeviceError[] values() {
        return (SigmaDeviceError[]) $VALUES.clone();
    }
}
