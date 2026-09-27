package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.net.Uri;
import defpackage.ix2;
import defpackage.k84;
import defpackage.m51;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class u {
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final String e;
    public final String f;
    public final boolean g;

    public u(String str, String str2, String str3, Uri uri, String str4, String str5, boolean z) {
        uri.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uri;
        this.e = str4;
        this.f = str5;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u) {
                u uVar = (u) obj;
                if (!Intrinsics.areEqual(this.a, uVar.a) || !Intrinsics.areEqual(this.b, uVar.b) || !Intrinsics.areEqual(this.c, uVar.c) || !Intrinsics.areEqual(this.d, uVar.d) || !Intrinsics.areEqual(this.e, uVar.e) || !Intrinsics.areEqual(this.f, uVar.f) || this.g != uVar.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + com.socure.docv.capturesdk.api.a.a(this.f, com.socure.docv.capturesdk.api.a.a(this.e, (this.d.hashCode() + com.socure.docv.capturesdk.api.a.a(this.c, com.socure.docv.capturesdk.api.a.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder r = m51.r("UnstructuredDocPreviewModel(documentName=", this.a, ", fileName=", this.b, ", fileSize=");
        r.append(this.c);
        r.append(", fileThumbnail=");
        r.append(this.d);
        r.append(", submitButtonText=");
        k84.q(r, this.e, ", cancelButtonText=", this.f, ", isDocument=");
        return ix2.r(r, this.g, ")");
    }
}
