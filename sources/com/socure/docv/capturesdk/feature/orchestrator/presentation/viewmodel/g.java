package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g {
    public final int a;
    public final com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.u b;

    public g(int i, com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.u uVar) {
        this.a = i;
        this.b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.a != gVar.a || !Intrinsics.areEqual(this.b, gVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PreviewRow(index=" + this.a + ", model=" + this.b + ")";
    }
}
