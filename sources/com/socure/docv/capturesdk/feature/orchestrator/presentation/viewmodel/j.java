package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class j extends k {
    public final ArrayList a;
    public final com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.u b;
    public final Uri c;

    public j(ArrayList arrayList, com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.u uVar, Uri uri) {
        this.a = arrayList;
        this.b = uVar;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (!Intrinsics.areEqual(this.a, jVar.a) || !Intrinsics.areEqual(this.b, jVar.b) || !Intrinsics.areEqual(this.c, jVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.u uVar = this.b;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Uri uri = this.c;
        if (uri != null) {
            i = uri.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "Ready(rows=" + this.a + ", firstScreen=" + this.b + ", submitThumbnailUri=" + this.c + ")";
    }
}
