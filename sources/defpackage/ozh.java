package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ozh extends Exception {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ozh ozhVar = (ozh) obj;
            if (Objects.equals(getMessage(), ozhVar.getMessage()) && Objects.equals(getCause(), ozhVar.getCause())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getMessage(), getCause());
    }
}
