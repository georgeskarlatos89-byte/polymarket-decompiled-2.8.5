package defpackage;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class tzh extends ozh {
    public final IOException a;

    public tzh(IOException iOException) {
        super(iOException);
        this.a = iOException;
    }

    @Override // defpackage.ozh
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tzh.class == obj.getClass()) {
            return this.a.equals(((tzh) obj).a);
        }
        return false;
    }

    @Override // defpackage.ozh
    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
