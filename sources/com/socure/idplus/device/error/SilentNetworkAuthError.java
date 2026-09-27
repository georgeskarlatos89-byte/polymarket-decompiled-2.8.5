package com.socure.idplus.device.error;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/socure/idplus/device/error/SilentNetworkAuthError;", "", "(Ljava/lang/String;I)V", "SdkNotInitializedError", "InvalidMobileNumberError", "UnAuthorizedError", "UnknownError", "ContextFetchError", "MissingPermissionsError", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SilentNetworkAuthError {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ SilentNetworkAuthError[] $VALUES;
    public static final SilentNetworkAuthError SdkNotInitializedError = new SilentNetworkAuthError("SdkNotInitializedError", 0);
    public static final SilentNetworkAuthError InvalidMobileNumberError = new SilentNetworkAuthError("InvalidMobileNumberError", 1);
    public static final SilentNetworkAuthError UnAuthorizedError = new SilentNetworkAuthError("UnAuthorizedError", 2);
    public static final SilentNetworkAuthError UnknownError = new SilentNetworkAuthError("UnknownError", 3);
    public static final SilentNetworkAuthError ContextFetchError = new SilentNetworkAuthError("ContextFetchError", 4);
    public static final SilentNetworkAuthError MissingPermissionsError = new SilentNetworkAuthError("MissingPermissionsError", 5);

    private static final /* synthetic */ SilentNetworkAuthError[] $values() {
        return new SilentNetworkAuthError[]{SdkNotInitializedError, InvalidMobileNumberError, UnAuthorizedError, UnknownError, ContextFetchError, MissingPermissionsError};
    }

    static {
        SilentNetworkAuthError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private SilentNetworkAuthError(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static SilentNetworkAuthError valueOf(String str) {
        return (SilentNetworkAuthError) Enum.valueOf(SilentNetworkAuthError.class, str);
    }

    public static SilentNetworkAuthError[] values() {
        return (SilentNetworkAuthError[]) $VALUES.clone();
    }
}
