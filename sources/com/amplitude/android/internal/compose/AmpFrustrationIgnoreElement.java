package com.amplitude.android.internal.compose;

import defpackage.jjc;
import defpackage.qjc;
import defpackage.tl0;
import defpackage.zn;
import defpackage.zz9;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/amplitude/android/internal/compose/AmpFrustrationIgnoreElement;", "Lqjc;", "Lzn;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AmpFrustrationIgnoreElement extends qjc {
    @Override // defpackage.qjc
    public final jjc create() {
        return new jjc();
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof AmpFrustrationIgnoreElement)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(false) * 31);
    }

    @Override // defpackage.qjc
    public final void inspectableProperties(zz9 zz9Var) {
        zz9Var.a = "ampIgnoreFrustrationAnalytics";
        tl0 tl0Var = zz9Var.c;
        Boolean bool = Boolean.FALSE;
        tl0Var.c(bool, "ignoreRageClick");
        tl0Var.c(bool, "ignoreDeadClick");
    }

    public final String toString() {
        return "AmpFrustrationIgnoreElement(ignoreRageClick=false, ignoreDeadClick=false)";
    }

    @Override // defpackage.qjc
    public final void update(jjc jjcVar) {
        ((zn) jjcVar).getClass();
    }
}
