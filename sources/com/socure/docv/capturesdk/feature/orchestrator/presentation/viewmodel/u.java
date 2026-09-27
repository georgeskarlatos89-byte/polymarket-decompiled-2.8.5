package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import com.socure.docv.capturesdk.api.SocureDocVError;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class u extends b0 {
    public final SocureDocVError a;

    public u(SocureDocVError socureDocVError) {
        socureDocVError.getClass();
        this.a = socureDocVError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u) && this.a == ((u) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ApiError(socureError=" + this.a + ")";
    }
}
