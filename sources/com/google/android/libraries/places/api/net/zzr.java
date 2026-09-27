package com.google.android.libraries.places.api.net;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzr extends IsOpenResponse {
    private final Boolean zza;

    public zzr(Boolean bool) {
        this.zza = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IsOpenResponse)) {
            return false;
        }
        IsOpenResponse isOpenResponse = (IsOpenResponse) obj;
        Boolean bool = this.zza;
        if (bool == null) {
            if (isOpenResponse.isOpen() == null) {
                return true;
            }
            return false;
        }
        return bool.equals(isOpenResponse.isOpen());
    }

    public final int hashCode() {
        int hashCode;
        Boolean bool = this.zza;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return hashCode ^ 1000003;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenResponse
    public final Boolean isOpen() {
        return this.zza;
    }

    public final String toString() {
        Boolean bool = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(bool).length() + 23);
        sb.append("IsOpenResponse{isOpen=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }
}
