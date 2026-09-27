package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.m51;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/models/AblyAuthResponse;", "", "token", "", "<init>", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AblyAuthResponse {
    public static final int $stable = 0;

    @SerializedName("token")
    private final String token;

    public AblyAuthResponse(String str) {
        str.getClass();
        this.token = str;
    }

    public static /* synthetic */ AblyAuthResponse copy$default(AblyAuthResponse ablyAuthResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ablyAuthResponse.token;
        }
        return ablyAuthResponse.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final AblyAuthResponse copy(String token) {
        token.getClass();
        return new AblyAuthResponse(token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof AblyAuthResponse) && Intrinsics.areEqual(this.token, ((AblyAuthResponse) other).token)) {
            return true;
        }
        return false;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    public String toString() {
        return m51.m(new StringBuilder("AblyAuthResponse(token="), this.token, ')');
    }
}
