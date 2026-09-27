package io.intercom.android.sdk;

import defpackage.m51;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0003H×\u0001J\t\u0010\u0013\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/IntercomError;", "", "errorCode", "", "errorMessage", "", "<init>", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class IntercomError {
    public static final int $stable = 0;
    private final int errorCode;
    private final String errorMessage;

    public /* synthetic */ IntercomError(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ IntercomError copy$default(IntercomError intercomError, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = intercomError.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = intercomError.errorMessage;
        }
        return intercomError.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final IntercomError copy(int errorCode, String errorMessage) {
        errorMessage.getClass();
        return new IntercomError(errorCode, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntercomError)) {
            return false;
        }
        IntercomError intercomError = (IntercomError) other;
        if (this.errorCode == intercomError.errorCode && Intrinsics.areEqual(this.errorMessage, intercomError.errorMessage)) {
            return true;
        }
        return false;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return this.errorMessage.hashCode() + (Integer.hashCode(this.errorCode) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntercomError(errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorMessage=");
        return m51.m(sb, this.errorMessage, ')');
    }

    public IntercomError(int i, String str) {
        str.getClass();
        this.errorCode = i;
        this.errorMessage = str;
    }

    public IntercomError() {
        this(0, null, 3, null);
    }
}
