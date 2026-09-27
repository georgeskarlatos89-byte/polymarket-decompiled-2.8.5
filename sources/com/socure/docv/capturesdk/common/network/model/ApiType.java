package com.socure.docv.capturesdk.common.network.model;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/ApiType;", "", "endpoint", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getEndpoint", "()Ljava/lang/String;", "START", "MODULE_SUBMISSION", "IMAGE_UPLOAD", "UNKNOWN", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ApiType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ApiType[] $VALUES;
    private final String endpoint;
    public static final ApiType START = new ApiType("START", 0, ApiConstant.STEP_UP_MODULE_START_SESSION);
    public static final ApiType MODULE_SUBMISSION = new ApiType("MODULE_SUBMISSION", 1, ApiConstant.STEP_UP_SUBMIT);
    public static final ApiType IMAGE_UPLOAD = new ApiType("IMAGE_UPLOAD", 2, ApiConstant.UPLOAD_URL);
    public static final ApiType UNKNOWN = new ApiType("UNKNOWN", 3, "");

    private static final /* synthetic */ ApiType[] $values() {
        return new ApiType[]{START, MODULE_SUBMISSION, IMAGE_UPLOAD, UNKNOWN};
    }

    static {
        ApiType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private ApiType(String str, int i, String str2) {
        this.endpoint = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ApiType valueOf(String str) {
        return (ApiType) Enum.valueOf(ApiType.class, str);
    }

    public static ApiType[] values() {
        return (ApiType[]) $VALUES.clone();
    }

    public final String getEndpoint() {
        return this.endpoint;
    }
}
