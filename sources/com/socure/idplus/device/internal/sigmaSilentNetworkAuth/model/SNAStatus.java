package com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model;

import defpackage.dmk;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/socure/idplus/device/internal/sigmaSilentNetworkAuth/model/SNAStatus;", "", "(Ljava/lang/String;I)V", "toString", "", "SUCCESS", "CELLULAR_NETWORK_NOT_AVAILABLE", "NETWORKING_ERROR", "NO_RESULT_FROM_THE_URL", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SNAStatus {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ SNAStatus[] $VALUES;
    public static final SNAStatus SUCCESS = new SNAStatus("SUCCESS", 0);
    public static final SNAStatus CELLULAR_NETWORK_NOT_AVAILABLE = new SNAStatus("CELLULAR_NETWORK_NOT_AVAILABLE", 1);
    public static final SNAStatus NETWORKING_ERROR = new SNAStatus("NETWORKING_ERROR", 2);
    public static final SNAStatus NO_RESULT_FROM_THE_URL = new SNAStatus("NO_RESULT_FROM_THE_URL", 3);

    private static final /* synthetic */ SNAStatus[] $values() {
        return new SNAStatus[]{SUCCESS, CELLULAR_NETWORK_NOT_AVAILABLE, NETWORKING_ERROR, NO_RESULT_FROM_THE_URL};
    }

    static {
        SNAStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private SNAStatus(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static SNAStatus valueOf(String str) {
        return (SNAStatus) Enum.valueOf(SNAStatus.class, str);
    }

    public static SNAStatus[] values() {
        return (SNAStatus[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = d.a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "noResultFromURL";
                    }
                    dmk.a();
                    return null;
                }
                return "networkingError";
            }
            return "cellularNetworkNotAvailable";
        }
        return "success";
    }
}
