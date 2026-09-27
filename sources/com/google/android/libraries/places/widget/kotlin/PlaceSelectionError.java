package com.google.android.libraries.places.widget.kotlin;

import com.google.android.gms.common.api.Status;
import defpackage.hm6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@hm6
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/android/libraries/places/widget/kotlin/PlaceSelectionError;", "Lcom/google/android/libraries/places/widget/kotlin/PlaceSelectionResult;", "status", "Lcom/google/android/gms/common/api/Status;", "<init>", "(Lcom/google/android/gms/common/api/Status;)V", "getStatus", "()Lcom/google/android/gms/common/api/Status;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "java.com.google.android.libraries.places.widget.kotlin_kotlin_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlaceSelectionError extends PlaceSelectionResult {

    /* renamed from: zza, reason: from toString */
    private final Status status;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceSelectionError(Status status) {
        super(null);
        status.getClass();
        this.status = status;
    }

    public static /* synthetic */ PlaceSelectionError copy$default(PlaceSelectionError placeSelectionError, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            status = placeSelectionError.status;
        }
        return placeSelectionError.copy(status);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final PlaceSelectionError copy(Status status) {
        status.getClass();
        return new PlaceSelectionError(status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof PlaceSelectionError) && Intrinsics.areEqual(this.status, ((PlaceSelectionError) other).status)) {
            return true;
        }
        return false;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        Status status = this.status;
        StringBuilder sb = new StringBuilder(String.valueOf(status).length() + 28);
        sb.append("PlaceSelectionError(status=");
        sb.append(status);
        sb.append(")");
        return sb.toString();
    }
}
