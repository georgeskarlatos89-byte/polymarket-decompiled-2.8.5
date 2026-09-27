package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import defpackage.k84;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class h0 {
    public final boolean a;
    public final boolean b;
    public final List c;
    public final int d;
    public final int e;
    public final f0 f;

    public h0(boolean z, boolean z2, List list, int i, int i2, f0 f0Var) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = i;
        this.e = i2;
        this.f = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h0) {
                h0 h0Var = (h0) obj;
                if (this.a != h0Var.a || this.b != h0Var.b || !Intrinsics.areEqual(this.c, h0Var.c) || this.d != h0Var.d || this.e != h0Var.e || !Intrinsics.areEqual(this.f, h0Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode() + com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.e, com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.d, com.socure.docv.capturesdk.common.analytics.model.a.a(this.c, com.socure.docv.capturesdk.api.b.a(this.b, com.socure.docv.capturesdk.api.b.a(this.a, Boolean.hashCode(false) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder h = k84.h("State(isLoading=false, canUpload=", ", canCapture=", ", uploadFileTypes=", this.a, this.b);
        h.append(this.c);
        h.append(", currentStep=");
        h.append(this.d);
        h.append(", totalSteps=");
        h.append(this.e);
        h.append(", labels=");
        h.append(this.f);
        h.append(")");
        return h.toString();
    }
}
