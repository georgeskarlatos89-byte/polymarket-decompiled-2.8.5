package com.socure.docv.capturesdk.common.view.model;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g {
    public final String a;
    public final h b;
    public final h c;
    public final h d;
    public final Bitmap e;
    public final b f;
    public final b g;
    public final Bitmap h;

    public g(String str, h hVar, h hVar2, h hVar3, Bitmap bitmap, b bVar, b bVar2, Bitmap bitmap2) {
        str.getClass();
        bitmap.getClass();
        this.a = str;
        this.b = hVar;
        this.c = hVar2;
        this.d = hVar3;
        this.e = bitmap;
        this.f = bVar;
        this.g = bVar2;
        this.h = bitmap2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (!Intrinsics.areEqual(this.a, gVar.a) || !Intrinsics.areEqual(this.b, gVar.b) || !Intrinsics.areEqual(this.c, gVar.c) || !Intrinsics.areEqual(this.d, gVar.d) || !Intrinsics.areEqual(this.e, gVar.e) || !Intrinsics.areEqual(this.f, gVar.f) || !Intrinsics.areEqual(this.g, gVar.g) || !Intrinsics.areEqual(this.h, gVar.h)) {
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
        int hashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Bitmap bitmap = this.h;
        if (bitmap == null) {
            hashCode = 0;
        } else {
            hashCode = bitmap.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "PreviewData(imageDimenRatio=" + this.a + ", title=" + this.b + ", confirmationTitle=" + this.c + ", confirmationText=" + this.d + ", previewBitmap=" + this.e + ", agreeButton=" + this.f + ", retake=" + this.g + ", debugImage=" + this.h + ")";
    }
}
