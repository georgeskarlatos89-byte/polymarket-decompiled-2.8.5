package defpackage;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ptk extends IntegrityTokenRequest {
    public final String a;
    public final Long b;

    public ptk(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long a() {
        return this.b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String b() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        Long l;
        if (obj != this) {
            if (obj instanceof IntegrityTokenRequest) {
                IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
                if (this.a.equals(integrityTokenRequest.b()) && ((l = this.b) != null ? l.equals(integrityTokenRequest.a()) : integrityTokenRequest.a() == null)) {
                    z = true;
                    if (!(obj instanceof ptk)) {
                        if (!z) {
                            return false;
                        }
                    } else {
                        return z;
                    }
                }
            }
            z = false;
            if (!(obj instanceof ptk)) {
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        Long l = this.b;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return (hashCode ^ (hashCode2 * 1000003)) * 1000003;
    }

    public final String toString() {
        return ("IntegrityTokenRequest{nonce=" + this.a + ", cloudProjectNumber=" + this.b).concat(", network=null").concat("}");
    }
}
