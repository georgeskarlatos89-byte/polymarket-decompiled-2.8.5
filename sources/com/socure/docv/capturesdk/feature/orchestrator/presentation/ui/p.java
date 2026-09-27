package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import defpackage.sv6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class p {
    public final String a;

    public p(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p) && Intrinsics.areEqual(this.a, ((p) obj).a) && Intrinsics.areEqual(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return sv6.n("TertiaryTextData(fullText=", this.a, ", annotatedText=null)");
    }
}
