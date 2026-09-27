package defpackage;

import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class stk extends IntegrityTokenResponse {
    public final String a;

    public stk(String str) {
        this.a = str;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.a;
    }
}
