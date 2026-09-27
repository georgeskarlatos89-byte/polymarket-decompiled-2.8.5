package com.socure.docv.capturesdk.common.view.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class f {
    public final h a;
    public final int b;
    public final List c;
    public final String d;
    public final b e;

    public f(h hVar, int i, List list, String str, b bVar) {
        list.getClass();
        str.getClass();
        this.a = hVar;
        this.b = i;
        this.c = list;
        this.d = str;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (!Intrinsics.areEqual(this.a, fVar.a) || this.b != fVar.b || !Intrinsics.areEqual(this.c, fVar.c) || !Intrinsics.areEqual(this.d, fVar.d) || !Intrinsics.areEqual(this.e, fVar.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + com.socure.docv.capturesdk.api.a.a(this.d, com.socure.docv.capturesdk.common.analytics.model.a.a(this.c, com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "HelpViewData(title=" + this.a + ", imageResId=" + this.b + ", instructionList=" + this.c + ", instrTextColor=" + this.d + ", continueButton=" + this.e + ")";
    }
}
