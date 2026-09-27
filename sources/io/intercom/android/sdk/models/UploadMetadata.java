package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.m51;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/models/UploadMetadata;", "", "safeAppId", "", "<init>", "(Ljava/lang/String;)V", "getSafeAppId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class UploadMetadata {
    public static final int $stable = 0;

    @SerializedName("safe_app_id")
    private final String safeAppId;

    public /* synthetic */ UploadMetadata(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ UploadMetadata copy$default(UploadMetadata uploadMetadata, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadMetadata.safeAppId;
        }
        return uploadMetadata.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSafeAppId() {
        return this.safeAppId;
    }

    public final UploadMetadata copy(String safeAppId) {
        safeAppId.getClass();
        return new UploadMetadata(safeAppId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof UploadMetadata) && Intrinsics.areEqual(this.safeAppId, ((UploadMetadata) other).safeAppId)) {
            return true;
        }
        return false;
    }

    public final String getSafeAppId() {
        return this.safeAppId;
    }

    public int hashCode() {
        return this.safeAppId.hashCode();
    }

    public String toString() {
        return m51.m(new StringBuilder("UploadMetadata(safeAppId="), this.safeAppId, ')');
    }

    public UploadMetadata(String str) {
        str.getClass();
        this.safeAppId = str;
    }

    public UploadMetadata() {
        this(null, 1, null);
    }
}
