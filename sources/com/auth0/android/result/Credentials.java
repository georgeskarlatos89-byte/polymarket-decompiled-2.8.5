package com.auth0.android.result;

import com.google.gson.annotations.SerializedName;
import defpackage.woa;
import java.util.Date;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000eR.\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@@X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/auth0/android/result/Credentials;", "", "", "idToken", "accessToken", "type", "refreshToken", "Ljava/util/Date;", "expiresAt", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getAccessToken", "getType", "getRefreshToken", "Ljava/util/Date;", "a", "()Ljava/util/Date;", "getScope", "<set-?>", "recoveryCode", "getRecoveryCode", "c", "(Ljava/lang/String;)V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class Credentials {

    @SerializedName("access_token")
    private final String accessToken;

    @SerializedName("expires_at")
    private final Date expiresAt;

    @SerializedName("id_token")
    private final String idToken;

    @SerializedName("recovery_code")
    private String recoveryCode;

    @SerializedName("refresh_token")
    private final String refreshToken;

    @SerializedName("scope")
    private final String scope;

    @SerializedName("token_type")
    private final String type;

    public Credentials(String str, String str2, String str3, String str4, Date date, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        date.getClass();
        this.idToken = str;
        this.accessToken = str2;
        this.type = str3;
        this.refreshToken = str4;
        this.expiresAt = date;
        this.scope = str5;
    }

    /* renamed from: a, reason: from getter */
    public final Date getExpiresAt() {
        return this.expiresAt;
    }

    /* renamed from: b, reason: from getter */
    public final String getIdToken() {
        return this.idToken;
    }

    public final void c(String str) {
        this.recoveryCode = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Credentials(idToken='xxxxx', accessToken='xxxxx', type='");
        sb.append(this.type);
        sb.append("', refreshToken='xxxxx', expiresAt='");
        sb.append(this.expiresAt);
        sb.append("', scope='");
        return woa.r(sb, this.scope, "')");
    }
}
